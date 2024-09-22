package com.localfoodprototip

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.android.gms.maps.CameraUpdate
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions
import com.localfoodprototip.R
import com.localfoodprototip.databinding.ActivityMainBinding

class MapActivity : AppCompatActivity(), OnMapReadyCallback {
    private lateinit var googleMap: GoogleMap
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_map)

        val mapFragment = supportFragmentManager.findFragmentById(R.id.map_fragment) as SupportMapFragment
        mapFragment.getMapAsync(this)
    }
    override fun onMapReady(map: GoogleMap) {
        googleMap = map
        val sydney = LatLng(-7.926062474209842, -34.89510851492043)
        googleMap.addMarker(MarkerOptions().position(sydney).title("BIG MONSA'S HOUSE"))
        val cameraUpdate = CameraUpdateFactory.newLatLngZoom(sydney, 15f)
        googleMap.animateCamera(cameraUpdate, 2000, null)
    }
}