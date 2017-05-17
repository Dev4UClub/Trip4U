package com.dev4uclub.trips4u.slidelist;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.dev4uclub.trips4u.R;


@SuppressLint("NewApi")
public class Flashlight extends Fragment {
@Override
    public View onCreateView(LayoutInflater inf, ViewGroup container, Bundle savedInstanceState)
    {
    View rootView = inf.inflate(R.layout.flashlight,container,false);
    return rootView;
    }
}
