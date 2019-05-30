package com.Icantbelievedefaultisexample.nistic.starcraft2unitcollider;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.io.File;

import static android.content.res.Configuration.ORIENTATION_LANDSCAPE;
import static android.content.res.Configuration.ORIENTATION_PORTRAIT;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "Main Activity: ";
    public Float pixelDensity = 0.0f;
    public Integer sdkNum = Build.VERSION.SDK_INT;
    public static DatabaseHelper unitDB;

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
        setContentView(R.layout.main_menu);
        int orientation = getResources().getConfiguration().orientation;
        pixelDensity = getResources().getDisplayMetrics().density;
        textView = findViewById(R.id.textView);

        unitDB = new DatabaseHelper(this);

        //  Upgrade the database in case some things have changed
        unitDB.onUpgrade(unitDB.getReadableDatabase(), 1, 2);
        Log.d(TAG, "onCreate: Database updated");

        unitVUnit = findViewById(R.id.unitVUnit);
        allInteractions = findViewById(R.id.allInteractions);
        createAStatistic = findViewById(R.id.createAStat);
        unitInfoDatabase = findViewById(R.id.unitDatabase);
        appDescription = findViewById(R.id.appDescription);

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

        if (sdkNum < 26) {
            if (orientation == ORIENTATION_PORTRAIT) {
                textView.setPadding(4, 4, 4, 4);
                unitVUnit.setPadding(4,4,4,4);
                allInteractions.setPadding(4,4,4,4);
                createAStatistic.setPadding(4,4,4,4);
                unitInfoDatabase.setPadding(4,4,4,4);
                appDescription.setPadding(2,2,2,2);
            }
            if (pixelDensity < 2.1) {
                textView.setTextSize(20);
                unitVUnit.setTextSize(13);
                allInteractions.setTextSize(13);
                createAStatistic.setTextSize(13);
                unitInfoDatabase.setTextSize(13);
                appDescription.setTextSize(9);

                navigation.setItemTextAppearanceInactive(R.style.BottomNavigationViewLow);
                navigation.setItemTextAppearanceActive(R.style.BottomNavigationViewActiveLow);
            }
        }

        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);

        navigation.getMenu().setGroupCheckable(0, false, true);
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

    @Override
    public void onDestroy(){
        super.onDestroy();
        unitDB.close();
    }
}
