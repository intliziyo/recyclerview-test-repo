package com.example.gitrecyclerviewtest.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.gitrecyclerviewtest.R

class ItemListAdapter(private val context: Context, private val dataset: MutableList<String>) :
    RecyclerView.Adapter<ItemListAdapter.ItemListViewHolder>() {
    class ItemListViewHolder(v: View) : RecyclerView.ViewHolder(v) {

        val textView: TextView = v.findViewById(R.id.item_title)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemListViewHolder {
        val adapterLayout = LayoutInflater
            .from(parent.context)
            .inflate(R.layout.list_item, parent, false)

        return ItemListViewHolder(adapterLayout)
    }

    override fun getItemCount(): Int = dataset.size

    override fun onBindViewHolder(holder: ItemListViewHolder, position: Int) {
        val item = dataset[position]
        holder.textView.text = item
        holder.textView.setOnClickListener {
            val toast = Toast.makeText(context, "${item}", Toast.LENGTH_SHORT)
            toast.show()
        }
    }
}