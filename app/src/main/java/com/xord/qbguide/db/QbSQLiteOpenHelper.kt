package com.xord.qbguide.db

import android.content.ContentValues
import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper
import android.text.Html
import com.xord.qbguide.R

class QbSQLiteOpenHelper(context: Context):SQLiteOpenHelper(context,null, null, 1) {

        var qbDesc = context.resources.getString(R.string.fun_note_qb_desc)
        var keyword = context.resources.getString(R.string.fun_note_keyword)
        var variable = context.resources.getString(R.string.fun_note_variable)
        var con = context.resources.getString(R.string.fun_note_constant)

        var conditionalStmt = context.resources.getString(R.string.dec_note_conditional)
        var ifSyntx = context.resources.getString(R.string.dec_syn_if)
        var ifNote = context.resources.getString(R.string.dec_note_if)
        var ifElseSyntx = context.resources.getString(R.string.dec_syn_ifElse)
        var ifElseNote = context.resources.getString(R.string.dec_note_ifElse)
        var ifElfSyntx = context.resources.getString(R.string.dec_syn_ifElseIf)
        var ifElfNote = context.resources.getString(R.string.dec_note_ifElseIf)
        var selectc = context.resources.getString(R.string.dec_note_select)


    var conp1q= context.resources.getString(R.string.conp1q)
    var conp1= context.resources.getString(R.string.conp1)
    var conp2q= context.resources.getString(R.string.conp2q)
    var conp2= context.resources.getString(R.string.conp2)
    var conp3q= context.resources.getString(R.string.conp3q)
    var conp3= context.resources.getString(R.string.conp3)
    var conp4q= context.resources.getString(R.string.conp4q)
    var conp4= context.resources.getString(R.string.conp4)
    var conp5q= context.resources.getString(R.string.conp5q)
    var conp5= context.resources.getString(R.string.conp5)
    var conp6q= context.resources.getString(R.string.conp6q)
    var conp6= context.resources.getString(R.string.conp6)
    var conp7q= context.resources.getString(R.string.conp7q)
    var conp7= context.resources.getString(R.string.conp7)
    var conp8q= context.resources.getString(R.string.conp8q)
    var conp8= context.resources.getString(R.string.conp8)
    var conp9q= context.resources.getString(R.string.conp9q)
    var conp9= context.resources.getString(R.string.conp9)
    var conp10q= context.resources.getString(R.string.conp10q)
    var conp10= context.resources.getString(R.string.conp10)
    var conp11q= context.resources.getString(R.string.conp11q)
    var conp11= context.resources.getString(R.string.conp11)


    var loop_note1 = context.resources.getString(R.string.loop_note1)
    var loop_note2 = context.resources.getString(R.string.loop_note2)
    var loop_note3 = context.resources.getString(R.string.loop_note3)
    var loop_note4 = context.resources.getString(R.string.loop_note4)
    var loop_note5 = context.resources.getString(R.string.loop_note5)

    var loopp1q= context.resources.getString(R.string.loopp1q)
    var loopp1= context.resources.getString(R.string.loopp1)
    var loopp2q= context.resources.getString(R.string.loopp2q)
    var loopp2= context.resources.getString(R.string.loopp2)
    var loopp3q= context.resources.getString(R.string.loopp3q)
    var loopp3= context.resources.getString(R.string.loopp3)
    var loopp4q= context.resources.getString(R.string.loopp4q)
    var loopp4= context.resources.getString(R.string.loopp4)
    var loopp5q= context.resources.getString(R.string.loopp5q)
    var loopp5= context.resources.getString(R.string.loopp5)
    var loopp6q= context.resources.getString(R.string.loopp6q)
    var loopp6= context.resources.getString(R.string.loopp6)
    var loopp7q= context.resources.getString(R.string.loopp7q)
    var loopp7= context.resources.getString(R.string.loopp7)
    var loopp8q= context.resources.getString(R.string.loopp8q)
    var loopp8= context.resources.getString(R.string.loopp8)
    var loopp9q= context.resources.getString(R.string.loopp9q)
    var loopp9= context.resources.getString(R.string.loopp9)
    var loopp10q= context.resources.getString(R.string.loopp10q)
    var loopp10= context.resources.getString(R.string.loopp10)
    var loopp11q= context.resources.getString(R.string.loopp11q)
    var loopp11= context.resources.getString(R.string.loopp11)
    var loopp12q= context.resources.getString(R.string.loopp12q)
    var loopp12= context.resources.getString(R.string.loopp12)
    var loopp13q= context.resources.getString(R.string.loopp13q)
    var loopp13= context.resources.getString(R.string.loopp13)
    var loopp14q= context.resources.getString(R.string.loopp14q)
    var loopp14= context.resources.getString(R.string.loopp14)

    var lib_note1 = context.resources.getString(R.string.lib_note1)
    var lib_note2 = context.resources.getString(R.string.lib_note2)
    var lib_note3 = context.resources.getString(R.string.lib_note3)
    var lib_note4 = context.resources.getString(R.string.lib_note4)
    var lib_note5 = context.resources.getString(R.string.lib_note5)



    var libp1q = context.resources.getString(R.string.libp1q)
    var libp1 = context.resources.getString(R.string.libp1)
    var libp2q = context.resources.getString(R.string.libp2q)
    var libp2 = context.resources.getString(R.string.libp2)
    var libp3q = context.resources.getString(R.string.libp3q)
    var libp3 = context.resources.getString(R.string.libp3)
    var libp4q = context.resources.getString(R.string.libp4q)
    var libp4 = context.resources.getString(R.string.libp4)
    var libp5q = context.resources.getString(R.string.libp5q)
    var libp5 = context.resources.getString(R.string.libp5)
    var libp6q = context.resources.getString(R.string.libp6q)
    var libp6 = context.resources.getString(R.string.libp6)
    var libp7q = context.resources.getString(R.string.libp7q)
    var libp7 = context.resources.getString(R.string.libp7)
    var libp8q = context.resources.getString(R.string.libp8q)
    var libp8 = context.resources.getString(R.string.libp8)
    var libp9q = context.resources.getString(R.string.libp9q)
    var libp9 = context.resources.getString(R.string.libp9)
    var libp10q = context.resources.getString(R.string.libp10q)
    var libp10 = context.resources.getString(R.string.libp10)
    var libp11q = context.resources.getString(R.string.libp11q)
    var libp11 = context.resources.getString(R.string.libp11)
    var libp12q = context.resources.getString(R.string.libp12q)
    var libp12 = context.resources.getString(R.string.libp12)
    var libp13q = context.resources.getString(R.string.libp13q)
    var libp13 = context.resources.getString(R.string.libp13)
    var libp14q = context.resources.getString(R.string.libp14q)
    var libp14 = context.resources.getString(R.string.libp14)
    var libp15q = context.resources.getString(R.string.libp15q)
    var libp15 = context.resources.getString(R.string.libp15)

    var mod_note1 = context.resources.getString(R.string.mod_note1)
    var mod_note2 = context.resources.getString(R.string.mod_note2)
    var mod_note3 = context.resources.getString(R.string.mod_note3)
    var mod_note4 = context.resources.getString(R.string.mod_note4)
    var mod_note5 = context.resources.getString(R.string.mod_note5)
    var mod_note6 = context.resources.getString(R.string.mod_note6)

    var modp1q = context.resources.getString(R.string.modp1q)
    var modp1 = context.resources.getString(R.string.modp1)
    var modp2q = context.resources.getString(R.string.modp2q)
    var modp2 = context.resources.getString(R.string.modp2)
    var modp3q = context.resources.getString(R.string.modp3q)
    var modp3 = context.resources.getString(R.string.modp3)
    var modp4q = context.resources.getString(R.string.modp4q)
    var modp4 = context.resources.getString(R.string.modp4)
    var modp5q = context.resources.getString(R.string.modp5q)
    var modp5 = context.resources.getString(R.string.modp5)
    var modp6q = context.resources.getString(R.string.modp6q)
    var modp6 = context.resources.getString(R.string.modp6)
    var modp7q = context.resources.getString(R.string.modp7q)
    var modp7 = context.resources.getString(R.string.modp7)
    var modp8q = context.resources.getString(R.string.modp8q)
    var modp8 = context.resources.getString(R.string.modp8)
    var modp9q = context.resources.getString(R.string.modp9q)
    var modp9 = context.resources.getString(R.string.modp9)
    var modp10q = context.resources.getString(R.string.modp10q)
    var modp10 = context.resources.getString(R.string.modp10)
    var modp11q = context.resources.getString(R.string.modp11q)
    var modp11 = context.resources.getString(R.string.modp11)
    var modp12q = context.resources.getString(R.string.modp12q)
    var modp12 = context.resources.getString(R.string.modp12)
    var modp13q = context.resources.getString(R.string.modp13q)
    var modp13 = context.resources.getString(R.string.modp13)
    var modp14q = context.resources.getString(R.string.modp14q)
    var modp14 = context.resources.getString(R.string.modp14)
    var modp15q = context.resources.getString(R.string.modp15q)
    var modp15 = context.resources.getString(R.string.modp15)
    var modp16q = context.resources.getString(R.string.modp16q)
    var modp16 = context.resources.getString(R.string.modp16)
    var modp17q = context.resources.getString(R.string.modp17q)
    var modp17 = context.resources.getString(R.string.modp17)
    var modp18q = context.resources.getString(R.string.modp18q)
    var modp18 = context.resources.getString(R.string.modp18)
    var modp19q = context.resources.getString(R.string.modp19q)
    var modp19 = context.resources.getString(R.string.modp19)
    var modp20q = context.resources.getString(R.string.modp20q)
    var modp20 = context.resources.getString(R.string.modp20)
    var modp21q = context.resources.getString(R.string.modp21q)
    var modp21 = context.resources.getString(R.string.modp21)
    var modp22q = context.resources.getString(R.string.modp22q)
    var modp22 = context.resources.getString(R.string.modp22)
    var modp23q = context.resources.getString(R.string.modp23q)
    var modp23 = context.resources.getString(R.string.modp23)
    var modp24q = context.resources.getString(R.string.modp24q)
    var modp24 = context.resources.getString(R.string.modp24)
    var modp25q = context.resources.getString(R.string.modp25q)
    var modp25 = context.resources.getString(R.string.modp25)
    var modp26q = context.resources.getString(R.string.modp26q)
    var modp26 = context.resources.getString(R.string.modp26)

    var file_note1 = context.resources.getString(R.string.file_note1)
    var file_note2 = context.resources.getString(R.string.file_note2)
    var file_note3 = context.resources.getString(R.string.file_note3)


    var filep1q = context.resources.getString(R.string.filep1q)
    var filep1 = context.resources.getString(R.string.filep1)
    var filep2q = context.resources.getString(R.string.filep2q)
    var filep2 = context.resources.getString(R.string.filep2)
    var filep3q = context.resources.getString(R.string.filep3q)
    var filep3 = context.resources.getString(R.string.filep3)
    var filep4q = context.resources.getString(R.string.filep4q)
    var filep4 = context.resources.getString(R.string.filep4)
    var filep5q = context.resources.getString(R.string.filep5q)
    var filep5 = context.resources.getString(R.string.filep5)
    var filep6q = context.resources.getString(R.string.filep6q)
    var filep6 = context.resources.getString(R.string.filep6)
    var filep7q = context.resources.getString(R.string.filep7q)
    var filep7 = context.resources.getString(R.string.filep7)
    var filep8q = context.resources.getString(R.string.filep8q)
    var filep8 = context.resources.getString(R.string.filep8)
    var filep9q = context.resources.getString(R.string.filep9q)
    var filep9 = context.resources.getString(R.string.filep9)
    var filep10q = context.resources.getString(R.string.filep10q)
    var filep10 = context.resources.getString(R.string.filep10)
    var filep11q = context.resources.getString(R.string.filep11q)
    var filep11 = context.resources.getString(R.string.filep11)
    var filep12q = context.resources.getString(R.string.filep12q)
    var filep12 = context.resources.getString(R.string.filep12)
    var filep13q = context.resources.getString(R.string.filep13q)
    var filep13 = context.resources.getString(R.string.filep13)
    var filep14q = context.resources.getString(R.string.filep14q)
    var filep14 = context.resources.getString(R.string.filep14)
    var filep15q = context.resources.getString(R.string.filep15q)
    var filep15 = context.resources.getString(R.string.filep15)
    var filep16q = context.resources.getString(R.string.filep16q)
    var filep16 = context.resources.getString(R.string.filep16)














    override fun onCreate(db: SQLiteDatabase?) {
        //creates category table
        db!!.execSQL("CREATE TABLE note_categories(_id INTEGER PRIMARY KEY,image_resource_id TEXT, name TEXT)")

        insertNoteCategory(db,1, R.drawable.fundamentals2,"fundamentals")
        insertNoteCategory(db,2,R.drawable.decision2,"decision")
        insertNoteCategory(db,3,R.drawable.loop2,"loop")
        insertNoteCategory(db,4, R.drawable.library2,"libraryfunction")
        insertNoteCategory(db,5, R.drawable.modular2,"modularprogrammig")
        insertNoteCategory(db,6, R.drawable.fh2,"filehandling")

        //note table
        db!!.execSQL("CREATE TABLE notes(note_title TEXT, note_syntax TEXT, note_details TEXT, category_id INTEGER)")

        insertNote(db,"QBASIC","",qbDesc,1)
        insertNote(db,"Keyword","",keyword,1)
        insertNote(db,"Variable","",variable,1)
        insertNote(db,"Constant","",con,1)

        insertNote(db,"Conditional Statement","",conditionalStmt,2)
        insertNote(db,"Simple IF",ifSyntx,ifNote,2)
        insertNote(db,"IF THEN ELSE",ifElseSyntx,ifElseNote,2)
        insertNote(db,"IF ELSEIF",ifElfSyntx,ifElfNote,2)
        insertNote(db,"SELECT CASE","",selectc,2)

        insertNote(db, "Loop","",loop_note1,3)
        insertNote(db, "FOR … NEXT","",loop_note2,3)
        insertNote(db, "WHILE … WEND","",loop_note3,3)
        insertNote(db, "DO … LOOP","",loop_note4,3)
        insertNote(db, "Nested loop","",loop_note5,3)

        insertNote(db, "Function","",lib_note1,4)
        insertNote(db, "User defined function","",lib_note2,4)
        insertNote(db, "Library function","",lib_note3,4)
        insertNote(db, "Numeric functions","",lib_note4,4)
        insertNote(db, "String functions","",lib_note5,4)

        insertNote(db, "Modular Programming","",mod_note1,5)
        insertNote(db, "Modular programming in QBASIC","",mod_note2,5)
        insertNote(db, "User-defined function","",mod_note3,5)
        insertNote(db, "Example","",mod_note4,5)
        insertNote(db, "Sub-procedure","",mod_note5,5)
        insertNote(db, "Example","",mod_note6,5)

        insertNote(db, "File Handling","",file_note1,6)
        insertNote(db, "Opening a file","",file_note2,6)
        insertNote(db, "File system commands","",file_note3,6)



        //program table
        db!!.execSQL("CREATE TABLE programs(prog_question TEXT, prog_answer TEXT,category_id INTEGER)")

        insertProgram(db,"1. WAP to print Hello World.","CLS\nPRINT\"Hello World\"\nEND",1)
        insertProgram(db,"2. WAP to to display name supplied by the user.","CLS\nINPUT \"Enter your name: \";nm\n"
        +"PRINT nm\nEND",1)
        insertProgram(db,"3. WAP to display sum of two numbers supplied by user.","CLS\n"+
                "INPUT \"Enter two numbers: \"; a, b\ns = a + b\nPRINT s\nEND",1)


        //conditional statement progs
        insertProgram(db,conp1q,conp1,2)
        insertProgram(db,conp2q,conp2,2)
        insertProgram(db,conp3q,conp3,2)
        insertProgram(db,conp4q,conp4,2)
        insertProgram(db,conp5q,conp5,2)
        insertProgram(db,conp6q,conp6,2)
        insertProgram(db,conp7q,conp7,2)
        insertProgram(db,conp8q,conp8,2)
        insertProgram(db,conp9q,conp9,2)
        insertProgram(db,conp10q,conp10,2)
        insertProgram(db,conp11q,conp11,2)

        //programs of looping
        insertProgram(db,loopp1q,loopp1,3)
        insertProgram(db,loopp2q,loopp2,3)
        insertProgram(db,loopp3q,loopp3,3)
        insertProgram(db,loopp4q,loopp4,3)
        insertProgram(db,loopp5q,loopp5,3)
        insertProgram(db,loopp6q,loopp6,3)
        insertProgram(db,loopp7q,loopp7,3)
        insertProgram(db,loopp8q,loopp8,3)
        insertProgram(db,loopp9q,loopp9,3)
        insertProgram(db,loopp10q,loopp10,3)
        insertProgram(db,loopp11q,loopp11,3)
        insertProgram(db,loopp12q,loopp12,3)
        insertProgram(db,loopp13q,loopp13,3)
        insertProgram(db,loopp14q,loopp14,3)
        


        //library function progs
        insertProgram(db,libp1q,libp1,4)
        insertProgram(db,libp2q,libp2,4)
        insertProgram(db,libp3q,libp3,4)
        insertProgram(db,libp4q,libp4,4)
        insertProgram(db,libp5q,libp5,4)
        insertProgram(db,libp6q,libp6,4)
        insertProgram(db,libp7q,libp7,4)
        insertProgram(db,libp8q,libp8,4)
        insertProgram(db,libp9q,libp9,4)
        insertProgram(db,libp10q,libp10,4)
        insertProgram(db,libp11q,libp11,4)
        insertProgram(db,libp12q,libp12,4)
        insertProgram(db,libp13q,libp13,4)
        insertProgram(db,libp14q,libp14,4)
        insertProgram(db,libp15q,libp15,4)

        insertProgram(db,modp1q,modp1,5)
        insertProgram(db,modp2q,modp2,5)
        insertProgram(db,modp3q,modp3,5)
        insertProgram(db,modp4q,modp4,5)
        insertProgram(db,modp5q,modp5,5)
        insertProgram(db,modp6q,modp6,5)
        insertProgram(db,modp7q,modp7,5)
        insertProgram(db,modp8q,modp8,5)
        insertProgram(db,modp9q,modp9,5)
        insertProgram(db,modp10q,modp10,5)
        insertProgram(db,modp11q,modp11,5)
        insertProgram(db,modp12q,modp12,5)
        insertProgram(db,modp13q,modp13,5)
        insertProgram(db,modp14q,modp14,5)
        insertProgram(db,modp15q,modp15,5)
        insertProgram(db,modp16q,modp16,5)
        insertProgram(db,modp17q,modp17,5)
        insertProgram(db,modp18q,modp18,5)
        insertProgram(db,modp19q,modp19,5)
        insertProgram(db,modp20q,modp20,5)
        insertProgram(db,modp21q,modp21,5)
        insertProgram(db,modp22q,modp22,5)
        insertProgram(db,modp23q,modp23,5)
        insertProgram(db,modp24q,modp24,5)
        insertProgram(db,modp25q,modp25,5)
        insertProgram(db,modp26q,modp26,5)

        //file handling progs
        insertProgram(db,filep1q,filep1,6)
        insertProgram(db,filep2q,filep2,6)
        insertProgram(db,filep3q,filep3,6)
        insertProgram(db,filep4q,filep4,6)
        insertProgram(db,filep5q,filep5,6)
        insertProgram(db,filep6q,filep6,6)
        insertProgram(db,filep7q,filep7,6)
        insertProgram(db,filep8q,filep8,6)
        insertProgram(db,filep9q,filep9,6)
        insertProgram(db,filep10q,filep10,6)
        insertProgram(db,filep11q,filep11,6)
        insertProgram(db,filep12q,filep12,6)
        insertProgram(db,filep13q,filep13,6)
        insertProgram(db,filep14q,filep14,6)
        insertProgram(db,filep15q,filep15,6)
        insertProgram(db,filep16q,filep16,6)




    }


    fun insertNoteCategory(db:SQLiteDatabase?,id: Int, resourceId: Int, name: String){
        val contentValues = ContentValues()
        contentValues.put("_id",id)
        contentValues.put("image_resource_id",resourceId)
        contentValues.put("name",name)

        db!!.insert("note_categories",null,contentValues)
    }

    fun insertNote(db:SQLiteDatabase?,noteTitle:String, noteSyntax:String, noteDetails:String, categoryId:Int){
        val contentValues = ContentValues()
        contentValues.put("note_title",noteTitle)
        contentValues.put("note_syntax",noteSyntax)
        contentValues.put("note_details",noteDetails)
        contentValues.put("category_id",categoryId)

        db!!.insert("notes",null,contentValues)
    }

    fun insertProgram(db:SQLiteDatabase?, question:String, answer: String, categoryId: Int){
        val contentValues = ContentValues()
        contentValues.put("prog_question", question)
        contentValues.put("prog_answer", answer)
        contentValues.put("category_id", categoryId)
        db!!.insert("programs",null,contentValues)
    }

    override fun onUpgrade(db: SQLiteDatabase?, oldVersion: Int, newVersion: Int) {

    }

}