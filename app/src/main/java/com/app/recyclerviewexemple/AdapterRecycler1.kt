package com.app.recyclerviewexemple

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import de.hdodenhof.circleimageview.CircleImageView

class AdapterRecycler1(private var image: List<Int>):
RecyclerView.Adapter<AdapterRecycler1.ViewHolder>()
{
    inner class ViewHolder(ItemView: View): RecyclerView.ViewHolder(ItemView){
        val images = ItemView.findViewById<ImageView>(R.id.iv_image)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val vi = LayoutInflater.from(parent.context).inflate(R.layout.item_layout_photo, parent, false)
        return ViewHolder(vi)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.images.setImageResource(image[position])
    }

    override fun getItemCount(): Int {
  return image.size
    }
}