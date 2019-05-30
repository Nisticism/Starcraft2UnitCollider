package com.Icantbelievedefaultisexample.nistic.starcraft2unitcollider;

import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.design.widget.BottomNavigationView;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.CharacterStyle;
import android.text.style.RelativeSizeSpan;
import android.text.style.StyleSpan;
import android.util.DisplayMetrics;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

import java.text.DecimalFormat;

public class unitProfileMaker extends MainActivity {
    public static String TAG = "unitProfileActivity";
    ImageView profile;
    TextView unitNameView;
    TextView unitStatsView;
    TextView unitDescripView;
    TextView unitUsesView;
    TextView unitLoreView;

    TextView unitStatsView2;
    TextView unitDescripView2;
    TextView unitUsesView2;
    TextView unitLoreView2;

    String unitName;

    String unitStats;
    SpannableString ss1;
    SpannableString s1;
    CharSequence allText;

    String unitDescription;
    String unitUses;
    String unitLore;
    Cursor res;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.unit_profile);
        Log.d(TAG, "onCreate: started.");

        profile = findViewById(R.id.profilePic);
        unitNameView = findViewById(R.id.unitName_);
        unitStatsView = findViewById(R.id.unitStats_);
        unitDescripView = findViewById(R.id.unitDescript_);
        unitUsesView = findViewById(R.id.unitUses_);
        unitLoreView = findViewById(R.id.unitLore_);

        unitStatsView2 = findViewById(R.id.unitStats_2);
        unitDescripView2 = findViewById(R.id.unitDescript_2);
        unitUsesView2 = findViewById(R.id.unitUses_2);
        unitLoreView2 = findViewById(R.id.unitLore_2);

        getIncomingIntent();
        res = unitDB.getOneData(unitName);
        res.moveToFirst();

        String unitDescrip = "Description" + "\n\n";
        SpannableString unitDescrip2 =  new SpannableString(unitDescrip);
//        StyleSpan italicSpan = new StyleSpan(Typeface.ITALIC);
//        unitDescrip2.setSpan(new RelativeSizeSpan(.7f), 11,24, 0); // set sizes
//        unitDescrip2.setSpan(italicSpan, 11, 24, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE); // set italic
        unitDescripView.setText(unitDescrip2);
        SpannableString unitDescrip3 = new SpannableString(res.getString(31));
        unitDescrip3.setSpan(new RelativeSizeSpan(.85f),0,unitDescrip3.length(),0);
        unitDescripView2.setText(unitDescrip3);

        String unitUses = "Uses" + "\n\n";
        SpannableString unitUses2 =  new SpannableString(unitUses);
//        unitUses2.setSpan(new RelativeSizeSpan(.7f), 4,17, 0); // set sizes
//        unitUses2.setSpan(italicSpan, 4, 17, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE); // set italic
        unitUsesView.setText(unitUses2);
        SpannableString unitUses3 = new SpannableString(res.getString(32));
        unitUses3.setSpan(new RelativeSizeSpan(.85f),0,unitUses3.length(),0);
        unitUsesView2.setText(unitUses3);

        String unitLore = "Lore" + "\n\n";
        SpannableString unitLore2 =  new SpannableString(unitLore);
//        unitLore2.setSpan(new RelativeSizeSpan(.7f), 4,17, 0); // set sizes
//        unitLore2.setSpan(italicSpan, 4, 17, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE); // set italic
        unitLoreView.setText(unitLore2);
        SpannableString unitLore3 = new SpannableString(res.getString(33));
        unitLore3.setSpan(new RelativeSizeSpan(.85f),0,unitLore3.length(),0);
        unitLoreView2.setText(unitLore3);

        dBStatsMaker();
        unitStatsView2.setText(s1);

        BottomNavigationView navigation = findViewById(R.id.navigation);
        if (pixelDensity < 2.1) {
            navigation.setItemTextAppearanceInactive(R.style.BottomNavigationViewLow);
            navigation.setItemTextAppearanceActive(R.style.BottomNavigationViewActiveLow);
        }
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
        navigation.getMenu().getItem(1).setChecked(true);
    }

    private void getIncomingIntent() {
        Log.d(TAG, "Checking for incoming intents");
        if (getIntent().hasExtra("image_value") && getIntent().hasExtra("name_value") && getIntent().hasExtra("type_value")) {
            Log.d(TAG, "Found extras");

            Bundle extras = getIntent().getExtras();
            int imageValue = extras.getInt("image_value");
            unitName = extras.getString("name_value");
            unitStats = extras.getString("type_value");

            Resources res = getBaseContext().getResources();
            Bitmap bmp = BitmapFactory.decodeResource(res, imageValue);
            profile.setImageBitmap(bmp);

            unitStats =  "• Attributes/Type: " + unitStats;
            String unitStats2 = "Statistics" + "\n\n";
            ss1 = new SpannableString(unitStats2);
            //StyleSpan italicSpan = new StyleSpan(Typeface.ITALIC);
            //ss1.setSpan(new RelativeSizeSpan(.7f), 10,unitStats.length() + 37, 0); // set sizes
            //ss1.setSpan(italicSpan, unitStats.length() + 16, unitStats.length() + 37, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE); // set italic
            unitNameView.setText(unitName);;
        }
    }

    private void dBStatsMaker() {
        DecimalFormat df = new DecimalFormat("#.000");
        String criticalStats = "";
        String sizeAndSpace = "";
        String cost = "";
        String speedAndMobility = "";
        String miscAndAbilities = "";
        String TotalHP = res.getString(3);
        StyleSpan boldStyle = new StyleSpan(Typeface.BOLD);
        SpannableString CriticalStats = new SpannableString("Critical Stats");
        CriticalStats.setSpan(boldStyle, 0, CriticalStats.length(), 0);
        criticalStats += "•  Race: " + res.getString(30) + "\n";
        //  unitStats = type
        criticalStats += unitStats + "\n";
        criticalStats += "•  Unit plane: " + res.getString(34) + "\n";
        if(res.getString(25) == null) {
            criticalStats += "•  Total hit points: " + TotalHP;
            if (res.getString(44) == null) {
                criticalStats += "\n";
            }
        }
        if (res.getString(25) != null) {
            TotalHP = Integer.toString(Integer.parseInt(res.getString(3)) + Integer.parseInt(res.getString(25)));
            criticalStats += "•  Total hit points: " + TotalHP + "  (Health: " + res.getString(3) + "  Shields: " + res.getString(25) + ")";
            if (res.getString(44) == null) {
                criticalStats += "\n";
            }
        }
        if (res.getString(44) != null) {
            criticalStats += ", " + res.getString(44) + "\n";
        }
        Integer unitAttack = 0;
        if (res.getString(4) != null && res.getString(48) != null) {
            unitAttack = Integer.parseInt(res.getString(4).toString()) * Integer.parseInt(res.getString(48).toString());
        }

        Integer unitAttack2 = 0;
        if (res.getString(5) != null && res.getString(49) != null) {
            unitAttack2 = Integer.parseInt(res.getString(5).toString()) * Integer.parseInt(res.getString(49).toString());
        }
        if (res.getString(48) != null) {
            if (res.getString(48).equals("1") || res.getString(48).equals("0")) {
                criticalStats += "•  Unit attack damage: " + res.getString(4);
                if (res.getString(40) == null && res.getString(41) == null) {
                    criticalStats += "\n";
                }
            } else {
                criticalStats += "•  Unit attack damage: " + res.getString(4) + " (×" + res.getString(48) + ")";
                if (res.getString(40) == null && res.getString(41) == null) {
                    criticalStats += "\n";
                }
            }
        }  else if (res.getString(48) == null) {
            criticalStats += "•  Unit attack damage: 0" + "\n";
        }
        if (res.getString(40) != null) {
            criticalStats += ", " + res.getString(40);
            if (res.getString(41) == null) {
                criticalStats += "\n";
            }
        }
        if (res.getString(41) != null) {
            criticalStats += ", " + res.getString(41) + "\n";
        }
        if (res.getString(5) != null && !res.getString(4).equals(res.getString(5))) {
            criticalStats += "•  Alternate unit damage (to air if ground & to ground if air): " + res.getString(5);
            if (res.getString(49) != null && !res.getString(49).equals("1")) {
                criticalStats += " (×" + res.getString((49)) + ")";
            }
            criticalStats += "\n";
        }

        if (res.getString(13) != null) {
            criticalStats += "•  DPS: " + df.format(unitAttack / Double.parseDouble(res.getString(13)));
            if (res.getString(42) == null && res.getString(43) == null) {
                criticalStats += "\n";
            }
        }
        if (res.getString(42) != null) {
            criticalStats += ", " + res.getString(42);
            if (res.getString(43) == null) {
                criticalStats += "\n";
            }
        }
        if (res.getString(43) != null) {
            criticalStats += ", " + res.getString(43) + "\n";
        }
        if (res.getString(14) != null && res.getString(5) == null && res.getString(46) != null && !res.getString(1).equals("Siege Tank (sieged)") && !res.getString(1).equals("Siege Tank (tank mode)")) {
            criticalStats += "•  DPS with " + res.getString(46) + ": " + df.format(unitAttack / Double.parseDouble(res.getString(14))) + "\n";
        }
        // Either the alternate attack is going to have the same attack speed or it will use column 14's attack speed.  If 14 is null, it will use the same attack speed (for example, queens).  If it's not null, it will use 14, for example infested terran.
        if (res.getString(5) != null && !res.getString(4).equals(res.getString(5))) {
            if (res.getString(14) == null) {
                criticalStats += "•  Alternate DPS: " + df.format(unitAttack2 / Double.parseDouble(res.getString(13))) + "\n";
            }
            if (res.getString(14) != null) {
                criticalStats += "•  Alternate DPS: " + df.format(unitAttack2 / Double.parseDouble(res.getString(14))) + "\n";
            }
        }

        if (res.getString(23) != null) {
            criticalStats += "•  Energy: " + res.getString(23) + "\n";
        }
        if (res.getString(45) == null) {
            criticalStats += "•  Armor: " + res.getString(6) + "\n\n";
        }
        if (res.getString(45) != null) {
            criticalStats += "•  Armor: " + res.getString(6);
            criticalStats += ", " + res.getString(45) + "\n\n";
        }

            //  Size and space
        sizeAndSpace += "•  Supply: " + res.getString(8) + "\n";
        if (res.getString(7) != null) {
            sizeAndSpace += "•  Cargo Space: " + res.getString(7) + "\n";
        }
        sizeAndSpace += "•  Unit Size: " + res.getString(20) + "\n\n";
        SpannableString SizeAndSpace = new SpannableString("Size & Space");
        SizeAndSpace.setSpan(boldStyle, 0, SizeAndSpace.length(), 0);


            //  Cost
        cost += "•  Mineral cost: " + res.getString(9) + "\n";
        cost += "•  Vespene gas cost: " + res.getString(10) + "\n";
        cost += "•  Total resource cost: " + (Integer.parseInt(res.getString(10)) + Integer.parseInt(res.getString(9))) + "\n";
        if (res.getString(39) != null) {
            cost+= "•  Energy cost: " + res.getString(39) + "\n";
        }
        cost += "•  Builds from: " + res.getString(35) + "\n";
        cost += "•  Build time: " + res.getString(11) + " seconds" + "\n";
        if (res.getString(26) != null) {
            cost += "•  Warpgate Cooldown: " + res.getString(26) + " seconds" + "\n";
        }
        cost += "•  Most advanced required structure: " + res.getString(24) + "\n\n";
        SpannableString Cost = new SpannableString("Cost & Requirements");
        Cost.setSpan(boldStyle, 0, Cost.length(), 0);

            //  Speed and mobility or Versatility
        speedAndMobility += "•  Unit speed: " + res.getString(12) + "\n";
        if (res.getString(27) != null) {
            speedAndMobility += "•  Secondary unit speed: " + res.getString(27) + "\n";
        }
        if (res.getString(13) != null) {
            speedAndMobility += "•  Attack cooldown: " + res.getString(13) + " seconds" + "\n";
        }
        if (res.getString(14) != null && res.getString(46) != null) {
            speedAndMobility += "•  Secondary attack cooldown: " + res.getString(14) + " seconds with " + res.getString(46) + "\n";
        }
        if (res.getString(13) != null) {
            speedAndMobility += "•  Attack speed: " + df.format(1 / Double.parseDouble(res.getString(13))) + " attacks/second" + "\n";
        }
        if (res.getString(14) != null && res.getString(46) != null) {
            speedAndMobility += "•  Secondary attack speed: " + df.format(1/Double.parseDouble(res.getString(14))) + " attacks/second with " + res.getString(46) + "\n";
        }
        if (res.getString(16) != null) {
            speedAndMobility += "•  Attack range vs ground: " + res.getString(16) + "\n";
        }
        if (res.getString(17) != null) {
            speedAndMobility += "•  Attack range vs air: " + res.getString(17) + "\n";
        }
        if (res.getString(47) != null) {
            speedAndMobility += "•  Splash damage radius: " + res.getString(47) + "\n";
        }
        speedAndMobility += "•  Line of sight range: " + res.getString(18) + "\n";
        if (res.getString(19) != null) {
            speedAndMobility += "•  Secondary line of sight range: " + res.getString(19) + "\n";
        }
        if (res.getString(36) != null) {
            speedAndMobility += "•  Capacity to attack: " + res.getString(36) + "\n";
        } else if (res.getString(21) == null) {
            speedAndMobility += "•  Capacity to attack: None" + "\n";
        }
        speedAndMobility += "•  Lifespan: " + res.getString(37) + "\n\n";
        SpannableString SpeedAndMobility = new SpannableString("Versatility");
        SpeedAndMobility.setSpan(boldStyle, 0, SpeedAndMobility.length(), 0);

        //  Misc and abilities
        if (res.getString(21) != null) {
            miscAndAbilities += "•  ≡ List of Upgrades ≡ : " + res.getString(21) + "\n\n";
        }  else if (res.getString(21) == null) {
            miscAndAbilities += "•  ≡ List of Upgrades ≡ : None" + "\n\n";
        }
        miscAndAbilities += "•  Abilities, Passives, & Characteristics: " + res.getString(22) + "\n\n";
        miscAndAbilities += "•  Attribute significance: " + "\n" + attributeBonusBuilder(res.getString(38));
        String bonus = res.getString(15);
        if (bonus == null) {
            bonus = "None";
        }
        miscAndAbilities += "\n•  Bonus against other units: " + bonus + "\n";
        miscAndAbilities += "•  Natural predators/counters: " + res.getString(28) + "\n";
        miscAndAbilities += "•  Natural prey: " + res.getString(29) + "\n";
        SpannableString MiscAndAbilities = new SpannableString("Upgrades, Abilities, Attributes, & Miscellaneous");
        MiscAndAbilities.setSpan(boldStyle, 0, MiscAndAbilities.length(), 0);

        //unitStats += '\n' + "Unit HP: " + unitDB.getHP(unitName);
        allText = TextUtils.concat(CriticalStats + "\n" + criticalStats + SizeAndSpace + "\n" + sizeAndSpace + Cost + "\n" + cost + SpeedAndMobility + "\n" +
                speedAndMobility + MiscAndAbilities + "\n" + miscAndAbilities);
        SpannableString allTextString = new SpannableString(allText);

        Integer SizeSpaceStart = CriticalStats.length() + criticalStats.length() + 1;
        Integer CostStart = SizeSpaceStart + SizeAndSpace.length() + sizeAndSpace.length() + 1;
        Integer VersatilityStart = CostStart + Cost.length() + cost.length() + 1;
        Integer MiscStart = VersatilityStart + SpeedAndMobility.length() + speedAndMobility.length() + 1;

        allTextString.setSpan(new RelativeSizeSpan(.8f), 0, allTextString.length(), 0);

        allTextString.setSpan(CharacterStyle.wrap(boldStyle), 0, CriticalStats.length(), 0);
        allTextString.setSpan(CharacterStyle.wrap(boldStyle), SizeSpaceStart, SizeSpaceStart + SizeAndSpace.length(), 0);
        allTextString.setSpan(CharacterStyle.wrap(boldStyle), CostStart, CostStart + Cost.length(), 0);
        allTextString.setSpan(CharacterStyle.wrap(boldStyle), VersatilityStart, VersatilityStart + SpeedAndMobility.length(), 0);
        allTextString.setSpan(CharacterStyle.wrap(boldStyle), MiscStart, MiscStart + MiscAndAbilities.length(), 0);
        s1 = allTextString;

    }

    public String attributeBonusBuilder(String unitType) {
        String benefits = "";
        if (unitType.contains("A")) {
            benefits += "               ARMORED    " + "\n" + "          •  Armored units, while often naturally having more armor than other units, will not necessarily directly benefit from being Armored in any way.  " + "\n" +
                    "          •  Units that deal bonus damage against Armored units include the Immortal, Lurker, Marauder, Siege Tank, Spine Crawler, Stalker, Ultralisk, Viking (fighter mode), and Void Ray" + "\n";
        }
        if (unitType.contains("B")) {
            benefits += "               BIOLOGICAL    " + "\n" + "          •  Biological units are units entirely or mostly composed of organic matter, or units that have a living, biological entity at their cores'.  These units benefit from the autocast Medivac ability Heal, as well as the Queen ability Transfuse and are targetted uniquely by the Ghost ability Steady Targetting (170 damage to Biological units, ignores armor)." + "\n"
                    + "          •  Units that deal bonus damage against Biological units include the Archon and Spore Crawler." + "\n";

        }
        if (unitType.contains("L")) {
            benefits += "               LIGHT    " + "\n" + "          •  Light units, while often being smaller, quicker, and more difficult to target, will not necessarily directly benefit from being Light in any way.  " + "\n" +
                    "          •  Units that deal bonus damage against Light units include the Adept, Baneling, Ghost, Hellbat, Hellion, Liberator (fighter mode), Oracle, Phoenix, Thor (explosive)." + "\n";
        }
        if (unitType.contains("X")) {
            benefits += "               MASSIVE    " + "\n" + "          •  Massive units are often larger in size and slower in speed than other units, but are often the heaviest hitters.  These units are immune to the Phoenix ability Graviton Beam, the Sentry ability Force Field (Massive units will shatter forcefields upon direct encounter), and the Marauder ability Concussive Shells." + "\n"
            + "          •  Units that deal bonus damage against Massive units include the Corruptor and Tempest." + "\n";
        }
        if (unitType.contains("M")) {
            benefits += "               MECHANICAL    " + "\n" + "          •  Mechanical units are either partly or entirely made of machines or other mechanical devices.  These units can be repaired (healed) by Terran workers, SCVs and MULEs, at a speed equal to the unit's build time × ((Starting HP - Remaining HP) / Starting HP), and a cost that is 25% of the unit's cost × ((Starting HP - Remaining HP) / Starting HP), making repair a potentially extremely efficient ability.  Along with Psionic units, Mechanical units are targetted uniquely by the Raven ability Interference Matrix." + "\n"
                    + "          •  Units that deal bonus damage against Mechanical units include the Viking (assault mode)." + "\n";
        }
        if (unitType.contains("P")) {
            benefits += "               PSIONIC    " + "\n" + "          •  The Psionic attribute is mostly a flavor attribute but implies some knowledge of Psionic powers. Not all energy units are Psionic, and not all Psionic units have energy.  Along with Psionic units, Mechanical units are targetted uniquely by the Raven ability Interference Matrix." + "\n"
                    + "          •  Psionic is the only attribute that does not give direct damage weaknesses to units by any other unit, but because Psionic units often have energy, Ghosts and High Templar can be strong against them." + "\n";
        }
        if (unitType.contains("S")) {
            benefits += "               STRUCTURE    " + "\n" + "          •  All structures have the Structure attribute, including those produced with energy and those that do damage.  Zerg structures all come from drones, with the exception Nydus Worms, and just like Zerg units will slowly regenerate health over time.  Terran structures all require an scv to build with the exception of the Auto-Turret, may all be repaired by SCVs and MULEs, and often may be floated and flown to a location without creep.  Protoss structures must be made within a Pylon radius and just like Protoss units, have energy which regenerates." + "\n"
                    + "          •  Units that deal bonus damage against structures include the Baneling." + "\n";
        }
        return benefits;
    }


    //  This function just makes dashes, if I need to divide up text based screen width, so that I don't make 2 lines of dashes.  Unfortunately I don't believe
    //  font size chosen by the system would be accounted for so it's not a very useful function.

    public String dashMaker () {
        String dashes = "";
        DisplayMetrics displayMetrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        int width = displayMetrics.widthPixels;
        Integer dashesI = (width/38);
        for (int i = 0; i < dashesI; i++) {
            dashes += "-";
        }
        return dashes;
    }
}
