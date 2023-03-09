package com.example.gitrecyclerviewtest

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import com.example.gitrecyclerviewtest.adapter.ItemListAdapter
import com.example.gitrecyclerviewtest.data.Datasource

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var items = Datasource().mushroomAndPlantList
        items = items.sorted() as MutableList<String>
        val recyclerView = findViewById<RecyclerView>(R.id.recycler_view)
        recyclerView.adapter = ItemListAdapter(this, items)
    }
}