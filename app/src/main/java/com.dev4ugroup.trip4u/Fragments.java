package com.dev4ugroup.trip4u;

import android.support.v4.app.Fragment;

import com.dev4ugroup.trip4u.ui.Infomation;
import com.dev4ugroup.trip4u.ui.Flashlight;
import com.dev4ugroup.trip4u.ui.NearGasStation;
import com.dev4ugroup.trip4u.ui.NearMotel;
import com.dev4ugroup.trip4u.ui.SettingsApp;
import com.dev4ugroup.trip4u.ui.Maps;



public enum Fragments {

  Maps(Maps.class), Flashlight(Flashlight.class), NearGasStation(NearGasStation.class),
  NearMotel(NearMotel.class), Settings(SettingsApp.class), Infomation(Infomation.class);

  final Class<? extends Fragment> fragment;

  Fragments(Class<? extends Fragment> fragment) {
    this.fragment = fragment;
  }

  public String getFragment() {
    return fragment.getName();
  }
}
