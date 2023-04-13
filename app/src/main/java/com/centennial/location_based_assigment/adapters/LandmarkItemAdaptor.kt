package com.centennial.location_based_assigment.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.centennial.location_based_assigment.R
import com.centennial.location_based_assigment.models.Landmark

class LandmarkAdapter(private val landmarks: List<Landmark>) :
    RecyclerView.Adapter<LandmarkAdapter.ViewHolder>() {

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val nameTextView: TextView = itemView.findViewById(R.id.landmark_name)
        val locationTextView: TextView = itemView.findViewById(R.id.landmark_location)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.landmark_item, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val landmark = landmarks[position]
        holder.nameTextView.text = landmark.name
        holder.locationTextView.text = "${landmark.province_name}"
    }

    override fun getItemCount(): Int {
        return landmarks.size
    }
}