package com.Icantbelievedefaultisexample.nistic.starcraft2unitcollider;

import android.os.Bundle;
import android.support.design.widget.BottomNavigationView;

public class UnitDatabase extends MainActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.unit_information_database);
        BottomNavigationView navigation = findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
        navigation.getMenu().getItem(1).setChecked(true);
    }
}
