package com.centennial.location_based_assigment

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.GridView
import android.widget.Toast
import com.centennial.location_based_assigment.adapters.MyGridAdapter
import com.centennial.location_based_assigment.adapters.MyGridItem

class MainActivity : AppCompatActivity() {
    val landmarkTypes = arrayOf("Natural", "Historical", "Cultural", "Architectural", "Geographical", "Political", "Tourist")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val gridView = findViewById<GridView>(R.id.gridView)
        val gridItems = listOf(
            MyGridItem(R.drawable.nature, "Natural Landmark"),
            MyGridItem(R.drawable.history, "Historical Landmark"),
            MyGridItem(R.drawable.culture, "Cultural Landmark"),
            MyGridItem(R.drawable.political, "Political Landmark"),
            MyGridItem(R.drawable.tourist, "Tourist Landmark"),
            MyGridItem(R.drawable.buildings, "Architectural Landmark")
        )

        gridView.adapter = MyGridAdapter(gridItems)

        gridView.onItemClickListener = AdapterView.OnItemClickListener { parent, view, position, id ->
            // handle clicks on the grid items here
            val type = gridItems[position].title

            // start the LandMarkListActivity and pass the landmark type as an extra
            val intent = Intent(this, LandMarkListActivity::class.java).apply {
                putExtra("landmarkType", type)
            }
            startActivity(intent)

        }
    }
}