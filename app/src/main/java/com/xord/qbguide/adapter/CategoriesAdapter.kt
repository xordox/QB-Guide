package com.xord.qbguide.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.xord.qbguide.Category
import com.xord.qbguide.R

class CategoriesAdapter(val context: Context, val categories: List<Category>, val onItemClick:(Int)->Unit ):RecyclerView.Adapter<CategoriesAdapter.MyViewHolder>() {


    inner class MyViewHolder(itemView: View, val onItemCLick: (Int) -> Unit):RecyclerView.ViewHolder(itemView) {
       val categoryImage = itemView!!.findViewById<ImageView>(R.id.imageViewCategoryImage)
       val categoryName = itemView!!.findViewById<TextView>(R.id.textViewCategoryName)

       fun bindData(category: Category, context: Context){
           categoryImage.setImageResource(category.resourceId)
           categoryName.text = category.name

           itemView.setOnClickListener {
               onItemCLick(category.id)
           }
       }
   }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.category_item,parent,false)
        val myViewHolder = MyViewHolder(view,onItemClick)

        return myViewHolder
    }

    override fun getItemCount(): Int {
        return categories.count()
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder!!.bindData(categories[position], context)
    }
}