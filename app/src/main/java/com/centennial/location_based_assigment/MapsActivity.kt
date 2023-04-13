package com.centennial.location_based_assigment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions
import com.centennial.location_based_assigment.databinding.ActivityMapsBinding
import com.centennial.location_based_assigment.models.Landmark
import com.google.gson.Gson

class MapsActivity : AppCompatActivity(), OnMapReadyCallback {

    private lateinit var mMap: GoogleMap
    private lateinit var binding: ActivityMapsBinding
    private lateinit var landmark: Landmark

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMapsBinding.inflate(layoutInflater)
        setContentView(binding.root)


        // get the landmark JSON string extra from the intent
        val landmarkJson = intent.getStringExtra("landmarkJson")

        // deserialize the JSON string to a Landmark object using Gson
        landmark = Gson().fromJson(landmarkJson, Landmark::class.java)

        // obtain the SupportMapFragment and get notified when the map is ready to be used.
        val mapFragment = supportFragmentManager
            .findFragmentById(R.id.map) as SupportMapFragment
        mapFragment.getMapAsync(this)
    }

    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    override fun onMapReady(googleMap: GoogleMap) {
        mMap = googleMap
        mMap.mapType = GoogleMap.MAP_TYPE_SATELLITE
        // Add a marker in Sydney and move the camera
        val markerPosition = LatLng(landmark.latitude, landmark.longitude)
        mMap.addMarker(MarkerOptions().position(markerPosition).title(landmark.name))
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(markerPosition, 15.0f))
    }
}