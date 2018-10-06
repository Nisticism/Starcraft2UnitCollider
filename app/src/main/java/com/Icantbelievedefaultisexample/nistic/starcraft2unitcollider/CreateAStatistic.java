package com.Icantbelievedefaultisexample.nistic.starcraft2unitcollider;

import android.os.Bundle;
import android.support.design.widget.BottomNavigationView;

public class CreateAStatistic extends MainActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.create_a_statistic);
        BottomNavigationView navigation = findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
        navigation.getMenu().getItem(2).setChecked(true);
    }
}
