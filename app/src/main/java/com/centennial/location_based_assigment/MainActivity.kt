package com.centennial.location_based_assigment

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.GridView
import com.centennial.location_based_assigment.adapters.MyGridAdapter
import com.centennial.location_based_assigment.adapters.MyGridItem

class MainActivity : AppCompatActivity() {
    val landmarkTypes = arrayOf("Natural", "Historical", "Cultural", "Architectural", "Geographical", "Political", "Tourist")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val gridView = findViewById<GridView>(R.id.gridView)
        val gridItems = listOf(
            MyGridItem(R.drawable.nature, "Natural"),
            MyGridItem(R.drawable.history, "Historical"),
            MyGridItem(R.drawable.culture, "Cultural"),
            MyGridItem(R.drawable.political, "Political"),
            MyGridItem(R.drawable.tourist, "Tourist"),
            MyGridItem(R.drawable.buildings, "Architectural")
        )

        gridView.adapter = MyGridAdapter(gridItems)

        // Customize the appearance of the grid view here
    }
}