package com.dev4ugroup.trip4u;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.dev4ugroup.trip4u.R;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsDisplay extends AppCompatActivity
        implements OnMapReadyCallback {

    GoogleMap map;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_main);
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.mapapi);
        mapFragment.getMapAsync(this);
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {

        LatLng hanoistation = new LatLng(21.025305, 105.841222);
        googleMap.addMarker(new MarkerOptions().position(hanoistation)
                .title("Marker in Hanoi Station"));
        googleMap.moveCamera(CameraUpdateFactory.newLatLng(hanoistation));

        map.setMapType(GoogleMap.MAP_TYPE_HYBRID);
    }


}
