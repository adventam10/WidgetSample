package com.example.widgetsample

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView

class GridViewAdapter(private val context: Context,
                      private val imageList: List<Int>) : BaseAdapter() {

    private val inflater = LayoutInflater.from(context)

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val view = convertView ?: createView(parent)
        val item =  getItem(position)
        val viewHolder = view.tag as ViewHolder
        viewHolder.image.setImageResource(item)
        return view
    }

    override fun getItem(position: Int) = imageList[position]

    override fun getItemId(position: Int) = position.toLong()

    override fun getCount() = imageList.size

    private fun createView(parent: ViewGroup?): View {
        val view = inflater.inflate(R.layout.grid_item, parent, false)
        view.tag = ViewHolder(view)
        return view
    }
    private class ViewHolder(view: View) {
        val image = view.findViewById<ImageView>(R.id.image)
    }
}