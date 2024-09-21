package com.example.swipeable_view

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.appcompat.view.menu.MenuView.ItemView
import androidx.recyclerview.widget.RecyclerView
import com.example.swipeable_view.ViewPageAdapter.*

class ViewPageAdapter(
    val image : List<Int>
    ):RecyclerView.Adapter<ViewPageViewHolder>()
{
        inner class ViewPageViewHolder(itemView: View) :RecyclerView.ViewHolder(itemView)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewPageViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_view_pager,parent,false)
        return ViewPageViewHolder(view)
    }

    override fun getItemCount(): Int {
       return image.size
    }

    override fun onBindViewHolder(holder: ViewPageViewHolder, position: Int) {
        val curImg = image[position]
        val img:ImageView = holder.itemView.findViewById(R.id.ivimg)

        img.setImageResource(curImg)

    }
}