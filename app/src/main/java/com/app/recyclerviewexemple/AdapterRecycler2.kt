package com.app.recyclerviewexemple

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class AdapterRecycler2(private var titlies: List<String>):
RecyclerView.Adapter<AdapterRecycler2.ViewHolder>(){

    inner class ViewHolder(ItemView:View): RecyclerView.ViewHolder(ItemView){

    val itemTitle = ItemView.findViewById<TextView>(R.id.tv_title3)


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.item_layout_tipe1, parent, false)
        return ViewHolder(v)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.itemTitle.text = titlies[position]

    }

    override fun getItemCount(): Int {
    return titlies.size
    }


}