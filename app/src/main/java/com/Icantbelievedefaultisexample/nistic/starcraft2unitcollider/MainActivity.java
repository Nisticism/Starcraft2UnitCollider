package com.Icantbelievedefaultisexample.nistic.starcraft2unitcollider;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.io.File;

public class MainActivity extends AppCompatActivity {

    private Float pixelDensity = 0.0f;

    Button unitVUnit;
    Button allInteractions;
    Button createAStatistic;
    Button unitInfoDatabase;
    Button appDescription;

    TextView textView;

    protected BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_unit_v_unit:
                    finish();
                    Intent uintent = new Intent(getBaseContext(), UnitVUnit.class);
                    uintent.addFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
                    startActivity(uintent);
                    overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
                    break;
                case R.id.navigation_unit_database:
                    finish();
                    startActivity(new Intent(getBaseContext(), UnitDatabase.class));
                    overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
                    break;
                case R.id.navigation_create_a_stat:
                    finish();
                    startActivity(new Intent(getBaseContext(), TakeQuiz.class));
                    overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
                    break;
                case R.id.navigation_all_interactions:
                    finish();
                    startActivity(new Intent(getBaseContext(), AllInteractions.class));
                    overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
                    break;
            }
            return false;
        }
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.all_units_db);
        setContentView(R.layout.main_menu);

        clearApplicationData();


        pixelDensity = getResources().getDisplayMetrics().density;
        textView = findViewById(R.id.textView);
        if (pixelDensity < 2.1) {
            textView.setTextSize(20);
        }
        unitVUnit = findViewById(R.id.unitVUnit);
        if (pixelDensity < 2.1) {
            unitVUnit.setTextSize(13);
        }
        allInteractions = findViewById(R.id.allInteractions);
        if (pixelDensity < 2.1) {
            allInteractions.setTextSize(13);
        }
        createAStatistic = findViewById(R.id.createAStat);
        if (pixelDensity < 2.1) {
            createAStatistic.setTextSize(13);
        }
        unitInfoDatabase = findViewById(R.id.unitDatabase);
        if (pixelDensity < 2.1) {
            unitInfoDatabase.setTextSize(13);
        }
        appDescription = findViewById(R.id.appDescription);
        if (pixelDensity < 2.1) {
            appDescription.setTextSize(11);
        }

        unitVUnit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getBaseContext(), UnitVUnit.class));
                overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
            }
        });
        allInteractions.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getBaseContext(), AllInteractions.class));
                overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
            }
        });
        createAStatistic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getBaseContext(), TakeQuiz.class));
                overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
            }
        });
        unitInfoDatabase.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getBaseContext(), UnitDatabase.class));
                overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
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

    public void clearApplicationData() {
        File cacheDirectory = getCacheDir();
        File applicationDirectory = new File(cacheDirectory.getParent());
        if (applicationDirectory.exists()) {
            String[] fileNames = applicationDirectory.list();
            for (String fileName : fileNames) {
                if (!fileName.equals("lib")) {
                    deleteFile(new File(applicationDirectory, fileName));
                }
            }
        }
    }

    public static boolean deleteFile(File file) {
        boolean deletedAll = true;
        if (file != null) {
            if (file.isDirectory()) {
                String[] children = file.list();
                for (int i = 0; i < children.length; i++) {
                    deletedAll = deleteFile(new File(file, children[i])) && deletedAll;
                }
            } else {
                deletedAll = file.delete();
            }
        }

        return deletedAll;
    }
}
