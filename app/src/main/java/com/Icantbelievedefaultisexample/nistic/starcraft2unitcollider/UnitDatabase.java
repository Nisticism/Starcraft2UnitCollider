package com.Icantbelievedefaultisexample.nistic.starcraft2unitcollider;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Gravity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.support.v7.widget.SearchView;
import android.widget.Toast;

import static com.Icantbelievedefaultisexample.nistic.starcraft2unitcollider.unitsMade.*;

public class UnitDatabase extends MainActivity{

    //  ADD SECTION FOR BUILDIGNS AND CONCEPTS/FEATURES (such as creep)

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

    private unitItem[] zUnitArray;
    private unitItem[] tUnitArray;
    private unitItem[] pUnitArray;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.unit_information_database);

        int orientation = getResources().getConfiguration().orientation;

        zUnitArray = new unitItem[]{baneling,broodlord, broodling, changeling, corruptor, drone, hydralisk, infestedterran, infestor, larva, locust, lurker,
                mutalisk, nydusworm, overlord, overseer, queen, ravager, roach, spinecrawler, sporecrawler, swarmhost, ultralisk, viper, zergling};

        tUnitArray = new unitItem[]{autoturret,banshee,battlecruiser,cyclone,ghost,hellbat,hellion,liberatordefender,liberatorfighter,marauder,marine,
        medivac,missileturret,mule,planetaryfortress,raven,reaper,scv,siegetanksieged,siegetanktank,thorexplosive,thorimpact,vikingassault,vikingfighter,
        widowmine};

        pUnitArray = new unitItem[]{adept, archon, carrier, colossus, darktemplar, disruptor, hightemplar, immortal, interceptor, mothership, observer, oracle,
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

        //  Zerg set adapter

        recyclerViewZ.setLayoutManager(zLayoutManager);
        zAdapter = new RecyclerAdapt(zUnitArray, getBaseContext());
        recyclerViewZ.setAdapter(zAdapter);

        //  Protoss set adapter

        recyclerViewP.setLayoutManager(pLayoutManager);
        pAdapter = new RecyclerAdapt(pUnitArray, getBaseContext());
        recyclerViewP.setAdapter(pAdapter);

        //  Terran set adapter

        recyclerViewT.setLayoutManager(tLayoutManager);
        tAdapter = new RecyclerAdapt(tUnitArray, getBaseContext());
        recyclerViewT.setAdapter(tAdapter);

        //  If the layout is horizontal, we must use a different adapter that allows for more images and resizes the height properties accordingly.  Text
        //  for the unit is also resized.

        if (orientation == 2) {
            tAdapter = new RecyclerAdapt2(tUnitArray, getBaseContext());
            pAdapter = new RecyclerAdapt2(pUnitArray, getBaseContext());
            zAdapter = new RecyclerAdapt2(zUnitArray, getBaseContext());
        }

        home = findViewById(R.id.home);
        search = findViewById(R.id.search);
        s = findViewById(R.id.searchBar);
        allUnits = findViewById(R.id.allUnits);

        final SearchView.SearchAutoComplete sAutoComplete = (SearchView.SearchAutoComplete)s.findViewById(android.support.v7.appcompat.R.id.search_src_text);
        sAutoComplete.setBackgroundColor(getResources().getColor(R.color.lilac));
        sAutoComplete.setTextColor(getResources().getColor(R.color.grayGreen));
        sAutoComplete.setDropDownBackgroundResource(R.color.lilac);

        //  This array is just to get the search auto-complete to work.  I believe it would take more time to load an array of units from the database and get their names, than
        //  to use the unitsMade Class.  The unitsMade class simply creates a bunch of "mini-units" that have only 3 pieces of info.

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

        //  If you click search, it should 'smooth scroll' on which array the index belongs to

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

        //  If the SDK version number is less than 26, all of the text auto-sizing options just go away, so the padding needs to be removed to prevent multiline things from happening.
        //  If I set them to single line, it's possible with the default value set at 16 sp, the word could get cut off, displaying only "Hom" or something.  Even with padding gone, the
        //  idea is the word still is centered and will have space around it, unless the pixel Density drops too low, for example below 2.1, in which case I resize the text manually
        //  anyway.  I must account for old devices and different densities, not just one or the other.  Unfortunately, old devices do not support auto-resize for text.

        if (sdkNum < 26) {
            home.setPadding(0,0,0,0);
            search.setPadding(0,0,0,0);
            allUnits.setPadding(0,0,0,0);
            if (pixelDensity < 2.1) {
                home.setTextSize(12);
                search.setTextSize(12);
                allUnits.setTextSize(12);

                navigation.setItemTextAppearanceInactive(R.style.BottomNavigationViewLow);
                navigation.setItemTextAppearanceActive(R.style.BottomNavigationViewActiveLow);
            }
        }

        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
        navigation.getMenu().getItem(1).setChecked(true);
    }

    @Override
    public void onSaveInstanceState(Bundle outState) throws NullPointerException {
        super.onSaveInstanceState(outState);

        outState.putParcelable("state", recyclerViewZ.getLayoutManager().onSaveInstanceState());

    }
}
