package com.xord.qbguide

import android.content.Intent
import android.database.Cursor
import android.database.sqlite.SQLiteDatabase
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.xord.qbguide.R.id.recyclerNoteTheory
import com.xord.qbguide.adapter.NoteAdapter
import com.xord.qbguide.adapter.ProgramAdapter
import com.xord.qbguide.db.QbSQLiteOpenHelper
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {

    var noteCategoryId = 0
    var db:SQLiteDatabase? = null
    var cursor:Cursor? = null
    var cursor2:Cursor? = null
    var flagNote:Boolean = false
    var flagProg:Boolean = false


    var noteAdapter:NoteAdapter? = null
    var programAdapter:ProgramAdapter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        var btnTh:Button? = findViewById<Button>(R.id.btn_theory)
        var rNote:RecyclerView = findViewById<RecyclerView>(R.id.recyclerNoteTheory)
        btnTh!!.setOnClickListener{
            if(flagNote == false) {
                rNote.visibility = View.VISIBLE
                flagNote = true
            }
            else {
                rNote.visibility = View.GONE
                flagNote = false
            }
        }

        var btnProg:Button? = findViewById<Button>(R.id.btn_program)
        var rProg:RecyclerView = findViewById<RecyclerView>(R.id.recyclerProgram)
        btnProg!!.setOnClickListener{
            if(flagProg == false) {
                rProg.visibility = View.VISIBLE
                flagProg = true
            }
            else {
                rProg.visibility = View.GONE
                flagProg = false
            }
        }




        noteCategoryId = intent.extras?.get("NOTE_CATEGORY_ID").toString().toInt()

        //Read from database
        val myNotesDatabaseHelper = QbSQLiteOpenHelper(this)
        db = myNotesDatabaseHelper.readableDatabase

        showNotes()
        showProgs()
    }

    fun showNotes(){
        cursor = db!!.query(
            "notes", arrayOf("note_title","note_syntax","note_details","category_id"),
            "category_id=?", arrayOf(noteCategoryId.toString()),null,null,null)


        var listOfNotes = mutableListOf<NoteCategory>()
        while (cursor!!.moveToNext()==true){
            val noteId = cursor!!.getInt(3)
            val noteTitle = cursor!!.getString(0)
            val noteSyntax = cursor!!.getString(1)
            val noteDesc = cursor!!.getString(2)

            val noteCategory = NoteCategory(noteTitle,noteSyntax,noteDesc,noteId)

            listOfNotes.add(noteCategory)
        }

        //create adapter class
        noteAdapter = NoteAdapter(this,listOfNotes)

        //use a layout manager
        val layoutManager = LinearLayoutManager(this)

        recyclerNoteTheory.layoutManager = layoutManager
        recyclerNoteTheory.adapter = noteAdapter

    }

    fun showProgs(){
        cursor2 = db!!.query(
            "programs", arrayOf("prog_question","prog_answer","category_id"),
            "category_id=?", arrayOf(noteCategoryId.toString()),null,null,null)

        var listOfProgs = mutableListOf<Program>()
        while (cursor2!!.moveToNext()==true){
            val progId = cursor2!!.getInt(2)
            val progQues = cursor2!!.getString(0)
            val progAns = cursor2!!.getString(1)

            val program = Program(progQues,progAns,progId)

            listOfProgs.add(program)
        }

        //create adapter class
        programAdapter = ProgramAdapter(this,listOfProgs){program->

            val shareIntent = Intent()
            shareIntent.action = Intent.ACTION_SEND
            shareIntent.putExtra(Intent.EXTRA_TEXT,program)
            shareIntent.type = "text/plain"
            startActivity(shareIntent)
        }

        //use a layout manager
        val layoutManager = LinearLayoutManager(this)

        recyclerProgram.layoutManager = layoutManager
        recyclerProgram.adapter = programAdapter
    }

}
