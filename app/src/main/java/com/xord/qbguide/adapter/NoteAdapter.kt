package com.xord.qbguide.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.xord.qbguide.NoteCategory
import com.xord.qbguide.R

class NoteAdapter(val context: Context, val notes:List<NoteCategory>):RecyclerView.Adapter<NoteAdapter.MyViewHolder>() {

    inner class MyViewHolder(itemView:View):RecyclerView.ViewHolder(itemView){

        val noteTitle = itemView!!.findViewById<TextView>(R.id.tv_title)
        val noteSyntax = itemView!!.findViewById<TextView>(R.id.tv_syntax)
        val noteDetails = itemView!!.findViewById<TextView>(R.id.tv_desc)

        fun bindData(category: NoteCategory,context: Context){
            noteTitle.text = category.noteTitle
            noteSyntax.text = category.noteSyntax
            noteDetails.text = category.noteDesc
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.note_details_item,parent,false)
        val myViewHolder = MyViewHolder(view)

        return myViewHolder
    }

    override fun getItemCount(): Int {
        return notes.count()
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder!!.bindData(notes[position], context)
    }
}