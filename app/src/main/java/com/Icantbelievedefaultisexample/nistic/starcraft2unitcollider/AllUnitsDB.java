package com.Icantbelievedefaultisexample.nistic.starcraft2unitcollider;

import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Color;
import android.graphics.PointF;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.widget.CardView;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.LinearSmoothScroller;
import android.support.v7.widget.RecyclerView;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.support.v7.widget.SearchView;
import android.widget.GridLayout;
import android.widget.Toast;
import android.widget.ViewFlipper;

import java.sql.Statement;
import java.util.ArrayList;
import java.util.Arrays;


import static com.Icantbelievedefaultisexample.nistic.starcraft2unitcollider.unitsMade.*;
import static com.Icantbelievedefaultisexample.nistic.starcraft2unitcollider.UnitDatabase.unitDB;

public class AllUnitsDB extends MainActivity{

    Button search;
    Button home;
    Button backToDB;
    Button toggleMixed;
    SearchView s;
    String queryString = "";
    GridLayout allUnits;
    Boolean Mixed;

    Button toggleMixed2;
    Button search2;
    Button home2;
    Button backToDB2;
    SearchView s2;
    GridLayout allUnits2;
    String queryString2 = "";

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

    unitItem[] allUnitMixedArray = new unitItem[] {adept,archon,autoturret,baneling,banshee,battlecruiser,broodlord,broodling,carrier,changeling,colossus,corruptor,cyclone,darktemplar,disruptor,drone,
            ghost,hellbat,hellion,hightemplar,hydralisk,immortal,infestedterran,infestor,interceptor,larva,liberatordefender,liberatorfighter,locust,lurker,marauder,marine,medivac,missileturret,
            mothership,mule,mutalisk,nydusworm,observer,oracle,overlord,overseer,phoenix,photoncannon,planetaryfortress,probe,queen,ravager,raven,reaper,roach,scv,sentry,siegetanksieged,
            siegetanktank,spinecrawler,sporecrawler,stalker,swarmhost,tempest,thorexplosive,thorimpact,ultralisk,vikingassault,vikingfighter,viper,voidray,warpprism,widowmine,zealot,zergling};

    private android.support.v7.widget.RecyclerView recyclerViewZ;

    public unitItem[] allUnitArray;
    public static DatabaseHelper unitDB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.all_units_db);
        unitDB = new DatabaseHelper(this);

        allUnitArray = new unitItem[]{baneling,broodlord, broodling, changeling, corruptor, drone, hydralisk, infestedterran, infestor, larva, locust, lurker,
                mutalisk, nydusworm, overlord, overseer, queen, ravager, roach, spinecrawler, sporecrawler, swarmhost, ultralisk, viper, zergling, autoturret,banshee,battlecruiser,cyclone,ghost,hellbat,hellion,liberatordefender,liberatorfighter,marauder,marine,
                medivac,missileturret,mule,planetaryfortress,raven,reaper,scv,siegetanksieged,siegetanktank,thorexplosive,thorimpact,vikingassault,vikingfighter,
                widowmine, adept, archon, carrier, colossus, darktemplar, disruptor, hightemplar, immortal, interceptor, mothership, observer, oracle,
                phoenix, photoncannon, probe, sentry, stalker, tempest, voidray, warpprism, zealot};

        allUnits = findViewById(R.id.allUnits);
        home = findViewById(R.id.home);
        search = findViewById(R.id.search);
        s = findViewById(R.id.searchBar);
        backToDB = findViewById(R.id.backToDB);
        toggleMixed = findViewById(R.id.toggleOrder);

        toggleMixed2 = findViewById(R.id.toggleOrder2);
        allUnits2 = findViewById(R.id.allUnits2);
        home2 = findViewById(R.id.home2);
        search2 = findViewById(R.id.search2);
        s2 = findViewById(R.id.searchBar2);
        backToDB2 = findViewById(R.id.backToDB2);


        final SearchView.SearchAutoComplete sAutoComplete = (SearchView.SearchAutoComplete)s.findViewById(android.support.v7.appcompat.R.id.search_src_text);
        sAutoComplete.setBackgroundColor(getResources().getColor(R.color.lilac));
        sAutoComplete.setTextColor(getResources().getColor(R.color.grayGreen));
        sAutoComplete.setDropDownBackgroundResource(R.color.lilac);

        final SearchView.SearchAutoComplete sAutoComplete2 = (SearchView.SearchAutoComplete)s2.findViewById(android.support.v7.appcompat.R.id.search_src_text);
        sAutoComplete2.setBackgroundColor(getResources().getColor(R.color.lilac));
        sAutoComplete2.setTextColor(getResources().getColor(R.color.grayGreen));
        sAutoComplete2.setDropDownBackgroundResource(R.color.lilac);


        ArrayAdapter<String> newsAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_dropdown_item_1line, dataArr);
        sAutoComplete.setAdapter(newsAdapter);

        sAutoComplete.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int itemIndex, long id) {
                queryString=(String)adapterView.getItemAtPosition(itemIndex);
                sAutoComplete.setText("" + queryString);
            }
        });

        ArrayAdapter<String> newsAdapter2 = new ArrayAdapter<String>(this, android.R.layout.simple_dropdown_item_1line, dataArr);
        sAutoComplete2.setAdapter(newsAdapter2);

        sAutoComplete2.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int itemIndex, long id) {
                queryString2=(String)adapterView.getItemAtPosition(itemIndex);
                sAutoComplete2.setText("" + queryString2);
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

        home2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
                startActivity(new Intent(getBaseContext(), MainActivity.class));
                overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
            }
        });

        backToDB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
                startActivity(new Intent(getBaseContext(), UnitDatabase.class));
                overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
            }
        });

        backToDB2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
                startActivity(new Intent(getBaseContext(), UnitDatabase.class));
                overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
            }
        });

        search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                for (int i = 0; i < 71; i++) {
                    if (allUnitArray[i].getUnitName().equals(queryString)) {
                        Intent intent = new Intent(getApplicationContext(), unitProfileMaker.class);
                        intent.putExtra("image_value", allUnitArray[i].getUnitImage());
                        intent.putExtra("name_value", allUnitArray[i].getUnitName());
                        intent.putExtra("type_value", allUnitArray[i].getUnitDescrip());
                        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                        startActivity(intent);
                    }
                }
            }
        });

        search2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                for (int i = 0; i < 71; i++) {
                    if (allUnitArray[i].getUnitName().equals(queryString)) {
                        Intent intent = new Intent(getApplicationContext(), unitProfileMaker.class);
                        intent.putExtra("image_value", allUnitArray[i].getUnitImage());
                        intent.putExtra("name_value", allUnitArray[i].getUnitName());
                        intent.putExtra("type_value", allUnitArray[i].getUnitDescrip());
                        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                        startActivity(intent);
                    }
                }
            }
        });

        final ViewFlipper vf = findViewById( R.id.viewFlipper );

        Mixed = true;
        setSingleEvent(allUnits);

        toggleMixed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Mixed) {
                    vf.showNext();
                    toggleMixed2.setText("Sort By Race");
                    setSingleEvent2(allUnits2);
                    Mixed = false;
                    return;
                }
            }
        });

        toggleMixed2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!Mixed) {
                    vf.showPrevious();
                    toggleMixed.setText("Sort By Name");
                    setSingleEvent(allUnits);
                    Mixed = true;
                    return;
                }
            }
        });

        BottomNavigationView navigation = findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
        navigation.getMenu().getItem(1).setChecked(true);

        BottomNavigationView navigation2 = findViewById(R.id.navigation2);
        navigation2.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener2);
        navigation2.getMenu().getItem(1).setChecked(true);
    }

    private void setSingleEvent(GridLayout allUnits) {
        for (int i = 0; i < allUnits.getChildCount(); i++) {
            final int j = i;
            CardView cardView = (CardView)allUnits.getChildAt(j);
                cardView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent2 = new Intent(getApplicationContext(), unitProfileMaker.class);
                        intent2.putExtra("image_value", allUnitArray[j].getUnitImage());
                        intent2.putExtra("name_value", allUnitArray[j].getUnitName());
                        intent2.putExtra("type_value", allUnitArray[j].getUnitDescrip());
                        startActivity(intent2);
                    }
                });
        }
    }

    private void setSingleEvent2(GridLayout allUnits) {
        for (int i = 0; i < allUnits.getChildCount(); i++) {
            final int j = i;
            CardView cardView = (CardView)allUnits.getChildAt(j);
            cardView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent3 = new Intent(getApplicationContext(), unitProfileMaker.class);
                    intent3.putExtra("image_value", allUnitMixedArray[j].getUnitImage());
                    intent3.putExtra("name_value", allUnitMixedArray[j].getUnitName());
                    intent3.putExtra("type_value", allUnitMixedArray[j].getUnitDescrip());
                    startActivity(intent3);
                }
            });

        }
    }

    protected BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener2
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
                    startActivity(new Intent(getBaseContext(), CreateAStatistic.class));
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

    public void mixedNameSetter() {
        for (int i = 0; i < allUnitMixedArray.length; i++) {

        }
    }
}
