package com.Icantbelievedefaultisexample.nistic.starcraft2unitcollider;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DatabaseHelper extends SQLiteOpenHelper {
    // (unitID, Name, Pic1, HP, Dmg1, Dmg2, Armor, Cargo, Supply, Minerals, Gas, BuildTime, Speed, AttackSpeed1, AttackSpeed2, Bonuses, " +
    //                "RangevsGround, RangevsAir, LOS, LOS2, unitSize, Upgrades, SpecialAbilities, Energy, TechRequired, Shields, WarpgateCooldown)
    public static final String DATABASE_NAME = "UnitsDB.db";
    public static final String TABLE_NAME = "units_table";
    public static final String COL_1 = "unitID";
    public static final String COL_2 = "Name";
    public static final String COL_3 = "Pic1";
    public static final String COL_4 = "HP";
    public static final String COL_5 = "Dmg1";
    public static final String COL_6 = "Dmg2";
    public static final String COL_7 = "Armor";
    public static final String COL_8 = "Cargo";
    public static final String COL_9 = "Supply";
    public static final String COL_10 = "Minerals";
    public static final String COL_11 = "Vespene";
    public static final String COL_12 = "BuildTime";
    public static final String COL_13 = "Speed";
    public static final String COL_14 = "AttackSpeed1";
    public static final String COL_15 = "AttackSpeed2";
    public static final String COL_16 = "Bonuses";
    public static final String COL_17 = "RangeVsGround";
    public static final String COL_18 = "RangeVsAir";
    public static final String COL_19 = "LOS";
    public static final String COL_20 = "LOS2";
    public static final String COL_21 = "unitSize";
    public static final String COL_22 = "Upgrades";
    public static final String COL_23 = "SpecialAbilities";
    public static final String COL_24 = "Energy";
    public static final String COL_25 = "TechRequired";
    public static final String COL_26 = "Shields";
    public static final String COL_27 = "WarpgateCooldown";
    public static final String COL_28 = "Speed2";
    public static final String COL_29 = "NaturalEnemies";
    public static final String COL_30 = "NaturalPrey";
    public static final String COL_31 = "Race";
    public static final String COL_32 = "Description";
    public static final String COL_33 = "Uses";
    public static final String COL_34 = "Lore";
    public static final String COL_35 = "GroundAir";
    public static final String COL_36 = "BuildsFrom";
    public static final String COL_37 = "AttacksGA";
    public static final String COL_38 = "Lifespan";
    public static final String COL_39 = "Attributes";
    public static final String COL_40 = "EnergyCost";
    public static final String COL_41 = "SpecialDmg1";
    public static final String COL_42 = "SpecialDmg2";
    public static final String COL_43 = "SpecialDPS1";
    public static final String COL_44 = "SpecialDPS2";
    public static final String COL_45 = "HP2";
    public static final String COL_46 = "Armor2";
    public static final String COL_47 = "ASString";
    public static final String COL_48 = "SplashRadius";
    public static final String COL_49 = "AttackCount";
    public static final String COL_50 = "AttackCount2";


    public DatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE IF NOT EXISTS " + TABLE_NAME + " (unitID INTEGER PRIMARY KEY AUTOINCREMENT,NAME TEXT,Pic1 INTEGER,HP INTEGER, Dmg1 INTEGER, Dmg2 INTEGER, Armor INTEGER, " +
                "Cargo DOUBLE, Supply DOUBLE, Minerals INTEGER, Vespene INTEGER, BuildTime INTEGER, Speed DOUBLE, AttackSpeed1 DOUBLE, AttackSpeed2 DOUBLE, Bonuses TEXT, " +
                "RangevsGround TEXT, RangevsAir TEXT, LOS INTEGER, LOS2 INTEGER, unitSize TEXT, Upgrades TEXT, SpecialAbilities TEXT, Energy TEXT, TechRequired TEXT, " +
                "Shields INTEGER, WarpgateCooldown INTEGER, Speed2 TEXT, NaturalEnemies TEXT, NaturalPrey TEXT, Race TEXT, Description TEXT, Uses TEXT, Lore TEXT, GroundAir TEXT," +
                "BuildsFrom TEXT, AttacksGA TEXT, Lifespan TEXT, Attributes TEXT, EnergyCost INTEGER, SpecialDmg1 TEXT, SpecialDmg2 TEXT, SpecialDPS1 TEXT, SpecialDPS2 TEXT, HP2 TEXT, Armor2 TEXT," +
                "ASString TEXT, SplashRadius DOUBLE, AttackCount TEXT, AttackCount2 TEXT)");

        Cursor res2 = db.rawQuery("select * from "+TABLE_NAME,null);
        if (res2.getCount() == 0) {
            populator(db);
        }
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS "+TABLE_NAME);
        onCreate(db);
    }

    public boolean insertData(String name,Integer pic1,Integer hp, Integer dmg1, Integer dmg2, Integer armor, Integer cargo, Double supply, Integer minerals, Integer gas, Integer buildTime,
        Double speed, Double attackSpeed1, Double attackSpeed2, String bonuses, String rangevsGround, String rangevsAir, Integer lOS, Integer lOS2, String unitSize, String upgrades,
        String specialAbilities, String energy, String techRequired, Integer shields, Integer warpGateCoolDown, Double speed2, String naturalEnemies, String naturalPrey, String race,
        String description, String uses, String lore, String groundAir, String buildsFrom, String attacksGA, String lifespan, String attributes, Integer energyCost, String specialDmg1,
                              String specialDmg2, String specialDPS1, String specialDPS2, String hP2, String armor2, String aSString, Double splashRadius, String attackCount1, String attackCount2) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(COL_2,name);
        contentValues.put(COL_3,pic1);
        contentValues.put(COL_4,hp);
        contentValues.put(COL_5,dmg1);
        contentValues.put(COL_6,dmg2);
        contentValues.put(COL_7,armor);
        contentValues.put(COL_8,cargo);
        contentValues.put(COL_9,supply);
        contentValues.put(COL_10,minerals);
        contentValues.put(COL_11,gas);
        contentValues.put(COL_12,buildTime);
        contentValues.put(COL_13,speed);
        contentValues.put(COL_14,attackSpeed1);
        contentValues.put(COL_15,attackSpeed2);
        contentValues.put(COL_16,bonuses);
        contentValues.put(COL_17,rangevsGround);
        contentValues.put(COL_18,rangevsAir);
        contentValues.put(COL_19,lOS);
        contentValues.put(COL_20,lOS2);
        contentValues.put(COL_21,unitSize);
        contentValues.put(COL_22,upgrades);
        contentValues.put(COL_23,specialAbilities);
        contentValues.put(COL_24,energy);
        contentValues.put(COL_25,techRequired);
        contentValues.put(COL_26,shields);
        contentValues.put(COL_27,warpGateCoolDown);
        contentValues.put(COL_28,speed2);
        contentValues.put(COL_29,naturalEnemies);
        contentValues.put(COL_30,naturalPrey);
        contentValues.put(COL_31,race);
        contentValues.put(COL_32,description);
        contentValues.put(COL_33,uses);
        contentValues.put(COL_34,lore);
        contentValues.put(COL_35,groundAir);
        contentValues.put(COL_36,buildsFrom);
        contentValues.put(COL_37,attacksGA);
        contentValues.put(COL_38,lifespan);
        contentValues.put(COL_39,attributes);
        contentValues.put(COL_40,energyCost);
        contentValues.put(COL_41,specialDmg1);
        contentValues.put(COL_42,specialDmg2);
        contentValues.put(COL_43,specialDPS1);
        contentValues.put(COL_44,specialDPS2);
        contentValues.put(COL_45,hP2);
        contentValues.put(COL_46,armor2);
        contentValues.put(COL_47,aSString);
        contentValues.put(COL_48,splashRadius);
        contentValues.put(COL_49, attackCount1);
        contentValues.put(COL_50, attackCount2);

        long result = db.insert(TABLE_NAME,null ,contentValues);
        if(result == -1)
            return false;
        else
            return true;
    }

    public Cursor getAllData() {
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor res = db.rawQuery("select * from "+TABLE_NAME,null);
        return res;
    }

    public boolean updateData(String id,String name,Integer pic1,Integer hp, Integer dmg1, Integer dmg2, Integer armor, Integer cargo, Double supply, Integer minerals, Integer gas, Integer buildTime,
                              Double speed, Double attackSpeed1, Double attackSpeed2, String bonuses, String rangevsGround, String rangevsAir, Integer lOS, Integer lOS2, String unitSize, String upgrades,
                              String specialAbilities, String energy, String techRequired, Integer shields, Integer warpGateCoolDown, Double speed2, String naturalEnemies, String naturalPrey, String race,
                              String description, String uses, String lore, String groundAir, String buildsFrom, String attacksGA, String lifespan, String attributes, Integer energyCost, String specialDmg1,
                              String specialDmg2, String specialDPS1, String specialDPS2, String hP2, String armor2, String aSString, Double splashRadius, String attackCount1, String attackCount2) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(COL_1,id);
        contentValues.put(COL_2,name);
        contentValues.put(COL_3,pic1);
        contentValues.put(COL_4,hp);
        contentValues.put(COL_5,dmg1);
        contentValues.put(COL_6,dmg2);
        contentValues.put(COL_7,armor);
        contentValues.put(COL_8,cargo);
        contentValues.put(COL_9,supply);
        contentValues.put(COL_10,minerals);
        contentValues.put(COL_11,gas);
        contentValues.put(COL_12,buildTime);
        contentValues.put(COL_13,speed);
        contentValues.put(COL_14,attackSpeed1);
        contentValues.put(COL_15,attackSpeed2);
        contentValues.put(COL_16,bonuses);
        contentValues.put(COL_17,rangevsGround);
        contentValues.put(COL_18,rangevsAir);
        contentValues.put(COL_19,lOS);
        contentValues.put(COL_20,lOS2);
        contentValues.put(COL_21,unitSize);
        contentValues.put(COL_22,upgrades);
        contentValues.put(COL_23,specialAbilities);
        contentValues.put(COL_24,energy);
        contentValues.put(COL_25,techRequired);
        contentValues.put(COL_26,shields);
        contentValues.put(COL_27,warpGateCoolDown);
        contentValues.put(COL_28,speed2);
        contentValues.put(COL_29,naturalEnemies);
        contentValues.put(COL_30,naturalPrey);
        contentValues.put(COL_31,race);
        contentValues.put(COL_32,description);
        contentValues.put(COL_33,uses);
        contentValues.put(COL_34,lore);
        contentValues.put(COL_35,groundAir);
        contentValues.put(COL_36,buildsFrom);
        contentValues.put(COL_37,attacksGA);
        contentValues.put(COL_38,lifespan);
        contentValues.put(COL_39,attributes);
        contentValues.put(COL_40,energyCost);
        contentValues.put(COL_41,specialDmg1);
        contentValues.put(COL_42,specialDmg2);
        contentValues.put(COL_43,specialDPS1);
        contentValues.put(COL_44,specialDPS2);
        contentValues.put(COL_45,hP2);
        contentValues.put(COL_46,armor2);
        contentValues.put(COL_47,aSString);
        contentValues.put(COL_48,splashRadius);
        contentValues.put(COL_49, attackCount1);
        contentValues.put(COL_50, attackCount2);

        db.update(TABLE_NAME, contentValues, "ID = ?",new String[] { id });
        return true;
    }

    public Integer deleteData (String id) {
        SQLiteDatabase db = this.getWritableDatabase();
        return db.delete(TABLE_NAME, "ID = ?",new String[] {id});
    }

    public Cursor getOneData(String unitName) {
        SQLiteDatabase db = this.getWritableDatabase();
        unitName = "'" + unitName + "'";
        Cursor res = db.rawQuery("select * from "+TABLE_NAME + " WHERE NAME = " + unitName,null);
        return res;
    }

    //    Alphabetical Units List!

//    {adept.getUnitName(),archon.getUnitName(),autoturret.getUnitName(),baneling.getUnitName(),banshee.getUnitName(),battlecruiser.getUnitName(),broodlord.getUnitName(),
//            broodling.getUnitName(), carrier.getUnitName(),changeling.getUnitName(),colossus.getUnitName(), corruptor.getUnitName(),cyclone.getUnitName(),darktemplar.getUnitName(),
//            disruptor.getUnitName(), drone.getUnitName(), ghost.getUnitName(),hellbat.getUnitName(),hellion.getUnitName(),hightemplar.getUnitName(),
//            hydralisk.getUnitName(),immortal.getUnitName(), infestedterran.getUnitName(), infestor.getUnitName(),interceptor.getUnitName(), larva.getUnitName(),liberatordefender.getUnitName(),
//            liberatorfighter.getUnitName(), locust.getUnitName(), lurker.getUnitName(),marauder.getUnitName(),marine.getUnitName(), medivac.getUnitName(),missileturret.getUnitName(),
//            mothership.getUnitName(),mule.getUnitName(), mutalisk.getUnitName(), nydusworm.getUnitName(), observer.getUnitName(), oracle.getUnitName(), overlord.getUnitName(),
//            overseer.getUnitName(),phoenix.getUnitName(), photoncannon.getUnitName(),planetaryfortress.getUnitName(), probe.getUnitName(), queen.getUnitName(), ravager.getUnitName(),
//            raven.getUnitName(),reaper.getUnitName(), roach.getUnitName(),scv.getUnitName(),sentry.getUnitName(),siegetanksieged.getUnitName(),siegetanktank.getUnitName(), spinecrawler.getUnitName(),
//            sporecrawler.getUnitName(),stalker.getUnitName(), swarmhost.getUnitName(),tempest.getUnitName(),thorexplosive.getUnitName(),thorimpact.getUnitName(), ultralisk.getUnitName(),
//            vikingassault.getUnitName(),vikingfighter.getUnitName(), viper.getUnitName(),voidray.getUnitName(),warpprism.getUnitName(),widowmine.getUnitName(),zealot.getUnitName(),
//            zergling.getUnitName()};

    public void populator(SQLiteDatabase db) {

        db.execSQL("INSERT INTO " + TABLE_NAME + "(unitID, NAME, Pic1, HP, Dmg1, Dmg2, Armor, Cargo, Supply, Minerals, Vespene, BuildTime, Speed, AttackSpeed1, AttackSpeed2, " +
                "Bonuses, RangevsGround, RangevsAir, LOS, LOS2, unitSize, Upgrades, SpecialAbilities, Energy, TechRequired, Shields, WarpgateCooldown, Speed2, NaturalEnemies, NaturalPrey," +
                "Race, Description, Uses, Lore, GroundAir, BuildsFrom, AttacksGA, Lifespan, Attributes, EnergyCost, SpecialDmg1, SpecialDmg2, SpecialDPS1, SpecialDPS2, HP2, Armor2, ASString, SplashRadius, AttackCount, AttackCount2) " +
                "VALUES (1,'Adept', null, 70, 10, null, 1, 2, 2.0, 100, 25, 27, 3.5, 1.61, 1.11, '+12 vs Light'\n" +
                ", '4', null, 9, null, '1.0', 'Ground Weapons Levels 1-3 (+1 each; +2 vs Light), Ground Armor Levels 1-3 (+1 each), & Shields Levels 1-3 (+1 armor to shields each), Resonating Glaves (Adepts attack 0.5 seconds faster or +45%) researched by a Twilight Council',\n" +
                "'Psionic Shade (allows Adept to project an invulnerable image of themselves that moves quickly and lasts 7 seconds to where the adept teleports afterwards)', null, 'Cybernetics Core', 70, 20, null, 'Roaches, Stalkers, Marauders, AOE Damage'," +
                "'Workers, Zerglings, Hydralisks, Marines, Zealots, Other Light Units', 'Protoss', '          The Adept is a light, ranged protoss unit produced from a gateway or warpgate.  It has a relatively small body, and moves quickly with the ability to shade.'," +
                "'          Adepts are mainly used for harassment as they''re fantastic and killing workers and escaping through strategic timing of their psionic shades.  The psionic transfer ability allows" +
                "    them to project an invulnerable, fast-moving image (called a shade) of themselves that can pass through any unit, but not buildings or other adept shades.  It has a line of sight of 4 and the adept will teleport to the shade after 7 seconds or its cancellation.  \n          Adepts can be used as part of a main army composition, sometimes replacing" +
                "    the likes of stalkers or zealots.  They''re more agile and damaging than zealots, but less sturdy than either zealots or stalkers in most cases.  They do particularly well against armies composed" +
                "    of light units, and may offer a relatively cheap buffer in front of more damaging units as well.', '          An officer class of infantry, adepts are highly-trained battlefield commanders who serve as ranged specialists.  Adepts were originally intended by Hierarch Artanis to replace former Judicator Caste leaders with Templar. By 2505, they were a recent addition to the Daelaam''s arsenal, and Dominion Intelligence had recently gained knowledge of their existence, with the Dominion Marine Corps possessing little battlefield experience against them. They were designated as primary targets in the event of any hostile encounter.\n" +
                "          Adepts were deployed during the End War, when groups of Templar volunteered to adopt Purifier ordinance refined by Phase-smith Karax. This ordnance allowed the Templar to amplify their psionic potential and project their minds for teleportation while weakening their enemies. Adept ordinance would continue to be used by the Daelaam, but never could reach the optimal performance of Karax''s original prototypes.\n" +
                "          In a short amount of time, the psionic amplification techniques of the adept were reverse engineered by the Tal''darim, and incorporated into their arsenal, equipped on their most promising warriors.\n" +
                "          After the End War, cultural trends harkening back to the Golden Age of Expansion within the Templar Caste led some adepts to wear ceremonial armor from the era.  \n\n  -  This section uses material from the \"Adept\" article on the Starcraft wiki at FANDOM and is licensed under the Creative Commons Attribution-Share Alike License', 'Ground','Gateway or Warpgate','Ground', 'Until destroyed', 'BL', null, '22 vs Light', null, '13.665 vs Light', '19.812 vs Light with Resonating Glaves',null, null, 'Resonating Glaves', null, '1', null)");

        db.execSQL("INSERT INTO " + TABLE_NAME + "(unitID, NAME, Pic1, HP, Dmg1, Dmg2, Armor, Cargo, Supply, Minerals, Vespene, BuildTime, Speed, AttackSpeed1, AttackSpeed2, " +
                "Bonuses, RangevsGround, RangevsAir, LOS, LOS2, unitSize, Upgrades, SpecialAbilities, Energy, TechRequired, Shields, WarpgateCooldown, Speed2, NaturalEnemies, NaturalPrey," +
                "Race, Description, Uses, Lore, GroundAir, BuildsFrom, AttacksGA, Lifespan, Attributes, EnergyCost, SpecialDmg1, SpecialDmg2, SpecialDPS1, SpecialDPS2, HP2, Armor2, ASString, SplashRadius, AttackCount, AttackCount2) " +
                "VALUES (2,'Archon', null, 10, 25, null, 0, 4, 4.0, 100, 300, 9, 3.94, 1.25, null, '+10 vs Biological'\n" +
                ", '3', '3', 9, null, '2.0', 'Ground Weapons Levels 1-3 (+3 each), Ground Armor Levels 1-3 (+1 each), & Shields Levels 1-3 (+1 shields armor each)',\n" +
                "'Deals splash damage in relatively small radius with every attack.  Can be created with any combination of high templar and dark templar.', null, 'Twilight Council', 350, null, null, 'Ghosts'," +
                "'Biological units, especially zerglings and marines', 'Protoss', '          The Archon is a massive, psionic short ranged protoss unit produced from merging two templar together (any combination).  It''s an amazingly tanky and beautiful core unit with very few weaknesses.  It looks like a medium-large sphere of bright energy radiating in all directions with an almost sinister humanoid-like protoss being inside with two arms to dish out its powerful ''psionic shockwave'' attacks.'," +
                "'          Archons should be considered an all around unit cabable of mixing with nearly any army composition.  They deal especially well with clumps of light units due to its splash, often crucial features of armies in the early and mid game.  Against zerg, protoss armies with archons" +
                "    and chargelots are often very effective.  Archons do very well against all zerg units due to their bonus against biological units, and in fact 1 shot Zerglings and Banelings that don''t have any Carapace.  Archon splash can be used to kill creep tumors without detection.  Against protoss, the archon can be used to push on 2 or 3 bases easily to deal with clumps of zealots and to break forcefields, as well as late game to help destroyed interceptors or phoenixes during Air vs Air wars.\n          Against terran archons are seen less frequently due to their short range, but nonetheless are very effective against bio units, being immune to concussive shells and having various other bonuses to help.  Archons can do well in situations" +
                "    with Shield Batteries, as the majority of their HP is in shields.  Archons, once severely damaged, should be microed back to base, or retreated away from the army to be saved for later.  Archons are also the only unit to be created in multiple different ways: either with dark templar or high templar, or one of each, making 3 combinations of total cost possible (100 Minerals & 300 Gas, 175 Minerals & 275 Gas, or 250 Minerals & 250 Gas)." +
                "    The most effective armies containing Archons will often involve a tank, providing support in front of the archon to sit behind, and a longer ranged unit behind the archon, increasing the army''s dps even more.', '          Archons are beings of psionic power and rage, and their presence on the battlefield inspires much fear in their foes. The creation of an archon is a serious affair and is never made lightly, for it requires the reluctant sacrifice of valuable Templars for a short-term gain. Archons radiate energy like stars and burn out when depleted.  The archon is, for the most part, a being of pure energy that hovers above ground by displacing gravity itself. Nonetheless, this embodiment of power has a nigh-intangible physical form with unmistakable protoss features; a remnant of the Templar who sacrificed their lives to bring it into being. Its purpose is to shape and anchor the psionic maelstrom, preventing the archon from burning out like a star as soon as the merging is complete. The merging results in the loss of self for the Templar who create the archon, and those who do so are bequeathed great honor and a place in the templar archives.\n\n" +
                "         The loss of most of the psionic powers of the two merging templar is more than compensated for by the archon''s formidable psychic gestalt. Archons can independently erect a resilient shield and direct psionic shockwaves. They may create rifts that draws in nearby matter, removing it and the archons from the battlefield. Emotionally, archons are manifestations of pure rage, though this may be \"twisted\" should the merging be in error. Archons are much feared by their enemies, and can wade through countless enemy troops; they are strong enough to engage ultralisks in single combat.\n" +
                "\n" +
                "          Originally, archons were formed through the merging of two high templar. After the Brood War and the reunification of the protoss, archons of a different kind can now be created by merging two Dark Templar or even a Khalai and Nerazim merging together.  \n\n  -  This section uses material from the \"Archon\" article on the Starcraft wiki at FANDOM and is licensed under the Creative Commons Attribution-Share Alike License','Ground', 'Merging Templar (Gateways or Warpgates)', 'Ground and Air', 'Until destroyed','PX', null, '35 vs Biological', null, '28 vs Biological', null, null, null, null, 1.0, '1', null)");

        db.execSQL("INSERT INTO " + TABLE_NAME + "(unitID, NAME, Pic1, HP, Dmg1, Dmg2, Armor, Cargo, Supply, Minerals, Vespene, BuildTime, Speed, AttackSpeed1, AttackSpeed2, " +
                "Bonuses, RangevsGround, RangevsAir, LOS, LOS2, unitSize, Upgrades, SpecialAbilities, Energy, TechRequired, Shields, WarpgateCooldown, Speed2, NaturalEnemies, NaturalPrey," +
                "Race, Description, Uses, Lore, GroundAir, BuildsFrom, AttacksGA, Lifespan, Attributes, EnergyCost, SpecialDmg1, SpecialDmg2, SpecialDPS1, SpecialDPS2, HP2, Armor2, ASString, SplashRadius, AttackCount, AttackCount2) " +
                "VALUES (3,'Auto-Turret', null, 150, 18, null, 1, null, 0.0, 0, 0, 0, 0.0, 0.57, null, null\n" +
                ", '6 (7 with Hi-Sec Auto Tracking upgrade)', '6 (7 with Hi-Sec Auto Tracking upgrade)', 7, null, '2x2', 'Hi-Sec Auto Tracking (+1 range), Structure Armor (+2 armor); both researched by an Engineering Bay',\n" +
                "'Has a timed lifespan, has deployment range of 3 from Raven', null, 'Starport', null, null, null, 'Immortals, Zerglings, Banelings, Spine Crawlers, Photon Cannons, Marauders, Tanks'," +
                "'Workers, Liberators (defender mode), single targets', 'Terran', '          The Auto-Turret is a Terran automated defensive structure produced by the Raven.  It consists of one main rotating 12mm gun which can fire once every just over half a second, and can deal 315 damage within its lifespan.','          Its main use is harassing mineral lines, and can be deployed in tricky to defend locations such as in between mineral patches or on ledges.  It deals enough damage to kill a queen before expiring and can be placed on creep unlike other terran buildings.  Auto-Turrets can also be used to ward off Liberators in defender mode, due to the Liberator''s inability to attack structures.  With a lifespan of only 10 seconds, they can no longer reliably kill reinforcements, but from time to time can be useful in base trades or cornering single targets.\n          Often it will initiate a worker pull upon being placed down (unless there are immediate army units nearby), which can be exploited in other ways and at least will cost mining time.  Being a structure, it''s arguably weak to banelings, but at a cost of 0 minerals and gas, it''s still a pretty good deal.'" +
                ",'          Designs for auto-defense cannon turrets were available as far back as 2499.  \n\n  -  This section uses material from the \"Auto-Turret\" article on the Starcraft wiki at FANDOM and is licensed under the Creative Commons Attribution-Share Alike License', 'Ground','Raven (Starport with Tech Lab)','Ground and Air', '10 seconds', 'AMS', 50, null, null, null, null, null, '3 with Structure Armor',null, null, '1', null)");

        db.execSQL("INSERT INTO " + TABLE_NAME + "(unitID, NAME, Pic1, HP, Dmg1, Dmg2, Armor, Cargo, Supply, Minerals, Vespene, BuildTime, Speed, AttackSpeed1, AttackSpeed2, " +
                "Bonuses, RangevsGround, RangevsAir, LOS, LOS2, unitSize, Upgrades, SpecialAbilities, Energy, TechRequired, Shields, WarpgateCooldown, Speed2, NaturalEnemies, NaturalPrey," +
                "Race, Description, Uses, Lore, GroundAir, BuildsFrom, AttacksGA, Lifespan, Attributes, EnergyCost, SpecialDmg1, SpecialDmg2, SpecialDPS1, SpecialDPS2, HP2, Armor2, ASString, SplashRadius, AttackCount, AttackCount2) " +
                "VALUES (4,'Baneling', null, 30, 20, null, 0, 2, 0.5, 25, 25, 14, 3.5, null, null, '+15 vs Light, +60 vs Structures'\n" +
                ", 0.25, null, 8, null, 0.75, 'Melee Attacks Levels 1-3 (+2 each; +4 vs Light; +5 vs Structures), Ground Carapace Levels 1-3 (+1 each) & Centrifugal Hooks increases Baneling''s speed by 0.63 and HP by 5 researched by Baneling Nest, requires Lair or Hive',\n" +
                "'Explodes upon impact in a decent splash radius, damaging all units in the radius equally.  Due to having only one attack during its life, it does not have DPS values.  Baneling cocoons (morphing state) have 50 HP and an armor of 2.', null, 'Baneling Nest', null, null, '4.13 with Centrifugal Hooks', 'Roaches, Stalkers, Archons, Marauders, AOE Damage such as Tanks and Storm'," +
                "'Workers, Zerglings, Hydralisks, Marines, Zealots, Other Light Units', 'Zerg', '          The Baneling is a small ground unit that can be described as an ovular sac of acid.  While it has legs, it''s relatively round shape even allows rolling as its preferred method of transportation after Centrifugal Hooks are evolved.  It''s movement speed is slower than that of Zerglings.  Most Baneling skins will show the torso as glowing, implying the acid itself is bright colored, usually neon green.','          Banelings can be used to great effect throughout almost every stage of the game, and in most matchups." +
                " The ability for Banelings to wreck worker lines in 1 or 2 detonations depending on upgrades never loses utility and should be seen as one of the most primary uses of Baneling.  Banelings are also great at destroying large clumps of light ground units.  They can be compared to a ground version of the Scourge in Broodwar.  A powerful suicidal unit that splashes heavily with no dropoff is not to be underestimated.\n          Banelings can also be dropped from overlords over a mineral line or the opponents army very effectively.  Due to their bonus against structures, only 5 Banelings are needed to bust through supply depots, making them easy targets when parts of the Terran''s wall.  The term ''Baneling Bust'' refers to their use as quick destructors of protective walls, followed usually by a flood of Speedlings.\n          Banelings should be controlled carefully and separately, and mobile enough to retreat and wait for an opportunity to surround or flank unsuspecting armies." +
                " Any attempt to restrict the movement of the opposing army, such as with the spell Fungal Growth, usually works well with Banelings, allowing them to more easily and quickly connect with their targets.', '          Banelings are created from zerglings following a brief chrysalis phase. In the new form, the zergling''s claws shrivel and become withered, and a swollen sac filled with volatile chemicals grows out of its back. The zergling''s skin is repurposed, stretching over newly formed growths while its bone plates soften to hold bulbous, pulsating acid sacs in place. Though the remains of the carapace offer no real protection, they allow for unhindered delivery of the baneling''s payload. The digestive and reproductory tracts are assimilated as nutrients to accelerate the process, and make room for the fleshy, mutated adrenal glands. These are re-purposed to produce and store large quantities of highly corrosive acid. Few materials can withstand this acid burst.\n" +
                "          Because of its mass, the baneling''s legs are thicker than the zergling''s, in order to stabilize itself. Its feet are replaced by sharp spikes that allow them to navigate rough terrain, albeit at a slower pace. The Swarm was able to increase the baneling''s speed despite these imperfections. Yet due to their bloated nature, banelings are barely able to walk. They have been observed to tuck into a ball and roll. Banelings also possess a rudimentary sonar system—Dominion scientists have theorized that this is a degeneration of the zergling''s complex optical structure. This system consists of a transmitter in the center of the baneling''s skull, along with two evenly spaced receivers to the sides. The transmitter emits pulses that map the baneling''s surrounding area, and echoes back to the receiver, feeding the baneling with a continuous stream of spatial information.\n          Banelings were first observed during the Siege of Cask on Sorona, in 2503. Its defenders held out against the zerg long enough so that it came to pass that only minor breeds such as zerglings continued to be spawned to be sent into battle. However, queens drove the development of a new strain, via zerglings incorporating an acidic native mold into themselves. These new banelings were thus sent against Cask, their spray of acid destroying its defenses and eradicating the terrans present.\n" +
                "          During the same year, when other terrans encountered the baneling for the first time they thought it was a mutation of a previously unknown genus rather than a morph of the zergling. The baneling was duly added to the list of threats and scientists began an effort to develop chemical rounds to detonate banelings prematurely.\n" +
                "          In 2505, Abathur used the baneling strain as a base for a mutation upgrade to the mutalisk, allowing its glaive wurms to explode on impact. After joining Kerrigan, Dehaka would selectively breed his pack to create similar strains of creatures among the primal zerg.\n" +
                "          Baneling acid sacs were harvested for use in Project Simulant in the project''s attempt to recreate the baneling in robotic form. The engineers had to deal with the sacs constantly melting through the surrounding plate infrastructure. Eventually they made it work.  \n\n  -  This section uses material from the \"Baneling\" article on the Starcraft wiki at FANDOM and is licensed under the Creative Commons Attribution-Share Alike License', 'Ground','Zerglings','Ground', 'Until destroyed', 'BL', null, '35 vs Light', '80 vs Structures', null, null, '35 with Centrifugal Hooks', null, null, 2.2, '1', null)");

        db.execSQL("INSERT INTO " + TABLE_NAME + "(unitID, NAME, Pic1, HP, Dmg1, Dmg2, Armor, Cargo, Supply, Minerals, Vespene, BuildTime, Speed, AttackSpeed1, AttackSpeed2, " +
                "Bonuses, RangevsGround, RangevsAir, LOS, LOS2, unitSize, Upgrades, SpecialAbilities, Energy, TechRequired, Shields, WarpgateCooldown, Speed2, NaturalEnemies, NaturalPrey," +
                "Race, Description, Uses, Lore, GroundAir, BuildsFrom, AttacksGA, Lifespan, Attributes, EnergyCost, SpecialDmg1, SpecialDmg2, SpecialDPS1, SpecialDPS2, HP2, Armor2, ASString, SplashRadius, AttackCount, AttackCount2) " +
                "VALUES (5,'Banshee', null, 140, 12, null, 0, null, 3.0, 150, 100, 43, 3.85, 0.89, null, null\n" +
                ", 6, null, 10, null, 1.5, 'Ship Weapons Levels 1-3 (+2 each (+1 to each of its 2 attacks)), Vehicle and Ship Plating Levels 1-3 (+1 each), Cloaking Field (allows Banshee''s cloaking ability), Hyperflight Rotors (Cost: 150/150, increases movement speed from 3.85 to 5.25); both researched by Tech Lab on Starport',\n" +
                "'Can use Cloak, which will require detection to counter.  2 shots workers.', '50/200', 'Starport', null, null, '5.25 with Hyperflight Rotors', 'Phoenix, Queens, Hydralisks, Spore Crawlers, Photon Cannons, all forms of detection during Cloak'," +
                "'Roaches, Ravagers, Banelings, Sentries, High Templars, Infestors, Siege Tanks, other high value single ground targets, all Workers', 'Terran'," +
                "'          Practically speaking most banshee play utilizes banshees as harass units either by themselves or in pairs.  If the first banshee is not lost there could be multiple banshees located in dead air space, able to come in and harass multiple bases.  It''s often worth it to get cloak to require an answer with detection, as the upgrade costs only 100/100.  With more than 3 or 4 banshees, it''s often worth it to get hyperflight rotors, although this strategy is usually planned out from the start as it''s a huge commitment.  2 banshees are enough to one shot a worker.  Banshees can commonly be seen against ultralisks in the late gate with mech compositions, and in the mid game to snipe key units such as sentries, hydralisks, and ravagers.','          The Banshee is an easily maneuverable flying Terran unit powered by two turbofans and a special propulsion system for space use.  Its standard attack consists of two backlash rockets which can be cast from a medium-long range.  The size is slightly ', " +
                "'          The Banshee was designed by Procyon Industries to meet requirements from the Terran Dominion for a dedicated ground attack aircraft for counter-insurgency operations. The Banshee was an entirely new design; adapting an existing design was unlikely to be satisfactory. After much experimentation, the Banshee was in use by the Dominion by 2502, and within the same year, the Kel-Morian Combine. It has proven very successful in service.\n" +
                "           Initial deployment within the Dominion was disappointing. The aircraft was judged as too inflexible, and many were relegated to minor roles with backwater militias. Over time, ease of interstellar deployment, the ability to deliver strikes over difficult terrain, and the addition of the cloaking device, led to more widespread deployment within the Dominion. The Banshee gained a reputation as a Dominion terror weapon due to collateral damage caused in urban combat (a result of the craft''s poor guidance systems for its backlash rockets).  Guerilla and resistance forces also found the Banshee useful against the Dominion. Banshees are used as light-infantry support, and can operate with Vikings as air cavalry.\n" +
                "\n" +
                "Despite its original purpose as a counter-insurgency weapon, the Banshee went on to be used against protoss, zerg, and terran front line forces. Little can be done to alter the public''s negative perception of the Dominion, but it has nonetheless gained a permenant place in its airforce due to its low cost and easy maintenance.\n" +
                "\n" +
                "Raynor''s Raiders gained access to the craft during the Second Great War. Through a series of backdoor deals, the Umojan Protectorate was able to acquire a limited number of Banshees from Procyon Industries, although the company maintained they were stolen. These Banshees were in use by the time of the Defenders of Man Insurgency.\n" +
                "\n" +
                "After the End War, Dominion engineers have made critical upgrades to the banshee''s twin VTOL turbofans, enabling superior stability and performance when paired with the new vertical stabilizer in the rear of the craft.\n\n  -  This section uses material from the \"Banshee\" article on the Starcraft wiki at FANDOM and is licensed under the Creative Commons Attribution-Share Alike License', 'Air','Starport with Tech Lab','Ground', 'Until destroyed', 'LM', null, null, null, null, null, null, null, null, null, '2', null)");

        db.execSQL("INSERT INTO " + TABLE_NAME + "(unitID, NAME, Pic1, HP, Dmg1, Dmg2, Armor, Cargo, Supply, Minerals, Vespene, BuildTime, Speed, AttackSpeed1, AttackSpeed2, " +
                "Bonuses, RangevsGround, RangevsAir, LOS, LOS2, unitSize, Upgrades, SpecialAbilities, Energy, TechRequired, Shields, WarpgateCooldown, Speed2, NaturalEnemies, NaturalPrey," +
                "Race, Description, Uses, Lore, GroundAir, BuildsFrom, AttacksGA, Lifespan, Attributes, EnergyCost, SpecialDmg1, SpecialDmg2, SpecialDPS1, SpecialDPS2, HP2, Armor2, ASString, SplashRadius, AttackCount, AttackCount2) " +
                "VALUES (6,'Battlecruiser', null, 550, 5, 8, 3, null, 6.0, 400, 300, 64, 2.62, 0.16, null, null\n" +
                ", 6, 8, 12, null, 2.5, 'Ship Weapons Levels 1-3 (+1 each), Vehicle and Ship Plating Levels 1-3 (+1 each), & Weapon Refit (allows the use of Yamato Cannon)',\n" +
                "'Can move while shooting, Tactical Jump - after 4 seconds, allows the Battlecruiser to teleport to any location on the map and has a cooldown of 71 seconds (invincible while jumping), Yamato Cannon - after 2 seconds, fires a devasting blast of plasma that deals 240 damage at a range of 10 and has a cooldown of 71 seconds', null, 'Fusion Core', null, null, null, 'Corruptors, Viper''s abduct, Infestor''s neural parasite, Stalkers, Voidrays, Widow Mines, Vikings, Thors (high impact), Raven''s interference matrix'," +
                "'Pretty much all other units, most significantly Hydralisks, Mutalisks, Marines, Tanks, Archons, and slow moving units such as Carriers and Thors (explosive payload)', 'Terran', '          ','          ', '          ', 'Air','Starport with Tech Lab','Ground and Air', 'Until destroyed', 'AMX', null, null, null, null, null, null, null, null, null, '1','1')");

        db.execSQL("INSERT INTO " + TABLE_NAME + "(unitID, NAME, Pic1, HP, Dmg1, Dmg2, Armor, Cargo, Supply, Minerals, Vespene, BuildTime, Speed, AttackSpeed1, AttackSpeed2, " +
                "Bonuses, RangevsGround, RangevsAir, LOS, LOS2, unitSize, Upgrades, SpecialAbilities, Energy, TechRequired, Shields, WarpgateCooldown, Speed2, NaturalEnemies, NaturalPrey," +
                "Race, Description, Uses, Lore, GroundAir, BuildsFrom, AttacksGA, Lifespan, Attributes, EnergyCost, SpecialDmg1, SpecialDmg2, SpecialDPS1, SpecialDPS2, HP2, Armor2, ASString, SplashRadius, AttackCount, AttackCount2) " +
                "VALUES (7,'Brood Lord', null, 225, 20, null, 1, null, 4.0, 150, 150, 24, 1.97, 1.79, null, null\n" +
                ", 10, null, 12, null, 2.0, 'Flyer Attacks Levels 1-3 (+2 each), Flyer Carapace Levels 1-3 (+1 each)',\n" +
                "'Spawn Broodlings, which can potentially more than double the dps of the Brood Lord - an additional 26 DPS more than the original 11 without upgrades with all 3 broodlings surrounding and attacking.', null, 'Greater Spire', null, null, null, 'Tempests, Void Rays, Corruptors, Vipers (abduct), Vikings, Battlecruisers, Ghosts (steady shot), Hellbats (to burn Broodlings)'," +
                "'All units that don''t attack air, particularly Siege Tanks that are sieged, as the Broodlings will draw fire and deal devestaing damage.  Compositions with Marines, Hydralisks, and Stalkers may suffer against sufficiently supported Brood Lords as well.','Zerg', '          ','          ', '          ', 'Air','Corruptor','Ground', 'Until destroyed', 'ABX', null, null, null, null, null, null, null, null, null, '1', null)");

        db.execSQL("INSERT INTO " + TABLE_NAME + "(unitID, NAME, Pic1, HP, Dmg1, Dmg2, Armor, Cargo, Supply, Minerals, Vespene, BuildTime, Speed, AttackSpeed1, AttackSpeed2, " +
                "Bonuses, RangevsGround, RangevsAir, LOS, LOS2, unitSize, Upgrades, SpecialAbilities, Energy, TechRequired, Shields, WarpgateCooldown, Speed2, NaturalEnemies, NaturalPrey," +
                "Race, Description, Uses, Lore, GroundAir, BuildsFrom, AttacksGA, Lifespan, Attributes, EnergyCost, SpecialDmg1, SpecialDmg2, SpecialDPS1, SpecialDPS2, HP2, Armor2, ASString, SplashRadius, AttackCount, AttackCount2) " +
                "VALUES (8,'Broodling', null, 30, 4, null, 0, null, 0.0, 0, 0, 0, 5.37, 0.46, null, null\n" +
                ", '0.1', null, 7, null, 0.75, 'Melee Attacks Levels 1-3 (+1 each), Ground Carapace Levels 1-3 (+1 each)',\n" +
                "'Has timed lifespan, and expires after 5.71 seconds.  Created either from Brood Lords or after a zerg building (save static defense) is destroyed.  Costs nothing.', null, 'Hatchery', null, null, null, 'Hellbats are the single best counter to Broodlings.  '," +
                "'Workers, Zerglings and Banelings are all good targets.  Broodlings are more relevant in zvz than most matchups.', 'Zerg', '          ','          May be used as a last line of defense for the zerg.  Buys time.  Scouting drone can make an evo chamber to block extractors and produce Brood Lings.  Brood Lings can block enemy units from advancing or retreating.', '          ', 'Ground','Brood Lords produced by Corruptors, or zerg buildings that have been destroyed','Ground', '5.71 seconds', 'BL', null, null, null, null, null, null, null, null, null, '1', null)");

        db.execSQL("INSERT INTO " + TABLE_NAME + "(unitID, NAME, Pic1, HP, Dmg1, Dmg2, Armor, Cargo, Supply, Minerals, Vespene, BuildTime, Speed, AttackSpeed1, AttackSpeed2, " +
                "Bonuses, RangevsGround, RangevsAir, LOS, LOS2, unitSize, Upgrades, SpecialAbilities, Energy, TechRequired, Shields, WarpgateCooldown, Speed2, NaturalEnemies, NaturalPrey," +
                "Race, Description, Uses, Lore, GroundAir, BuildsFrom, AttacksGA, Lifespan, Attributes, EnergyCost, SpecialDmg1, SpecialDmg2, SpecialDPS1, SpecialDPS2, HP2, Armor2, ASString, SplashRadius, AttackCount, AttackCount2) " +
                "VALUES (9,'Carrier', null, 300, 5, null, 2, null, 6.0, 350, 250, 64, 2.62, 0.2675, null, null\n" +
                ", 8, 8, 12, null, 2.5, 'Air Weapons Levels 1-3 (+1 each interceptor shot (+2 total)), Air Armor Levels 1-3 (+1 each), & Shields Levels 1-3 (+1 armor to shields each)',\n" +
                "'Builds interceptors at a rate of one every 11 seconds when not maxed at 8 interceptors.  The Build Interceptors ability is by default automatic.  Interceptors will all die when the Carrier dies, and may fly out to a range of 14 away from the Carrier.', null, 'Fleet Beacon', 150, null, null, 'Corruptors, Battlecruisers, Tempests, Vikings, and sometimes Archons, Marines, and Hydralisks to slay the interceptors, and sometimes Vipers (abduct)'," +
                "'Most other units fall to the carrier.  Only weak against heavy anti-air damage.  ', 'Protoss', '          ','          ', '          ', 'Air','Stargate','Ground and Air','Until destroyed', 'AMX', null, null, null, null, null, null, null, null, null, '2', null)");

        db.execSQL("INSERT INTO " + TABLE_NAME + "(unitID, NAME, Pic1, HP, Dmg1, Dmg2, Armor, Cargo, Supply, Minerals, Vespene, BuildTime, Speed, AttackSpeed1, AttackSpeed2, " +
                "Bonuses, RangevsGround, RangevsAir, LOS, LOS2, unitSize, Upgrades, SpecialAbilities, Energy, TechRequired, Shields, WarpgateCooldown, Speed2, NaturalEnemies, NaturalPrey," +
                "Race, Description, Uses, Lore, GroundAir, BuildsFrom, AttacksGA, Lifespan, Attributes, EnergyCost, SpecialDmg1, SpecialDmg2, SpecialDPS1, SpecialDPS2, HP2, Armor2, ASString, SplashRadius, AttackCount, AttackCount2) " +
                "VALUES (10,'Changeling', null, 5, null, null, 0, null, 0.0, 0, 0, 0, 3.15, null, null, null\n" +
                ", null, null, 8, 9, 0.75, null,\n" +
                "'Will not be auto-attacked by enemies, must be targetted.  Will disguise itself into a basic military unit of the opponent''s race.  Has one more sight range disguised as a Marine or Zealot, but faster speed as a Zergling.  Has a timed lifespan and deals no damage.', null, 'Overseer', null, null, '4.13 disguised as Zergling', 'Every unit that deals ground damage can take them out.  Detectors are useful for distinguishing them.'," +
                "'Only thing Changelings do is scout and identify enemy assets.', 'Zerg', '          ','          ', '          ', 'Ground','Overseer, made from Overlords',null, '150 seconds', 'BL', null, null, null, null, null, null, null, null, null, '1', null)");

        db.execSQL("INSERT INTO " + TABLE_NAME + "(unitID, NAME, Pic1, HP, Dmg1, Dmg2, Armor, Cargo, Supply, Minerals, Vespene, BuildTime, Speed, AttackSpeed1, AttackSpeed2, " +
                "Bonuses, RangevsGround, RangevsAir, LOS, LOS2, unitSize, Upgrades, SpecialAbilities, Energy, TechRequired, Shields, WarpgateCooldown, Speed2, NaturalEnemies, NaturalPrey," +
                "Race, Description, Uses, Lore, GroundAir, BuildsFrom, AttacksGA, Lifespan, Attributes, EnergyCost, SpecialDmg1, SpecialDmg2, SpecialDPS1, SpecialDPS2, HP2, Armor2, ASString, SplashRadius, AttackCount, AttackCount2) " +
                "VALUES (11,'Colossus', null, 200, 10, null, 1, 8, 6.0, 300, 200, 54, 3.15, 1.07, null, '+5 (x2) vs Light'\n" +
                ", 7, null, 10, null, 2.0, 'Ground Weapons Levels 1-3 (+1 each; +2 vs Light), Ground Armor Levels 1-3 (+1 each), & Shields Levels 1-3 (+1 armor to shields each), & Extended Thermal Lance (Increases the range of the Colossus by 2) researched by the Robotics Bay',\n" +
                "'Can cliff walk and be attacked by air to air units.  Other units can walk beneath it.', null, 'Robotics Bay', 150, null, null, 'Vikings, Corruptors, Tempests, Marauders, Lurkers, Disruptors, units that deal well vs armor'," +
                "'Hydralisks, Marines, and other light units', 'Protoss', '          ','          ', '          ', 'Ground','Robotics Facility','Ground', 'Until destroyed', 'AMX', null, '15 (x2) vs Light', null, '28.037 vs Light', null, null, null, null, 2.0, '2', null)");

        db.execSQL("INSERT INTO " + TABLE_NAME + "(unitID, NAME, Pic1, HP, Dmg1, Dmg2, Armor, Cargo, Supply, Minerals, Vespene, BuildTime, Speed, AttackSpeed1, AttackSpeed2, " +
                "Bonuses, RangevsGround, RangevsAir, LOS, LOS2, unitSize, Upgrades, SpecialAbilities, Energy, TechRequired, Shields, WarpgateCooldown, Speed2, NaturalEnemies, NaturalPrey," +
                "Race, Description, Uses, Lore, GroundAir, BuildsFrom, AttacksGA, Lifespan, Attributes, EnergyCost, SpecialDmg1, SpecialDmg2, SpecialDPS1, SpecialDPS2, HP2, Armor2, ASString, SplashRadius, AttackCount, AttackCount2) " +
                "VALUES (12,'Corruptor', null, 200, 14, null, 2, null, 2.0, 150, 100, 29, 4.725, 1.36, null, '+6 vs Massive'\n" +
                ", null, 6, 10, null, 1.25, 'Flyer Attacks Levels 1-3 (+1 each, +2 vs Massive), Flyer Carapace Levels 1-3 (+1 each)',\n" +
                "'Can use Caustic Spray to destroy buildings at a rate of 7 damage per second for 4.3 damage (30 total) and then 35 damage per second following this time', null, 'Spire', null, null, null, 'Thors (high impact), Vikings (fighter mode), Archons, Stalkers, Void Rays, any ground to air unit'," +
                "'Brood Lords, Mutalisks, Phoenix, Tempests, Carriers, Collosi, Battlecruisers, every massive air unit', 'Zerg', '          ','          ', '          ', 'Air','Hatchery, Lair, or Hive','Air', 'Until destroyed', 'AB', null, '20 vs Massive', null, null, null, null, null, null,null, '1', null)");

        db.execSQL("INSERT INTO " + TABLE_NAME + "(unitID, NAME, Pic1, HP, Dmg1, Dmg2, Armor, Cargo, Supply, Minerals, Vespene, BuildTime, Speed, AttackSpeed1, AttackSpeed2, " +
                "Bonuses, RangevsGround, RangevsAir, LOS, LOS2, unitSize, Upgrades, SpecialAbilities, Energy, TechRequired, Shields, WarpgateCooldown, Speed2, NaturalEnemies, NaturalPrey," +
                "Race, Description, Uses, Lore, GroundAir, BuildsFrom, AttacksGA, Lifespan, Attributes, EnergyCost, SpecialDmg1, SpecialDmg2, SpecialDPS1, SpecialDPS2, HP2, Armor2, ASString, SplashRadius, AttackCount, AttackCount2) " +
                "VALUES (13,'Cyclone', null, 120, 18, null, 1, 4, 3.0, 150, 100, 32, 4.73, 0.71, null, '+2 vs Armored'\n" +
                ", 5, null, 11, null, 1.5, 'Vehicle Weapons Levels 1-3 (+2 each), Vehicle and Ship Plating Levels 1-3 (+1 each), Mag-Field Accelerator - costs 100 minerals 100 gas, takes 100 seconds to research, researched by Tech Lab on Factory; increases Cyclone''s Lock On damage to armored units from 400 over 14 seconds to 800',\n" +
                "'Can use Lock On to remain targetted on units up to 15 range away, while dealing 400 damage over 14 seconds.  Ability lasts for 14.3 seconds, but will end when the target goes out of range or out of sight, and has a cooldown of 4.3 seconds.', null, 'Factory + Tech Lab', null, null, null, 'Immortals, Siege Tanks, Zerglings'," +
                "'Marauders, Roaches, Adepts', 'Terran', '          ','          ', '          ', 'Ground','Factory with Tech Lab','Ground & Air', 'Until destroyed', 'AM', null, '20 vs Armored', '400 over 14.3 seconds with Lock On', '28.169 vs Armored', '27.972 with Lock On', null, null, null, null, '1', null)");

        db.execSQL("INSERT INTO " + TABLE_NAME + "(unitID, NAME, Pic1, HP, Dmg1, Dmg2, Armor, Cargo, Supply, Minerals, Vespene, BuildTime, Speed, AttackSpeed1, AttackSpeed2, " +
                "Bonuses, RangevsGround, RangevsAir, LOS, LOS2, unitSize, Upgrades, SpecialAbilities, Energy, TechRequired, Shields, WarpgateCooldown, Speed2, NaturalEnemies, NaturalPrey," +
                "Race, Description, Uses, Lore, GroundAir, BuildsFrom, AttacksGA, Lifespan, Attributes, EnergyCost, SpecialDmg1, SpecialDmg2, SpecialDPS1, SpecialDPS2, HP2, Armor2, ASString, SplashRadius, AttackCount, AttackCount2) " +
                "VALUES (14,'Dark Templar', null, 40, 45, null, 1, 2, 2.0, 125, 125, 39, 3.94, 1.21, null, null,\n" +
                " 0, null, 8, null, 0.75, 'Ground Weapons Levels 1-3 (+5 each), Ground Armor Levels 1-3 (+1 each), & Shields Levels 1-3 (+1 armor to shields each), Shadow Stride (similar to blink, teleports the dark templar to a nearby location), Archon Warp (may turn into an archon with the presence of another dark templar or high templar',\n" +
                " 'Has Permanent Cloak and requires detection to target and attack.  May be destroyed without detection by means of splash damage.', null, 'Dark Shrine', 80, 32, null, 'The DT is not bad against ground units if it remains undetected.  Due to low HP, it is poor vs most ground units if detected.'," +
                "'Workers, Zerglings, Marines, Hydralisks, and other units that may be kill in one or two hits', 'Protoss', '          ','          ', '          ', 'Ground','Gateway or Warpgate','Ground', 'Until destroyed', 'BLP', null, null, null, null, null, null, null, null, null, '1', null)");

        db.execSQL("INSERT INTO " + TABLE_NAME + "(unitID, NAME, Pic1, HP, Dmg1, Dmg2, Armor, Cargo, Supply, Minerals, Vespene, BuildTime, Speed, AttackSpeed1, AttackSpeed2, " +
                "Bonuses, RangevsGround, RangevsAir, LOS, LOS2, unitSize, Upgrades, SpecialAbilities, Energy, TechRequired, Shields, WarpgateCooldown, Speed2, NaturalEnemies, NaturalPrey," +
                "Race, Description, Uses, Lore, GroundAir, BuildsFrom, AttacksGA, Lifespan, Attributes, EnergyCost, SpecialDmg1, SpecialDmg2, SpecialDPS1, SpecialDPS2, HP2, Armor2, ASString, SplashRadius, AttackCount, AttackCount2) " +
                "VALUES (15,'Disruptor', null, 100, null, null, 1, 4, 3.0, 150, 150, 36, 3.15, null, null, 'Nova deals +55 to Shields'\n" +
                ", null, null, 9, null, 1.0, 'Ground Armor Levels 1-3 (+1 each), & Shields Levels 1-3 (+1 armor to shields each)',\n" +
                "'Casts Purification Nova, which sends forth a ball of energy that denotes after 2.1 seconds, dealing 145 splash damage and up to 55 additional shield damage in a 1.5 range radious.  The disruptor cannot move during this ability.  Has cooldown of 21.4 seconds.', null, 'Robotics Bay', 100, null, null, 'Zerglings, Phoenix, Immortals, Thors, Ultralisks, and any air to ground unit'," +
                "'Stalkers, Roaches, Hydralisks, Zealots, Adepts, Sentries, any mid-tier ground unit', 'Protoss', '          ','          ', '          ', 'Ground','Robotics Facility','Ground', 'Until destroyed', 'AM', null, null, null, null, null, null, null, null, 1.5, '1', null)");

        db.execSQL("INSERT INTO " + TABLE_NAME + "(unitID, NAME, Pic1, HP, Dmg1, Dmg2, Armor, Cargo, Supply, Minerals, Vespene, BuildTime, Speed, AttackSpeed1, AttackSpeed2, " +
                "Bonuses, RangevsGround, RangevsAir, LOS, LOS2, unitSize, Upgrades, SpecialAbilities, Energy, TechRequired, Shields, WarpgateCooldown, Speed2, NaturalEnemies, NaturalPrey," +
                "Race, Description, Uses, Lore, GroundAir, BuildsFrom, AttacksGA, Lifespan, Attributes, EnergyCost, SpecialDmg1, SpecialDmg2, SpecialDPS1, SpecialDPS2, HP2, Armor2, ASString, SplashRadius, AttackCount, AttackCount2) " +
                    "VALUES (16,'Drone', null, 40, 5, null, 0, 1, 1.0, 50, 0, 12, 3.94, 1.07, null, null\n" +
                ", 0, null, 8, null, 0.75, 'Melee Attacks Levels 1-3 (+1 each), Ground Carapace Levels 1-3 (+1 each)',\n" +
                "'Can build structures; is the basis for all zerg buildings', null, 'Baneling Nest', null, null, null, 'Oracles, Liberators, Zerglings, Banelings, and other units that specialize in worker harass'," +
                "'Other workers/None', 'Zerg', '          ','          ', '          ', 'Ground','Hatchery, Lair, or Hive','Ground', 'Until destroyed', 'BL', null, null, null, null, null, null, null, null, null, '1', null)");

        db.execSQL("INSERT INTO " + TABLE_NAME + "(unitID, NAME, Pic1, HP, Dmg1, Dmg2, Armor, Cargo, Supply, Minerals, Vespene, BuildTime, Speed, AttackSpeed1, AttackSpeed2, " +
                "Bonuses, RangevsGround, RangevsAir, LOS, LOS2, unitSize, Upgrades, SpecialAbilities, Energy, TechRequired, Shields, WarpgateCooldown, Speed2, NaturalEnemies, NaturalPrey," +
                "Race, Description, Uses, Lore, GroundAir, BuildsFrom, AttacksGA, Lifespan, Attributes, EnergyCost, SpecialDmg1, SpecialDmg2, SpecialDPS1, SpecialDPS2, HP2, Armor2, ASString, SplashRadius, AttackCount, AttackCount2) " +
                "VALUES (17,'Ghost', null, 100, 10, null, 0, 2, 2.0, 150, 125, 29, 3.94, 1.07, null, '+10 vs Light'\n" +
                ", 6, null, 11, null, 0.75, 'Infantry Weapons Levels 1-3 (+1 each; +2 vs Light), Infantry Armor Armor Levels 1-3 (+1 each), & Personal Cloaking (renders the ghost invisible until energy depletes or is cancelled) researched by Ghost Academy',\n" +
                "'Steady Targetting (costs 50 energy; colloquially known as ''Snipe''), EMP Round (costs 75 energy; ''EMP'' removes up to 100 shields and energy from targetted units within a splash radius of 1.5), Cloak (costs 25 energy + 1.3/s; this activates the ghost''s invisibility, mandating detection to be targetted), and Tactical Nuke Strike (stored 1 at a time in Ghost Academies; this calls down a nuke that deals up to 300 damage and +200 to buildings, splash radius of 4)', '75/200', 'Ghost Academy', null, null, null, 'Zerglings, Stalkers, Marauders'," +
                "'All energy units (EMP), Ultralisks (Snipe), Workers (Cloak), some other light or biological units', 'Terran', '          ','          ', '          ', 'Ground','Barracks with Tech Lab','Ground', 'Until destroyed', 'BP', null, '20 vs Light', null, '18.6 vs Light', null, null, null, null, null, '1', null)");

        db.execSQL("INSERT INTO " + TABLE_NAME + "(unitID, NAME, Pic1, HP, Dmg1, Dmg2, Armor, Cargo, Supply, Minerals, Vespene, BuildTime, Speed, AttackSpeed1, AttackSpeed2, " +
                "Bonuses, RangevsGround, RangevsAir, LOS, LOS2, unitSize, Upgrades, SpecialAbilities, Energy, TechRequired, Shields, WarpgateCooldown, Speed2, NaturalEnemies, NaturalPrey," +
                "Race, Description, Uses, Lore, GroundAir, BuildsFrom, AttacksGA, Lifespan, Attributes, EnergyCost, SpecialDmg1, SpecialDmg2, SpecialDPS1, SpecialDPS2, HP2, Armor2, ASString, SplashRadius, AttackCount, AttackCount2) " +
                "VALUES (18,'Hellbat', null, 135, 18, null, 0, 4, 2.0, 100, 0, 21, 3.15, 1.43, null, '+1 per attack upgrade vs Light units, +12 vs Light units with Infernal Pre-Igniter (and +1 per attack upgrade)'\n" +
                ", 2, null, 10, null, 1.25, 'Vehicle Weapons Levels 1-3 (+2 each; +3 vs Light), Vehicle and Ship Plating Levels 1-3 (+1 each), Infernal Pre-Igniter (grants +12 damage to Light) researched by Tech Lab on Factory, Smart Servos (reduces transformation time from Hellion to Hellbat from 2.86-3.04 seconds to 1.43 seconds) researched by Tech Lab on Factory',\n" +
                "'Can be regenerated by medivacs, can transform back to Hellion form, Hellbat Mode for Hellions available with Armory, deals splash damage', null, 'Armory', null, null, null, 'Stalkers, Marauders, Banelings'," +
                "'Workers, Zerglings, Hydralisks, Marines, Zealots, other Light units', 'Terran', '          ','          ', '          ', 'Ground','Factory','Ground', 'Until destroyed', 'BLM', null, '30 vs Light with Infernal Pre-Igniter', null, '20.979 vs Light with Infernal Pre-Igniter', null, null, null, null, null, '1', null)");

        db.execSQL("INSERT INTO " + TABLE_NAME + "(unitID, NAME, Pic1, HP, Dmg1, Dmg2, Armor, Cargo, Supply, Minerals, Vespene, BuildTime, Speed, AttackSpeed1, AttackSpeed2, " +
                "Bonuses, RangevsGround, RangevsAir, LOS, LOS2, unitSize, Upgrades, SpecialAbilities, Energy, TechRequired, Shields, WarpgateCooldown, Speed2, NaturalEnemies, NaturalPrey," +
                "Race, Description, Uses, Lore, GroundAir, BuildsFrom, AttacksGA, Lifespan, Attributes, EnergyCost, SpecialDmg1, SpecialDmg2, SpecialDPS1, SpecialDPS2, HP2, Armor2, ASString, SplashRadius, AttackCount, AttackCount2) " +
                "VALUES (19,'Hellion', null, 90, 8, null, 0, 2, 2.0, 100, 0, 21, 5.95, 1.79, null, '+6 vs Light units (and +1 per attack upgrade), +11 vs Light units with Infernal Pre-Igniter (and +1 per attack upgrade)'\n" +
                ", 5, null, 10, null, 1.25, 'Vehicle Weapons Levels 1-3 (+1 each; +2 vs Light), Vehicle and Ship Plating Levels 1-3 (+1 each), & Infernal Pre-Igniter (grants +5 damage to Light) researched by Tech Lab on Factory, Smart Servos (reduces transformation time from Hellion to Hellbat from 2.86-3.04 seconds to 1.43 seconds) researched by Tech Lab on Factory',\n" +
                "'Can use Hellbat Mode to transform into a Hellbat if Armory is present, deals splash damage in a linear path', null, 'Factory', null, null, null, 'Stalkers, Marauders, Roaches, and other units that deal well with light and fast units'," +
                "'Workers, Zerglings, Hydralisks (in certain situations with Infernal Pre-Igniter), Marines, Other Light Units', 'Terran', '          ','          ', '          ', 'Ground','Factory','Ground', 'Until destroyed', 'LM', null, '14 vs Light', '19 vs Light with Infernal Pre-Igniter', '7.82 vs Light', '10.615 vs Light with Infernal Pre-Igniter', null, null, null, null, '1', null)");

        db.execSQL("INSERT INTO " + TABLE_NAME + "(unitID, NAME, Pic1, HP, Dmg1, Dmg2, Armor, Cargo, Supply, Minerals, Vespene, BuildTime, Speed, AttackSpeed1, AttackSpeed2, " +
                "Bonuses, RangevsGround, RangevsAir, LOS, LOS2, unitSize, Upgrades, SpecialAbilities, Energy, TechRequired, Shields, WarpgateCooldown, Speed2, NaturalEnemies, NaturalPrey," +
                "Race, Description, Uses, Lore, GroundAir, BuildsFrom, AttacksGA, Lifespan, Attributes, EnergyCost, SpecialDmg1, SpecialDmg2, SpecialDPS1, SpecialDPS2, HP2, Armor2, ASString, SplashRadius, AttackCount, AttackCount2) " +
                "VALUES (20,'High Templar', null, 40, 4, null, 0, 2, 2.0, 50, 150, 39, 2.62, 1.25, null, null\n" +
                ", 6, null, 10, null, 0.75, 'Ground Weapons Levels 1-3 (+1 each), Ground Armor Levels 1-3 (+1 each), Shields Levels 1-3, & Psionic Storm which allows the High Templar to cast a damaging storm with an area of effect radius of 1.5, dealing up to 80 damage lasting 2.85 seconds, cast range of 9, and 1.43 second cooldown; researched by Templar Archives',\n" +
                "'Can cast Psionic Storm (explained in upgrades), Feedback which drains all energy from targetted unit and deals 0.5 damage per energy drained this way, and can morph into on Archon with another High Templar or Dark Templar.', null, 'Templar Archives', 40, 32, '4.13 with Centrifugal Hooks', 'Roaches, Stalkers, Archons, Marauders, AOE Damage such as Tanks and Storm'," +
                "'Workers, Zerglings, Hydralisks, Marines, Zealots, Other Light Units', 'Protoss', '          ','          ', '          ', 'Ground','Gateway or Warp Gate','Ground', 'Until destroyed', 'BLP', null, null, null, null, null, null, null, null, null, '1', null)");

        db.execSQL("INSERT INTO " + TABLE_NAME + "(unitID, NAME, Pic1, HP, Dmg1, Dmg2, Armor, Cargo, Supply, Minerals, Vespene, BuildTime, Speed, AttackSpeed1, AttackSpeed2, " +
                "Bonuses, RangevsGround, RangevsAir, LOS, LOS2, unitSize, Upgrades, SpecialAbilities, Energy, TechRequired, Shields, WarpgateCooldown, Speed2, NaturalEnemies, NaturalPrey," +
                "Race, Description, Uses, Lore, GroundAir, BuildsFrom, AttacksGA, Lifespan, Attributes, EnergyCost, SpecialDmg1, SpecialDmg2, SpecialDPS1, SpecialDPS2, HP2, Armor2, ASString, SplashRadius, AttackCount, AttackCount2) " +
                "VALUES (21,'Hydralisk', null, 90, 12, null, 0, 2, 2.0, 100, 50, 24, 3.15, 0.59, null, null\n" +
                ", 5, 5, 9, null, 1.25, 'Missile Attacks Levels 1-3 (+1 each), Ground Carapace Levels 1-3 (+1 each), Muscular Augments increases the Hydralisk''s movement speed by 0.7895, & Grooved Spines increases the Hydralisk''s range by 1',\n" +
                "'Can morph into Lurkers if Lurker Den is present', null, 'Hydralisk Den', null, null, '3.94 with Muscular Augments', 'Banelings, Roaches, Marines, Siege Tanks, Hellbats, Chargelots, High Templar with storm, and other units that deal well with Light units'," +
                "'All Air units save for the Battlecruiser, Immortals, Marauders', 'Zerg', '          ','          ', '          ', 'Ground','Hatchery, Lair, or Hive','Ground and Air', 'Until destroyed', 'BL', null, null, null, null, null, null, null, null, null, '1', null)");

        db.execSQL("INSERT INTO " + TABLE_NAME + "(unitID, NAME, Pic1, HP, Dmg1, Dmg2, Armor, Cargo, Supply, Minerals, Vespene, BuildTime, Speed, AttackSpeed1, AttackSpeed2, " +
                "Bonuses, RangevsGround, RangevsAir, LOS, LOS2, unitSize, Upgrades, SpecialAbilities, Energy, TechRequired, Shields, WarpgateCooldown, Speed2, NaturalEnemies, NaturalPrey," +
                "Race, Description, Uses, Lore, GroundAir, BuildsFrom, AttacksGA, Lifespan, Attributes, EnergyCost, SpecialDmg1, SpecialDmg2, SpecialDPS1, SpecialDPS2, HP2, Armor2, ASString, SplashRadius, AttackCount, AttackCount2) " +
                "VALUES (22,'Immortal', null, 200, 20, null, 1, 4, 4.0, 275, 100, 39, 3.15, 1.04, null, '+30 vs Armored'\n" +
                ", 0, null, 8, null, 1.5, 'Ground Weapons Levels 1-3 (+2 each; +5 vs Armored), Ground Armor Levels 1-3 (+1 each), & Shields Levels 1-3 (+1 armor to shields each)',\n" +
                "'Has Barrier which activates when attacked. It can prevent up to 100 damage, lasts 2 seconds, and has a cooldown of 32 seconds.', null, 'Robotics Facility', null, null, null, 'Air to ground units, Hydralisks, Zerglings, Marines, and Chargelots'," +
                "'Roaches, Stalkers, Siege Tanks, and other Armored units', 'Protoss', '          ','          ', '          ', 'Ground','Robotics Facility','Ground', 'Until destroyed', 'AM', null, '50 vs Armored', null, null, null, 'Effective total HP of 400 with Barrier', null, null, null, '1', null)");

        db.execSQL("INSERT INTO " + TABLE_NAME + "(unitID, NAME, Pic1, HP, Dmg1, Dmg2, Armor, Cargo, Supply, Minerals, Vespene, BuildTime, Speed, AttackSpeed1, AttackSpeed2, " +
                "Bonuses, RangevsGround, RangevsAir, LOS, LOS2, unitSize, Upgrades, SpecialAbilities, Energy, TechRequired, Shields, WarpgateCooldown, Speed2, NaturalEnemies, NaturalPrey," +
                "Race, Description, Uses, Lore, GroundAir, BuildsFrom, AttacksGA, Lifespan, Attributes, EnergyCost, SpecialDmg1, SpecialDmg2, SpecialDPS1, SpecialDPS2, HP2, Armor2, ASString, SplashRadius, AttackCount, AttackCount2) " +
                "VALUES (23,'Infested Terran', null, 50, 6, 14, 0, null, 0.0, 0, 0, 3, 1.31, 0.61, 0.95, null\n" +
                ", 5, 6, 9, null, 0.75, 'Missile Attacks Levels 1-3 (+1 each)',\n" +
                "'Is spawned from Infestor and has a timed life of 21 seconds.  May be cast within a range of 8.', null, 'None', null, null, null, 'Banelings, Tanks, and Archons, among others'," +
                "'Workers, Interceptors, and Ultralisks (to block pathing)', 'Zerg', '          ','          ', '          ', 'Ground','Infestor energy','Ground and Air', '21 seconds', 'BL', 25, null, null, null, null, null, null, 'vs air units', null, '1', '1')");

        db.execSQL("INSERT INTO " + TABLE_NAME + "(unitID, NAME, Pic1, HP, Dmg1, Dmg2, Armor, Cargo, Supply, Minerals, Vespene, BuildTime, Speed, AttackSpeed1, AttackSpeed2, " +
                "Bonuses, RangevsGround, RangevsAir, LOS, LOS2, unitSize, Upgrades, SpecialAbilities, Energy, TechRequired, Shields, WarpgateCooldown, Speed2, NaturalEnemies, NaturalPrey," +
                "Race, Description, Uses, Lore, GroundAir, BuildsFrom, AttacksGA, Lifespan, Attributes, EnergyCost, SpecialDmg1, SpecialDmg2, SpecialDPS1, SpecialDPS2, HP2, Armor2, ASString, SplashRadius, AttackCount, AttackCount2) " +
                "VALUES (24,'Infestor', null, 90, 0, null, 0, 2, 2.0, 100, 150, 36, 3.15, null, null, null\n" +
                ", 0, null, 8, null, 1.5, 'Ground Carapace Levels 1-3 (+1 each), Neural Parasite researched by Infestation Pit costs 150 150, and takes 79 seconds to research and allows the casting of the ability Neural Parasite, and Pathogen Glands increases the starting energy of infestors by 25, and is researched by Infestation Pit costs 150 150 and takes 57 seconds to research',\n" +
                "'Can cast a variety of spells and starts with 50/200 energy, which can be upgraded to 75/200 by Pathogen Glands (allowing infestors to cast fungal growth right after spawning).  Neural Parasite costs 100 energy and allows the infestor to take control of an enemy unit for 11 seconds with a cast range of 9 and total range up to 14.  The infestor cannot move during the neural parasite, but it can cancel the spell.  Fungal Growth costs 75 energy and launches an area of effect spell with radius of 2.25, cast range of 10, and duration of 3 seconds, dealing a total of 30 damage.  This spell reduces speed by 75%, reveals cloaked units, and prevents most movement abilities such as Blink, Tactical Jump, or loading into transports or buildings.  Infested Terran cost 25 minerals each, may be cast in a range of 8, and can attack both ground and air units.  They may be spawned while burrowed.', '50/200', 'Infestation Pit', null, null, null, 'Ghosts, High Templar, all units that deal damage to ground units'," +
                "'Clumps of light units such as Marines, Zerglings, Banelings, and other core units such as Marauders, Stalkers, and Roaches.  High priority single targets such as Thors, Battlecruisers, and Carriers.', 'Zerg', '          ','          ', '          ', 'Ground','Hatchery, Lair, or Hive','Ground', 'Until destroyed', 'BL', null, null, null, null, null, null, null, null, null, '0', null)");

        db.execSQL("INSERT INTO " + TABLE_NAME + "(unitID, NAME, Pic1, HP, Dmg1, Dmg2, Armor, Cargo, Supply, Minerals, Vespene, BuildTime, Speed, AttackSpeed1, AttackSpeed2, " +
                "Bonuses, RangevsGround, RangevsAir, LOS, LOS2, unitSize, Upgrades, SpecialAbilities, Energy, TechRequired, Shields, WarpgateCooldown, Speed2, NaturalEnemies, NaturalPrey," +
                "Race, Description, Uses, Lore, GroundAir, BuildsFrom, AttacksGA, Lifespan, Attributes, EnergyCost, SpecialDmg1, SpecialDmg2, SpecialDPS1, SpecialDPS2, HP2, Armor2, ASString, SplashRadius, AttackCount, AttackCount2) " +
                "VALUES (25,'Interceptor', null, 40, 5, null, 0, null, 0.0, 15, 0, 11, 10.5, 2.14, null, null\n" +
                ", 0, null, 7, null, 0.5, 'Air Weapons Levels 1-3 (+1 each), Air Armor Levels 1-3 (+1 each), & Shields Levels 1-3 (+1 armor to shields each)',\n" +
                "'Launched from carrers, Interceptors have the high speed in the game of any unit, but are automatically kept within a radius of 8 to the Carrier.  Interceptors will prioritize units that target air, and are not individually selectable.  A maximum of 8 Interceptors may be stored at a time within a Carrier.', null, 'None', 40, null, null, 'Hydralisks, Marines, and Archons'," +
                "'See ''Carrier''', 'Protoss', '          ','          ', '          ', 'Air','Carrier','Ground and Air', 'Until destroyed or until the Carrier is destroyed', 'LM', null, null, null, null, null, null, null, null, null, '2', null)");

        db.execSQL("INSERT INTO " + TABLE_NAME + "(unitID, NAME, Pic1, HP, Dmg1, Dmg2, Armor, Cargo, Supply, Minerals, Vespene, BuildTime, Speed, AttackSpeed1, AttackSpeed2, " +
                "Bonuses, RangevsGround, RangevsAir, LOS, LOS2, unitSize, Upgrades, SpecialAbilities, Energy, TechRequired, Shields, WarpgateCooldown, Speed2, NaturalEnemies, NaturalPrey," +
                "Race, Description, Uses, Lore, GroundAir, BuildsFrom, AttacksGA, Lifespan, Attributes, EnergyCost, SpecialDmg1, SpecialDmg2, SpecialDPS1, SpecialDPS2, HP2, Armor2, ASString, SplashRadius, AttackCount, AttackCount2) " +
                "VALUES (26,'Larva', null, 25, 0, null, 10, null, 0, 0, 0, 11, 0.79, null, null, null\n" +
                ", 0, null, 5, null, 0.25, null,\n" +
                "'Larvae can be selected to morph into any zerg unit for which you have the required tech, except Queens.  They have the highest armor in the game at 10, but one of the lowest HP values of 25.  They have the slowest speed, shortest line of sight, and like Interceptors are automatically produced and are not directly controlable. Unlike Interceptors, they cost nothing and are selectable.', null, 'Hatchery', null, null, null, 'Any unit with high damage output, or units with bonuses to light or biological units, such as Hellions, Hellbats, and Archons.  Also spells such as Psionic Storm, Fungal Growth, Snipe, and Oracle''s Pulsar Beam will deal full damage to Larvae.  Banelings can destroy Larvae in one detonation.'," +
                "'None','Zerg', '          ','          ', '          ', 'Ground','Hatchery, Lair, or Hive','None', 'Until destroyed or off creep', 'BL', null, null, null, null, null, null, null, null, null, '0', null)");

        db.execSQL("INSERT INTO " + TABLE_NAME + "(unitID, NAME, Pic1, HP, Dmg1, Dmg2, Armor, Cargo, Supply, Minerals, Vespene, BuildTime, Speed, AttackSpeed1, AttackSpeed2, " +
                "Bonuses, RangevsGround, RangevsAir, LOS, LOS2, unitSize, Upgrades, SpecialAbilities, Energy, TechRequired, Shields, WarpgateCooldown, Speed2, NaturalEnemies, NaturalPrey," +
                "Race, Description, Uses, Lore, GroundAir, BuildsFrom, AttacksGA, Lifespan, Attributes, EnergyCost, SpecialDmg1, SpecialDmg2, SpecialDPS1, SpecialDPS2, HP2, Armor2, ASString, SplashRadius, AttackCount, AttackCount2) " +
                "VALUES (27,'Liberator (defender mode)', null, 180, 75, null, 0, null, 3.0, 150, 150, 43, 0.0, 1.14, null, null\n" +
                ", 5, null, 10, null, 1.5, 'Ship Weapons Levels 1-3 (+5 each), Ship Armor Levels 1-3 (+1 each), & Advanced Ballistics, costs 150 150, takes 79 seconds to research, is researched by the Tech Lab on Starport, and requires a Fusion Core.  Advanced Ballistics increases the range of Liberators in Defender Mode by 4 (from 5 to 9).',\n" +
                "'May unsiege to return to Fighter Mode, the default mode when built.  Has a unique attack radius that can be repositioned anywhere within its range of 5 (or 9 with Advanced Ballistics).  Always has vision of the targetted area.  Defender Mode Liberators cannot move, and must be unsieged to do so.', null, 'Starport', null, null, null, 'Void Rays, Corruptors, Vikings, anti-air static defense, and some ground units such as Queens and Stalkers when in range'," +
                "'Workers, Hydralisks, Siege Tanks, Immortals, Ultralisks, and any ground unit that cannot attack air units', 'Terran', '          ','          ', '          ', 'Air','Starport with Tech Lab','Ground', 'Until destroyed', 'AM', null, null, null, null, null, null, null, null, null, '1', null)");

        db.execSQL("INSERT INTO " + TABLE_NAME + "(unitID, NAME, Pic1, HP, Dmg1, Dmg2, Armor, Cargo, Supply, Minerals, Vespene, BuildTime, Speed, AttackSpeed1, AttackSpeed2, " +
                "Bonuses, RangevsGround, RangevsAir, LOS, LOS2, unitSize, Upgrades, SpecialAbilities, Energy, TechRequired, Shields, WarpgateCooldown, Speed2, NaturalEnemies, NaturalPrey," +
                "Race, Description, Uses, Lore, GroundAir, BuildsFrom, AttacksGA, Lifespan, Attributes, EnergyCost, SpecialDmg1, SpecialDmg2, SpecialDPS1, SpecialDPS2, HP2, Armor2, ASString, SplashRadius, AttackCount, AttackCount2) " +
                "VALUES (28,'Liberator (fighter mode)', null, 180, 5, null, 0, null, 3.0, 150, 150, 43, 0.0, 1.14, null, '+2 per attack vs Light units'\n" +
                ", null, 5, 10, null, 1.5, 'Ship Weapons Levels 1-3 (+1 each), Ship Armor Levels 1-3 (+1 each), & Advanced Ballistics, costs 150 150, takes 79 seconds to research, is researched by the Tech Lab on Starport, and requires a Fusion Core.  Advanced Ballistics increases the range of Liberators in Defender Mode by 4 (from 5 to 9).',\n" +
                "'Deals area of effect damage to air units, and has two low damage attacks against air, making them weak to highly armored air units.  May siege with a specified radius - See Liberator (defender mode).', null, 'Starport', null, null, null, 'Void Rays, Corruptors, Vikings, and all ground-to-air units'," +
                "'Mutalisks and Phoenix when clumped in a group', 'Terran', '          ','          ', '          ', 'Air','Starport with Tech Lab','Air', 'Until destroyed', 'AM', null, null, null, null, null, null, null, null, null, '2', null)");

        db.execSQL("INSERT INTO " + TABLE_NAME + "(unitID, NAME, Pic1, HP, Dmg1, Dmg2, Armor, Cargo, Supply, Minerals, Vespene, BuildTime, Speed, AttackSpeed1, AttackSpeed2, " +
                "Bonuses, RangevsGround, RangevsAir, LOS, LOS2, unitSize, Upgrades, SpecialAbilities, Energy, TechRequired, Shields, WarpgateCooldown, Speed2, NaturalEnemies, NaturalPrey," +
                "Race, Description, Uses, Lore, GroundAir, BuildsFrom, AttacksGA, Lifespan, Attributes, EnergyCost, SpecialDmg1, SpecialDmg2, SpecialDPS1, SpecialDPS2, HP2, Armor2, ASString, SplashRadius, AttackCount, AttackCount2) " +
                "VALUES (29,'Locust', null, 50, 10, null, 0, null, 0.0, 0, 0, 2, 2.62, 0.43, null, null\n" +
                ", 6, null, 6, null, 0.75, 'Missile Attacks Upgrades Levels 1-3 (+1 each), Ground Carapace Levels 1-3 (+1 each)',\n" +
                "'Spawn flying, and may swoop and land at any point.  May only attack while landed.  Has timed life of 21 seconds.', null, 'None', null, null, null, 'AOE Damage such as Siege Tanks, Psionic Storm, Hellbats, Collosi, and Banelings'," +
                "'Workers, Siege Tanks to incur friendly fire', 'Zerg', '          ','          ', '          ', 'Ground, but spawned as Air','Swarm Hosts','Ground', '21 seconds', 'BL', null, null, null, null, null, null, null, null, null, '1', null)");

        db.execSQL("INSERT INTO " + TABLE_NAME + "(unitID, NAME, Pic1, HP, Dmg1, Dmg2, Armor, Cargo, Supply, Minerals, Vespene, BuildTime, Speed, AttackSpeed1, AttackSpeed2, " +
                "Bonuses, RangevsGround, RangevsAir, LOS, LOS2, unitSize, Upgrades, SpecialAbilities, Energy, TechRequired, Shields, WarpgateCooldown, Speed2, NaturalEnemies, NaturalPrey," +
                "Race, Description, Uses, Lore, GroundAir, BuildsFrom, AttacksGA, Lifespan, Attributes, EnergyCost, SpecialDmg1, SpecialDmg2, SpecialDPS1, SpecialDPS2, HP2, Armor2, ASString, SplashRadius, AttackCount, AttackCount2) " +
                "VALUES (30,'Lurker', null, 30, 20, null, 1, 4, 3.0, 50, 100, 18, 4.13, 1.43, null, '+10 vs Armored units'\n" +
                ", 9, null, 10, null, 1.5, 'Missile Attacks Levels 1-3 (+2 each, +3 vs Armored), Ground Carapace Levels 1-3 (+1 each), & Adaptine Talons - costs 150 150, takes 54 seconds to research, and requires a Hive, researched by Lurker Den.  Adapter Talons reduces the time it takes for the Lurker to burrow from 2.0 seconds to 0.7 seconds, and increases its speed by 0.413.',\n" +
                "'Lurkers attack in a straight line like Hellions but the attack is not instantaneous, and takes time to travel, which allows for micro potential against Lurkers.  Lurkers deal heavy damage to Armored units and can only attack while burrowed.  Lurkers are morphed from Hydralisks, making the total cost of a Lurker 200 250 when the Hydralisk cost is considered.  Their speed may be upgraded from 4.13 to 4.543 and burrow speed reduced from 2.0 seconds to 0.7 seconds with Adaptive Talons.', null, 'Lurker Den', null, null, '4.543 with Adaptive Talons', 'Siege Tanks, Immortals, Ultralisks, Vipers (blinding cloud or abduct), and Disruptors'," +
                "'Roaches, Stalkers, Marines, Hydralisks, Zealots, and other massable units', 'Zerg', '          ','          ', '          ', 'Ground','Hydralisks','Ground', 'Until destroyed', 'AB', null, '30 vs Armored', null, '21.98 vs Armored', null, null, null, null, null, '1', null)");

        db.execSQL("INSERT INTO " + TABLE_NAME + "(unitID, NAME, Pic1, HP, Dmg1, Dmg2, Armor, Cargo, Supply, Minerals, Vespene, BuildTime, Speed, AttackSpeed1, AttackSpeed2, " +
                "Bonuses, RangevsGround, RangevsAir, LOS, LOS2, unitSize, Upgrades, SpecialAbilities, Energy, TechRequired, Shields, WarpgateCooldown, Speed2, NaturalEnemies, NaturalPrey," +
                "Race, Description, Uses, Lore, GroundAir, BuildsFrom, AttacksGA, Lifespan, Attributes, EnergyCost, SpecialDmg1, SpecialDmg2, SpecialDPS1, SpecialDPS2, HP2, Armor2, ASString, SplashRadius, AttackCount, AttackCount2) " +
                "VALUES (31,'Marauder', null, 120, 5, null, 1, 2, 2.0, 100, 25, 21, 3.15, 1.07, 0.71, '+ 5 (x2) vs Armored'\n" +
                ", 6, null, 10, null, 1.125, 'Infantry Weapons Levels 1-3 (+2 each), Infantry Armor Levels 1-3 (+1 each), Concussive Shells - costs 50 minerals 50 gas, takes 43 seconds to research from Tech Lab on Barracks; every Marauder gains Concussive Shells (see Abilities and Passives), and Stimpack - costs 100 minerals 100 gas, takes 121 seconds to research from Tech Lab on Barracks; every marine and marauder gain the Stimpack ability.',\n" +
                "'Has up to two researchable abilities: Stimpack and Concussive Shells.  Stimpack increases the movement speed of Marines and Marauders by 50% at the cost of 10 HP per Marine or 20 HP for Marauders and last 11 seconds.  Concussive Shells makes each shot slow targetted non-massive units by 1.07 seconds (the time it takes the marauder to shoot) by 50%, without stacking.', null, 'Barracks', null, null, '4.72 during Stimpack', 'Zerglings, Zealots, and Marines'," +
                "'Roaches, Stalkers, Thors, and other Armored units', 'Terran', '          ','          ', '          ', 'Ground','Barracks with Tech Lab','Ground', 'Until destroyed', 'AB', null, '10 (x2) vs Armored', null, '18.6 vs Armored', null, null, null, null, null, '2', null)");

        db.execSQL("INSERT INTO " + TABLE_NAME + "(unitID, NAME, Pic1, HP, Dmg1, Dmg2, Armor, Cargo, Supply, Minerals, Vespene, BuildTime, Speed, AttackSpeed1, AttackSpeed2, " +
                "Bonuses, RangevsGround, RangevsAir, LOS, LOS2, unitSize, Upgrades, SpecialAbilities, Energy, TechRequired, Shields, WarpgateCooldown, Speed2, NaturalEnemies, NaturalPrey," +
                "Race, Description, Uses, Lore, GroundAir, BuildsFrom, AttacksGA, Lifespan, Attributes, EnergyCost, SpecialDmg1, SpecialDmg2, SpecialDPS1, SpecialDPS2, HP2, Armor2, ASString, SplashRadius, AttackCount, AttackCount2) " +
                "VALUES (32,'Marine', null, 45, 6, null, 0, 1, 1.0, 50, 0, 18, 3.15, 0.61, 0.4, null\n" +
                ", 5, 5, 9, null, 0.75, 'Infantry Weapons Levels 1-3 (+1 each), Infantry Armor Levels 1-3 (+1 each), Combat Shields - costs 100 minerals 100 gas, takes 79 seconds to research, researched from Tech Lab on Barracks, and Stimpack - costs 100 minerals 100 gas, takes 121 seconds to research from Tech Lab on Barracks; every marine and marauder gain the Stimpack ability.',\n" +
                "'Has two researchable upgrades or abilities:  Stimpack and Combat Shields.  Stimpack increases the movement speed of Marines and Marauders by 50% at the cost of 10 HP per Marine or 20 HP for Marauders and lasts 11 seconds.  Combat Shields is a passive that grants all Marines +10 HP.', null, 'Barracks', null, null, '4.72 during Stimpack', 'Banelings, Colossus, Disruptors, Siege Tanks, '," +
                "'Marauders, Hydralisks, Immortals, and most air units', 'Terran', '          ','          ', '          ', 'Ground','Barracks','Ground and Air', 'Until destroyed', 'BL', null, null, null, null, null, '55 with Combat Shields', null, null, null, '1', null)");

        db.execSQL("INSERT INTO " + TABLE_NAME + "(unitID, NAME, Pic1, HP, Dmg1, Dmg2, Armor, Cargo, Supply, Minerals, Vespene, BuildTime, Speed, AttackSpeed1, AttackSpeed2, " +
                "Bonuses, RangevsGround, RangevsAir, LOS, LOS2, unitSize, Upgrades, SpecialAbilities, Energy, TechRequired, Shields, WarpgateCooldown, Speed2, NaturalEnemies, NaturalPrey," +
                "Race, Description, Uses, Lore, GroundAir, BuildsFrom, AttacksGA, Lifespan, Attributes, EnergyCost, SpecialDmg1, SpecialDmg2, SpecialDPS1, SpecialDPS2, HP2, Armor2, ASString, SplashRadius, AttackCount, AttackCount2) " +
                "VALUES (33,'Medivac', null, 30, 20, null, 0, 2, 0.5, 50, 25, 14, 3.5, null, null, '+15 vs Light, +60 vs Structures'\n" +
                ", 0, null, 8, null, 0.75, 'Ground Weapons Levels 1-3 (+2 each; +4 vs Light; +5 vs Structures), Ground Armor Levels 1-3 (+1 each), & Shields Levels 1-3 (+1 armor to shields each), & Centrifugal Hooks increases Baneling''s speed by 0.63 and HP by 5 researched by Baneling Nest, requires Lair or Hive',\n" +
                "'Automatically heals units for energy.', null, 'Baneling Nest', null, null, '4.13 with Centrifugal Hooks', 'Roaches, Stalkers, Archons, Marauders, AOE Damage such as Tanks and Storm'," +
                "'Workers, Zerglings, Hydralisks, Marines, Zealots, Other Light Units', 'Terran', '          ','          ', '          ', 'Ground','Hatchery, Lair, or Hive','Ground', 'Until destroyed', 'BL', null, '35 vs Light', '80 vs Structures', null, null, '35 with Centrifugal Hooks', null, null, null, '1', null)");

        db.execSQL("INSERT INTO " + TABLE_NAME + "(unitID, NAME, Pic1, HP, Dmg1, Dmg2, Armor, Cargo, Supply, Minerals, Vespene, BuildTime, Speed, AttackSpeed1, AttackSpeed2, " +
                "Bonuses, RangevsGround, RangevsAir, LOS, LOS2, unitSize, Upgrades, SpecialAbilities, Energy, TechRequired, Shields, WarpgateCooldown, Speed2, NaturalEnemies, NaturalPrey," +
                "Race, Description, Uses, Lore, GroundAir, BuildsFrom, AttacksGA, Lifespan, Attributes, EnergyCost, SpecialDmg1, SpecialDmg2, SpecialDPS1, SpecialDPS2, HP2, Armor2, ASString, SplashRadius, AttackCount, AttackCount2) " +
                "VALUES (34,'Missile Turret', null, 30, 20, null, 0, 2, 0.5, 50, 25, 14, 3.5, null, null, '+15 vs Light, +60 vs Structures'\n" +
                ", 0, null, 8, null, 0.75, 'Ground Weapons Levels 1-3 (+2 each; +4 vs Light; +5 vs Structures), Ground Armor Levels 1-3 (+1 each), & Shields Levels 1-3 (+1 armor to shields each), & Centrifugal Hooks increases Baneling''s speed by 0.63 and HP by 5 researched by Baneling Nest, requires Lair or Hive',\n" +
                "'Explodes upon impact in a decent splash radius, damaging all units in the radius equally.  Due to having only one attack during its life, it does not have DPS values.', null, 'Baneling Nest', null, null, '4.13 with Centrifugal Hooks', 'Roaches, Stalkers, Archons, Marauders, AOE Damage such as Tanks and Storm'," +
                "'Workers, Zerglings, Hydralisks, Marines, Zealots, Other Light Units', 'Zerg    ----  ALL STATS FILLED IN WITH BANELING PLACEHOLDER INFO  ---', '          ','          ', '          ', 'Ground','Hatchery, Lair, or Hive','Ground', 'Until destroyed', 'BL', null, '35 vs Light', '80 vs Structures', null, null, '35 with Centrifugal Hooks', null, null, null, '1', null)");

        db.execSQL("INSERT INTO " + TABLE_NAME + "(unitID, NAME, Pic1, HP, Dmg1, Dmg2, Armor, Cargo, Supply, Minerals, Vespene, BuildTime, Speed, AttackSpeed1, AttackSpeed2, " +
                "Bonuses, RangevsGround, RangevsAir, LOS, LOS2, unitSize, Upgrades, SpecialAbilities, Energy, TechRequired, Shields, WarpgateCooldown, Speed2, NaturalEnemies, NaturalPrey," +
                "Race, Description, Uses, Lore, GroundAir, BuildsFrom, AttacksGA, Lifespan, Attributes, EnergyCost, SpecialDmg1, SpecialDmg2, SpecialDPS1, SpecialDPS2, HP2, Armor2, ASString, SplashRadius, AttackCount, AttackCount2) " +
                "VALUES (35,'Mothership', null, 30, 20, null, 0, 2, 0.5, 50, 25, 14, 3.5, null, null, '+15 vs Light, +60 vs Structures'\n" +
                ", 0, null, 8, null, 0.75, 'Ground Weapons Levels 1-3 (+2 each; +4 vs Light; +5 vs Structures), Ground Armor Levels 1-3 (+1 each), & Shields Levels 1-3 (+1 armor to shields each), & Centrifugal Hooks increases Baneling''s speed by 0.63 and HP by 5 researched by Baneling Nest, requires Lair or Hive',\n" +
                "'Explodes upon impact in a decent splash radius, damaging all units in the radius equally.  Due to having only one attack during its life, it does not have DPS values.', null, 'Baneling Nest', null, null, '4.13 with Centrifugal Hooks', 'Roaches, Stalkers, Archons, Marauders, AOE Damage such as Tanks and Storm'," +
                "'Workers, Zerglings, Hydralisks, Marines, Zealots, Other Light Units', 'Zerg    ----  ALL STATS FILLED IN WITH BANELING PLACEHOLDER INFO  ---', '          ','          ', '          ', 'Ground','Hatchery, Lair, or Hive','Ground', 'Until destroyed', 'BL', null, '35 vs Light', '80 vs Structures', null, null, '35 with Centrifugal Hooks', null, null, null, '1', null)");

        db.execSQL("INSERT INTO " + TABLE_NAME + "(unitID, NAME, Pic1, HP, Dmg1, Dmg2, Armor, Cargo, Supply, Minerals, Vespene, BuildTime, Speed, AttackSpeed1, AttackSpeed2, " +
                "Bonuses, RangevsGround, RangevsAir, LOS, LOS2, unitSize, Upgrades, SpecialAbilities, Energy, TechRequired, Shields, WarpgateCooldown, Speed2, NaturalEnemies, NaturalPrey," +
                "Race, Description, Uses, Lore, GroundAir, BuildsFrom, AttacksGA, Lifespan, Attributes, EnergyCost, SpecialDmg1, SpecialDmg2, SpecialDPS1, SpecialDPS2, HP2, Armor2, ASString, SplashRadius, AttackCount, AttackCount2) " +
                "VALUES (36,'MULE', null, 30, 20, null, 0, 2, 0.5, 50, 25, 14, 3.5, null, null, '+15 vs Light, +60 vs Structures'\n" +
                ", 0, null, 8, null, 0.75, 'Ground Weapons Levels 1-3 (+2 each; +4 vs Light; +5 vs Structures), Ground Armor Levels 1-3 (+1 each), & Shields Levels 1-3 (+1 armor to shields each), & Centrifugal Hooks increases Baneling''s speed by 0.63 and HP by 5 researched by Baneling Nest, requires Lair or Hive',\n" +
                "'Explodes upon impact in a decent splash radius, damaging all units in the radius equally.  Due to having only one attack during its life, it does not have DPS values.', null, 'Baneling Nest', null, null, '4.13 with Centrifugal Hooks', 'Roaches, Stalkers, Archons, Marauders, AOE Damage such as Tanks and Storm'," +
                "'Workers, Zerglings, Hydralisks, Marines, Zealots, Other Light Units', 'Zerg    ----  ALL STATS FILLED IN WITH BANELING PLACEHOLDER INFO  ---', '          ','          ', '          ', 'Ground','Hatchery, Lair, or Hive','Ground', 'Until destroyed', 'BL', null, '35 vs Light', '80 vs Structures', null, null, '35 with Centrifugal Hooks', null, null, null, '1', null)");

        db.execSQL("INSERT INTO " + TABLE_NAME + "(unitID, NAME, Pic1, HP, Dmg1, Dmg2, Armor, Cargo, Supply, Minerals, Vespene, BuildTime, Speed, AttackSpeed1, AttackSpeed2, " +
                "Bonuses, RangevsGround, RangevsAir, LOS, LOS2, unitSize, Upgrades, SpecialAbilities, Energy, TechRequired, Shields, WarpgateCooldown, Speed2, NaturalEnemies, NaturalPrey," +
                "Race, Description, Uses, Lore, GroundAir, BuildsFrom, AttacksGA, Lifespan, Attributes, EnergyCost, SpecialDmg1, SpecialDmg2, SpecialDPS1, SpecialDPS2, HP2, Armor2, ASString, SplashRadius, AttackCount, AttackCount2) " +
                "VALUES (37,'Mutalisk', null, 30, 20, null, 0, 2, 0.5, 50, 25, 14, 3.5, null, null, '+15 vs Light, +60 vs Structures'\n" +
                ", 0, null, 8, null, 0.75, 'Ground Weapons Levels 1-3 (+2 each; +4 vs Light; +5 vs Structures), Ground Armor Levels 1-3 (+1 each), & Shields Levels 1-3 (+1 armor to shields each), & Centrifugal Hooks increases Baneling''s speed by 0.63 and HP by 5 researched by Baneling Nest, requires Lair or Hive',\n" +
                "'Explodes upon impact in a decent splash radius, damaging all units in the radius equally.  Due to having only one attack during its life, it does not have DPS values.', null, 'Baneling Nest', null, null, '4.13 with Centrifugal Hooks', 'Roaches, Stalkers, Archons, Marauders, AOE Damage such as Tanks and Storm'," +
                "'Workers, Zerglings, Hydralisks, Marines, Zealots, Other Light Units', 'Zerg    ----  ALL STATS FILLED IN WITH BANELING PLACEHOLDER INFO  ---', '          ','          ', '          ', 'Ground','Hatchery, Lair, or Hive','Ground', 'Until destroyed', 'BL', null, '35 vs Light', '80 vs Structures', null, null, '35 with Centrifugal Hooks', null, null, null, '1', null)");

        db.execSQL("INSERT INTO " + TABLE_NAME + "(unitID, NAME, Pic1, HP, Dmg1, Dmg2, Armor, Cargo, Supply, Minerals, Vespene, BuildTime, Speed, AttackSpeed1, AttackSpeed2, " +
                "Bonuses, RangevsGround, RangevsAir, LOS, LOS2, unitSize, Upgrades, SpecialAbilities, Energy, TechRequired, Shields, WarpgateCooldown, Speed2, NaturalEnemies, NaturalPrey," +
                "Race, Description, Uses, Lore, GroundAir, BuildsFrom, AttacksGA, Lifespan, Attributes, EnergyCost, SpecialDmg1, SpecialDmg2, SpecialDPS1, SpecialDPS2, HP2, Armor2, ASString, SplashRadius, AttackCount, AttackCount2) " +
                "VALUES (38,'Nydus Worm', null, 30, 20, null, 0, 2, 0.5, 50, 25, 14, 3.5, null, null, '+15 vs Light, +60 vs Structures'\n" +
                ", 0, null, 8, null, 0.75, 'Ground Weapons Levels 1-3 (+2 each; +4 vs Light; +5 vs Structures), Ground Armor Levels 1-3 (+1 each), & Shields Levels 1-3 (+1 armor to shields each), & Centrifugal Hooks increases Baneling''s speed by 0.63 and HP by 5 researched by Baneling Nest, requires Lair or Hive',\n" +
                "'Explodes upon impact in a decent splash radius, damaging all units in the radius equally.  Due to having only one attack during its life, it does not have DPS values.', null, 'Baneling Nest', null, null, '4.13 with Centrifugal Hooks', 'Roaches, Stalkers, Archons, Marauders, AOE Damage such as Tanks and Storm'," +
                "'Workers, Zerglings, Hydralisks, Marines, Zealots, Other Light Units', 'Zerg    ----  ALL STATS FILLED IN WITH BANELING PLACEHOLDER INFO  ---', '          ','          ', '          ', 'Ground','Hatchery, Lair, or Hive','Ground', 'Until destroyed', 'BL', null, '35 vs Light', '80 vs Structures', null, null, '35 with Centrifugal Hooks', null, null, null, '1', null)");

        db.execSQL("INSERT INTO " + TABLE_NAME + "(unitID, NAME, Pic1, HP, Dmg1, Dmg2, Armor, Cargo, Supply, Minerals, Vespene, BuildTime, Speed, AttackSpeed1, AttackSpeed2, " +
                "Bonuses, RangevsGround, RangevsAir, LOS, LOS2, unitSize, Upgrades, SpecialAbilities, Energy, TechRequired, Shields, WarpgateCooldown, Speed2, NaturalEnemies, NaturalPrey," +
                "Race, Description, Uses, Lore, GroundAir, BuildsFrom, AttacksGA, Lifespan, Attributes, EnergyCost, SpecialDmg1, SpecialDmg2, SpecialDPS1, SpecialDPS2, HP2, Armor2, ASString, SplashRadius, AttackCount, AttackCount2) " +
                "VALUES (39,'Observer', null, 30, 20, null, 0, 2, 0.5, 50, 25, 14, 3.5, null, null, '+15 vs Light, +60 vs Structures'\n" +
                ", 0, null, 8, null, 0.75, 'Ground Weapons Levels 1-3 (+2 each; +4 vs Light; +5 vs Structures), Ground Armor Levels 1-3 (+1 each), & Shields Levels 1-3 (+1 armor to shields each), & Centrifugal Hooks increases Baneling''s speed by 0.63 and HP by 5 researched by Baneling Nest, requires Lair or Hive',\n" +
                "'Explodes upon impact in a decent splash radius, damaging all units in the radius equally.  Due to having only one attack during its life, it does not have DPS values.', null, 'Baneling Nest', null, null, '4.13 with Centrifugal Hooks', 'Roaches, Stalkers, Archons, Marauders, AOE Damage such as Tanks and Storm'," +
                "'Workers, Zerglings, Hydralisks, Marines, Zealots, Other Light Units', 'Zerg    ----  ALL STATS FILLED IN WITH BANELING PLACEHOLDER INFO  ---', '          ','          ', '          ', 'Ground','Hatchery, Lair, or Hive','Ground', 'Until destroyed', 'BL', null, '35 vs Light', '80 vs Structures', null, null, '35 with Centrifugal Hooks', null, null, null, '1', null)");

        db.execSQL("INSERT INTO " + TABLE_NAME + "(unitID, NAME, Pic1, HP, Dmg1, Dmg2, Armor, Cargo, Supply, Minerals, Vespene, BuildTime, Speed, AttackSpeed1, AttackSpeed2, " +
                "Bonuses, RangevsGround, RangevsAir, LOS, LOS2, unitSize, Upgrades, SpecialAbilities, Energy, TechRequired, Shields, WarpgateCooldown, Speed2, NaturalEnemies, NaturalPrey," +
                "Race, Description, Uses, Lore, GroundAir, BuildsFrom, AttacksGA, Lifespan, Attributes, EnergyCost, SpecialDmg1, SpecialDmg2, SpecialDPS1, SpecialDPS2, HP2, Armor2, ASString, SplashRadius, AttackCount, AttackCount2) " +
                "VALUES (40,'Oracle', null, 30, 20, null, 0, 2, 0.5, 50, 25, 14, 3.5, null, null, '+15 vs Light, +60 vs Structures'\n" +
                ", 0, null, 8, null, 0.75, 'Ground Weapons Levels 1-3 (+2 each; +4 vs Light; +5 vs Structures), Ground Armor Levels 1-3 (+1 each), & Shields Levels 1-3 (+1 armor to shields each), & Centrifugal Hooks increases Baneling''s speed by 0.63 and HP by 5 researched by Baneling Nest, requires Lair or Hive',\n" +
                "'Explodes upon impact in a decent splash radius, damaging all units in the radius equally.  Due to having only one attack during its life, it does not have DPS values.', null, 'Baneling Nest', null, null, '4.13 with Centrifugal Hooks', 'Roaches, Stalkers, Archons, Marauders, AOE Damage such as Tanks and Storm'," +
                "'Workers, Zerglings, Hydralisks, Marines, Zealots, Other Light Units', 'Zerg    ----  ALL STATS FILLED IN WITH BANELING PLACEHOLDER INFO  ---', '          ','          ', '          ', 'Ground','Hatchery, Lair, or Hive','Ground', 'Until destroyed', 'BL', null, '35 vs Light', '80 vs Structures', null, null, '35 with Centrifugal Hooks', null, null, null, '1', null)");

        db.execSQL("INSERT INTO " + TABLE_NAME + "(unitID, NAME, Pic1, HP, Dmg1, Dmg2, Armor, Cargo, Supply, Minerals, Vespene, BuildTime, Speed, AttackSpeed1, AttackSpeed2, " +
                "Bonuses, RangevsGround, RangevsAir, LOS, LOS2, unitSize, Upgrades, SpecialAbilities, Energy, TechRequired, Shields, WarpgateCooldown, Speed2, NaturalEnemies, NaturalPrey," +
                "Race, Description, Uses, Lore, GroundAir, BuildsFrom, AttacksGA, Lifespan, Attributes, EnergyCost, SpecialDmg1, SpecialDmg2, SpecialDPS1, SpecialDPS2, HP2, Armor2, ASString, SplashRadius, AttackCount, AttackCount2) " +
                "VALUES (41,'Overlord', null, 30, 20, null, 0, 2, 0.5, 50, 25, 14, 3.5, null, null, '+15 vs Light, +60 vs Structures'\n" +
                ", 0, null, 8, null, 0.75, 'Ground Weapons Levels 1-3 (+2 each; +4 vs Light; +5 vs Structures), Ground Armor Levels 1-3 (+1 each), & Shields Levels 1-3 (+1 armor to shields each), & Centrifugal Hooks increases Baneling''s speed by 0.63 and HP by 5 researched by Baneling Nest, requires Lair or Hive',\n" +
                "'Explodes upon impact in a decent splash radius, damaging all units in the radius equally.  Due to having only one attack during its life, it does not have DPS values.', null, 'Baneling Nest', null, null, '4.13 with Centrifugal Hooks', 'Roaches, Stalkers, Archons, Marauders, AOE Damage such as Tanks and Storm'," +
                "'Workers, Zerglings, Hydralisks, Marines, Zealots, Other Light Units', 'Zerg    ----  ALL STATS FILLED IN WITH BANELING PLACEHOLDER INFO  ---', '          ','          ', '          ', 'Ground','Hatchery, Lair, or Hive','Ground', 'Until destroyed', 'BL', null, '35 vs Light', '80 vs Structures', null, null, '35 with Centrifugal Hooks', null, null, null, '1', null)");

        db.execSQL("INSERT INTO " + TABLE_NAME + "(unitID, NAME, Pic1, HP, Dmg1, Dmg2, Armor, Cargo, Supply, Minerals, Vespene, BuildTime, Speed, AttackSpeed1, AttackSpeed2, " +
                "Bonuses, RangevsGround, RangevsAir, LOS, LOS2, unitSize, Upgrades, SpecialAbilities, Energy, TechRequired, Shields, WarpgateCooldown, Speed2, NaturalEnemies, NaturalPrey," +
                "Race, Description, Uses, Lore, GroundAir, BuildsFrom, AttacksGA, Lifespan, Attributes, EnergyCost, SpecialDmg1, SpecialDmg2, SpecialDPS1, SpecialDPS2, HP2, Armor2, ASString, SplashRadius, AttackCount, AttackCount2) " +
                "VALUES (42,'Overseer', null, 30, 20, null, 0, 2, 0.5, 50, 25, 14, 3.5, null, null, '+15 vs Light, +60 vs Structures'\n" +
                ", 0, null, 8, null, 0.75, 'Ground Weapons Levels 1-3 (+2 each; +4 vs Light; +5 vs Structures), Ground Armor Levels 1-3 (+1 each), & Shields Levels 1-3 (+1 armor to shields each), & Centrifugal Hooks increases Baneling''s speed by 0.63 and HP by 5 researched by Baneling Nest, requires Lair or Hive',\n" +
                "'Explodes upon impact in a decent splash radius, damaging all units in the radius equally.  Due to having only one attack during its life, it does not have DPS values.', null, 'Baneling Nest', null, null, '4.13 with Centrifugal Hooks', 'Roaches, Stalkers, Archons, Marauders, AOE Damage such as Tanks and Storm'," +
                "'Workers, Zerglings, Hydralisks, Marines, Zealots, Other Light Units', 'Zerg    ----  ALL STATS FILLED IN WITH BANELING PLACEHOLDER INFO  ---', '          ','          ', '          ', 'Ground','Hatchery, Lair, or Hive','Ground', 'Until destroyed', 'BL', null, '35 vs Light', '80 vs Structures', null, null, '35 with Centrifugal Hooks', null, null, null, '1', null)");

        db.execSQL("INSERT INTO " + TABLE_NAME + "(unitID, NAME, Pic1, HP, Dmg1, Dmg2, Armor, Cargo, Supply, Minerals, Vespene, BuildTime, Speed, AttackSpeed1, AttackSpeed2, " +
                "Bonuses, RangevsGround, RangevsAir, LOS, LOS2, unitSize, Upgrades, SpecialAbilities, Energy, TechRequired, Shields, WarpgateCooldown, Speed2, NaturalEnemies, NaturalPrey," +
                "Race, Description, Uses, Lore, GroundAir, BuildsFrom, AttacksGA, Lifespan, Attributes, EnergyCost, SpecialDmg1, SpecialDmg2, SpecialDPS1, SpecialDPS2, HP2, Armor2, ASString, SplashRadius, AttackCount, AttackCount2) " +
                "VALUES (43,'Phoenix', null, 30, 20, null, 0, 2, 0.5, 50, 25, 14, 3.5, null, null, '+15 vs Light, +60 vs Structures'\n" +
                ", 0, null, 8, null, 0.75, 'Ground Weapons Levels 1-3 (+2 each; +4 vs Light; +5 vs Structures), Ground Armor Levels 1-3 (+1 each), & Shields Levels 1-3 (+1 armor to shields each), & Centrifugal Hooks increases Baneling''s speed by 0.63 and HP by 5 researched by Baneling Nest, requires Lair or Hive',\n" +
                "'Explodes upon impact in a decent splash radius, damaging all units in the radius equally.  Due to having only one attack during its life, it does not have DPS values.', null, 'Baneling Nest', null, null, '4.13 with Centrifugal Hooks', 'Roaches, Stalkers, Archons, Marauders, AOE Damage such as Tanks and Storm'," +
                "'Workers, Zerglings, Hydralisks, Marines, Zealots, Other Light Units', 'Zerg    ----  ALL STATS FILLED IN WITH BANELING PLACEHOLDER INFO  ---', '          ','          ', '          ', 'Ground','Hatchery, Lair, or Hive','Ground', 'Until destroyed', 'BL', null, '35 vs Light', '80 vs Structures', null, null, '35 with Centrifugal Hooks', null, null, null, '1', null)");

        db.execSQL("INSERT INTO " + TABLE_NAME + "(unitID, NAME, Pic1, HP, Dmg1, Dmg2, Armor, Cargo, Supply, Minerals, Vespene, BuildTime, Speed, AttackSpeed1, AttackSpeed2, " +
                "Bonuses, RangevsGround, RangevsAir, LOS, LOS2, unitSize, Upgrades, SpecialAbilities, Energy, TechRequired, Shields, WarpgateCooldown, Speed2, NaturalEnemies, NaturalPrey," +
                "Race, Description, Uses, Lore, GroundAir, BuildsFrom, AttacksGA, Lifespan, Attributes, EnergyCost, SpecialDmg1, SpecialDmg2, SpecialDPS1, SpecialDPS2, HP2, Armor2, ASString, SplashRadius, AttackCount, AttackCount2) " +
                "VALUES (44,'Photon Cannon', null, 30, 20, null, 0, 2, 0.5, 50, 25, 14, 3.5, null, null, '+15 vs Light, +60 vs Structures'\n" +
                ", 0, null, 8, null, 0.75, 'Ground Weapons Levels 1-3 (+2 each; +4 vs Light; +5 vs Structures), Ground Armor Levels 1-3 (+1 each), & Shields Levels 1-3 (+1 armor to shields each), & Centrifugal Hooks increases Baneling''s speed by 0.63 and HP by 5 researched by Baneling Nest, requires Lair or Hive',\n" +
                "'Explodes upon impact in a decent splash radius, damaging all units in the radius equally.  Due to having only one attack during its life, it does not have DPS values.', null, 'Baneling Nest', null, null, '4.13 with Centrifugal Hooks', 'Roaches, Stalkers, Archons, Marauders, AOE Damage such as Tanks and Storm'," +
                "'Workers, Zerglings, Hydralisks, Marines, Zealots, Other Light Units', 'Zerg    ----  ALL STATS FILLED IN WITH BANELING PLACEHOLDER INFO  ---', '          ','          ', '          ', 'Ground','Hatchery, Lair, or Hive','Ground', 'Until destroyed', 'BL', null, '35 vs Light', '80 vs Structures', null, null, '35 with Centrifugal Hooks', null, null, null, '1', null)");

        db.execSQL("INSERT INTO " + TABLE_NAME + "(unitID, NAME, Pic1, HP, Dmg1, Dmg2, Armor, Cargo, Supply, Minerals, Vespene, BuildTime, Speed, AttackSpeed1, AttackSpeed2, " +
                "Bonuses, RangevsGround, RangevsAir, LOS, LOS2, unitSize, Upgrades, SpecialAbilities, Energy, TechRequired, Shields, WarpgateCooldown, Speed2, NaturalEnemies, NaturalPrey," +
                "Race, Description, Uses, Lore, GroundAir, BuildsFrom, AttacksGA, Lifespan, Attributes, EnergyCost, SpecialDmg1, SpecialDmg2, SpecialDPS1, SpecialDPS2, HP2, Armor2, ASString, SplashRadius, AttackCount, AttackCount2) " +
                "VALUES (45,'Planetary Fortress', null, 30, 20, null, 0, 2, 0.5, 50, 25, 14, 3.5, null, null, '+15 vs Light, +60 vs Structures'\n" +
                ", 0, null, 8, null, 0.75, 'Ground Weapons Levels 1-3 (+2 each; +4 vs Light; +5 vs Structures), Ground Armor Levels 1-3 (+1 each), & Shields Levels 1-3 (+1 armor to shields each), & Centrifugal Hooks increases Baneling''s speed by 0.63 and HP by 5 researched by Baneling Nest, requires Lair or Hive',\n" +
                "'Explodes upon impact in a decent splash radius, damaging all units in the radius equally.  Due to having only one attack during its life, it does not have DPS values.', null, 'Baneling Nest', null, null, '4.13 with Centrifugal Hooks', 'Roaches, Stalkers, Archons, Marauders, AOE Damage such as Tanks and Storm'," +
                "'Workers, Zerglings, Hydralisks, Marines, Zealots, Other Light Units', 'Zerg    ----  ALL STATS FILLED IN WITH BANELING PLACEHOLDER INFO  ---', '          ','          ', '          ', 'Ground','Hatchery, Lair, or Hive','Ground', 'Until destroyed', 'BL', null, '35 vs Light', '80 vs Structures', null, null, '35 with Centrifugal Hooks', null, null, null, '1', null)");

        db.execSQL("INSERT INTO " + TABLE_NAME + "(unitID, NAME, Pic1, HP, Dmg1, Dmg2, Armor, Cargo, Supply, Minerals, Vespene, BuildTime, Speed, AttackSpeed1, AttackSpeed2, " +
                "Bonuses, RangevsGround, RangevsAir, LOS, LOS2, unitSize, Upgrades, SpecialAbilities, Energy, TechRequired, Shields, WarpgateCooldown, Speed2, NaturalEnemies, NaturalPrey," +
                "Race, Description, Uses, Lore, GroundAir, BuildsFrom, AttacksGA, Lifespan, Attributes, EnergyCost, SpecialDmg1, SpecialDmg2, SpecialDPS1, SpecialDPS2, HP2, Armor2, ASString, SplashRadius, AttackCount, AttackCount2) " +
                "VALUES (46,'Probe', null, 30, 20, null, 0, 2, 0.5, 50, 25, 14, 3.5, null, null, '+15 vs Light, +60 vs Structures'\n" +
                ", 0, null, 8, null, 0.75, 'Ground Weapons Levels 1-3 (+2 each; +4 vs Light; +5 vs Structures), Ground Armor Levels 1-3 (+1 each), & Shields Levels 1-3 (+1 armor to shields each), & Centrifugal Hooks increases Baneling''s speed by 0.63 and HP by 5 researched by Baneling Nest, requires Lair or Hive',\n" +
                "'Explodes upon impact in a decent splash radius, damaging all units in the radius equally.  Due to having only one attack during its life, it does not have DPS values.', null, 'Baneling Nest', null, null, '4.13 with Centrifugal Hooks', 'Roaches, Stalkers, Archons, Marauders, AOE Damage such as Tanks and Storm'," +
                "'Workers, Zerglings, Hydralisks, Marines, Zealots, Other Light Units', 'Zerg    ----  ALL STATS FILLED IN WITH BANELING PLACEHOLDER INFO  ---', '          ','          ', '          ', 'Ground','Hatchery, Lair, or Hive','Ground', 'Until destroyed', 'BL', null, '35 vs Light', '80 vs Structures', null, null, '35 with Centrifugal Hooks', null, null, null, '1', null)");

        db.execSQL("INSERT INTO " + TABLE_NAME + "(unitID, NAME, Pic1, HP, Dmg1, Dmg2, Armor, Cargo, Supply, Minerals, Vespene, BuildTime, Speed, AttackSpeed1, AttackSpeed2, " +
                "Bonuses, RangevsGround, RangevsAir, LOS, LOS2, unitSize, Upgrades, SpecialAbilities, Energy, TechRequired, Shields, WarpgateCooldown, Speed2, NaturalEnemies, NaturalPrey," +
                "Race, Description, Uses, Lore, GroundAir, BuildsFrom, AttacksGA, Lifespan, Attributes, EnergyCost, SpecialDmg1, SpecialDmg2, SpecialDPS1, SpecialDPS2, HP2, Armor2, ASString, SplashRadius, AttackCount, AttackCount2) " +
                "VALUES (47,'Queen', null, 30, 20, null, 0, 2, 0.5, 50, 25, 14, 3.5, null, null, '+15 vs Light, +60 vs Structures'\n" +
                ", 0, null, 8, null, 0.75, 'Ground Weapons Levels 1-3 (+2 each; +4 vs Light; +5 vs Structures), Ground Armor Levels 1-3 (+1 each), & Shields Levels 1-3 (+1 armor to shields each), & Centrifugal Hooks increases Baneling''s speed by 0.63 and HP by 5 researched by Baneling Nest, requires Lair or Hive',\n" +
                "'Explodes upon impact in a decent splash radius, damaging all units in the radius equally.  Due to having only one attack during its life, it does not have DPS values.', null, 'Baneling Nest', null, null, '4.13 with Centrifugal Hooks', 'Roaches, Stalkers, Archons, Marauders, AOE Damage such as Tanks and Storm'," +
                "'Workers, Zerglings, Hydralisks, Marines, Zealots, Other Light Units', 'Zerg    ----  ALL STATS FILLED IN WITH BANELING PLACEHOLDER INFO  ---', '          ','          ', '          ', 'Ground','Hatchery, Lair, or Hive','Ground', 'Until destroyed', 'BL', null, '35 vs Light', '80 vs Structures', null, null, '35 with Centrifugal Hooks', null, null, null, '1', null)");

        db.execSQL("INSERT INTO " + TABLE_NAME + "(unitID, NAME, Pic1, HP, Dmg1, Dmg2, Armor, Cargo, Supply, Minerals, Vespene, BuildTime, Speed, AttackSpeed1, AttackSpeed2, " +
                "Bonuses, RangevsGround, RangevsAir, LOS, LOS2, unitSize, Upgrades, SpecialAbilities, Energy, TechRequired, Shields, WarpgateCooldown, Speed2, NaturalEnemies, NaturalPrey," +
                "Race, Description, Uses, Lore, GroundAir, BuildsFrom, AttacksGA, Lifespan, Attributes, EnergyCost, SpecialDmg1, SpecialDmg2, SpecialDPS1, SpecialDPS2, HP2, Armor2, ASString, SplashRadius, AttackCount, AttackCount2) " +
                "VALUES (48,'Ravager', null, 30, 20, null, 0, 2, 0.5, 50, 25, 14, 3.5, null, null, '+15 vs Light, +60 vs Structures'\n" +
                ", 0, null, 8, null, 0.75, 'Ground Weapons Levels 1-3 (+2 each; +4 vs Light; +5 vs Structures), Ground Armor Levels 1-3 (+1 each), & Shields Levels 1-3 (+1 armor to shields each), & Centrifugal Hooks increases Baneling''s speed by 0.63 and HP by 5 researched by Baneling Nest, requires Lair or Hive',\n" +
                "'Explodes upon impact in a decent splash radius, damaging all units in the radius equally.  Due to having only one attack during its life, it does not have DPS values.', null, 'Baneling Nest', null, null, '4.13 with Centrifugal Hooks', 'Roaches, Stalkers, Archons, Marauders, AOE Damage such as Tanks and Storm'," +
                "'Workers, Zerglings, Hydralisks, Marines, Zealots, Other Light Units', 'Zerg    ----  ALL STATS FILLED IN WITH BANELING PLACEHOLDER INFO  ---', '          ','          ', '          ', 'Ground','Hatchery, Lair, or Hive','Ground', 'Until destroyed', 'BL', null, '35 vs Light', '80 vs Structures', null, null, '35 with Centrifugal Hooks', null, null, null, '1', null)");

        db.execSQL("INSERT INTO " + TABLE_NAME + "(unitID, NAME, Pic1, HP, Dmg1, Dmg2, Armor, Cargo, Supply, Minerals, Vespene, BuildTime, Speed, AttackSpeed1, AttackSpeed2, " +
                "Bonuses, RangevsGround, RangevsAir, LOS, LOS2, unitSize, Upgrades, SpecialAbilities, Energy, TechRequired, Shields, WarpgateCooldown, Speed2, NaturalEnemies, NaturalPrey," +
                "Race, Description, Uses, Lore, GroundAir, BuildsFrom, AttacksGA, Lifespan, Attributes, EnergyCost, SpecialDmg1, SpecialDmg2, SpecialDPS1, SpecialDPS2, HP2, Armor2, ASString, SplashRadius, AttackCount, AttackCount2) " +
                "VALUES (49,'Raven', null, 30, 20, null, 0, 2, 0.5, 50, 25, 14, 3.5, null, null, '+15 vs Light, +60 vs Structures'\n" +
                ", 0, null, 8, null, 0.75, 'Ground Weapons Levels 1-3 (+2 each; +4 vs Light; +5 vs Structures), Ground Armor Levels 1-3 (+1 each), & Shields Levels 1-3 (+1 armor to shields each), & Centrifugal Hooks increases Baneling''s speed by 0.63 and HP by 5 researched by Baneling Nest, requires Lair or Hive',\n" +
                "'Explodes upon impact in a decent splash radius, damaging all units in the radius equally.  Due to having only one attack during its life, it does not have DPS values.', null, 'Baneling Nest', null, null, '4.13 with Centrifugal Hooks', 'Roaches, Stalkers, Archons, Marauders, AOE Damage such as Tanks and Storm'," +
                "'Workers, Zerglings, Hydralisks, Marines, Zealots, Other Light Units', 'Zerg    ----  ALL STATS FILLED IN WITH BANELING PLACEHOLDER INFO  ---', '          ','          ', '          ', 'Ground','Hatchery, Lair, or Hive','Ground', 'Until destroyed', 'BL', null, '35 vs Light', '80 vs Structures', null, null, '35 with Centrifugal Hooks', null, null, null, '1', null)");

        db.execSQL("INSERT INTO " + TABLE_NAME + "(unitID, NAME, Pic1, HP, Dmg1, Dmg2, Armor, Cargo, Supply, Minerals, Vespene, BuildTime, Speed, AttackSpeed1, AttackSpeed2, " +
                "Bonuses, RangevsGround, RangevsAir, LOS, LOS2, unitSize, Upgrades, SpecialAbilities, Energy, TechRequired, Shields, WarpgateCooldown, Speed2, NaturalEnemies, NaturalPrey," +
                "Race, Description, Uses, Lore, GroundAir, BuildsFrom, AttacksGA, Lifespan, Attributes, EnergyCost, SpecialDmg1, SpecialDmg2, SpecialDPS1, SpecialDPS2, HP2, Armor2, ASString, SplashRadius, AttackCount, AttackCount2) " +
                "VALUES (50,'Reaper', null, 30, 20, null, 0, 2, 0.5, 50, 25, 14, 3.5, null, null, '+15 vs Light, +60 vs Structures'\n" +
                ", 0, null, 8, null, 0.75, 'Ground Weapons Levels 1-3 (+2 each; +4 vs Light; +5 vs Structures), Ground Armor Levels 1-3 (+1 each), & Shields Levels 1-3 (+1 armor to shields each), & Centrifugal Hooks increases Baneling''s speed by 0.63 and HP by 5 researched by Baneling Nest, requires Lair or Hive',\n" +
                "'Explodes upon impact in a decent splash radius, damaging all units in the radius equally.  Due to having only one attack during its life, it does not have DPS values.', null, 'Baneling Nest', null, null, '4.13 with Centrifugal Hooks', 'Roaches, Stalkers, Archons, Marauders, AOE Damage such as Tanks and Storm'," +
                "'Workers, Zerglings, Hydralisks, Marines, Zealots, Other Light Units', 'Zerg    ----  ALL STATS FILLED IN WITH BANELING PLACEHOLDER INFO  ---', '          ','          ', '          ', 'Ground','Hatchery, Lair, or Hive','Ground', 'Until destroyed', 'BL', null, '35 vs Light', '80 vs Structures', null, null, '35 with Centrifugal Hooks', null, null, null, '1', null)");

        db.execSQL("INSERT INTO " + TABLE_NAME + "(unitID, NAME, Pic1, HP, Dmg1, Dmg2, Armor, Cargo, Supply, Minerals, Vespene, BuildTime, Speed, AttackSpeed1, AttackSpeed2, " +
                "Bonuses, RangevsGround, RangevsAir, LOS, LOS2, unitSize, Upgrades, SpecialAbilities, Energy, TechRequired, Shields, WarpgateCooldown, Speed2, NaturalEnemies, NaturalPrey," +
                "Race, Description, Uses, Lore, GroundAir, BuildsFrom, AttacksGA, Lifespan, Attributes, EnergyCost, SpecialDmg1, SpecialDmg2, SpecialDPS1, SpecialDPS2, HP2, Armor2, ASString, SplashRadius, AttackCount, AttackCount2) " +
                "VALUES (51,'Roach', null, 30, 20, null, 0, 2, 0.5, 50, 25, 14, 3.5, null, null, '+15 vs Light, +60 vs Structures'\n" +
                ", 0, null, 8, null, 0.75, 'Ground Weapons Levels 1-3 (+2 each; +4 vs Light; +5 vs Structures), Ground Armor Levels 1-3 (+1 each), & Shields Levels 1-3 (+1 armor to shields each), & Centrifugal Hooks increases Baneling''s speed by 0.63 and HP by 5 researched by Baneling Nest, requires Lair or Hive',\n" +
                "'Explodes upon impact in a decent splash radius, damaging all units in the radius equally.  Due to having only one attack during its life, it does not have DPS values.', null, 'Baneling Nest', null, null, '4.13 with Centrifugal Hooks', 'Roaches, Stalkers, Archons, Marauders, AOE Damage such as Tanks and Storm'," +
                "'Workers, Zerglings, Hydralisks, Marines, Zealots, Other Light Units', 'Zerg    ----  ALL STATS FILLED IN WITH BANELING PLACEHOLDER INFO  ---', '          ','          ', '          ', 'Ground','Hatchery, Lair, or Hive','Ground', 'Until destroyed', 'BL', null, '35 vs Light', '80 vs Structures', null, null, '35 with Centrifugal Hooks', null, null, null, '1', null)");

        db.execSQL("INSERT INTO " + TABLE_NAME + "(unitID, NAME, Pic1, HP, Dmg1, Dmg2, Armor, Cargo, Supply, Minerals, Vespene, BuildTime, Speed, AttackSpeed1, AttackSpeed2, " +
                "Bonuses, RangevsGround, RangevsAir, LOS, LOS2, unitSize, Upgrades, SpecialAbilities, Energy, TechRequired, Shields, WarpgateCooldown, Speed2, NaturalEnemies, NaturalPrey," +
                "Race, Description, Uses, Lore, GroundAir, BuildsFrom, AttacksGA, Lifespan, Attributes, EnergyCost, SpecialDmg1, SpecialDmg2, SpecialDPS1, SpecialDPS2, HP2, Armor2, ASString, SplashRadius, AttackCount, AttackCount2) " +
                "VALUES (52,'SCV', null, 30, 20, null, 0, 2, 0.5, 50, 25, 14, 3.5, null, null, '+15 vs Light, +60 vs Structures'\n" +
                ", 0, null, 8, null, 0.75, 'Ground Weapons Levels 1-3 (+2 each; +4 vs Light; +5 vs Structures), Ground Armor Levels 1-3 (+1 each), & Shields Levels 1-3 (+1 armor to shields each), & Centrifugal Hooks increases Baneling''s speed by 0.63 and HP by 5 researched by Baneling Nest, requires Lair or Hive',\n" +
                "'Explodes upon impact in a decent splash radius, damaging all units in the radius equally.  Due to having only one attack during its life, it does not have DPS values.', null, 'Baneling Nest', null, null, '4.13 with Centrifugal Hooks', 'Roaches, Stalkers, Archons, Marauders, AOE Damage such as Tanks and Storm'," +
                "'Workers, Zerglings, Hydralisks, Marines, Zealots, Other Light Units', 'Zerg    ----  ALL STATS FILLED IN WITH BANELING PLACEHOLDER INFO  ---', '          ','          ', '          ', 'Ground','Hatchery, Lair, or Hive','Ground', 'Until destroyed', 'BL', null, '35 vs Light', '80 vs Structures', null, null, '35 with Centrifugal Hooks', null, null, null, '1', null)");

        db.execSQL("INSERT INTO " + TABLE_NAME + "(unitID, NAME, Pic1, HP, Dmg1, Dmg2, Armor, Cargo, Supply, Minerals, Vespene, BuildTime, Speed, AttackSpeed1, AttackSpeed2, " +
                "Bonuses, RangevsGround, RangevsAir, LOS, LOS2, unitSize, Upgrades, SpecialAbilities, Energy, TechRequired, Shields, WarpgateCooldown, Speed2, NaturalEnemies, NaturalPrey," +
                "Race, Description, Uses, Lore, GroundAir, BuildsFrom, AttacksGA, Lifespan, Attributes, EnergyCost, SpecialDmg1, SpecialDmg2, SpecialDPS1, SpecialDPS2, HP2, Armor2, ASString, SplashRadius, AttackCount, AttackCount2) " +
                "VALUES (53,'Sentry', null, 30, 20, null, 0, 2, 0.5, 50, 25, 14, 3.5, null, null, '+15 vs Light, +60 vs Structures'\n" +
                ", 0, null, 8, null, 0.75, 'Ground Weapons Levels 1-3 (+2 each; +4 vs Light; +5 vs Structures), Ground Armor Levels 1-3 (+1 each), & Shields Levels 1-3 (+1 armor to shields each), & Centrifugal Hooks increases Baneling''s speed by 0.63 and HP by 5 researched by Baneling Nest, requires Lair or Hive',\n" +
                "'Explodes upon impact in a decent splash radius, damaging all units in the radius equally.  Due to having only one attack during its life, it does not have DPS values.', null, 'Baneling Nest', null, null, '4.13 with Centrifugal Hooks', 'Roaches, Stalkers, Archons, Marauders, AOE Damage such as Tanks and Storm'," +
                "'Workers, Zerglings, Hydralisks, Marines, Zealots, Other Light Units', 'Zerg    ----  ALL STATS FILLED IN WITH BANELING PLACEHOLDER INFO  ---', '          ','          ', '          ', 'Ground','Hatchery, Lair, or Hive','Ground', 'Until destroyed', 'BL', null, '35 vs Light', '80 vs Structures', null, null, '35 with Centrifugal Hooks', null, null, null, '1', null)");

        db.execSQL("INSERT INTO " + TABLE_NAME + "(unitID, NAME, Pic1, HP, Dmg1, Dmg2, Armor, Cargo, Supply, Minerals, Vespene, BuildTime, Speed, AttackSpeed1, AttackSpeed2, " +
                "Bonuses, RangevsGround, RangevsAir, LOS, LOS2, unitSize, Upgrades, SpecialAbilities, Energy, TechRequired, Shields, WarpgateCooldown, Speed2, NaturalEnemies, NaturalPrey," +
                "Race, Description, Uses, Lore, GroundAir, BuildsFrom, AttacksGA, Lifespan, Attributes, EnergyCost, SpecialDmg1, SpecialDmg2, SpecialDPS1, SpecialDPS2, HP2, Armor2, ASString, SplashRadius, AttackCount, AttackCount2) " +
                "VALUES (54,'Siege Tank (sieged)', null, 30, 20, null, 0, 2, 0.5, 50, 25, 14, 3.5, null, null, '+15 vs Light, +60 vs Structures'\n" +
                ", 0, null, 8, null, 0.75, 'Ground Weapons Levels 1-3 (+2 each; +4 vs Light; +5 vs Structures), Ground Armor Levels 1-3 (+1 each), & Shields Levels 1-3 (+1 armor to shields each), & Centrifugal Hooks increases Baneling''s speed by 0.63 and HP by 5 researched by Baneling Nest, requires Lair or Hive',\n" +
                "'Explodes upon impact in a decent splash radius, damaging all units in the radius equally.  Due to having only one attack during its life, it does not have DPS values.', null, 'Baneling Nest', null, null, '4.13 with Centrifugal Hooks', 'Roaches, Stalkers, Archons, Marauders, AOE Damage such as Tanks and Storm'," +
                "'Workers, Zerglings, Hydralisks, Marines, Zealots, Other Light Units', 'Zerg    ----  ALL STATS FILLED IN WITH BANELING PLACEHOLDER INFO  ---', '          ','          ', '          ', 'Ground','Hatchery, Lair, or Hive','Ground', 'Until destroyed', 'BL', null, '35 vs Light', '80 vs Structures', null, null, '35 with Centrifugal Hooks', null, null, null, '1', null)");

        db.execSQL("INSERT INTO " + TABLE_NAME + "(unitID, NAME, Pic1, HP, Dmg1, Dmg2, Armor, Cargo, Supply, Minerals, Vespene, BuildTime, Speed, AttackSpeed1, AttackSpeed2, " +
                "Bonuses, RangevsGround, RangevsAir, LOS, LOS2, unitSize, Upgrades, SpecialAbilities, Energy, TechRequired, Shields, WarpgateCooldown, Speed2, NaturalEnemies, NaturalPrey," +
                "Race, Description, Uses, Lore, GroundAir, BuildsFrom, AttacksGA, Lifespan, Attributes, EnergyCost, SpecialDmg1, SpecialDmg2, SpecialDPS1, SpecialDPS2, HP2, Armor2, ASString, SplashRadius, AttackCount, AttackCount2) " +
                "VALUES (55,'Siege Tank (tank mode)', null, 30, 20, null, 0, 2, 0.5, 50, 25, 14, 3.5, null, null, '+15 vs Light, +60 vs Structures'\n" +
                ", 0, null, 8, null, 0.75, 'Ground Weapons Levels 1-3 (+2 each; +4 vs Light; +5 vs Structures), Ground Armor Levels 1-3 (+1 each), & Shields Levels 1-3 (+1 armor to shields each), & Centrifugal Hooks increases Baneling''s speed by 0.63 and HP by 5 researched by Baneling Nest, requires Lair or Hive',\n" +
                "'Explodes upon impact in a decent splash radius, damaging all units in the radius equally.  Due to having only one attack during its life, it does not have DPS values.', null, 'Baneling Nest', null, null, '4.13 with Centrifugal Hooks', 'Roaches, Stalkers, Archons, Marauders, AOE Damage such as Tanks and Storm'," +
                "'Workers, Zerglings, Hydralisks, Marines, Zealots, Other Light Units', 'Zerg    ----  ALL STATS FILLED IN WITH BANELING PLACEHOLDER INFO  ---', '          ','          ', '          ', 'Ground','Hatchery, Lair, or Hive','Ground', 'Until destroyed', 'BL', null, '35 vs Light', '80 vs Structures', null, null, '35 with Centrifugal Hooks', null, null, null, '1', null)");

        db.execSQL("INSERT INTO " + TABLE_NAME + "(unitID, NAME, Pic1, HP, Dmg1, Dmg2, Armor, Cargo, Supply, Minerals, Vespene, BuildTime, Speed, AttackSpeed1, AttackSpeed2, " +
                "Bonuses, RangevsGround, RangevsAir, LOS, LOS2, unitSize, Upgrades, SpecialAbilities, Energy, TechRequired, Shields, WarpgateCooldown, Speed2, NaturalEnemies, NaturalPrey," +
                "Race, Description, Uses, Lore, GroundAir, BuildsFrom, AttacksGA, Lifespan, Attributes, EnergyCost, SpecialDmg1, SpecialDmg2, SpecialDPS1, SpecialDPS2, HP2, Armor2, ASString, SplashRadius, AttackCount, AttackCount2) " +
                "VALUES (56,'Spine Crawler', null, 30, 20, null, 0, 2, 0.5, 50, 25, 14, 3.5, null, null, '+15 vs Light, +60 vs Structures'\n" +
                ", 0, null, 8, null, 0.75, 'Ground Weapons Levels 1-3 (+2 each; +4 vs Light; +5 vs Structures), Ground Armor Levels 1-3 (+1 each), & Shields Levels 1-3 (+1 armor to shields each), & Centrifugal Hooks increases Baneling''s speed by 0.63 and HP by 5 researched by Baneling Nest, requires Lair or Hive',\n" +
                "'Explodes upon impact in a decent splash radius, damaging all units in the radius equally.  Due to having only one attack during its life, it does not have DPS values.', null, 'Baneling Nest', null, null, '4.13 with Centrifugal Hooks', 'Roaches, Stalkers, Archons, Marauders, AOE Damage such as Tanks and Storm'," +
                "'Workers, Zerglings, Hydralisks, Marines, Zealots, Other Light Units', 'Zerg    ----  ALL STATS FILLED IN WITH BANELING PLACEHOLDER INFO  ---', '          ','          ', '          ', 'Ground','Hatchery, Lair, or Hive','Ground', 'Until destroyed', 'BL', null, '35 vs Light', '80 vs Structures', null, null, '35 with Centrifugal Hooks', null, null, null, '1', null)");

        db.execSQL("INSERT INTO " + TABLE_NAME + "(unitID, NAME, Pic1, HP, Dmg1, Dmg2, Armor, Cargo, Supply, Minerals, Vespene, BuildTime, Speed, AttackSpeed1, AttackSpeed2, " +
                "Bonuses, RangevsGround, RangevsAir, LOS, LOS2, unitSize, Upgrades, SpecialAbilities, Energy, TechRequired, Shields, WarpgateCooldown, Speed2, NaturalEnemies, NaturalPrey," +
                "Race, Description, Uses, Lore, GroundAir, BuildsFrom, AttacksGA, Lifespan, Attributes, EnergyCost, SpecialDmg1, SpecialDmg2, SpecialDPS1, SpecialDPS2, HP2, Armor2, ASString, SplashRadius, AttackCount, AttackCount2) " +
                "VALUES (57,'Spore Crawler', null, 30, 20, null, 0, 2, 0.5, 50, 25, 14, 3.5, null, null, '+15 vs Light, +60 vs Structures'\n" +
                ", 0, null, 8, null, 0.75, 'Ground Weapons Levels 1-3 (+2 each; +4 vs Light; +5 vs Structures), Ground Armor Levels 1-3 (+1 each), & Shields Levels 1-3 (+1 armor to shields each), & Centrifugal Hooks increases Baneling''s speed by 0.63 and HP by 5 researched by Baneling Nest, requires Lair or Hive',\n" +
                "'Explodes upon impact in a decent splash radius, damaging all units in the radius equally.  Due to having only one attack during its life, it does not have DPS values.', null, 'Baneling Nest', null, null, '4.13 with Centrifugal Hooks', 'Roaches, Stalkers, Archons, Marauders, AOE Damage such as Tanks and Storm'," +
                "'Workers, Zerglings, Hydralisks, Marines, Zealots, Other Light Units', 'Zerg    ----  ALL STATS FILLED IN WITH BANELING PLACEHOLDER INFO  ---', '          ','          ', '          ', 'Ground','Hatchery, Lair, or Hive','Ground', 'Until destroyed', 'BL', null, '35 vs Light', '80 vs Structures', null, null, '35 with Centrifugal Hooks', null, null, null, '1', null)");

        db.execSQL("INSERT INTO " + TABLE_NAME + "(unitID, NAME, Pic1, HP, Dmg1, Dmg2, Armor, Cargo, Supply, Minerals, Vespene, BuildTime, Speed, AttackSpeed1, AttackSpeed2, " +
                "Bonuses, RangevsGround, RangevsAir, LOS, LOS2, unitSize, Upgrades, SpecialAbilities, Energy, TechRequired, Shields, WarpgateCooldown, Speed2, NaturalEnemies, NaturalPrey," +
                "Race, Description, Uses, Lore, GroundAir, BuildsFrom, AttacksGA, Lifespan, Attributes, EnergyCost, SpecialDmg1, SpecialDmg2, SpecialDPS1, SpecialDPS2, HP2, Armor2, ASString, SplashRadius, AttackCount, AttackCount2) " +
                "VALUES (58,'Stalker', null, 30, 20, null, 0, 2, 0.5, 50, 25, 14, 3.5, null, null, '+15 vs Light, +60 vs Structures'\n" +
                ", 0, null, 8, null, 0.75, 'Ground Weapons Levels 1-3 (+2 each; +4 vs Light; +5 vs Structures), Ground Armor Levels 1-3 (+1 each), & Shields Levels 1-3 (+1 armor to shields each), & Centrifugal Hooks increases Baneling''s speed by 0.63 and HP by 5 researched by Baneling Nest, requires Lair or Hive',\n" +
                "'Explodes upon impact in a decent splash radius, damaging all units in the radius equally.  Due to having only one attack during its life, it does not have DPS values.', null, 'Baneling Nest', null, null, '4.13 with Centrifugal Hooks', 'Roaches, Stalkers, Archons, Marauders, AOE Damage such as Tanks and Storm'," +
                "'Workers, Zerglings, Hydralisks, Marines, Zealots, Other Light Units', 'Zerg    ----  ALL STATS FILLED IN WITH BANELING PLACEHOLDER INFO  ---', '          ','          ', '          ', 'Ground','Hatchery, Lair, or Hive','Ground', 'Until destroyed', 'BL', null, '35 vs Light', '80 vs Structures', null, null, '35 with Centrifugal Hooks', null, null, null, '1', null)");

        db.execSQL("INSERT INTO " + TABLE_NAME + "(unitID, NAME, Pic1, HP, Dmg1, Dmg2, Armor, Cargo, Supply, Minerals, Vespene, BuildTime, Speed, AttackSpeed1, AttackSpeed2, " +
                "Bonuses, RangevsGround, RangevsAir, LOS, LOS2, unitSize, Upgrades, SpecialAbilities, Energy, TechRequired, Shields, WarpgateCooldown, Speed2, NaturalEnemies, NaturalPrey," +
                "Race, Description, Uses, Lore, GroundAir, BuildsFrom, AttacksGA, Lifespan, Attributes, EnergyCost, SpecialDmg1, SpecialDmg2, SpecialDPS1, SpecialDPS2, HP2, Armor2, ASString, SplashRadius, AttackCount, AttackCount2) " +
                "VALUES (59,'Swarm Host', null, 30, 20, null, 0, 2, 0.5, 50, 25, 14, 3.5, null, null, '+15 vs Light, +60 vs Structures'\n" +
                ", 0, null, 8, null, 0.75, 'Ground Weapons Levels 1-3 (+2 each; +4 vs Light; +5 vs Structures), Ground Armor Levels 1-3 (+1 each), & Shields Levels 1-3 (+1 armor to shields each), & Centrifugal Hooks increases Baneling''s speed by 0.63 and HP by 5 researched by Baneling Nest, requires Lair or Hive',\n" +
                "'Explodes upon impact in a decent splash radius, damaging all units in the radius equally.  Due to having only one attack during its life, it does not have DPS values.', null, 'Baneling Nest', null, null, '4.13 with Centrifugal Hooks', 'Roaches, Stalkers, Archons, Marauders, AOE Damage such as Tanks and Storm'," +
                "'Workers, Zerglings, Hydralisks, Marines, Zealots, Other Light Units', 'Zerg    ----  ALL STATS FILLED IN WITH BANELING PLACEHOLDER INFO  ---', '          ','          ', '          ', 'Ground','Hatchery, Lair, or Hive','Ground', 'Until destroyed', 'BL', null, '35 vs Light', '80 vs Structures', null, null, '35 with Centrifugal Hooks', null, null, null, '1', null)");

        db.execSQL("INSERT INTO " + TABLE_NAME + "(unitID, NAME, Pic1, HP, Dmg1, Dmg2, Armor, Cargo, Supply, Minerals, Vespene, BuildTime, Speed, AttackSpeed1, AttackSpeed2, " +
                "Bonuses, RangevsGround, RangevsAir, LOS, LOS2, unitSize, Upgrades, SpecialAbilities, Energy, TechRequired, Shields, WarpgateCooldown, Speed2, NaturalEnemies, NaturalPrey," +
                "Race, Description, Uses, Lore, GroundAir, BuildsFrom, AttacksGA, Lifespan, Attributes, EnergyCost, SpecialDmg1, SpecialDmg2, SpecialDPS1, SpecialDPS2, HP2, Armor2, ASString, SplashRadius, AttackCount, AttackCount2) " +
                "VALUES (60,'Tempest', null, 30, 20, null, 0, 2, 0.5, 50, 25, 14, 3.5, null, null, '+15 vs Light, +60 vs Structures'\n" +
                ", 0, null, 8, null, 0.75, 'Ground Weapons Levels 1-3 (+2 each; +4 vs Light; +5 vs Structures), Ground Armor Levels 1-3 (+1 each), & Shields Levels 1-3 (+1 armor to shields each), & Centrifugal Hooks increases Baneling''s speed by 0.63 and HP by 5 researched by Baneling Nest, requires Lair or Hive',\n" +
                "'Explodes upon impact in a decent splash radius, damaging all units in the radius equally.  Due to having only one attack during its life, it does not have DPS values.', null, 'Baneling Nest', null, null, '4.13 with Centrifugal Hooks', 'Roaches, Stalkers, Archons, Marauders, AOE Damage such as Tanks and Storm'," +
                "'Workers, Zerglings, Hydralisks, Marines, Zealots, Other Light Units', 'Zerg    ----  ALL STATS FILLED IN WITH BANELING PLACEHOLDER INFO  ---', '          ','          ', '          ', 'Ground','Hatchery, Lair, or Hive','Ground', 'Until destroyed', 'BL', null, '35 vs Light', '80 vs Structures', null, null, '35 with Centrifugal Hooks', null, null, null, '1', null)");

        db.execSQL("INSERT INTO " + TABLE_NAME + "(unitID, NAME, Pic1, HP, Dmg1, Dmg2, Armor, Cargo, Supply, Minerals, Vespene, BuildTime, Speed, AttackSpeed1, AttackSpeed2, " +
                "Bonuses, RangevsGround, RangevsAir, LOS, LOS2, unitSize, Upgrades, SpecialAbilities, Energy, TechRequired, Shields, WarpgateCooldown, Speed2, NaturalEnemies, NaturalPrey," +
                "Race, Description, Uses, Lore, GroundAir, BuildsFrom, AttacksGA, Lifespan, Attributes, EnergyCost, SpecialDmg1, SpecialDmg2, SpecialDPS1, SpecialDPS2, HP2, Armor2, ASString, SplashRadius, AttackCount, AttackCount2) " +
                "VALUES (61,'Thor (explosive)', null, 30, 20, null, 0, 2, 0.5, 50, 25, 14, 3.5, null, null, '+15 vs Light, +60 vs Structures'\n" +
                ", 0, null, 8, null, 0.75, 'Ground Weapons Levels 1-3 (+2 each; +4 vs Light; +5 vs Structures), Ground Armor Levels 1-3 (+1 each), & Shields Levels 1-3 (+1 armor to shields each), & Centrifugal Hooks increases Baneling''s speed by 0.63 and HP by 5 researched by Baneling Nest, requires Lair or Hive',\n" +
                "'Explodes upon impact in a decent splash radius, damaging all units in the radius equally.  Due to having only one attack during its life, it does not have DPS values.', null, 'Baneling Nest', null, null, '4.13 with Centrifugal Hooks', 'Roaches, Stalkers, Archons, Marauders, AOE Damage such as Tanks and Storm'," +
                "'Workers, Zerglings, Hydralisks, Marines, Zealots, Other Light Units', 'Zerg    ----  ALL STATS FILLED IN WITH BANELING PLACEHOLDER INFO  ---', '          ','          ', '          ', 'Ground','Hatchery, Lair, or Hive','Ground', 'Until destroyed', 'BL', null, '35 vs Light', '80 vs Structures', null, null, '35 with Centrifugal Hooks', null, null, null, '1', null)");

        db.execSQL("INSERT INTO " + TABLE_NAME + "(unitID, NAME, Pic1, HP, Dmg1, Dmg2, Armor, Cargo, Supply, Minerals, Vespene, BuildTime, Speed, AttackSpeed1, AttackSpeed2, " +
                "Bonuses, RangevsGround, RangevsAir, LOS, LOS2, unitSize, Upgrades, SpecialAbilities, Energy, TechRequired, Shields, WarpgateCooldown, Speed2, NaturalEnemies, NaturalPrey," +
                "Race, Description, Uses, Lore, GroundAir, BuildsFrom, AttacksGA, Lifespan, Attributes, EnergyCost, SpecialDmg1, SpecialDmg2, SpecialDPS1, SpecialDPS2, HP2, Armor2, ASString, SplashRadius, AttackCount, AttackCount2) " +
                "VALUES (62,'Thor (high impact)', null, 30, 20, null, 0, 2, 0.5, 50, 25, 14, 3.5, null, null, '+15 vs Light, +60 vs Structures'\n" +
                ", 0, null, 8, null, 0.75, 'Ground Weapons Levels 1-3 (+2 each; +4 vs Light; +5 vs Structures), Ground Armor Levels 1-3 (+1 each), & Shields Levels 1-3 (+1 armor to shields each), & Centrifugal Hooks increases Baneling''s speed by 0.63 and HP by 5 researched by Baneling Nest, requires Lair or Hive',\n" +
                "'Explodes upon impact in a decent splash radius, damaging all units in the radius equally.  Due to having only one attack during its life, it does not have DPS values.', null, 'Baneling Nest', null, null, '4.13 with Centrifugal Hooks', 'Roaches, Stalkers, Archons, Marauders, AOE Damage such as Tanks and Storm'," +
                "'Workers, Zerglings, Hydralisks, Marines, Zealots, Other Light Units', 'Zerg    ----  ALL STATS FILLED IN WITH BANELING PLACEHOLDER INFO  ---', '          ','          ', '          ', 'Ground','Hatchery, Lair, or Hive','Ground', 'Until destroyed', 'BL', null, '35 vs Light', '80 vs Structures', null, null, '35 with Centrifugal Hooks', null, null, null, '1', null)");

        db.execSQL("INSERT INTO " + TABLE_NAME + "(unitID, NAME, Pic1, HP, Dmg1, Dmg2, Armor, Cargo, Supply, Minerals, Vespene, BuildTime, Speed, AttackSpeed1, AttackSpeed2, " +
                "Bonuses, RangevsGround, RangevsAir, LOS, LOS2, unitSize, Upgrades, SpecialAbilities, Energy, TechRequired, Shields, WarpgateCooldown, Speed2, NaturalEnemies, NaturalPrey," +
                "Race, Description, Uses, Lore, GroundAir, BuildsFrom, AttacksGA, Lifespan, Attributes, EnergyCost, SpecialDmg1, SpecialDmg2, SpecialDPS1, SpecialDPS2, HP2, Armor2, ASString, SplashRadius, AttackCount, AttackCount2) " +
                "VALUES (63,'Ultralisk', null, 30, 20, null, 0, 2, 0.5, 50, 25, 14, 3.5, null, null, '+15 vs Light, +60 vs Structures'\n" +
                ", 0, null, 8, null, 0.75, 'Ground Weapons Levels 1-3 (+2 each; +4 vs Light; +5 vs Structures), Ground Armor Levels 1-3 (+1 each), & Shields Levels 1-3 (+1 armor to shields each), & Centrifugal Hooks increases Baneling''s speed by 0.63 and HP by 5 researched by Baneling Nest, requires Lair or Hive',\n" +
                "'Explodes upon impact in a decent splash radius, damaging all units in the radius equally.  Due to having only one attack during its life, it does not have DPS values.', null, 'Baneling Nest', null, null, '4.13 with Centrifugal Hooks', 'Roaches, Stalkers, Archons, Marauders, AOE Damage such as Tanks and Storm'," +
                "'Workers, Zerglings, Hydralisks, Marines, Zealots, Other Light Units', 'Zerg    ----  ALL STATS FILLED IN WITH BANELING PLACEHOLDER INFO  ---', '          ','          ', '          ', 'Ground','Hatchery, Lair, or Hive','Ground', 'Until destroyed', 'BL', null, '35 vs Light', '80 vs Structures', null, null, '35 with Centrifugal Hooks', null, null, null, '1', null)");

        db.execSQL("INSERT INTO " + TABLE_NAME + "(unitID, NAME, Pic1, HP, Dmg1, Dmg2, Armor, Cargo, Supply, Minerals, Vespene, BuildTime, Speed, AttackSpeed1, AttackSpeed2, " +
                "Bonuses, RangevsGround, RangevsAir, LOS, LOS2, unitSize, Upgrades, SpecialAbilities, Energy, TechRequired, Shields, WarpgateCooldown, Speed2, NaturalEnemies, NaturalPrey," +
                "Race, Description, Uses, Lore, GroundAir, BuildsFrom, AttacksGA, Lifespan, Attributes, EnergyCost, SpecialDmg1, SpecialDmg2, SpecialDPS1, SpecialDPS2, HP2, Armor2, ASString, SplashRadius, AttackCount, AttackCount2) " +
                "VALUES (64,'Viking (assault mode)', null, 30, 20, null, 0, 2, 0.5, 50, 25, 14, 3.5, null, null, '+15 vs Light, +60 vs Structures'\n" +
                ", 0, null, 8, null, 0.75, 'Ground Weapons Levels 1-3 (+2 each; +4 vs Light; +5 vs Structures), Ground Armor Levels 1-3 (+1 each), & Shields Levels 1-3 (+1 armor to shields each), & Centrifugal Hooks increases Baneling''s speed by 0.63 and HP by 5 researched by Baneling Nest, requires Lair or Hive',\n" +
                "'Explodes upon impact in a decent splash radius, damaging all units in the radius equally.  Due to having only one attack during its life, it does not have DPS values.', null, 'Baneling Nest', null, null, '4.13 with Centrifugal Hooks', 'Roaches, Stalkers, Archons, Marauders, AOE Damage such as Tanks and Storm'," +
                "'Workers, Zerglings, Hydralisks, Marines, Zealots, Other Light Units', 'Zerg    ----  ALL STATS FILLED IN WITH BANELING PLACEHOLDER INFO  ---', '          ','          ', '          ', 'Ground','Hatchery, Lair, or Hive','Ground', 'Until destroyed', 'BL', null, '35 vs Light', '80 vs Structures', null, null, '35 with Centrifugal Hooks', null, null, null, '1', null)");

        db.execSQL("INSERT INTO " + TABLE_NAME + "(unitID, NAME, Pic1, HP, Dmg1, Dmg2, Armor, Cargo, Supply, Minerals, Vespene, BuildTime, Speed, AttackSpeed1, AttackSpeed2, " +
                "Bonuses, RangevsGround, RangevsAir, LOS, LOS2, unitSize, Upgrades, SpecialAbilities, Energy, TechRequired, Shields, WarpgateCooldown, Speed2, NaturalEnemies, NaturalPrey," +
                "Race, Description, Uses, Lore, GroundAir, BuildsFrom, AttacksGA, Lifespan, Attributes, EnergyCost, SpecialDmg1, SpecialDmg2, SpecialDPS1, SpecialDPS2, HP2, Armor2, ASString, SplashRadius, AttackCount, AttackCount2) " +
                "VALUES (65,'Viking (fighter mode)', null, 30, 20, null, 0, 2, 0.5, 50, 25, 14, 3.5, null, null, '+15 vs Light, +60 vs Structures'\n" +
                ", 0, null, 8, null, 0.75, 'Ground Weapons Levels 1-3 (+2 each; +4 vs Light; +5 vs Structures), Ground Armor Levels 1-3 (+1 each), & Shields Levels 1-3 (+1 armor to shields each), & Centrifugal Hooks increases Baneling''s speed by 0.63 and HP by 5 researched by Baneling Nest, requires Lair or Hive',\n" +
                "'Explodes upon impact in a decent splash radius, damaging all units in the radius equally.  Due to having only one attack during its life, it does not have DPS values.', null, 'Baneling Nest', null, null, '4.13 with Centrifugal Hooks', 'Roaches, Stalkers, Archons, Marauders, AOE Damage such as Tanks and Storm'," +
                "'Workers, Zerglings, Hydralisks, Marines, Zealots, Other Light Units', 'Zerg    ----  ALL STATS FILLED IN WITH BANELING PLACEHOLDER INFO  ---', '          ','          ', '          ', 'Ground','Hatchery, Lair, or Hive','Ground', 'Until destroyed', 'BL', null, '35 vs Light', '80 vs Structures', null, null, '35 with Centrifugal Hooks', null, null, null, '1', null)");

        db.execSQL("INSERT INTO " + TABLE_NAME + "(unitID, NAME, Pic1, HP, Dmg1, Dmg2, Armor, Cargo, Supply, Minerals, Vespene, BuildTime, Speed, AttackSpeed1, AttackSpeed2, " +
                "Bonuses, RangevsGround, RangevsAir, LOS, LOS2, unitSize, Upgrades, SpecialAbilities, Energy, TechRequired, Shields, WarpgateCooldown, Speed2, NaturalEnemies, NaturalPrey," +
                "Race, Description, Uses, Lore, GroundAir, BuildsFrom, AttacksGA, Lifespan, Attributes, EnergyCost, SpecialDmg1, SpecialDmg2, SpecialDPS1, SpecialDPS2, HP2, Armor2, ASString, SplashRadius, AttackCount, AttackCount2) " +
                "VALUES (66,'Viper', null, 30, 20, null, 0, 2, 0.5, 50, 25, 14, 3.5, null, null, '+15 vs Light, +60 vs Structures'\n" +
                ", 0, null, 8, null, 0.75, 'Ground Weapons Levels 1-3 (+2 each; +4 vs Light; +5 vs Structures), Ground Armor Levels 1-3 (+1 each), & Shields Levels 1-3 (+1 armor to shields each), & Centrifugal Hooks increases Baneling''s speed by 0.63 and HP by 5 researched by Baneling Nest, requires Lair or Hive',\n" +
                "'Explodes upon impact in a decent splash radius, damaging all units in the radius equally.  Due to having only one attack during its life, it does not have DPS values.', null, 'Baneling Nest', null, null, '4.13 with Centrifugal Hooks', 'Roaches, Stalkers, Archons, Marauders, AOE Damage such as Tanks and Storm'," +
                "'Workers, Zerglings, Hydralisks, Marines, Zealots, Other Light Units', 'Zerg    ----  ALL STATS FILLED IN WITH BANELING PLACEHOLDER INFO  ---', '          ','          ', '          ', 'Ground','Hatchery, Lair, or Hive','Ground', 'Until destroyed', 'BL', null, '35 vs Light', '80 vs Structures', null, null, '35 with Centrifugal Hooks', null, null, null, '1', null)");

        db.execSQL("INSERT INTO " + TABLE_NAME + "(unitID, NAME, Pic1, HP, Dmg1, Dmg2, Armor, Cargo, Supply, Minerals, Vespene, BuildTime, Speed, AttackSpeed1, AttackSpeed2, " +
                "Bonuses, RangevsGround, RangevsAir, LOS, LOS2, unitSize, Upgrades, SpecialAbilities, Energy, TechRequired, Shields, WarpgateCooldown, Speed2, NaturalEnemies, NaturalPrey," +
                "Race, Description, Uses, Lore, GroundAir, BuildsFrom, AttacksGA, Lifespan, Attributes, EnergyCost, SpecialDmg1, SpecialDmg2, SpecialDPS1, SpecialDPS2, HP2, Armor2, ASString, SplashRadius, AttackCount, AttackCount2) " +
                "VALUES (67,'Void Ray', null, 30, 20, null, 0, 2, 0.5, 50, 25, 14, 3.5, null, null, '+15 vs Light, +60 vs Structures'\n" +
                ", 0, null, 8, null, 0.75, 'Ground Weapons Levels 1-3 (+2 each; +4 vs Light; +5 vs Structures), Ground Armor Levels 1-3 (+1 each), & Shields Levels 1-3 (+1 armor to shields each), & Centrifugal Hooks increases Baneling''s speed by 0.63 and HP by 5 researched by Baneling Nest, requires Lair or Hive',\n" +
                "'Explodes upon impact in a decent splash radius, damaging all units in the radius equally.  Due to having only one attack during its life, it does not have DPS values.', null, 'Baneling Nest', null, null, '4.13 with Centrifugal Hooks', 'Roaches, Stalkers, Archons, Marauders, AOE Damage such as Tanks and Storm'," +
                "'Workers, Zerglings, Hydralisks, Marines, Zealots, Other Light Units', 'Zerg    ----  ALL STATS FILLED IN WITH BANELING PLACEHOLDER INFO  ---', '          ','          ', '          ', 'Ground','Hatchery, Lair, or Hive','Ground', 'Until destroyed', 'BL', null, '35 vs Light', '80 vs Structures', null, null, '35 with Centrifugal Hooks', null, null, null, '1', null)");

        db.execSQL("INSERT INTO " + TABLE_NAME + "(unitID, NAME, Pic1, HP, Dmg1, Dmg2, Armor, Cargo, Supply, Minerals, Vespene, BuildTime, Speed, AttackSpeed1, AttackSpeed2, " +
                "Bonuses, RangevsGround, RangevsAir, LOS, LOS2, unitSize, Upgrades, SpecialAbilities, Energy, TechRequired, Shields, WarpgateCooldown, Speed2, NaturalEnemies, NaturalPrey," +
                "Race, Description, Uses, Lore, GroundAir, BuildsFrom, AttacksGA, Lifespan, Attributes, EnergyCost, SpecialDmg1, SpecialDmg2, SpecialDPS1, SpecialDPS2, HP2, Armor2, ASString, SplashRadius, AttackCount, AttackCount2) " +
                "VALUES (68,'Warp Prism', null, 30, 20, null, 0, 2, 0.5, 50, 25, 14, 3.5, null, null, '+15 vs Light, +60 vs Structures'\n" +
                ", 0, null, 8, null, 0.75, 'Ground Weapons Levels 1-3 (+2 each; +4 vs Light; +5 vs Structures), Ground Armor Levels 1-3 (+1 each), & Shields Levels 1-3 (+1 armor to shields each), & Centrifugal Hooks increases Baneling''s speed by 0.63 and HP by 5 researched by Baneling Nest, requires Lair or Hive',\n" +
                "'Explodes upon impact in a decent splash radius, damaging all units in the radius equally.  Due to having only one attack during its life, it does not have DPS values.', null, 'Baneling Nest', null, null, '4.13 with Centrifugal Hooks', 'Roaches, Stalkers, Archons, Marauders, AOE Damage such as Tanks and Storm'," +
                "'Workers, Zerglings, Hydralisks, Marines, Zealots, Other Light Units', 'Zerg    ----  ALL STATS FILLED IN WITH BANELING PLACEHOLDER INFO  ---', '          ','          ', '          ', 'Ground','Hatchery, Lair, or Hive','Ground', 'Until destroyed', 'BL', null, '35 vs Light', '80 vs Structures', null, null, '35 with Centrifugal Hooks', null, null, null, '1', null)");

        db.execSQL("INSERT INTO " + TABLE_NAME + "(unitID, NAME, Pic1, HP, Dmg1, Dmg2, Armor, Cargo, Supply, Minerals, Vespene, BuildTime, Speed, AttackSpeed1, AttackSpeed2, " +
                "Bonuses, RangevsGround, RangevsAir, LOS, LOS2, unitSize, Upgrades, SpecialAbilities, Energy, TechRequired, Shields, WarpgateCooldown, Speed2, NaturalEnemies, NaturalPrey," +
                "Race, Description, Uses, Lore, GroundAir, BuildsFrom, AttacksGA, Lifespan, Attributes, EnergyCost, SpecialDmg1, SpecialDmg2, SpecialDPS1, SpecialDPS2, HP2, Armor2, ASString, SplashRadius, AttackCount, AttackCount2) " +
                "VALUES (69,'Widow Mine', null, 30, 20, null, 0, 2, 0.5, 50, 25, 14, 3.5, null, null, '+15 vs Light, +60 vs Structures'\n" +
                ", 0, null, 8, null, 0.75, 'Ground Weapons Levels 1-3 (+2 each; +4 vs Light; +5 vs Structures), Ground Armor Levels 1-3 (+1 each), & Shields Levels 1-3 (+1 armor to shields each), & Centrifugal Hooks increases Baneling''s speed by 0.63 and HP by 5 researched by Baneling Nest, requires Lair or Hive',\n" +
                "'Explodes upon impact in a decent splash radius, damaging all units in the radius equally.  Due to having only one attack during its life, it does not have DPS values.', null, 'Baneling Nest', null, null, '4.13 with Centrifugal Hooks', 'Roaches, Stalkers, Archons, Marauders, AOE Damage such as Tanks and Storm'," +
                "'Workers, Zerglings, Hydralisks, Marines, Zealots, Other Light Units', 'Zerg    ----  ALL STATS FILLED IN WITH BANELING PLACEHOLDER INFO  ---', '          ','          ', '          ', 'Ground','Hatchery, Lair, or Hive','Ground', 'Until destroyed', 'BL', null, '35 vs Light', '80 vs Structures', null, null, '35 with Centrifugal Hooks', null, null, null, '1', null)");

        db.execSQL("INSERT INTO " + TABLE_NAME + "(unitID, NAME, Pic1, HP, Dmg1, Dmg2, Armor, Cargo, Supply, Minerals, Vespene, BuildTime, Speed, AttackSpeed1, AttackSpeed2, " +
                "Bonuses, RangevsGround, RangevsAir, LOS, LOS2, unitSize, Upgrades, SpecialAbilities, Energy, TechRequired, Shields, WarpgateCooldown, Speed2, NaturalEnemies, NaturalPrey," +
                "Race, Description, Uses, Lore, GroundAir, BuildsFrom, AttacksGA, Lifespan, Attributes, EnergyCost, SpecialDmg1, SpecialDmg2, SpecialDPS1, SpecialDPS2, HP2, Armor2, ASString, SplashRadius, AttackCount, AttackCount2) " +
                "VALUES (70,'Zealot', null, 30, 20, null, 0, 2, 0.5, 50, 25, 14, 3.5, null, null, '+15 vs Light, +60 vs Structures'\n" +
                ", 0, null, 8, null, 0.75, 'Ground Weapons Levels 1-3 (+2 each; +4 vs Light; +5 vs Structures), Ground Armor Levels 1-3 (+1 each), & Shields Levels 1-3 (+1 armor to shields each), & Centrifugal Hooks increases Baneling''s speed by 0.63 and HP by 5 researched by Baneling Nest, requires Lair or Hive',\n" +
                "'Explodes upon impact in a decent splash radius, damaging all units in the radius equally.  Due to having only one attack during its life, it does not have DPS values.', null, 'Baneling Nest', null, null, '4.13 with Centrifugal Hooks', 'Roaches, Stalkers, Archons, Marauders, AOE Damage such as Tanks and Storm'," +
                "'Workers, Zerglings, Hydralisks, Marines, Zealots, Other Light Units', 'Zerg    ----  ALL STATS FILLED IN WITH BANELING PLACEHOLDER INFO  ---', '          ','          ', '          ', 'Ground','Hatchery, Lair, or Hive','Ground', 'Until destroyed', 'BL', null, '35 vs Light', '80 vs Structures', null, null, '35 with Centrifugal Hooks', null, null, null, '1', null)");

        db.execSQL("INSERT INTO " + TABLE_NAME + "(unitID, NAME, Pic1, HP, Dmg1, Dmg2, Armor, Cargo, Supply, Minerals, Vespene, BuildTime, Speed, AttackSpeed1, AttackSpeed2, " +
                "Bonuses, RangevsGround, RangevsAir, LOS, LOS2, unitSize, Upgrades, SpecialAbilities, Energy, TechRequired, Shields, WarpgateCooldown, Speed2, NaturalEnemies, NaturalPrey," +
                "Race, Description, Uses, Lore, GroundAir, BuildsFrom, AttacksGA, Lifespan, Attributes, EnergyCost, SpecialDmg1, SpecialDmg2, SpecialDPS1, SpecialDPS2, HP2, Armor2, ASString, SplashRadius, AttackCount, AttackCount2) " +
                "VALUES (71,'Zergling', null, 30, 20, null, 0, 2, 0.5, 50, 25, 14, 3.5, null, null, '+15 vs Light, +60 vs Structures'\n" +
                ", 0, null, 8, null, 0.75, 'Ground Weapons Levels 1-3 (+2 each; +4 vs Light; +5 vs Structures), Ground Armor Levels 1-3 (+1 each), & Shields Levels 1-3 (+1 armor to shields each), & Centrifugal Hooks increases Baneling''s speed by 0.63 and HP by 5 researched by Baneling Nest, requires Lair or Hive',\n" +
                "'Explodes upon impact in a decent splash radius, damaging all units in the radius equally.  Due to having only one attack during its life, it does not have DPS values.', null, 'Baneling Nest', null, null, '4.13 with Centrifugal Hooks', 'Roaches, Stalkers, Archons, Marauders, AOE Damage such as Tanks and Storm'," +
                "'Workers, Zerglings, Hydralisks, Marines, Zealots, Other Light Units', 'Zerg    ----  ALL STATS FILLED IN WITH BANELING PLACEHOLDER INFO  ---', '          ','          ', '          ', 'Ground','Hatchery, Lair, or Hive','Ground', 'Until destroyed', 'BL', null, '35 vs Light', '80 vs Structures', null, null, '35 with Centrifugal Hooks', null, null, null, '1', null)");








    }
}
