package com.centennial.location_based_assigment.adapters

import android.graphics.Color
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import com.centennial.location_based_assigment.R

class MyGridItem(val imageResId: Int, val title: String)

class MyGridAdapter(private val items: List<MyGridItem>) : BaseAdapter() {

    override fun getCount(): Int {
        return items.size
    }

    override fun getItem(position: Int): Any {
        return items[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val view: View = convertView ?: LayoutInflater.from(parent?.context).inflate(R.layout.my_grid_item_layout, parent, false)

        val item = items[position]

        val imageView = view.findViewById<ImageView>(R.id.grid_item_image)
        imageView.setImageResource(item.imageResId)

        val titleView = view.findViewById<TextView>(R.id.grid_item_title)
        titleView.text = item.title

        return view
    }
}