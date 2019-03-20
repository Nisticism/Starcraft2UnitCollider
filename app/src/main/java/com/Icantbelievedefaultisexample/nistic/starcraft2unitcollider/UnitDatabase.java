package com.Icantbelievedefaultisexample.nistic.starcraft2unitcollider;

import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Color;
import android.graphics.PointF;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.LinearSmoothScroller;
import android.support.v7.widget.RecyclerView;
import android.view.Gravity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.support.v7.widget.SearchView;
import android.widget.Toast;

import java.sql.Statement;
import java.util.ArrayList;
import java.util.Arrays;


import static com.Icantbelievedefaultisexample.nistic.starcraft2unitcollider.unitsMade.*;

public class UnitDatabase extends MainActivity{

    private Float pixelDensity = 0.0f;

    Button home;
    Button search;
    SearchView s;
    String queryString = "";
    Button allUnits;
    private newLayoutManager zLayoutManager;
    private newLayoutManager tLayoutManager;
    private newLayoutManager pLayoutManager;

    private android.support.v7.widget.RecyclerView recyclerViewZ;
    private RecyclerView.Adapter zAdapter;

    private RecyclerView recyclerViewP;
    private RecyclerView.Adapter pAdapter;

    private RecyclerView recyclerViewT;
    private RecyclerView.Adapter tAdapter;

    public unitItem[] zUnitArray;
    public unitItem[] tUnitArray;
    public unitItem[] pUnitArray;
    public unitItem[] allUnitArray;

    private Parcelable state;
    public static DatabaseHelper unitDB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.unit_information_database);
        unitDB = new DatabaseHelper(this);
        pixelDensity = getResources().getDisplayMetrics().density;

        zUnitArray = new unitItem[]{baneling,broodlord, broodling, changeling, corruptor, drone, hydralisk, infestedterran, infestor, larva, locust, lurker,
                mutalisk, nydusworm, overlord, overseer, queen, ravager, roach, spinecrawler, sporecrawler, swarmhost, ultralisk, viper, zergling};

        tUnitArray = new unitItem[]{autoturret,banshee,battlecruiser,cyclone,ghost,hellbat,hellion,liberatordefender,liberatorfighter,marauder,marine,
        medivac,missileturret,mule,planetaryfortress,raven,reaper,scv,siegetanksieged,siegetanktank,thorexplosive,thorimpact,vikingassault,vikingfighter,
        widowmine};

        pUnitArray = new unitItem[]{adept, archon, carrier, colossus, darktemplar, disruptor, hightemplar, immortal, interceptor, mothership, observer, oracle,
        phoenix, photoncannon, probe, sentry, stalker, tempest, voidray, warpprism, zealot};

        allUnitArray = new unitItem[]{baneling,broodlord, broodling, changeling, corruptor, drone, hydralisk, infestedterran, infestor, larva, locust, lurker,
                mutalisk, nydusworm, overlord, overseer, queen, ravager, roach, spinecrawler, sporecrawler, swarmhost, ultralisk, viper, zergling, autoturret,banshee,battlecruiser,cyclone,ghost,hellbat,hellion,liberatordefender,liberatorfighter,marauder,marine,
                medivac,missileturret,mule,planetaryfortress,raven,reaper,scv,siegetanksieged,siegetanktank,thorexplosive,thorimpact,vikingassault,vikingfighter,
                widowmine, adept, archon, carrier, colossus, darktemplar, disruptor, hightemplar, immortal, interceptor, mothership, observer, oracle,
                phoenix, photoncannon, probe, sentry, stalker, tempest, voidray, warpprism, zealot};

        recyclerViewZ = findViewById(R.id.zergcycle);
        recyclerViewZ.setHasFixedSize(true);
        recyclerViewP = findViewById(R.id.protosscycle);
        recyclerViewP.setHasFixedSize(true);
        recyclerViewT = findViewById(R.id.terrancycle);
        recyclerViewT.setHasFixedSize(true);

        zLayoutManager = new newLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        pLayoutManager = new newLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        tLayoutManager = new newLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);

        recyclerViewZ.setLayoutManager(zLayoutManager);
        zAdapter = new RecyclerAdapt(zUnitArray, getBaseContext());
        recyclerViewZ.setAdapter(zAdapter);

        recyclerViewP.setLayoutManager(pLayoutManager);
        pAdapter = new RecyclerAdapt(pUnitArray, getBaseContext());
        recyclerViewP.setAdapter(pAdapter);

        recyclerViewT.setLayoutManager(tLayoutManager);
        tAdapter = new RecyclerAdapt(tUnitArray, getBaseContext());
        recyclerViewT.setAdapter(tAdapter);

        // Load state experiment...
//        recyclerViewZ.getLayoutManager().onRestoreInstanceState(state);
//        state=savedInstanceState.getParcelable("state");

        home = findViewById(R.id.home);
        if (pixelDensity < 2.1) {
            home.setTextSize(12);
        }
        search = findViewById(R.id.search);
        if (pixelDensity < 2.1) {
            search.setTextSize(12);
        }
        s = findViewById(R.id.searchBar);
        allUnits = findViewById(R.id.allUnits);
        if (pixelDensity < 2.1) {
            allUnits.setTextSize(12);
        }

        final SearchView.SearchAutoComplete sAutoComplete = (SearchView.SearchAutoComplete)s.findViewById(android.support.v7.appcompat.R.id.search_src_text);
        sAutoComplete.setBackgroundColor(getResources().getColor(R.color.lilac));
        sAutoComplete.setTextColor(getResources().getColor(R.color.grayGreen));
        sAutoComplete.setDropDownBackgroundResource(R.color.lilac);

        String dataArr[] = {adept.getUnitName(),archon.getUnitName(),autoturret.getUnitName(),baneling.getUnitName(),banshee.getUnitName(),battlecruiser.getUnitName(),broodlord.getUnitName(),
                broodling.getUnitName(), carrier.getUnitName(),changeling.getUnitName(),colossus.getUnitName(), corruptor.getUnitName(),cyclone.getUnitName(),darktemplar.getUnitName(),
                disruptor.getUnitName(), drone.getUnitName(), ghost.getUnitName(),hellbat.getUnitName(),hellion.getUnitName(),hightemplar.getUnitName(),
                hydralisk.getUnitName(),immortal.getUnitName(), infestedterran.getUnitName(), infestor.getUnitName(),interceptor.getUnitName(), larva.getUnitName(),liberatordefender.getUnitName(),
                liberatorfighter.getUnitName(), locust.getUnitName(), lurker.getUnitName(),marauder.getUnitName(),marine.getUnitName(), medivac.getUnitName(),missileturret.getUnitName(),
                mothership.getUnitName(),mule.getUnitName(), mutalisk.getUnitName(), nydusworm.getUnitName(), observer.getUnitName(), oracle.getUnitName(), overlord.getUnitName(),
                overseer.getUnitName(),phoenix.getUnitName(), photoncannon.getUnitName(),planetaryfortress.getUnitName(), probe.getUnitName(), queen.getUnitName(), ravager.getUnitName(),
                raven.getUnitName(),reaper.getUnitName(), roach.getUnitName(),scv.getUnitName(),sentry.getUnitName(),siegetanksieged.getUnitName(),siegetanktank.getUnitName(), spinecrawler.getUnitName(),
                sporecrawler.getUnitName(),stalker.getUnitName(), swarmhost.getUnitName(),tempest.getUnitName(),thorexplosive.getUnitName(),thorimpact.getUnitName(), ultralisk.getUnitName(),
                vikingassault.getUnitName(),vikingfighter.getUnitName(), viper.getUnitName(),voidray.getUnitName(),warpprism.getUnitName(),widowmine.getUnitName(),zealot.getUnitName(),
                zergling.getUnitName()};

        //populator();

        ArrayAdapter<String> newsAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_dropdown_item_1line, dataArr);
        sAutoComplete.setAdapter(newsAdapter);

        sAutoComplete.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int itemIndex, long id) {
                queryString=(String)adapterView.getItemAtPosition(itemIndex);
                sAutoComplete.setText("" + queryString);
            }
        });

        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
                startActivity(new Intent(getBaseContext(), MainActivity.class));
                overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
            }
        });

        allUnits.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
                startActivity(new Intent(getBaseContext(), AllUnitsDB.class));
                overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
            }
        });

        search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                queryString = s.getQuery().toString();
                Integer count = 0;
                for (int i = 0; i < 25; i++) {
                    if (zUnitArray[i].getUnitName().equals(queryString)) {
                        recyclerViewZ.smoothScrollToPosition(i);
                        count += 1;
                    }
                }
                for (int i = 0; i < 25; i++) {
                    if (tUnitArray[i].getUnitName().equals(queryString)) {
                        recyclerViewT.smoothScrollToPosition(i);
                        count += 1;
                    }
                }
                for (int i = 0; i < 21; i++) {
                    if (pUnitArray[i].getUnitName().equals(queryString)) {
                        recyclerViewP.smoothScrollToPosition(i);
                        count += 1;
                    }
                }
                if (count == 0) {
                    Toast toast1 = Toast.makeText(getBaseContext(), "No results found for \'" + queryString + "\'", Toast.LENGTH_SHORT);
                    toast1.setGravity(Gravity.CENTER, 0, -130);
                    toast1.show();
                }
            }
        });

        BottomNavigationView navigation = findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
        navigation.getMenu().getItem(1).setChecked(true);
    }

    @Override
    public void onSaveInstanceState(Bundle outState) throws NullPointerException {
        super.onSaveInstanceState(outState);

        outState.putParcelable("state", recyclerViewZ.getLayoutManager().onSaveInstanceState());

    }


    //  To remember the columns:
    //          String id,String name,int pic1,Integer hp, Integer dmg1, Integer dmg2, Integer armor, Integer cargo, Integer supply, Integer minerals, Integer gas, Integer buildTime,
    //          Double speed, Double attackSpeed1, Double attackSpeed2, String bonuses, Integer rangevsGround, Integer rangevsAir, Integer lOS, Integer lOS2, Double unitSize, String upgrades,
    //          String specialAbilities, Integer energy, String techRequired, Integer shields, Integer warpGateCoolDown

//    public void populator() {
//        unitDB.insertData("Adept", null, 70, 10, null, 1, 2, 2, 100, 25, 27, 3.5, 1.61, 1.11, "+12 vs Light"
//                , 4, null, 9, null, 1.0, "Ground Weapons Levels 1-3 (+1 each), Ground Armor Levels 1-3 (+1 each), & Shields Levels 1-3 (+1 shields armor each)",
//                "Resonating Glaves (Adepts attack 0.5 seconds faster) researched by Twilight Counsil", null, "Gateway", 70, 20, );
//    }
}
