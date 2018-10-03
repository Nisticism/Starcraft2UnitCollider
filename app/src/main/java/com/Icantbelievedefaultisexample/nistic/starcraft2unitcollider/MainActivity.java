package com.Icantbelievedefaultisexample.nistic.starcraft2unitcollider;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button unitVUnit;
    Button allInteractions;
    Button createAStatistic;
    Button unitInfoDatabase;
    Button appDescription;

    protected BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_unit_v_unit:
                    startActivity(new Intent(getBaseContext(), UnitVUnit.class));
                    return true;
                case R.id.navigation_unit_database:
                    startActivity(new Intent(getBaseContext(), UnitDatabase.class));
                    return true;
                case R.id.navigation_create_a_stat:
                    startActivity(new Intent(getBaseContext(), CreateAStatistic.class));
                    return true;
                case R.id.navigation_all_interactions:
                    startActivity(new Intent(getBaseContext(), AllInteractions.class));
                    return true;
            }
            return false;
        }
    };



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_menu);

        unitVUnit = findViewById(R.id.unitVUnit);
        allInteractions = findViewById(R.id.allInteractions);
        createAStatistic = findViewById(R.id.createAStat);
        unitInfoDatabase = findViewById(R.id.unitDatabase);
        appDescription = findViewById(R.id.appDescription);

        unitVUnit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getBaseContext(), UnitVUnit.class));
            }
        });
        allInteractions.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getBaseContext(), AllInteractions.class));
            }
        });
        createAStatistic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getBaseContext(), CreateAStatistic.class));
            }
        });
        unitInfoDatabase.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getBaseContext(), UnitDatabase.class));
            }
        });
        appDescription.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getBaseContext(), appDescrip.class));
            }
        });
        BottomNavigationView navigation = findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
        navigation.getMenu().getItem(0).setCheckable(false);
    }
}
