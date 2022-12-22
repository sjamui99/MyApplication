package com.example.mynewsapplication

import android.content.Context
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView

class MyAdapter(val context: Context):RecyclerView.Adapter<MyAdapter.MyViewHolder>() {
    inner class MyViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
        val img = itemView.findViewById<ImageView>(R.id.myImage)
        val txt = itemView.findViewById<ImageView>(R.id.myText)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }
}