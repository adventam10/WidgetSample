package com.example.widgetsample

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView.*

class RecyclerViewAdapter(context: Context, private val onItemClicked: (position: Int, item: String) -> Unit) : Adapter<RecyclerViewAdapter.RecyclerViewHolder>() {

    private val list = listOf("AAA", "BBB", "CCC", "DDD", "EEE")
    private val inflater = LayoutInflater.from(context)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerViewHolder {
        val view  = inflater.inflate(R.layout.recycler_row, parent, false)
        val viewHolder = RecyclerViewHolder(view)
        view.setOnClickListener {
            val position = viewHolder.adapterPosition
            val item = list[position]
            onItemClicked(position, item)
        }
        return  viewHolder
    }

    override fun getItemCount() = list.size

    override fun onBindViewHolder(holder: RecyclerViewHolder, position: Int) {
        val item = list[position]
        holder.text.text = item
    }

    class RecyclerViewHolder(view: View) : ViewHolder(view) {
        val text = view.findViewById<TextView>(R.id.text)
    }
}