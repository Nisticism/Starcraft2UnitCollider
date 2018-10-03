package com.Icantbelievedefaultisexample.nistic.starcraft2unitcollider;

import android.os.Bundle;
import android.support.design.widget.BottomNavigationView;

public class AllInteractions extends MainActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.all_interactions);
        BottomNavigationView navigation = findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
    }
}
