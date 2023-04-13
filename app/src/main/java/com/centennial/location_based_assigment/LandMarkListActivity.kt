package com.centennial.location_based_assigment

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.centennial.location_based_assigment.adapters.LandmarkAdapter
import com.centennial.location_based_assigment.models.Landmark
import com.google.gson.Gson

class LandMarkListActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_land_mark_list)

        // get the landmark type extra from the intent
        val landmarkType = intent.getStringExtra("landmarkType")

        title = landmarkType

        // create the RecyclerView
        val recyclerView = findViewById<RecyclerView>(R.id.recycler_view)

        // set the RecyclerView to use a linear layout manager
        recyclerView.layoutManager = LinearLayoutManager(this)

        // use the landmark type to filter the list of landmarks
        val landmarks = Landmark.getLandmarks().filter { it.typeOfLandMark == landmarkType }

        // set the adapter for the RecyclerView with a lambda expression for item click events
        recyclerView.adapter = LandmarkAdapter(landmarks) { landmark ->
            // create a Gson object
            val gson = Gson()

            // convert the landmark object to JSON using Gson
            val landmarkJson = gson.toJson(landmark)

            // create a new intent for the MapsActivity
            val intent = Intent(this, MapsActivity::class.java)

            // pass the landmark JSON string as an extra to the MapsActivity
            intent.putExtra("landmarkJson", landmarkJson)

            // start the MapsActivity
            startActivity(intent)
        }


    }

}

