package com.xord.qbguide.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.xord.qbguide.Program
import com.xord.qbguide.R

class ProgramAdapter(val context: Context,val progs:List<Program>, val onItemLongClick:(String) -> Unit):RecyclerView.Adapter<ProgramAdapter.MyViewHolder>() {

    inner class MyViewHolder(itemView: View, onItemLongClick: (String) -> Unit):RecyclerView.ViewHolder(itemView) {
        var progQues = itemView.findViewById<TextView>(R.id.tv_question)
        val progSoln = itemView.findViewById<TextView>(R.id.tv_answer)

        fun bindProg(category:Program,context: Context){
            progQues.text = category.pQuestion
            progSoln.text = category.pSolution
            itemView.setOnLongClickListener {
                onItemLongClick(category.pSolution)
                true

            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.program_item,parent,false)
        val myViewHolder = MyViewHolder(view,onItemLongClick)

        return myViewHolder
    }

    override fun getItemCount(): Int {
       return progs.count()
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder!!.bindProg(progs[position],context)
    }
}