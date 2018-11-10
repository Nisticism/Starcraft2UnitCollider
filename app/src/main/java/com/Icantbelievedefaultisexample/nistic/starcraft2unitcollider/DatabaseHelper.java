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


    public DatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE IF NOT EXISTS " + TABLE_NAME + " (unitID INTEGER PRIMARY KEY AUTOINCREMENT,NAME TEXT,Pic1 INTEGER,HP INTEGER, Dmg1 INTEGER, Dmg2 INTEGER, Armor INTEGER, " +
                "Cargo DOUBLE, Supply DOUBLE, Minerals INTEGER, Vespene INTEGER, BuildTime INTEGER, Speed DOUBLE, AttackSpeed1 DOUBLE, AttackSpeed2 DOUBLE, Bonuses TEXT, " +
                "RangevsGround TEXT, RangevsAir TEXT, LOS INTEGER, LOS2 INTEGER, unitSize TEXT, Upgrades TEXT, SpecialAbilities TEXT, Energy INTEGER, TechRequired TEXT, " +
                "Shields INTEGER, WarpgateCooldown INTEGER, Speed2 TEXT, NaturalEnemies TEXT, NaturalPrey TEXT, Race TEXT, Description TEXT, Uses TEXT, Lore TEXT, GroundAir TEXT," +
                "BuildsFrom TEXT, AttacksGA TEXT, Lifespan TEXT, Attributes TEXT, EnergyCost INTEGER, SpecialDmg1 TEXT, SpecialDmg2 TEXT, SpecialDPS1 TEXT, SpecialDPS2 TEXT, HP2 TEXT, Armor2 TEXT," +
                "ASString TEXT, SplashRadius DOUBLE)");

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
        String specialAbilities, Integer energy, String techRequired, Integer shields, Integer warpGateCoolDown, Double speed2, String naturalEnemies, String naturalPrey, String race,
        String description, String uses, String lore, String groundAir, String buildsFrom, String attacksGA, String lifespan, String attributes, Integer energyCost, String specialDmg1,
                              String specialDmg2, String specialDPS1, String specialDPS2, String hP2, String armor2, String aSString, Double splashRadius) {
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
                              String specialAbilities, Integer energy, String techRequired, Integer shields, Integer warpGateCoolDown, Double speed2, String naturalEnemies, String naturalPrey, String race,
                              String description, String uses, String lore, String groundAir, String buildsFrom, String attacksGA, String lifespan, String attributes, Integer energyCost, String specialDmg1,
                              String specialDmg2, String specialDPS1, String specialDPS2, String hP2, String armor2, String aSString, Double splashRadius) {
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
                "Race, Description, Uses, Lore, GroundAir, BuildsFrom, AttacksGA, Lifespan, Attributes, EnergyCost, SpecialDmg1, SpecialDmg2, SpecialDPS1, SpecialDPS2, HP2, Armor2, ASString, SplashRadius) " +
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
                "          After the End War, cultural trends harkening back to the Golden Age of Expansion within the Templar Caste led some adepts to wear ceremonial armor from the era.', 'Ground','Gateway or Warpgate','Ground', 'Until destroyed', 'BL', null, '22 vs Light', null, '13.665 vs Light', '19.812 vs Light with Resonating Glaves',null, null, 'Resonating Glaves', null)");

        db.execSQL("INSERT INTO " + TABLE_NAME + "(unitID, NAME, Pic1, HP, Dmg1, Dmg2, Armor, Cargo, Supply, Minerals, Vespene, BuildTime, Speed, AttackSpeed1, AttackSpeed2, " +
                "Bonuses, RangevsGround, RangevsAir, LOS, LOS2, unitSize, Upgrades, SpecialAbilities, Energy, TechRequired, Shields, WarpgateCooldown, Speed2, NaturalEnemies, NaturalPrey," +
                "Race, Description, Uses, Lore, GroundAir, BuildsFrom, AttacksGA, Lifespan, Attributes, EnergyCost, SpecialDmg1, SpecialDmg2, SpecialDPS1, SpecialDPS2, HP2, Armor2, ASString, SplashRadius) " +
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
                "          Originally, archons were formed through the merging of two high templar. After the Brood War and the reunification of the protoss, archons of a different kind can now be created by merging two Dark Templar or even a Khalai and Nerazim merging together.','Ground', 'Merging Templar (Gateways or Warpgates)', 'Ground and Air', 'Until destroyed','PX', null, '35 vs Biological', null, '28 vs Biological', null, null, null, null, 1.0)");

        db.execSQL("INSERT INTO " + TABLE_NAME + "(unitID, NAME, Pic1, HP, Dmg1, Dmg2, Armor, Cargo, Supply, Minerals, Vespene, BuildTime, Speed, AttackSpeed1, AttackSpeed2, " +
                "Bonuses, RangevsGround, RangevsAir, LOS, LOS2, unitSize, Upgrades, SpecialAbilities, Energy, TechRequired, Shields, WarpgateCooldown, Speed2, NaturalEnemies, NaturalPrey," +
                "Race, Description, Uses, Lore, GroundAir, BuildsFrom, AttacksGA, Lifespan, Attributes, EnergyCost, SpecialDmg1, SpecialDmg2, SpecialDPS1, SpecialDPS2, HP2, Armor2, ASString, SplashRadius) " +
                "VALUES (3,'Auto-Turret', null, 150, 18, null, 1, null, 0.0, 0, 0, 0, 0.0, 0.57, null, null\n" +
                ", '6 (7 with Hi-Sec Auto Tracking upgrade)', '6 (7 with Hi-Sec Auto Tracking upgrade)', 7, null, '2x2', 'Hi-Sec Auto Tracking (+1 range), Structure Armor (+2 armor); both researched by an Engineering Bay',\n" +
                "'Has a timed lifespan, has deployment range of 3 from Raven', null, 'Starport', null, null, null, 'Immortals, Zerglings, Banelings, Spine Crawlers, Photon Cannons, Marauders, Tanks'," +
                "'Workers, Liberators (defender mode), single targets', 'Terran', '          The Auto-Turret is a Terran automated defensive structure produced by the Raven.  It consists of one main rotating 12mm gun which can fire once every just over half a second, and can deal 315 damage within its lifespan.','          Its main use is harassing mineral lines, and can be deployed in tricky to defend locations such as in between mineral patches or on ledges.  It deals enough damage to kill a queen before expiring and can be placed on creep unlike other terran buildings.  Auto-Turrets can also be used to ward off Liberators in defender mode, due to the Liberator''s inability to attack structures.  With a lifespan of only 10 seconds, they can no longer reliably kill reinforcements, but from time to time can be useful in base trades or cornering single targets.\n          Often it will initiate a worker pull upon being placed down (unless there are immediate army units nearby), which can be exploited in other ways and at least will cost mining time.  Being a structure, it''s arguably weak to banelings, but at a cost of 0 minerals and gas, it''s still a pretty good deal.'" +
                ",'          Designs for auto-defense cannon turrets were available as far back as 2499.', 'Ground','Raven (Starport with Tech Lab)','Ground and Air', '10 seconds', 'AMS', 50, null, null, null, null, null, '3 with Structure Armor',null, null)");

        db.execSQL("INSERT INTO " + TABLE_NAME + "(unitID, NAME, Pic1, HP, Dmg1, Dmg2, Armor, Cargo, Supply, Minerals, Vespene, BuildTime, Speed, AttackSpeed1, AttackSpeed2, " +
                "Bonuses, RangevsGround, RangevsAir, LOS, LOS2, unitSize, Upgrades, SpecialAbilities, Energy, TechRequired, Shields, WarpgateCooldown, Speed2, NaturalEnemies, NaturalPrey," +
                "Race, Description, Uses, Lore, GroundAir, BuildsFrom, AttacksGA, Lifespan, Attributes, EnergyCost, SpecialDmg1, SpecialDmg2, SpecialDPS1, SpecialDPS2, HP2, Armor2, ASString, SplashRadius) " +
                "VALUES (4,'Baneling', null, 30, 20, null, 0, 2, 0.5, 50, 25, 14, 3.5, null, null, '+15 vs Light, +60 vs Structures'\n" +
                ", 0.25, null, 8, null, 0.75, 'Ground Weapons Levels 1-3 (+2 each; +4 vs Light; +5 vs Structures), Ground Armor Levels 1-3 (+1 each), & Shields Levels 1-3 (+1 armor to shields each), & Centrifugal Hooks increases Baneling''s speed by 0.63 and HP by 5 researched by Baneling Nest, requires Lair or Hive',\n" +
                "'Explodes upon impact in a decent splash radius, damaging all units in the radius equally.  Due to having only one attack during its life, it does not have DPS values.  Baneling cocoons (morphing state) have 50 HP and an armor of 2.', null, 'Baneling Nest', null, null, '4.13 with Centrifugal Hooks', 'Roaches, Stalkers, Archons, Marauders, AOE Damage such as Tanks and Storm'," +
                "'Workers, Zerglings, Hydralisks, Marines, Zealots, Other Light Units', 'Zerg', '          The Baneling is a small ground unit that can be described as an ovular sac of acid.  While it has legs, it''s relatively round shape even allows rolling as its preferred method of transportation after Centrifugal Hooks are evolved.  It''s movement speed is slower than that of Zerglings.  Most Baneling skins will show the torso as glowing, implying the acid itself is bright colored, usually neon green.','          Banelings can be used to great effect throughout almost every stage of the game, and in most matchups." +
                " The ability for Banelings to wreck worker lines in 1 or 2 detonations depending on upgrades never loses utility and should be seen as one of the most primary uses of Baneling.  Banelings are also great at destroying large clumps of light ground units.  They can be compared to a ground version of the Scourge in Broodwar.  A powerful suicidal unit that splashes heavily with no dropoff is not to be underestimated.\n          Banelings can also be dropped from overlords over a mineral line or the opponents army very effectively.  Due to their bonus against structures, only 5 Banelings are needed to bust through supply depots, making them easy targets when parts of the Terran''s wall.  The term ''Baneling Bust'' refers to their use as quick destructors of protective walls, followed usually by a flood of Speedlings.\n          Banelings should be controlled carefully and separately, and mobile enough to retreat and wait for an opportunity to surround or flank unsuspecting armies." +
                " Any attempt to restrict the movement of the opposing army, such as with the spell Fungal Growth, usually works well with Banelings, allowing them to more easily and quickly connect with their targets.', '          Banelings are created from zerglings following a brief chrysalis phase. In the new form, the zergling''s claws shrivel and become withered, and a swollen sac filled with volatile chemicals grows out of its back. The zergling''s skin is repurposed, stretching over newly formed growths while its bone plates soften to hold bulbous, pulsating acid sacs in place. Though the remains of the carapace offer no real protection, they allow for unhindered delivery of the baneling''s payload. The digestive and reproductory tracts are assimilated as nutrients to accelerate the process, and make room for the fleshy, mutated adrenal glands. These are re-purposed to produce and store large quantities of highly corrosive acid. Few materials can withstand this acid burst.\n" +
                "          Because of its mass, the baneling''s legs are thicker than the zergling''s, in order to stabilize itself. Its feet are replaced by sharp spikes that allow them to navigate rough terrain, albeit at a slower pace. The Swarm was able to increase the baneling''s speed despite these imperfections. Yet due to their bloated nature, banelings are barely able to walk. They have been observed to tuck into a ball and roll. Banelings also possess a rudimentary sonar system—Dominion scientists have theorized that this is a degeneration of the zergling''s complex optical structure. This system consists of a transmitter in the center of the baneling''s skull, along with two evenly spaced receivers to the sides. The transmitter emits pulses that map the baneling''s surrounding area, and echoes back to the receiver, feeding the baneling with a continuous stream of spatial information.\n          Banelings were first observed during the Siege of Cask on Sorona, in 2503. Its defenders held out against the zerg long enough so that it came to pass that only minor breeds such as zerglings continued to be spawned to be sent into battle. However, queens drove the development of a new strain, via zerglings incorporating an acidic native mold into themselves. These new banelings were thus sent against Cask, their spray of acid destroying its defenses and eradicating the terrans present.\n" +
                "          During the same year, when other terrans encountered the baneling for the first time they thought it was a mutation of a previously unknown genus rather than a morph of the zergling. The baneling was duly added to the list of threats and scientists began an effort to develop chemical rounds to detonate banelings prematurely.\n" +
                "          In 2505, Abathur used the baneling strain as a base for a mutation upgrade to the mutalisk, allowing its glaive wurms to explode on impact. After joining Kerrigan, Dehaka would selectively breed his pack to create similar strains of creatures among the primal zerg.\n" +
                "          Baneling acid sacs were harvested for use in Project Simulant in the project''s attempt to recreate the baneling in robotic form. The engineers had to deal with the sacs constantly melting through the surrounding plate infrastructure. Eventually they made it work.', 'Ground','Hatchery, Lair, or Hive','Ground', 'Until destroyed', 'BL', null, '35 vs Light', '80 vs Structures', null, null, '35 with Centrifugal Hooks', null, null, 2.2)");

        db.execSQL("INSERT INTO " + TABLE_NAME + "(unitID, NAME, Pic1, HP, Dmg1, Dmg2, Armor, Cargo, Supply, Minerals, Vespene, BuildTime, Speed, AttackSpeed1, AttackSpeed2, " +
                "Bonuses, RangevsGround, RangevsAir, LOS, LOS2, unitSize, Upgrades, SpecialAbilities, Energy, TechRequired, Shields, WarpgateCooldown, Speed2, NaturalEnemies, NaturalPrey," +
                "Race, Description, Uses, Lore, GroundAir, BuildsFrom, AttacksGA, Lifespan, Attributes, EnergyCost, SpecialDmg1, SpecialDmg2, SpecialDPS1, SpecialDPS2, HP2, Armor2, ASString, SplashRadius) " +
                "VALUES (5,'Banshee', null, 30, 20, null, 0, 2, 0.5, 50, 25, 14, 3.5, null, null, '+15 vs Light, +60 vs Structures'\n" +
                ", 0, null, 8, null, 0.75, 'Ground Weapons Levels 1-3 (+2 each; +4 vs Light; +5 vs Structures), Ground Armor Levels 1-3 (+1 each), & Shields Levels 1-3 (+1 armor to shields each), & Centrifugal Hooks increases Baneling''s speed by 0.63 and HP by 5 researched by Baneling Nest, requires Lair or Hive',\n" +
                "'Explodes upon impact in a decent splash radius, damaging all units in the radius equally.  Due to having only one attack during its life, it does not have DPS values.', null, 'Baneling Nest', null, null, '4.13 with Centrifugal Hooks', 'Roaches, Stalkers, Archons, Marauders, AOE Damage such as Tanks and Storm'," +
                "'Workers, Zerglings, Hydralisks, Marines, Zealots, Other Light Units', 'Zerg    ----  ALL STATS FILLED IN WITH BANELING PLACEHOLDER INFO  ---', '          ','          ', '          ', 'Ground','Hatchery, Lair, or Hive','Ground', 'Until destroyed', 'BL', null, '35 vs Light', '80 vs Structures', null, null, '35 with Centrifugal Hooks', null, null, null)");

        db.execSQL("INSERT INTO " + TABLE_NAME + "(unitID, NAME, Pic1, HP, Dmg1, Dmg2, Armor, Cargo, Supply, Minerals, Vespene, BuildTime, Speed, AttackSpeed1, AttackSpeed2, " +
                "Bonuses, RangevsGround, RangevsAir, LOS, LOS2, unitSize, Upgrades, SpecialAbilities, Energy, TechRequired, Shields, WarpgateCooldown, Speed2, NaturalEnemies, NaturalPrey," +
                "Race, Description, Uses, Lore, GroundAir, BuildsFrom, AttacksGA, Lifespan, Attributes, EnergyCost, SpecialDmg1, SpecialDmg2, SpecialDPS1, SpecialDPS2, HP2, Armor2, ASString, SplashRadius) " +
                "VALUES (6,'Battlecruiser', null, 30, 20, null, 0, 2, 0.5, 50, 25, 14, 3.5, null, null, '+15 vs Light, +60 vs Structures'\n" +
                ", 0, null, 8, null, 0.75, 'Ground Weapons Levels 1-3 (+2 each; +4 vs Light; +5 vs Structures), Ground Armor Levels 1-3 (+1 each), & Shields Levels 1-3 (+1 armor to shields each), & Centrifugal Hooks increases Baneling''s speed by 0.63 and HP by 5 researched by Baneling Nest, requires Lair or Hive',\n" +
                "'Explodes upon impact in a decent splash radius, damaging all units in the radius equally.  Due to having only one attack during its life, it does not have DPS values.', null, 'Baneling Nest', null, null, '4.13 with Centrifugal Hooks', 'Roaches, Stalkers, Archons, Marauders, AOE Damage such as Tanks and Storm'," +
                "'Workers, Zerglings, Hydralisks, Marines, Zealots, Other Light Units', 'Zerg    ----  ALL STATS FILLED IN WITH BANELING PLACEHOLDER INFO  ---', '          ','          ', '          ', 'Ground','Hatchery, Lair, or Hive','Ground', 'Until destroyed', 'BL', null, '35 vs Light', '80 vs Structures', null, null, '35 with Centrifugal Hooks', null, null, null)");

        db.execSQL("INSERT INTO " + TABLE_NAME + "(unitID, NAME, Pic1, HP, Dmg1, Dmg2, Armor, Cargo, Supply, Minerals, Vespene, BuildTime, Speed, AttackSpeed1, AttackSpeed2, " +
                "Bonuses, RangevsGround, RangevsAir, LOS, LOS2, unitSize, Upgrades, SpecialAbilities, Energy, TechRequired, Shields, WarpgateCooldown, Speed2, NaturalEnemies, NaturalPrey," +
                "Race, Description, Uses, Lore, GroundAir, BuildsFrom, AttacksGA, Lifespan, Attributes, EnergyCost, SpecialDmg1, SpecialDmg2, SpecialDPS1, SpecialDPS2, HP2, Armor2, ASString, SplashRadius) " +
                "VALUES (7,'Brood Lord', null, 30, 20, null, 0, 2, 0.5, 50, 25, 14, 3.5, null, null, '+15 vs Light, +60 vs Structures'\n" +
                ", 0, null, 8, null, 0.75, 'Ground Weapons Levels 1-3 (+2 each; +4 vs Light; +5 vs Structures), Ground Armor Levels 1-3 (+1 each), & Shields Levels 1-3 (+1 armor to shields each), & Centrifugal Hooks increases Baneling''s speed by 0.63 and HP by 5 researched by Baneling Nest, requires Lair or Hive',\n" +
                "'Explodes upon impact in a decent splash radius, damaging all units in the radius equally.  Due to having only one attack during its life, it does not have DPS values.', null, 'Baneling Nest', null, null, '4.13 with Centrifugal Hooks', 'Roaches, Stalkers, Archons, Marauders, AOE Damage such as Tanks and Storm'," +
                "'Workers, Zerglings, Hydralisks, Marines, Zealots, Other Light Units', 'Zerg    ----  ALL STATS FILLED IN WITH BANELING PLACEHOLDER INFO  ---', '          ','          ', '          ', 'Ground','Hatchery, Lair, or Hive','Ground', 'Until destroyed', 'BL', null, '35 vs Light', '80 vs Structures', null, null, '35 with Centrifugal Hooks', null, null, null)");

        db.execSQL("INSERT INTO " + TABLE_NAME + "(unitID, NAME, Pic1, HP, Dmg1, Dmg2, Armor, Cargo, Supply, Minerals, Vespene, BuildTime, Speed, AttackSpeed1, AttackSpeed2, " +
                "Bonuses, RangevsGround, RangevsAir, LOS, LOS2, unitSize, Upgrades, SpecialAbilities, Energy, TechRequired, Shields, WarpgateCooldown, Speed2, NaturalEnemies, NaturalPrey," +
                "Race, Description, Uses, Lore, GroundAir, BuildsFrom, AttacksGA, Lifespan, Attributes, EnergyCost, SpecialDmg1, SpecialDmg2, SpecialDPS1, SpecialDPS2, HP2, Armor2, ASString, SplashRadius) " +
                "VALUES (8,'Broodling', null, 30, 20, null, 0, 2, 0.5, 50, 25, 14, 3.5, null, null, '+15 vs Light, +60 vs Structures'\n" +
                ", 0, null, 8, null, 0.75, 'Ground Weapons Levels 1-3 (+2 each; +4 vs Light; +5 vs Structures), Ground Armor Levels 1-3 (+1 each), & Shields Levels 1-3 (+1 armor to shields each), & Centrifugal Hooks increases Baneling''s speed by 0.63 and HP by 5 researched by Baneling Nest, requires Lair or Hive',\n" +
                "'Explodes upon impact in a decent splash radius, damaging all units in the radius equally.  Due to having only one attack during its life, it does not have DPS values.', null, 'Baneling Nest', null, null, '4.13 with Centrifugal Hooks', 'Roaches, Stalkers, Archons, Marauders, AOE Damage such as Tanks and Storm'," +
                "'Workers, Zerglings, Hydralisks, Marines, Zealots, Other Light Units', 'Zerg    ----  ALL STATS FILLED IN WITH BANELING PLACEHOLDER INFO  ---', '          ','          ', '          ', 'Ground','Hatchery, Lair, or Hive','Ground', 'Until destroyed', 'BL', null, '35 vs Light', '80 vs Structures', null, null, '35 with Centrifugal Hooks', null, null, null)");

        db.execSQL("INSERT INTO " + TABLE_NAME + "(unitID, NAME, Pic1, HP, Dmg1, Dmg2, Armor, Cargo, Supply, Minerals, Vespene, BuildTime, Speed, AttackSpeed1, AttackSpeed2, " +
                "Bonuses, RangevsGround, RangevsAir, LOS, LOS2, unitSize, Upgrades, SpecialAbilities, Energy, TechRequired, Shields, WarpgateCooldown, Speed2, NaturalEnemies, NaturalPrey," +
                "Race, Description, Uses, Lore, GroundAir, BuildsFrom, AttacksGA, Lifespan, Attributes, EnergyCost, SpecialDmg1, SpecialDmg2, SpecialDPS1, SpecialDPS2, HP2, Armor2, ASString, SplashRadius) " +
                "VALUES (9,'Carrier', null, 30, 20, null, 0, 2, 0.5, 50, 25, 14, 3.5, null, null, '+15 vs Light, +60 vs Structures'\n" +
                ", 0, null, 8, null, 0.75, 'Ground Weapons Levels 1-3 (+2 each; +4 vs Light; +5 vs Structures), Ground Armor Levels 1-3 (+1 each), & Shields Levels 1-3 (+1 armor to shields each), & Centrifugal Hooks increases Baneling''s speed by 0.63 and HP by 5 researched by Baneling Nest, requires Lair or Hive',\n" +
                "'Explodes upon impact in a decent splash radius, damaging all units in the radius equally.  Due to having only one attack during its life, it does not have DPS values.', null, 'Baneling Nest', null, null, '4.13 with Centrifugal Hooks', 'Roaches, Stalkers, Archons, Marauders, AOE Damage such as Tanks and Storm'," +
                "'Workers, Zerglings, Hydralisks, Marines, Zealots, Other Light Units', 'Zerg    ----  ALL STATS FILLED IN WITH BANELING PLACEHOLDER INFO  ---', '          ','          ', '          ', 'Ground','Hatchery, Lair, or Hive','Ground', 'Until destroyed', 'BL', null, '35 vs Light', '80 vs Structures', null, null, '35 with Centrifugal Hooks', null, null, null)");

        db.execSQL("INSERT INTO " + TABLE_NAME + "(unitID, NAME, Pic1, HP, Dmg1, Dmg2, Armor, Cargo, Supply, Minerals, Vespene, BuildTime, Speed, AttackSpeed1, AttackSpeed2, " +
                "Bonuses, RangevsGround, RangevsAir, LOS, LOS2, unitSize, Upgrades, SpecialAbilities, Energy, TechRequired, Shields, WarpgateCooldown, Speed2, NaturalEnemies, NaturalPrey," +
                "Race, Description, Uses, Lore, GroundAir, BuildsFrom, AttacksGA, Lifespan, Attributes, EnergyCost, SpecialDmg1, SpecialDmg2, SpecialDPS1, SpecialDPS2, HP2, Armor2, ASString, SplashRadius) " +
                "VALUES (10,'Changeling', null, 30, 20, null, 0, 2, 0.5, 50, 25, 14, 3.5, null, null, '+15 vs Light, +60 vs Structures'\n" +
                ", 0, null, 8, null, 0.75, 'Ground Weapons Levels 1-3 (+2 each; +4 vs Light; +5 vs Structures), Ground Armor Levels 1-3 (+1 each), & Shields Levels 1-3 (+1 armor to shields each), & Centrifugal Hooks increases Baneling''s speed by 0.63 and HP by 5 researched by Baneling Nest, requires Lair or Hive',\n" +
                "'Explodes upon impact in a decent splash radius, damaging all units in the radius equally.  Due to having only one attack during its life, it does not have DPS values.', null, 'Baneling Nest', null, null, '4.13 with Centrifugal Hooks', 'Roaches, Stalkers, Archons, Marauders, AOE Damage such as Tanks and Storm'," +
                "'Workers, Zerglings, Hydralisks, Marines, Zealots, Other Light Units', 'Zerg    ----  ALL STATS FILLED IN WITH BANELING PLACEHOLDER INFO  ---', '          ','          ', '          ', 'Ground','Hatchery, Lair, or Hive','Ground', 'Until destroyed', 'BL', null, '35 vs Light', '80 vs Structures', null, null, '35 with Centrifugal Hooks', null, null, null)");

        db.execSQL("INSERT INTO " + TABLE_NAME + "(unitID, NAME, Pic1, HP, Dmg1, Dmg2, Armor, Cargo, Supply, Minerals, Vespene, BuildTime, Speed, AttackSpeed1, AttackSpeed2, " +
                "Bonuses, RangevsGround, RangevsAir, LOS, LOS2, unitSize, Upgrades, SpecialAbilities, Energy, TechRequired, Shields, WarpgateCooldown, Speed2, NaturalEnemies, NaturalPrey," +
                "Race, Description, Uses, Lore, GroundAir, BuildsFrom, AttacksGA, Lifespan, Attributes, EnergyCost, SpecialDmg1, SpecialDmg2, SpecialDPS1, SpecialDPS2, HP2, Armor2, ASString, SplashRadius) " +
                "VALUES (11,'Colossus', null, 30, 20, null, 0, 2, 0.5, 50, 25, 14, 3.5, null, null, '+15 vs Light, +60 vs Structures'\n" +
                ", 0, null, 8, null, 0.75, 'Ground Weapons Levels 1-3 (+2 each; +4 vs Light; +5 vs Structures), Ground Armor Levels 1-3 (+1 each), & Shields Levels 1-3 (+1 armor to shields each), & Centrifugal Hooks increases Baneling''s speed by 0.63 and HP by 5 researched by Baneling Nest, requires Lair or Hive',\n" +
                "'Explodes upon impact in a decent splash radius, damaging all units in the radius equally.  Due to having only one attack during its life, it does not have DPS values.', null, 'Baneling Nest', null, null, '4.13 with Centrifugal Hooks', 'Roaches, Stalkers, Archons, Marauders, AOE Damage such as Tanks and Storm'," +
                "'Workers, Zerglings, Hydralisks, Marines, Zealots, Other Light Units', 'Zerg    ----  ALL STATS FILLED IN WITH BANELING PLACEHOLDER INFO  ---', '          ','          ', '          ', 'Ground','Hatchery, Lair, or Hive','Ground', 'Until destroyed', 'BL', null, '35 vs Light', '80 vs Structures', null, null, '35 with Centrifugal Hooks', null, null, null)");

        db.execSQL("INSERT INTO " + TABLE_NAME + "(unitID, NAME, Pic1, HP, Dmg1, Dmg2, Armor, Cargo, Supply, Minerals, Vespene, BuildTime, Speed, AttackSpeed1, AttackSpeed2, " +
                "Bonuses, RangevsGround, RangevsAir, LOS, LOS2, unitSize, Upgrades, SpecialAbilities, Energy, TechRequired, Shields, WarpgateCooldown, Speed2, NaturalEnemies, NaturalPrey," +
                "Race, Description, Uses, Lore, GroundAir, BuildsFrom, AttacksGA, Lifespan, Attributes, EnergyCost, SpecialDmg1, SpecialDmg2, SpecialDPS1, SpecialDPS2, HP2, Armor2, ASString, SplashRadius) " +
                "VALUES (12,'Corruptor', null, 30, 20, null, 0, 2, 0.5, 50, 25, 14, 3.5, null, null, '+15 vs Light, +60 vs Structures'\n" +
                ", 0, null, 8, null, 0.75, 'Ground Weapons Levels 1-3 (+2 each; +4 vs Light; +5 vs Structures), Ground Armor Levels 1-3 (+1 each), & Shields Levels 1-3 (+1 armor to shields each), & Centrifugal Hooks increases Baneling''s speed by 0.63 and HP by 5 researched by Baneling Nest, requires Lair or Hive',\n" +
                "'Explodes upon impact in a decent splash radius, damaging all units in the radius equally.  Due to having only one attack during its life, it does not have DPS values.', null, 'Baneling Nest', null, null, '4.13 with Centrifugal Hooks', 'Roaches, Stalkers, Archons, Marauders, AOE Damage such as Tanks and Storm'," +
                "'Workers, Zerglings, Hydralisks, Marines, Zealots, Other Light Units', 'Zerg    ----  ALL STATS FILLED IN WITH BANELING PLACEHOLDER INFO  ---', '          ','          ', '          ', 'Ground','Hatchery, Lair, or Hive','Ground', 'Until destroyed', 'BL', null, '35 vs Light', '80 vs Structures', null, null, '35 with Centrifugal Hooks', null, null, null)");

        db.execSQL("INSERT INTO " + TABLE_NAME + "(unitID, NAME, Pic1, HP, Dmg1, Dmg2, Armor, Cargo, Supply, Minerals, Vespene, BuildTime, Speed, AttackSpeed1, AttackSpeed2, " +
                "Bonuses, RangevsGround, RangevsAir, LOS, LOS2, unitSize, Upgrades, SpecialAbilities, Energy, TechRequired, Shields, WarpgateCooldown, Speed2, NaturalEnemies, NaturalPrey," +
                "Race, Description, Uses, Lore, GroundAir, BuildsFrom, AttacksGA, Lifespan, Attributes, EnergyCost, SpecialDmg1, SpecialDmg2, SpecialDPS1, SpecialDPS2, HP2, Armor2, ASString, SplashRadius) " +
                "VALUES (13,'Cyclone', null, 30, 20, null, 0, 2, 0.5, 50, 25, 14, 3.5, null, null, '+15 vs Light, +60 vs Structures'\n" +
                ", 0, null, 8, null, 0.75, 'Ground Weapons Levels 1-3 (+2 each; +4 vs Light; +5 vs Structures), Ground Armor Levels 1-3 (+1 each), & Shields Levels 1-3 (+1 armor to shields each), & Centrifugal Hooks increases Baneling''s speed by 0.63 and HP by 5 researched by Baneling Nest, requires Lair or Hive',\n" +
                "'Explodes upon impact in a decent splash radius, damaging all units in the radius equally.  Due to having only one attack during its life, it does not have DPS values.', null, 'Baneling Nest', null, null, '4.13 with Centrifugal Hooks', 'Roaches, Stalkers, Archons, Marauders, AOE Damage such as Tanks and Storm'," +
                "'Workers, Zerglings, Hydralisks, Marines, Zealots, Other Light Units', 'Zerg    ----  ALL STATS FILLED IN WITH BANELING PLACEHOLDER INFO  ---', '          ','          ', '          ', 'Ground','Hatchery, Lair, or Hive','Ground', 'Until destroyed', 'BL', null, '35 vs Light', '80 vs Structures', null, null, '35 with Centrifugal Hooks', null, null, null)");

        db.execSQL("INSERT INTO " + TABLE_NAME + "(unitID, NAME, Pic1, HP, Dmg1, Dmg2, Armor, Cargo, Supply, Minerals, Vespene, BuildTime, Speed, AttackSpeed1, AttackSpeed2, " +
                "Bonuses, RangevsGround, RangevsAir, LOS, LOS2, unitSize, Upgrades, SpecialAbilities, Energy, TechRequired, Shields, WarpgateCooldown, Speed2, NaturalEnemies, NaturalPrey," +
                "Race, Description, Uses, Lore, GroundAir, BuildsFrom, AttacksGA, Lifespan, Attributes, EnergyCost, SpecialDmg1, SpecialDmg2, SpecialDPS1, SpecialDPS2, HP2, Armor2, ASString, SplashRadius) " +
                "VALUES (14,'Dark Templar', null, 30, 20, null, 0, 2, 0.5, 50, 25, 14, 3.5, null, null, '+15 vs Light, +60 vs Structures'\n" +
                ", 0, null, 8, null, 0.75, 'Ground Weapons Levels 1-3 (+2 each; +4 vs Light; +5 vs Structures), Ground Armor Levels 1-3 (+1 each), & Shields Levels 1-3 (+1 armor to shields each), & Centrifugal Hooks increases Baneling''s speed by 0.63 and HP by 5 researched by Baneling Nest, requires Lair or Hive',\n" +
                "'Explodes upon impact in a decent splash radius, damaging all units in the radius equally.  Due to having only one attack during its life, it does not have DPS values.', null, 'Baneling Nest', null, null, '4.13 with Centrifugal Hooks', 'Roaches, Stalkers, Archons, Marauders, AOE Damage such as Tanks and Storm'," +
                "'Workers, Zerglings, Hydralisks, Marines, Zealots, Other Light Units', 'Zerg    ----  ALL STATS FILLED IN WITH BANELING PLACEHOLDER INFO  ---', '          ','          ', '          ', 'Ground','Hatchery, Lair, or Hive','Ground', 'Until destroyed', 'BL', null, '35 vs Light', '80 vs Structures', null, null, '35 with Centrifugal Hooks', null, null, null)");

        db.execSQL("INSERT INTO " + TABLE_NAME + "(unitID, NAME, Pic1, HP, Dmg1, Dmg2, Armor, Cargo, Supply, Minerals, Vespene, BuildTime, Speed, AttackSpeed1, AttackSpeed2, " +
                "Bonuses, RangevsGround, RangevsAir, LOS, LOS2, unitSize, Upgrades, SpecialAbilities, Energy, TechRequired, Shields, WarpgateCooldown, Speed2, NaturalEnemies, NaturalPrey," +
                "Race, Description, Uses, Lore, GroundAir, BuildsFrom, AttacksGA, Lifespan, Attributes, EnergyCost, SpecialDmg1, SpecialDmg2, SpecialDPS1, SpecialDPS2, HP2, Armor2, ASString, SplashRadius) " +
                "VALUES (15,'Disruptor', null, 30, 20, null, 0, 2, 0.5, 50, 25, 14, 3.5, null, null, '+15 vs Light, +60 vs Structures'\n" +
                ", 0, null, 8, null, 0.75, 'Ground Weapons Levels 1-3 (+2 each; +4 vs Light; +5 vs Structures), Ground Armor Levels 1-3 (+1 each), & Shields Levels 1-3 (+1 armor to shields each), & Centrifugal Hooks increases Baneling''s speed by 0.63 and HP by 5 researched by Baneling Nest, requires Lair or Hive',\n" +
                "'Explodes upon impact in a decent splash radius, damaging all units in the radius equally.  Due to having only one attack during its life, it does not have DPS values.', null, 'Baneling Nest', null, null, '4.13 with Centrifugal Hooks', 'Roaches, Stalkers, Archons, Marauders, AOE Damage such as Tanks and Storm'," +
                "'Workers, Zerglings, Hydralisks, Marines, Zealots, Other Light Units', 'Zerg    ----  ALL STATS FILLED IN WITH BANELING PLACEHOLDER INFO  ---', '          ','          ', '          ', 'Ground','Hatchery, Lair, or Hive','Ground', 'Until destroyed', 'BL', null, '35 vs Light', '80 vs Structures', null, null, '35 with Centrifugal Hooks', null, null, null)");

        db.execSQL("INSERT INTO " + TABLE_NAME + "(unitID, NAME, Pic1, HP, Dmg1, Dmg2, Armor, Cargo, Supply, Minerals, Vespene, BuildTime, Speed, AttackSpeed1, AttackSpeed2, " +
                "Bonuses, RangevsGround, RangevsAir, LOS, LOS2, unitSize, Upgrades, SpecialAbilities, Energy, TechRequired, Shields, WarpgateCooldown, Speed2, NaturalEnemies, NaturalPrey," +
                "Race, Description, Uses, Lore, GroundAir, BuildsFrom, AttacksGA, Lifespan, Attributes, EnergyCost, SpecialDmg1, SpecialDmg2, SpecialDPS1, SpecialDPS2, HP2, Armor2, ASString, SplashRadius) " +
                "VALUES (16,'Drone', null, 30, 20, null, 0, 2, 0.5, 50, 25, 14, 3.5, null, null, '+15 vs Light, +60 vs Structures'\n" +
                ", 0, null, 8, null, 0.75, 'Ground Weapons Levels 1-3 (+2 each; +4 vs Light; +5 vs Structures), Ground Armor Levels 1-3 (+1 each), & Shields Levels 1-3 (+1 armor to shields each), & Centrifugal Hooks increases Baneling''s speed by 0.63 and HP by 5 researched by Baneling Nest, requires Lair or Hive',\n" +
                "'Explodes upon impact in a decent splash radius, damaging all units in the radius equally.  Due to having only one attack during its life, it does not have DPS values.', null, 'Baneling Nest', null, null, '4.13 with Centrifugal Hooks', 'Roaches, Stalkers, Archons, Marauders, AOE Damage such as Tanks and Storm'," +
                "'Workers, Zerglings, Hydralisks, Marines, Zealots, Other Light Units', 'Zerg    ----  ALL STATS FILLED IN WITH BANELING PLACEHOLDER INFO  ---', '          ','          ', '          ', 'Ground','Hatchery, Lair, or Hive','Ground', 'Until destroyed', 'BL', null, '35 vs Light', '80 vs Structures', null, null, '35 with Centrifugal Hooks', null, null, null)");

        db.execSQL("INSERT INTO " + TABLE_NAME + "(unitID, NAME, Pic1, HP, Dmg1, Dmg2, Armor, Cargo, Supply, Minerals, Vespene, BuildTime, Speed, AttackSpeed1, AttackSpeed2, " +
                "Bonuses, RangevsGround, RangevsAir, LOS, LOS2, unitSize, Upgrades, SpecialAbilities, Energy, TechRequired, Shields, WarpgateCooldown, Speed2, NaturalEnemies, NaturalPrey," +
                "Race, Description, Uses, Lore, GroundAir, BuildsFrom, AttacksGA, Lifespan, Attributes, EnergyCost, SpecialDmg1, SpecialDmg2, SpecialDPS1, SpecialDPS2, HP2, Armor2, ASString, SplashRadius) " +
                "VALUES (17,'Ghost', null, 30, 20, null, 0, 2, 0.5, 50, 25, 14, 3.5, null, null, '+15 vs Light, +60 vs Structures'\n" +
                ", 0, null, 8, null, 0.75, 'Ground Weapons Levels 1-3 (+2 each; +4 vs Light; +5 vs Structures), Ground Armor Levels 1-3 (+1 each), & Shields Levels 1-3 (+1 armor to shields each), & Centrifugal Hooks increases Baneling''s speed by 0.63 and HP by 5 researched by Baneling Nest, requires Lair or Hive',\n" +
                "'Explodes upon impact in a decent splash radius, damaging all units in the radius equally.  Due to having only one attack during its life, it does not have DPS values.', null, 'Baneling Nest', null, null, '4.13 with Centrifugal Hooks', 'Roaches, Stalkers, Archons, Marauders, AOE Damage such as Tanks and Storm'," +
                "'Workers, Zerglings, Hydralisks, Marines, Zealots, Other Light Units', 'Zerg    ----  ALL STATS FILLED IN WITH BANELING PLACEHOLDER INFO  ---', '          ','          ', '          ', 'Ground','Hatchery, Lair, or Hive','Ground', 'Until destroyed', 'BL', null, '35 vs Light', '80 vs Structures', null, null, '35 with Centrifugal Hooks', null, null, null)");

        db.execSQL("INSERT INTO " + TABLE_NAME + "(unitID, NAME, Pic1, HP, Dmg1, Dmg2, Armor, Cargo, Supply, Minerals, Vespene, BuildTime, Speed, AttackSpeed1, AttackSpeed2, " +
                "Bonuses, RangevsGround, RangevsAir, LOS, LOS2, unitSize, Upgrades, SpecialAbilities, Energy, TechRequired, Shields, WarpgateCooldown, Speed2, NaturalEnemies, NaturalPrey," +
                "Race, Description, Uses, Lore, GroundAir, BuildsFrom, AttacksGA, Lifespan, Attributes, EnergyCost, SpecialDmg1, SpecialDmg2, SpecialDPS1, SpecialDPS2, HP2, Armor2, ASString, SplashRadius) " +
                "VALUES (18,'Hellbat', null, 30, 20, null, 0, 2, 0.5, 50, 25, 14, 3.5, null, null, '+15 vs Light, +60 vs Structures'\n" +
                ", 0, null, 8, null, 0.75, 'Ground Weapons Levels 1-3 (+2 each; +4 vs Light; +5 vs Structures), Ground Armor Levels 1-3 (+1 each), & Shields Levels 1-3 (+1 armor to shields each), & Centrifugal Hooks increases Baneling''s speed by 0.63 and HP by 5 researched by Baneling Nest, requires Lair or Hive',\n" +
                "'Explodes upon impact in a decent splash radius, damaging all units in the radius equally.  Due to having only one attack during its life, it does not have DPS values.', null, 'Baneling Nest', null, null, '4.13 with Centrifugal Hooks', 'Roaches, Stalkers, Archons, Marauders, AOE Damage such as Tanks and Storm'," +
                "'Workers, Zerglings, Hydralisks, Marines, Zealots, Other Light Units', 'Zerg    ----  ALL STATS FILLED IN WITH BANELING PLACEHOLDER INFO  ---', '          ','          ', '          ', 'Ground','Hatchery, Lair, or Hive','Ground', 'Until destroyed', 'BL', null, '35 vs Light', '80 vs Structures', null, null, '35 with Centrifugal Hooks', null, null, null)");

        db.execSQL("INSERT INTO " + TABLE_NAME + "(unitID, NAME, Pic1, HP, Dmg1, Dmg2, Armor, Cargo, Supply, Minerals, Vespene, BuildTime, Speed, AttackSpeed1, AttackSpeed2, " +
                "Bonuses, RangevsGround, RangevsAir, LOS, LOS2, unitSize, Upgrades, SpecialAbilities, Energy, TechRequired, Shields, WarpgateCooldown, Speed2, NaturalEnemies, NaturalPrey," +
                "Race, Description, Uses, Lore, GroundAir, BuildsFrom, AttacksGA, Lifespan, Attributes, EnergyCost, SpecialDmg1, SpecialDmg2, SpecialDPS1, SpecialDPS2, HP2, Armor2, ASString, SplashRadius) " +
                "VALUES (19,'Hellion', null, 30, 20, null, 0, 2, 0.5, 50, 25, 14, 3.5, null, null, '+15 vs Light, +60 vs Structures'\n" +
                ", 0, null, 8, null, 0.75, 'Ground Weapons Levels 1-3 (+2 each; +4 vs Light; +5 vs Structures), Ground Armor Levels 1-3 (+1 each), & Shields Levels 1-3 (+1 armor to shields each), & Centrifugal Hooks increases Baneling''s speed by 0.63 and HP by 5 researched by Baneling Nest, requires Lair or Hive',\n" +
                "'Explodes upon impact in a decent splash radius, damaging all units in the radius equally.  Due to having only one attack during its life, it does not have DPS values.', null, 'Baneling Nest', null, null, '4.13 with Centrifugal Hooks', 'Roaches, Stalkers, Archons, Marauders, AOE Damage such as Tanks and Storm'," +
                "'Workers, Zerglings, Hydralisks, Marines, Zealots, Other Light Units', 'Zerg    ----  ALL STATS FILLED IN WITH BANELING PLACEHOLDER INFO  ---', '          ','          ', '          ', 'Ground','Hatchery, Lair, or Hive','Ground', 'Until destroyed', 'BL', null, '35 vs Light', '80 vs Structures', null, null, '35 with Centrifugal Hooks', null, null, null)");

        db.execSQL("INSERT INTO " + TABLE_NAME + "(unitID, NAME, Pic1, HP, Dmg1, Dmg2, Armor, Cargo, Supply, Minerals, Vespene, BuildTime, Speed, AttackSpeed1, AttackSpeed2, " +
                "Bonuses, RangevsGround, RangevsAir, LOS, LOS2, unitSize, Upgrades, SpecialAbilities, Energy, TechRequired, Shields, WarpgateCooldown, Speed2, NaturalEnemies, NaturalPrey," +
                "Race, Description, Uses, Lore, GroundAir, BuildsFrom, AttacksGA, Lifespan, Attributes, EnergyCost, SpecialDmg1, SpecialDmg2, SpecialDPS1, SpecialDPS2, HP2, Armor2, ASString, SplashRadius) " +
                "VALUES (20,'High Templar', null, 30, 20, null, 0, 2, 0.5, 50, 25, 14, 3.5, null, null, '+15 vs Light, +60 vs Structures'\n" +
                ", 0, null, 8, null, 0.75, 'Ground Weapons Levels 1-3 (+2 each; +4 vs Light; +5 vs Structures), Ground Armor Levels 1-3 (+1 each), & Shields Levels 1-3 (+1 armor to shields each), & Centrifugal Hooks increases Baneling''s speed by 0.63 and HP by 5 researched by Baneling Nest, requires Lair or Hive',\n" +
                "'Explodes upon impact in a decent splash radius, damaging all units in the radius equally.  Due to having only one attack during its life, it does not have DPS values.', null, 'Baneling Nest', null, null, '4.13 with Centrifugal Hooks', 'Roaches, Stalkers, Archons, Marauders, AOE Damage such as Tanks and Storm'," +
                "'Workers, Zerglings, Hydralisks, Marines, Zealots, Other Light Units', 'Zerg    ----  ALL STATS FILLED IN WITH BANELING PLACEHOLDER INFO  ---', '          ','          ', '          ', 'Ground','Hatchery, Lair, or Hive','Ground', 'Until destroyed', 'BL', null, '35 vs Light', '80 vs Structures', null, null, '35 with Centrifugal Hooks', null, null, null)");

        db.execSQL("INSERT INTO " + TABLE_NAME + "(unitID, NAME, Pic1, HP, Dmg1, Dmg2, Armor, Cargo, Supply, Minerals, Vespene, BuildTime, Speed, AttackSpeed1, AttackSpeed2, " +
                "Bonuses, RangevsGround, RangevsAir, LOS, LOS2, unitSize, Upgrades, SpecialAbilities, Energy, TechRequired, Shields, WarpgateCooldown, Speed2, NaturalEnemies, NaturalPrey," +
                "Race, Description, Uses, Lore, GroundAir, BuildsFrom, AttacksGA, Lifespan, Attributes, EnergyCost, SpecialDmg1, SpecialDmg2, SpecialDPS1, SpecialDPS2, HP2, Armor2, ASString, SplashRadius) " +
                "VALUES (21,'Hydralisk', null, 30, 20, null, 0, 2, 0.5, 50, 25, 14, 3.5, null, null, '+15 vs Light, +60 vs Structures'\n" +
                ", 0, null, 8, null, 0.75, 'Ground Weapons Levels 1-3 (+2 each; +4 vs Light; +5 vs Structures), Ground Armor Levels 1-3 (+1 each), & Shields Levels 1-3 (+1 armor to shields each), & Centrifugal Hooks increases Baneling''s speed by 0.63 and HP by 5 researched by Baneling Nest, requires Lair or Hive',\n" +
                "'Explodes upon impact in a decent splash radius, damaging all units in the radius equally.  Due to having only one attack during its life, it does not have DPS values.', null, 'Baneling Nest', null, null, '4.13 with Centrifugal Hooks', 'Roaches, Stalkers, Archons, Marauders, AOE Damage such as Tanks and Storm'," +
                "'Workers, Zerglings, Hydralisks, Marines, Zealots, Other Light Units', 'Zerg    ----  ALL STATS FILLED IN WITH BANELING PLACEHOLDER INFO  ---', '          ','          ', '          ', 'Ground','Hatchery, Lair, or Hive','Ground', 'Until destroyed', 'BL', null, '35 vs Light', '80 vs Structures', null, null, '35 with Centrifugal Hooks', null, null, null)");

        db.execSQL("INSERT INTO " + TABLE_NAME + "(unitID, NAME, Pic1, HP, Dmg1, Dmg2, Armor, Cargo, Supply, Minerals, Vespene, BuildTime, Speed, AttackSpeed1, AttackSpeed2, " +
                "Bonuses, RangevsGround, RangevsAir, LOS, LOS2, unitSize, Upgrades, SpecialAbilities, Energy, TechRequired, Shields, WarpgateCooldown, Speed2, NaturalEnemies, NaturalPrey," +
                "Race, Description, Uses, Lore, GroundAir, BuildsFrom, AttacksGA, Lifespan, Attributes, EnergyCost, SpecialDmg1, SpecialDmg2, SpecialDPS1, SpecialDPS2, HP2, Armor2, ASString, SplashRadius) " +
                "VALUES (22,'Immortal', null, 30, 20, null, 0, 2, 0.5, 50, 25, 14, 3.5, null, null, '+15 vs Light, +60 vs Structures'\n" +
                ", 0, null, 8, null, 0.75, 'Ground Weapons Levels 1-3 (+2 each; +4 vs Light; +5 vs Structures), Ground Armor Levels 1-3 (+1 each), & Shields Levels 1-3 (+1 armor to shields each), & Centrifugal Hooks increases Baneling''s speed by 0.63 and HP by 5 researched by Baneling Nest, requires Lair or Hive',\n" +
                "'Explodes upon impact in a decent splash radius, damaging all units in the radius equally.  Due to having only one attack during its life, it does not have DPS values.', null, 'Baneling Nest', null, null, '4.13 with Centrifugal Hooks', 'Roaches, Stalkers, Archons, Marauders, AOE Damage such as Tanks and Storm'," +
                "'Workers, Zerglings, Hydralisks, Marines, Zealots, Other Light Units', 'Zerg    ----  ALL STATS FILLED IN WITH BANELING PLACEHOLDER INFO  ---', '          ','          ', '          ', 'Ground','Hatchery, Lair, or Hive','Ground', 'Until destroyed', 'BL', null, '35 vs Light', '80 vs Structures', null, null, '35 with Centrifugal Hooks', null, null, null)");

        db.execSQL("INSERT INTO " + TABLE_NAME + "(unitID, NAME, Pic1, HP, Dmg1, Dmg2, Armor, Cargo, Supply, Minerals, Vespene, BuildTime, Speed, AttackSpeed1, AttackSpeed2, " +
                "Bonuses, RangevsGround, RangevsAir, LOS, LOS2, unitSize, Upgrades, SpecialAbilities, Energy, TechRequired, Shields, WarpgateCooldown, Speed2, NaturalEnemies, NaturalPrey," +
                "Race, Description, Uses, Lore, GroundAir, BuildsFrom, AttacksGA, Lifespan, Attributes, EnergyCost, SpecialDmg1, SpecialDmg2, SpecialDPS1, SpecialDPS2, HP2, Armor2, ASString, SplashRadius) " +
                "VALUES (23,'Infested Terran', null, 30, 20, null, 0, 2, 0.5, 50, 25, 14, 3.5, null, null, '+15 vs Light, +60 vs Structures'\n" +
                ", 0, null, 8, null, 0.75, 'Ground Weapons Levels 1-3 (+2 each; +4 vs Light; +5 vs Structures), Ground Armor Levels 1-3 (+1 each), & Shields Levels 1-3 (+1 armor to shields each), & Centrifugal Hooks increases Baneling''s speed by 0.63 and HP by 5 researched by Baneling Nest, requires Lair or Hive',\n" +
                "'Explodes upon impact in a decent splash radius, damaging all units in the radius equally.  Due to having only one attack during its life, it does not have DPS values.', null, 'Baneling Nest', null, null, '4.13 with Centrifugal Hooks', 'Roaches, Stalkers, Archons, Marauders, AOE Damage such as Tanks and Storm'," +
                "'Workers, Zerglings, Hydralisks, Marines, Zealots, Other Light Units', 'Zerg    ----  ALL STATS FILLED IN WITH BANELING PLACEHOLDER INFO  ---', '          ','          ', '          ', 'Ground','Hatchery, Lair, or Hive','Ground', 'Until destroyed', 'BL', null, '35 vs Light', '80 vs Structures', null, null, '35 with Centrifugal Hooks', null, null, null)");

        db.execSQL("INSERT INTO " + TABLE_NAME + "(unitID, NAME, Pic1, HP, Dmg1, Dmg2, Armor, Cargo, Supply, Minerals, Vespene, BuildTime, Speed, AttackSpeed1, AttackSpeed2, " +
                "Bonuses, RangevsGround, RangevsAir, LOS, LOS2, unitSize, Upgrades, SpecialAbilities, Energy, TechRequired, Shields, WarpgateCooldown, Speed2, NaturalEnemies, NaturalPrey," +
                "Race, Description, Uses, Lore, GroundAir, BuildsFrom, AttacksGA, Lifespan, Attributes, EnergyCost, SpecialDmg1, SpecialDmg2, SpecialDPS1, SpecialDPS2, HP2, Armor2, ASString, SplashRadius) " +
                "VALUES (24,'Infestor', null, 30, 20, null, 0, 2, 0.5, 50, 25, 14, 3.5, null, null, '+15 vs Light, +60 vs Structures'\n" +
                ", 0, null, 8, null, 0.75, 'Ground Weapons Levels 1-3 (+2 each; +4 vs Light; +5 vs Structures), Ground Armor Levels 1-3 (+1 each), & Shields Levels 1-3 (+1 armor to shields each), & Centrifugal Hooks increases Baneling''s speed by 0.63 and HP by 5 researched by Baneling Nest, requires Lair or Hive',\n" +
                "'Explodes upon impact in a decent splash radius, damaging all units in the radius equally.  Due to having only one attack during its life, it does not have DPS values.', null, 'Baneling Nest', null, null, '4.13 with Centrifugal Hooks', 'Roaches, Stalkers, Archons, Marauders, AOE Damage such as Tanks and Storm'," +
                "'Workers, Zerglings, Hydralisks, Marines, Zealots, Other Light Units', 'Zerg    ----  ALL STATS FILLED IN WITH BANELING PLACEHOLDER INFO  ---', '          ','          ', '          ', 'Ground','Hatchery, Lair, or Hive','Ground', 'Until destroyed', 'BL', null, '35 vs Light', '80 vs Structures', null, null, '35 with Centrifugal Hooks', null, null, null)");

        db.execSQL("INSERT INTO " + TABLE_NAME + "(unitID, NAME, Pic1, HP, Dmg1, Dmg2, Armor, Cargo, Supply, Minerals, Vespene, BuildTime, Speed, AttackSpeed1, AttackSpeed2, " +
                "Bonuses, RangevsGround, RangevsAir, LOS, LOS2, unitSize, Upgrades, SpecialAbilities, Energy, TechRequired, Shields, WarpgateCooldown, Speed2, NaturalEnemies, NaturalPrey," +
                "Race, Description, Uses, Lore, GroundAir, BuildsFrom, AttacksGA, Lifespan, Attributes, EnergyCost, SpecialDmg1, SpecialDmg2, SpecialDPS1, SpecialDPS2, HP2, Armor2, ASString, SplashRadius) " +
                "VALUES (25,'Interceptor', null, 30, 20, null, 0, 2, 0.5, 50, 25, 14, 3.5, null, null, '+15 vs Light, +60 vs Structures'\n" +
                ", 0, null, 8, null, 0.75, 'Ground Weapons Levels 1-3 (+2 each; +4 vs Light; +5 vs Structures), Ground Armor Levels 1-3 (+1 each), & Shields Levels 1-3 (+1 armor to shields each), & Centrifugal Hooks increases Baneling''s speed by 0.63 and HP by 5 researched by Baneling Nest, requires Lair or Hive',\n" +
                "'Explodes upon impact in a decent splash radius, damaging all units in the radius equally.  Due to having only one attack during its life, it does not have DPS values.', null, 'Baneling Nest', null, null, '4.13 with Centrifugal Hooks', 'Roaches, Stalkers, Archons, Marauders, AOE Damage such as Tanks and Storm'," +
                "'Workers, Zerglings, Hydralisks, Marines, Zealots, Other Light Units', 'Zerg    ----  ALL STATS FILLED IN WITH BANELING PLACEHOLDER INFO  ---', '          ','          ', '          ', 'Ground','Hatchery, Lair, or Hive','Ground', 'Until destroyed', 'BL', null, '35 vs Light', '80 vs Structures', null, null, '35 with Centrifugal Hooks', null, null, null)");

        db.execSQL("INSERT INTO " + TABLE_NAME + "(unitID, NAME, Pic1, HP, Dmg1, Dmg2, Armor, Cargo, Supply, Minerals, Vespene, BuildTime, Speed, AttackSpeed1, AttackSpeed2, " +
                "Bonuses, RangevsGround, RangevsAir, LOS, LOS2, unitSize, Upgrades, SpecialAbilities, Energy, TechRequired, Shields, WarpgateCooldown, Speed2, NaturalEnemies, NaturalPrey," +
                "Race, Description, Uses, Lore, GroundAir, BuildsFrom, AttacksGA, Lifespan, Attributes, EnergyCost, SpecialDmg1, SpecialDmg2, SpecialDPS1, SpecialDPS2, HP2, Armor2, ASString, SplashRadius) " +
                "VALUES (26,'Larva', null, 30, 20, null, 0, 2, 0.5, 50, 25, 14, 3.5, null, null, '+15 vs Light, +60 vs Structures'\n" +
                ", 0, null, 8, null, 0.75, 'Ground Weapons Levels 1-3 (+2 each; +4 vs Light; +5 vs Structures), Ground Armor Levels 1-3 (+1 each), & Shields Levels 1-3 (+1 armor to shields each), & Centrifugal Hooks increases Baneling''s speed by 0.63 and HP by 5 researched by Baneling Nest, requires Lair or Hive',\n" +
                "'Explodes upon impact in a decent splash radius, damaging all units in the radius equally.  Due to having only one attack during its life, it does not have DPS values.', null, 'Baneling Nest', null, null, '4.13 with Centrifugal Hooks', 'Roaches, Stalkers, Archons, Marauders, AOE Damage such as Tanks and Storm'," +
                "'Workers, Zerglings, Hydralisks, Marines, Zealots, Other Light Units', 'Zerg    ----  ALL STATS FILLED IN WITH BANELING PLACEHOLDER INFO  ---', '          ','          ', '          ', 'Ground','Hatchery, Lair, or Hive','Ground', 'Until destroyed', 'BL', null, '35 vs Light', '80 vs Structures', null, null, '35 with Centrifugal Hooks', null, null, null)");

        db.execSQL("INSERT INTO " + TABLE_NAME + "(unitID, NAME, Pic1, HP, Dmg1, Dmg2, Armor, Cargo, Supply, Minerals, Vespene, BuildTime, Speed, AttackSpeed1, AttackSpeed2, " +
                "Bonuses, RangevsGround, RangevsAir, LOS, LOS2, unitSize, Upgrades, SpecialAbilities, Energy, TechRequired, Shields, WarpgateCooldown, Speed2, NaturalEnemies, NaturalPrey," +
                "Race, Description, Uses, Lore, GroundAir, BuildsFrom, AttacksGA, Lifespan, Attributes, EnergyCost, SpecialDmg1, SpecialDmg2, SpecialDPS1, SpecialDPS2, HP2, Armor2, ASString, SplashRadius) " +
                "VALUES (27,'Liberator (defender mode)', null, 30, 20, null, 0, 2, 0.5, 50, 25, 14, 3.5, null, null, '+15 vs Light, +60 vs Structures'\n" +
                ", 0, null, 8, null, 0.75, 'Ground Weapons Levels 1-3 (+2 each; +4 vs Light; +5 vs Structures), Ground Armor Levels 1-3 (+1 each), & Shields Levels 1-3 (+1 armor to shields each), & Centrifugal Hooks increases Baneling''s speed by 0.63 and HP by 5 researched by Baneling Nest, requires Lair or Hive',\n" +
                "'Explodes upon impact in a decent splash radius, damaging all units in the radius equally.  Due to having only one attack during its life, it does not have DPS values.', null, 'Baneling Nest', null, null, '4.13 with Centrifugal Hooks', 'Roaches, Stalkers, Archons, Marauders, AOE Damage such as Tanks and Storm'," +
                "'Workers, Zerglings, Hydralisks, Marines, Zealots, Other Light Units', 'Zerg    ----  ALL STATS FILLED IN WITH BANELING PLACEHOLDER INFO  ---', '          ','          ', '          ', 'Ground','Hatchery, Lair, or Hive','Ground', 'Until destroyed', 'BL', null, '35 vs Light', '80 vs Structures', null, null, '35 with Centrifugal Hooks', null, null, null)");

        db.execSQL("INSERT INTO " + TABLE_NAME + "(unitID, NAME, Pic1, HP, Dmg1, Dmg2, Armor, Cargo, Supply, Minerals, Vespene, BuildTime, Speed, AttackSpeed1, AttackSpeed2, " +
                "Bonuses, RangevsGround, RangevsAir, LOS, LOS2, unitSize, Upgrades, SpecialAbilities, Energy, TechRequired, Shields, WarpgateCooldown, Speed2, NaturalEnemies, NaturalPrey," +
                "Race, Description, Uses, Lore, GroundAir, BuildsFrom, AttacksGA, Lifespan, Attributes, EnergyCost, SpecialDmg1, SpecialDmg2, SpecialDPS1, SpecialDPS2, HP2, Armor2, ASString, SplashRadius) " +
                "VALUES (28,'Liberator (fighter mode)', null, 30, 20, null, 0, 2, 0.5, 50, 25, 14, 3.5, null, null, '+15 vs Light, +60 vs Structures'\n" +
                ", 0, null, 8, null, 0.75, 'Ground Weapons Levels 1-3 (+2 each; +4 vs Light; +5 vs Structures), Ground Armor Levels 1-3 (+1 each), & Shields Levels 1-3 (+1 armor to shields each), & Centrifugal Hooks increases Baneling''s speed by 0.63 and HP by 5 researched by Baneling Nest, requires Lair or Hive',\n" +
                "'Explodes upon impact in a decent splash radius, damaging all units in the radius equally.  Due to having only one attack during its life, it does not have DPS values.', null, 'Baneling Nest', null, null, '4.13 with Centrifugal Hooks', 'Roaches, Stalkers, Archons, Marauders, AOE Damage such as Tanks and Storm'," +
                "'Workers, Zerglings, Hydralisks, Marines, Zealots, Other Light Units', 'Zerg    ----  ALL STATS FILLED IN WITH BANELING PLACEHOLDER INFO  ---', '          ','          ', '          ', 'Ground','Hatchery, Lair, or Hive','Ground', 'Until destroyed', 'BL', null, '35 vs Light', '80 vs Structures', null, null, '35 with Centrifugal Hooks', null, null, null)");

        db.execSQL("INSERT INTO " + TABLE_NAME + "(unitID, NAME, Pic1, HP, Dmg1, Dmg2, Armor, Cargo, Supply, Minerals, Vespene, BuildTime, Speed, AttackSpeed1, AttackSpeed2, " +
                "Bonuses, RangevsGround, RangevsAir, LOS, LOS2, unitSize, Upgrades, SpecialAbilities, Energy, TechRequired, Shields, WarpgateCooldown, Speed2, NaturalEnemies, NaturalPrey," +
                "Race, Description, Uses, Lore, GroundAir, BuildsFrom, AttacksGA, Lifespan, Attributes, EnergyCost, SpecialDmg1, SpecialDmg2, SpecialDPS1, SpecialDPS2, HP2, Armor2, ASString, SplashRadius) " +
                "VALUES (29,'Locust', null, 30, 20, null, 0, 2, 0.5, 50, 25, 14, 3.5, null, null, '+15 vs Light, +60 vs Structures'\n" +
                ", 0, null, 8, null, 0.75, 'Ground Weapons Levels 1-3 (+2 each; +4 vs Light; +5 vs Structures), Ground Armor Levels 1-3 (+1 each), & Shields Levels 1-3 (+1 armor to shields each), & Centrifugal Hooks increases Baneling''s speed by 0.63 and HP by 5 researched by Baneling Nest, requires Lair or Hive',\n" +
                "'Explodes upon impact in a decent splash radius, damaging all units in the radius equally.  Due to having only one attack during its life, it does not have DPS values.', null, 'Baneling Nest', null, null, '4.13 with Centrifugal Hooks', 'Roaches, Stalkers, Archons, Marauders, AOE Damage such as Tanks and Storm'," +
                "'Workers, Zerglings, Hydralisks, Marines, Zealots, Other Light Units', 'Zerg    ----  ALL STATS FILLED IN WITH BANELING PLACEHOLDER INFO  ---', '          ','          ', '          ', 'Ground','Hatchery, Lair, or Hive','Ground', 'Until destroyed', 'BL', null, '35 vs Light', '80 vs Structures', null, null, '35 with Centrifugal Hooks', null, null, null)");

        db.execSQL("INSERT INTO " + TABLE_NAME + "(unitID, NAME, Pic1, HP, Dmg1, Dmg2, Armor, Cargo, Supply, Minerals, Vespene, BuildTime, Speed, AttackSpeed1, AttackSpeed2, " +
                "Bonuses, RangevsGround, RangevsAir, LOS, LOS2, unitSize, Upgrades, SpecialAbilities, Energy, TechRequired, Shields, WarpgateCooldown, Speed2, NaturalEnemies, NaturalPrey," +
                "Race, Description, Uses, Lore, GroundAir, BuildsFrom, AttacksGA, Lifespan, Attributes, EnergyCost, SpecialDmg1, SpecialDmg2, SpecialDPS1, SpecialDPS2, HP2, Armor2, ASString, SplashRadius) " +
                "VALUES (30,'Lurker', null, 30, 20, null, 0, 2, 0.5, 50, 25, 14, 3.5, null, null, '+15 vs Light, +60 vs Structures'\n" +
                ", 0, null, 8, null, 0.75, 'Ground Weapons Levels 1-3 (+2 each; +4 vs Light; +5 vs Structures), Ground Armor Levels 1-3 (+1 each), & Shields Levels 1-3 (+1 armor to shields each), & Centrifugal Hooks increases Baneling''s speed by 0.63 and HP by 5 researched by Baneling Nest, requires Lair or Hive',\n" +
                "'Explodes upon impact in a decent splash radius, damaging all units in the radius equally.  Due to having only one attack during its life, it does not have DPS values.', null, 'Baneling Nest', null, null, '4.13 with Centrifugal Hooks', 'Roaches, Stalkers, Archons, Marauders, AOE Damage such as Tanks and Storm'," +
                "'Workers, Zerglings, Hydralisks, Marines, Zealots, Other Light Units', 'Zerg    ----  ALL STATS FILLED IN WITH BANELING PLACEHOLDER INFO  ---', '          ','          ', '          ', 'Ground','Hatchery, Lair, or Hive','Ground', 'Until destroyed', 'BL', null, '35 vs Light', '80 vs Structures', null, null, '35 with Centrifugal Hooks', null, null, null)");

        db.execSQL("INSERT INTO " + TABLE_NAME + "(unitID, NAME, Pic1, HP, Dmg1, Dmg2, Armor, Cargo, Supply, Minerals, Vespene, BuildTime, Speed, AttackSpeed1, AttackSpeed2, " +
                "Bonuses, RangevsGround, RangevsAir, LOS, LOS2, unitSize, Upgrades, SpecialAbilities, Energy, TechRequired, Shields, WarpgateCooldown, Speed2, NaturalEnemies, NaturalPrey," +
                "Race, Description, Uses, Lore, GroundAir, BuildsFrom, AttacksGA, Lifespan, Attributes, EnergyCost, SpecialDmg1, SpecialDmg2, SpecialDPS1, SpecialDPS2, HP2, Armor2, ASString, SplashRadius) " +
                "VALUES (31,'Marauder', null, 30, 20, null, 0, 2, 0.5, 50, 25, 14, 3.5, null, null, '+15 vs Light, +60 vs Structures'\n" +
                ", 0, null, 8, null, 0.75, 'Ground Weapons Levels 1-3 (+2 each; +4 vs Light; +5 vs Structures), Ground Armor Levels 1-3 (+1 each), & Shields Levels 1-3 (+1 armor to shields each), & Centrifugal Hooks increases Baneling''s speed by 0.63 and HP by 5 researched by Baneling Nest, requires Lair or Hive',\n" +
                "'Explodes upon impact in a decent splash radius, damaging all units in the radius equally.  Due to having only one attack during its life, it does not have DPS values.', null, 'Baneling Nest', null, null, '4.13 with Centrifugal Hooks', 'Roaches, Stalkers, Archons, Marauders, AOE Damage such as Tanks and Storm'," +
                "'Workers, Zerglings, Hydralisks, Marines, Zealots, Other Light Units', 'Zerg    ----  ALL STATS FILLED IN WITH BANELING PLACEHOLDER INFO  ---', '          ','          ', '          ', 'Ground','Hatchery, Lair, or Hive','Ground', 'Until destroyed', 'BL', null, '35 vs Light', '80 vs Structures', null, null, '35 with Centrifugal Hooks', null, null, null)");

        db.execSQL("INSERT INTO " + TABLE_NAME + "(unitID, NAME, Pic1, HP, Dmg1, Dmg2, Armor, Cargo, Supply, Minerals, Vespene, BuildTime, Speed, AttackSpeed1, AttackSpeed2, " +
                "Bonuses, RangevsGround, RangevsAir, LOS, LOS2, unitSize, Upgrades, SpecialAbilities, Energy, TechRequired, Shields, WarpgateCooldown, Speed2, NaturalEnemies, NaturalPrey," +
                "Race, Description, Uses, Lore, GroundAir, BuildsFrom, AttacksGA, Lifespan, Attributes, EnergyCost, SpecialDmg1, SpecialDmg2, SpecialDPS1, SpecialDPS2, HP2, Armor2, ASString, SplashRadius) " +
                "VALUES (32,'Marine', null, 30, 20, null, 0, 2, 0.5, 50, 25, 14, 3.5, null, null, '+15 vs Light, +60 vs Structures'\n" +
                ", 0, null, 8, null, 0.75, 'Ground Weapons Levels 1-3 (+2 each; +4 vs Light; +5 vs Structures), Ground Armor Levels 1-3 (+1 each), & Shields Levels 1-3 (+1 armor to shields each), & Centrifugal Hooks increases Baneling''s speed by 0.63 and HP by 5 researched by Baneling Nest, requires Lair or Hive',\n" +
                "'Explodes upon impact in a decent splash radius, damaging all units in the radius equally.  Due to having only one attack during its life, it does not have DPS values.', null, 'Baneling Nest', null, null, '4.13 with Centrifugal Hooks', 'Roaches, Stalkers, Archons, Marauders, AOE Damage such as Tanks and Storm'," +
                "'Workers, Zerglings, Hydralisks, Marines, Zealots, Other Light Units', 'Zerg    ----  ALL STATS FILLED IN WITH BANELING PLACEHOLDER INFO  ---', '          ','          ', '          ', 'Ground','Hatchery, Lair, or Hive','Ground', 'Until destroyed', 'BL', null, '35 vs Light', '80 vs Structures', null, null, '35 with Centrifugal Hooks', null, null, null)");

        db.execSQL("INSERT INTO " + TABLE_NAME + "(unitID, NAME, Pic1, HP, Dmg1, Dmg2, Armor, Cargo, Supply, Minerals, Vespene, BuildTime, Speed, AttackSpeed1, AttackSpeed2, " +
                "Bonuses, RangevsGround, RangevsAir, LOS, LOS2, unitSize, Upgrades, SpecialAbilities, Energy, TechRequired, Shields, WarpgateCooldown, Speed2, NaturalEnemies, NaturalPrey," +
                "Race, Description, Uses, Lore, GroundAir, BuildsFrom, AttacksGA, Lifespan, Attributes, EnergyCost, SpecialDmg1, SpecialDmg2, SpecialDPS1, SpecialDPS2, HP2, Armor2, ASString, SplashRadius) " +
                "VALUES (33,'Medivac', null, 30, 20, null, 0, 2, 0.5, 50, 25, 14, 3.5, null, null, '+15 vs Light, +60 vs Structures'\n" +
                ", 0, null, 8, null, 0.75, 'Ground Weapons Levels 1-3 (+2 each; +4 vs Light; +5 vs Structures), Ground Armor Levels 1-3 (+1 each), & Shields Levels 1-3 (+1 armor to shields each), & Centrifugal Hooks increases Baneling''s speed by 0.63 and HP by 5 researched by Baneling Nest, requires Lair or Hive',\n" +
                "'Explodes upon impact in a decent splash radius, damaging all units in the radius equally.  Due to having only one attack during its life, it does not have DPS values.', null, 'Baneling Nest', null, null, '4.13 with Centrifugal Hooks', 'Roaches, Stalkers, Archons, Marauders, AOE Damage such as Tanks and Storm'," +
                "'Workers, Zerglings, Hydralisks, Marines, Zealots, Other Light Units', 'Zerg    ----  ALL STATS FILLED IN WITH BANELING PLACEHOLDER INFO  ---', '          ','          ', '          ', 'Ground','Hatchery, Lair, or Hive','Ground', 'Until destroyed', 'BL', null, '35 vs Light', '80 vs Structures', null, null, '35 with Centrifugal Hooks', null, null, null)");

        db.execSQL("INSERT INTO " + TABLE_NAME + "(unitID, NAME, Pic1, HP, Dmg1, Dmg2, Armor, Cargo, Supply, Minerals, Vespene, BuildTime, Speed, AttackSpeed1, AttackSpeed2, " +
                "Bonuses, RangevsGround, RangevsAir, LOS, LOS2, unitSize, Upgrades, SpecialAbilities, Energy, TechRequired, Shields, WarpgateCooldown, Speed2, NaturalEnemies, NaturalPrey," +
                "Race, Description, Uses, Lore, GroundAir, BuildsFrom, AttacksGA, Lifespan, Attributes, EnergyCost, SpecialDmg1, SpecialDmg2, SpecialDPS1, SpecialDPS2, HP2, Armor2, ASString, SplashRadius) " +
                "VALUES (34,'Missile Turret', null, 30, 20, null, 0, 2, 0.5, 50, 25, 14, 3.5, null, null, '+15 vs Light, +60 vs Structures'\n" +
                ", 0, null, 8, null, 0.75, 'Ground Weapons Levels 1-3 (+2 each; +4 vs Light; +5 vs Structures), Ground Armor Levels 1-3 (+1 each), & Shields Levels 1-3 (+1 armor to shields each), & Centrifugal Hooks increases Baneling''s speed by 0.63 and HP by 5 researched by Baneling Nest, requires Lair or Hive',\n" +
                "'Explodes upon impact in a decent splash radius, damaging all units in the radius equally.  Due to having only one attack during its life, it does not have DPS values.', null, 'Baneling Nest', null, null, '4.13 with Centrifugal Hooks', 'Roaches, Stalkers, Archons, Marauders, AOE Damage such as Tanks and Storm'," +
                "'Workers, Zerglings, Hydralisks, Marines, Zealots, Other Light Units', 'Zerg    ----  ALL STATS FILLED IN WITH BANELING PLACEHOLDER INFO  ---', '          ','          ', '          ', 'Ground','Hatchery, Lair, or Hive','Ground', 'Until destroyed', 'BL', null, '35 vs Light', '80 vs Structures', null, null, '35 with Centrifugal Hooks', null, null, null)");

        db.execSQL("INSERT INTO " + TABLE_NAME + "(unitID, NAME, Pic1, HP, Dmg1, Dmg2, Armor, Cargo, Supply, Minerals, Vespene, BuildTime, Speed, AttackSpeed1, AttackSpeed2, " +
                "Bonuses, RangevsGround, RangevsAir, LOS, LOS2, unitSize, Upgrades, SpecialAbilities, Energy, TechRequired, Shields, WarpgateCooldown, Speed2, NaturalEnemies, NaturalPrey," +
                "Race, Description, Uses, Lore, GroundAir, BuildsFrom, AttacksGA, Lifespan, Attributes, EnergyCost, SpecialDmg1, SpecialDmg2, SpecialDPS1, SpecialDPS2, HP2, Armor2, ASString, SplashRadius) " +
                "VALUES (35,'Mothership', null, 30, 20, null, 0, 2, 0.5, 50, 25, 14, 3.5, null, null, '+15 vs Light, +60 vs Structures'\n" +
                ", 0, null, 8, null, 0.75, 'Ground Weapons Levels 1-3 (+2 each; +4 vs Light; +5 vs Structures), Ground Armor Levels 1-3 (+1 each), & Shields Levels 1-3 (+1 armor to shields each), & Centrifugal Hooks increases Baneling''s speed by 0.63 and HP by 5 researched by Baneling Nest, requires Lair or Hive',\n" +
                "'Explodes upon impact in a decent splash radius, damaging all units in the radius equally.  Due to having only one attack during its life, it does not have DPS values.', null, 'Baneling Nest', null, null, '4.13 with Centrifugal Hooks', 'Roaches, Stalkers, Archons, Marauders, AOE Damage such as Tanks and Storm'," +
                "'Workers, Zerglings, Hydralisks, Marines, Zealots, Other Light Units', 'Zerg    ----  ALL STATS FILLED IN WITH BANELING PLACEHOLDER INFO  ---', '          ','          ', '          ', 'Ground','Hatchery, Lair, or Hive','Ground', 'Until destroyed', 'BL', null, '35 vs Light', '80 vs Structures', null, null, '35 with Centrifugal Hooks', null, null, null)");

        db.execSQL("INSERT INTO " + TABLE_NAME + "(unitID, NAME, Pic1, HP, Dmg1, Dmg2, Armor, Cargo, Supply, Minerals, Vespene, BuildTime, Speed, AttackSpeed1, AttackSpeed2, " +
                "Bonuses, RangevsGround, RangevsAir, LOS, LOS2, unitSize, Upgrades, SpecialAbilities, Energy, TechRequired, Shields, WarpgateCooldown, Speed2, NaturalEnemies, NaturalPrey," +
                "Race, Description, Uses, Lore, GroundAir, BuildsFrom, AttacksGA, Lifespan, Attributes, EnergyCost, SpecialDmg1, SpecialDmg2, SpecialDPS1, SpecialDPS2, HP2, Armor2, ASString, SplashRadius) " +
                "VALUES (36,'MULE', null, 30, 20, null, 0, 2, 0.5, 50, 25, 14, 3.5, null, null, '+15 vs Light, +60 vs Structures'\n" +
                ", 0, null, 8, null, 0.75, 'Ground Weapons Levels 1-3 (+2 each; +4 vs Light; +5 vs Structures), Ground Armor Levels 1-3 (+1 each), & Shields Levels 1-3 (+1 armor to shields each), & Centrifugal Hooks increases Baneling''s speed by 0.63 and HP by 5 researched by Baneling Nest, requires Lair or Hive',\n" +
                "'Explodes upon impact in a decent splash radius, damaging all units in the radius equally.  Due to having only one attack during its life, it does not have DPS values.', null, 'Baneling Nest', null, null, '4.13 with Centrifugal Hooks', 'Roaches, Stalkers, Archons, Marauders, AOE Damage such as Tanks and Storm'," +
                "'Workers, Zerglings, Hydralisks, Marines, Zealots, Other Light Units', 'Zerg    ----  ALL STATS FILLED IN WITH BANELING PLACEHOLDER INFO  ---', '          ','          ', '          ', 'Ground','Hatchery, Lair, or Hive','Ground', 'Until destroyed', 'BL', null, '35 vs Light', '80 vs Structures', null, null, '35 with Centrifugal Hooks', null, null, null)");

        db.execSQL("INSERT INTO " + TABLE_NAME + "(unitID, NAME, Pic1, HP, Dmg1, Dmg2, Armor, Cargo, Supply, Minerals, Vespene, BuildTime, Speed, AttackSpeed1, AttackSpeed2, " +
                "Bonuses, RangevsGround, RangevsAir, LOS, LOS2, unitSize, Upgrades, SpecialAbilities, Energy, TechRequired, Shields, WarpgateCooldown, Speed2, NaturalEnemies, NaturalPrey," +
                "Race, Description, Uses, Lore, GroundAir, BuildsFrom, AttacksGA, Lifespan, Attributes, EnergyCost, SpecialDmg1, SpecialDmg2, SpecialDPS1, SpecialDPS2, HP2, Armor2, ASString, SplashRadius) " +
                "VALUES (37,'Mutalisk', null, 30, 20, null, 0, 2, 0.5, 50, 25, 14, 3.5, null, null, '+15 vs Light, +60 vs Structures'\n" +
                ", 0, null, 8, null, 0.75, 'Ground Weapons Levels 1-3 (+2 each; +4 vs Light; +5 vs Structures), Ground Armor Levels 1-3 (+1 each), & Shields Levels 1-3 (+1 armor to shields each), & Centrifugal Hooks increases Baneling''s speed by 0.63 and HP by 5 researched by Baneling Nest, requires Lair or Hive',\n" +
                "'Explodes upon impact in a decent splash radius, damaging all units in the radius equally.  Due to having only one attack during its life, it does not have DPS values.', null, 'Baneling Nest', null, null, '4.13 with Centrifugal Hooks', 'Roaches, Stalkers, Archons, Marauders, AOE Damage such as Tanks and Storm'," +
                "'Workers, Zerglings, Hydralisks, Marines, Zealots, Other Light Units', 'Zerg    ----  ALL STATS FILLED IN WITH BANELING PLACEHOLDER INFO  ---', '          ','          ', '          ', 'Ground','Hatchery, Lair, or Hive','Ground', 'Until destroyed', 'BL', null, '35 vs Light', '80 vs Structures', null, null, '35 with Centrifugal Hooks', null, null, null)");

        db.execSQL("INSERT INTO " + TABLE_NAME + "(unitID, NAME, Pic1, HP, Dmg1, Dmg2, Armor, Cargo, Supply, Minerals, Vespene, BuildTime, Speed, AttackSpeed1, AttackSpeed2, " +
                "Bonuses, RangevsGround, RangevsAir, LOS, LOS2, unitSize, Upgrades, SpecialAbilities, Energy, TechRequired, Shields, WarpgateCooldown, Speed2, NaturalEnemies, NaturalPrey," +
                "Race, Description, Uses, Lore, GroundAir, BuildsFrom, AttacksGA, Lifespan, Attributes, EnergyCost, SpecialDmg1, SpecialDmg2, SpecialDPS1, SpecialDPS2, HP2, Armor2, ASString, SplashRadius) " +
                "VALUES (38,'Nydus Worm', null, 30, 20, null, 0, 2, 0.5, 50, 25, 14, 3.5, null, null, '+15 vs Light, +60 vs Structures'\n" +
                ", 0, null, 8, null, 0.75, 'Ground Weapons Levels 1-3 (+2 each; +4 vs Light; +5 vs Structures), Ground Armor Levels 1-3 (+1 each), & Shields Levels 1-3 (+1 armor to shields each), & Centrifugal Hooks increases Baneling''s speed by 0.63 and HP by 5 researched by Baneling Nest, requires Lair or Hive',\n" +
                "'Explodes upon impact in a decent splash radius, damaging all units in the radius equally.  Due to having only one attack during its life, it does not have DPS values.', null, 'Baneling Nest', null, null, '4.13 with Centrifugal Hooks', 'Roaches, Stalkers, Archons, Marauders, AOE Damage such as Tanks and Storm'," +
                "'Workers, Zerglings, Hydralisks, Marines, Zealots, Other Light Units', 'Zerg    ----  ALL STATS FILLED IN WITH BANELING PLACEHOLDER INFO  ---', '          ','          ', '          ', 'Ground','Hatchery, Lair, or Hive','Ground', 'Until destroyed', 'BL', null, '35 vs Light', '80 vs Structures', null, null, '35 with Centrifugal Hooks', null, null, null)");

        db.execSQL("INSERT INTO " + TABLE_NAME + "(unitID, NAME, Pic1, HP, Dmg1, Dmg2, Armor, Cargo, Supply, Minerals, Vespene, BuildTime, Speed, AttackSpeed1, AttackSpeed2, " +
                "Bonuses, RangevsGround, RangevsAir, LOS, LOS2, unitSize, Upgrades, SpecialAbilities, Energy, TechRequired, Shields, WarpgateCooldown, Speed2, NaturalEnemies, NaturalPrey," +
                "Race, Description, Uses, Lore, GroundAir, BuildsFrom, AttacksGA, Lifespan, Attributes, EnergyCost, SpecialDmg1, SpecialDmg2, SpecialDPS1, SpecialDPS2, HP2, Armor2, ASString, SplashRadius) " +
                "VALUES (39,'Observer', null, 30, 20, null, 0, 2, 0.5, 50, 25, 14, 3.5, null, null, '+15 vs Light, +60 vs Structures'\n" +
                ", 0, null, 8, null, 0.75, 'Ground Weapons Levels 1-3 (+2 each; +4 vs Light; +5 vs Structures), Ground Armor Levels 1-3 (+1 each), & Shields Levels 1-3 (+1 armor to shields each), & Centrifugal Hooks increases Baneling''s speed by 0.63 and HP by 5 researched by Baneling Nest, requires Lair or Hive',\n" +
                "'Explodes upon impact in a decent splash radius, damaging all units in the radius equally.  Due to having only one attack during its life, it does not have DPS values.', null, 'Baneling Nest', null, null, '4.13 with Centrifugal Hooks', 'Roaches, Stalkers, Archons, Marauders, AOE Damage such as Tanks and Storm'," +
                "'Workers, Zerglings, Hydralisks, Marines, Zealots, Other Light Units', 'Zerg    ----  ALL STATS FILLED IN WITH BANELING PLACEHOLDER INFO  ---', '          ','          ', '          ', 'Ground','Hatchery, Lair, or Hive','Ground', 'Until destroyed', 'BL', null, '35 vs Light', '80 vs Structures', null, null, '35 with Centrifugal Hooks', null, null, null)");

        db.execSQL("INSERT INTO " + TABLE_NAME + "(unitID, NAME, Pic1, HP, Dmg1, Dmg2, Armor, Cargo, Supply, Minerals, Vespene, BuildTime, Speed, AttackSpeed1, AttackSpeed2, " +
                "Bonuses, RangevsGround, RangevsAir, LOS, LOS2, unitSize, Upgrades, SpecialAbilities, Energy, TechRequired, Shields, WarpgateCooldown, Speed2, NaturalEnemies, NaturalPrey," +
                "Race, Description, Uses, Lore, GroundAir, BuildsFrom, AttacksGA, Lifespan, Attributes, EnergyCost, SpecialDmg1, SpecialDmg2, SpecialDPS1, SpecialDPS2, HP2, Armor2, ASString, SplashRadius) " +
                "VALUES (40,'Oracle', null, 30, 20, null, 0, 2, 0.5, 50, 25, 14, 3.5, null, null, '+15 vs Light, +60 vs Structures'\n" +
                ", 0, null, 8, null, 0.75, 'Ground Weapons Levels 1-3 (+2 each; +4 vs Light; +5 vs Structures), Ground Armor Levels 1-3 (+1 each), & Shields Levels 1-3 (+1 armor to shields each), & Centrifugal Hooks increases Baneling''s speed by 0.63 and HP by 5 researched by Baneling Nest, requires Lair or Hive',\n" +
                "'Explodes upon impact in a decent splash radius, damaging all units in the radius equally.  Due to having only one attack during its life, it does not have DPS values.', null, 'Baneling Nest', null, null, '4.13 with Centrifugal Hooks', 'Roaches, Stalkers, Archons, Marauders, AOE Damage such as Tanks and Storm'," +
                "'Workers, Zerglings, Hydralisks, Marines, Zealots, Other Light Units', 'Zerg    ----  ALL STATS FILLED IN WITH BANELING PLACEHOLDER INFO  ---', '          ','          ', '          ', 'Ground','Hatchery, Lair, or Hive','Ground', 'Until destroyed', 'BL', null, '35 vs Light', '80 vs Structures', null, null, '35 with Centrifugal Hooks', null, null, null)");

        db.execSQL("INSERT INTO " + TABLE_NAME + "(unitID, NAME, Pic1, HP, Dmg1, Dmg2, Armor, Cargo, Supply, Minerals, Vespene, BuildTime, Speed, AttackSpeed1, AttackSpeed2, " +
                "Bonuses, RangevsGround, RangevsAir, LOS, LOS2, unitSize, Upgrades, SpecialAbilities, Energy, TechRequired, Shields, WarpgateCooldown, Speed2, NaturalEnemies, NaturalPrey," +
                "Race, Description, Uses, Lore, GroundAir, BuildsFrom, AttacksGA, Lifespan, Attributes, EnergyCost, SpecialDmg1, SpecialDmg2, SpecialDPS1, SpecialDPS2, HP2, Armor2, ASString, SplashRadius) " +
                "VALUES (41,'Overlord', null, 30, 20, null, 0, 2, 0.5, 50, 25, 14, 3.5, null, null, '+15 vs Light, +60 vs Structures'\n" +
                ", 0, null, 8, null, 0.75, 'Ground Weapons Levels 1-3 (+2 each; +4 vs Light; +5 vs Structures), Ground Armor Levels 1-3 (+1 each), & Shields Levels 1-3 (+1 armor to shields each), & Centrifugal Hooks increases Baneling''s speed by 0.63 and HP by 5 researched by Baneling Nest, requires Lair or Hive',\n" +
                "'Explodes upon impact in a decent splash radius, damaging all units in the radius equally.  Due to having only one attack during its life, it does not have DPS values.', null, 'Baneling Nest', null, null, '4.13 with Centrifugal Hooks', 'Roaches, Stalkers, Archons, Marauders, AOE Damage such as Tanks and Storm'," +
                "'Workers, Zerglings, Hydralisks, Marines, Zealots, Other Light Units', 'Zerg    ----  ALL STATS FILLED IN WITH BANELING PLACEHOLDER INFO  ---', '          ','          ', '          ', 'Ground','Hatchery, Lair, or Hive','Ground', 'Until destroyed', 'BL', null, '35 vs Light', '80 vs Structures', null, null, '35 with Centrifugal Hooks', null, null, null)");

        db.execSQL("INSERT INTO " + TABLE_NAME + "(unitID, NAME, Pic1, HP, Dmg1, Dmg2, Armor, Cargo, Supply, Minerals, Vespene, BuildTime, Speed, AttackSpeed1, AttackSpeed2, " +
                "Bonuses, RangevsGround, RangevsAir, LOS, LOS2, unitSize, Upgrades, SpecialAbilities, Energy, TechRequired, Shields, WarpgateCooldown, Speed2, NaturalEnemies, NaturalPrey," +
                "Race, Description, Uses, Lore, GroundAir, BuildsFrom, AttacksGA, Lifespan, Attributes, EnergyCost, SpecialDmg1, SpecialDmg2, SpecialDPS1, SpecialDPS2, HP2, Armor2, ASString, SplashRadius) " +
                "VALUES (42,'Overseer', null, 30, 20, null, 0, 2, 0.5, 50, 25, 14, 3.5, null, null, '+15 vs Light, +60 vs Structures'\n" +
                ", 0, null, 8, null, 0.75, 'Ground Weapons Levels 1-3 (+2 each; +4 vs Light; +5 vs Structures), Ground Armor Levels 1-3 (+1 each), & Shields Levels 1-3 (+1 armor to shields each), & Centrifugal Hooks increases Baneling''s speed by 0.63 and HP by 5 researched by Baneling Nest, requires Lair or Hive',\n" +
                "'Explodes upon impact in a decent splash radius, damaging all units in the radius equally.  Due to having only one attack during its life, it does not have DPS values.', null, 'Baneling Nest', null, null, '4.13 with Centrifugal Hooks', 'Roaches, Stalkers, Archons, Marauders, AOE Damage such as Tanks and Storm'," +
                "'Workers, Zerglings, Hydralisks, Marines, Zealots, Other Light Units', 'Zerg    ----  ALL STATS FILLED IN WITH BANELING PLACEHOLDER INFO  ---', '          ','          ', '          ', 'Ground','Hatchery, Lair, or Hive','Ground', 'Until destroyed', 'BL', null, '35 vs Light', '80 vs Structures', null, null, '35 with Centrifugal Hooks', null, null, null)");

        db.execSQL("INSERT INTO " + TABLE_NAME + "(unitID, NAME, Pic1, HP, Dmg1, Dmg2, Armor, Cargo, Supply, Minerals, Vespene, BuildTime, Speed, AttackSpeed1, AttackSpeed2, " +
                "Bonuses, RangevsGround, RangevsAir, LOS, LOS2, unitSize, Upgrades, SpecialAbilities, Energy, TechRequired, Shields, WarpgateCooldown, Speed2, NaturalEnemies, NaturalPrey," +
                "Race, Description, Uses, Lore, GroundAir, BuildsFrom, AttacksGA, Lifespan, Attributes, EnergyCost, SpecialDmg1, SpecialDmg2, SpecialDPS1, SpecialDPS2, HP2, Armor2, ASString, SplashRadius) " +
                "VALUES (43,'Phoenix', null, 30, 20, null, 0, 2, 0.5, 50, 25, 14, 3.5, null, null, '+15 vs Light, +60 vs Structures'\n" +
                ", 0, null, 8, null, 0.75, 'Ground Weapons Levels 1-3 (+2 each; +4 vs Light; +5 vs Structures), Ground Armor Levels 1-3 (+1 each), & Shields Levels 1-3 (+1 armor to shields each), & Centrifugal Hooks increases Baneling''s speed by 0.63 and HP by 5 researched by Baneling Nest, requires Lair or Hive',\n" +
                "'Explodes upon impact in a decent splash radius, damaging all units in the radius equally.  Due to having only one attack during its life, it does not have DPS values.', null, 'Baneling Nest', null, null, '4.13 with Centrifugal Hooks', 'Roaches, Stalkers, Archons, Marauders, AOE Damage such as Tanks and Storm'," +
                "'Workers, Zerglings, Hydralisks, Marines, Zealots, Other Light Units', 'Zerg    ----  ALL STATS FILLED IN WITH BANELING PLACEHOLDER INFO  ---', '          ','          ', '          ', 'Ground','Hatchery, Lair, or Hive','Ground', 'Until destroyed', 'BL', null, '35 vs Light', '80 vs Structures', null, null, '35 with Centrifugal Hooks', null, null, null)");

        db.execSQL("INSERT INTO " + TABLE_NAME + "(unitID, NAME, Pic1, HP, Dmg1, Dmg2, Armor, Cargo, Supply, Minerals, Vespene, BuildTime, Speed, AttackSpeed1, AttackSpeed2, " +
                "Bonuses, RangevsGround, RangevsAir, LOS, LOS2, unitSize, Upgrades, SpecialAbilities, Energy, TechRequired, Shields, WarpgateCooldown, Speed2, NaturalEnemies, NaturalPrey," +
                "Race, Description, Uses, Lore, GroundAir, BuildsFrom, AttacksGA, Lifespan, Attributes, EnergyCost, SpecialDmg1, SpecialDmg2, SpecialDPS1, SpecialDPS2, HP2, Armor2, ASString, SplashRadius) " +
                "VALUES (44,'Photon Cannon', null, 30, 20, null, 0, 2, 0.5, 50, 25, 14, 3.5, null, null, '+15 vs Light, +60 vs Structures'\n" +
                ", 0, null, 8, null, 0.75, 'Ground Weapons Levels 1-3 (+2 each; +4 vs Light; +5 vs Structures), Ground Armor Levels 1-3 (+1 each), & Shields Levels 1-3 (+1 armor to shields each), & Centrifugal Hooks increases Baneling''s speed by 0.63 and HP by 5 researched by Baneling Nest, requires Lair or Hive',\n" +
                "'Explodes upon impact in a decent splash radius, damaging all units in the radius equally.  Due to having only one attack during its life, it does not have DPS values.', null, 'Baneling Nest', null, null, '4.13 with Centrifugal Hooks', 'Roaches, Stalkers, Archons, Marauders, AOE Damage such as Tanks and Storm'," +
                "'Workers, Zerglings, Hydralisks, Marines, Zealots, Other Light Units', 'Zerg    ----  ALL STATS FILLED IN WITH BANELING PLACEHOLDER INFO  ---', '          ','          ', '          ', 'Ground','Hatchery, Lair, or Hive','Ground', 'Until destroyed', 'BL', null, '35 vs Light', '80 vs Structures', null, null, '35 with Centrifugal Hooks', null, null, null)");

        db.execSQL("INSERT INTO " + TABLE_NAME + "(unitID, NAME, Pic1, HP, Dmg1, Dmg2, Armor, Cargo, Supply, Minerals, Vespene, BuildTime, Speed, AttackSpeed1, AttackSpeed2, " +
                "Bonuses, RangevsGround, RangevsAir, LOS, LOS2, unitSize, Upgrades, SpecialAbilities, Energy, TechRequired, Shields, WarpgateCooldown, Speed2, NaturalEnemies, NaturalPrey," +
                "Race, Description, Uses, Lore, GroundAir, BuildsFrom, AttacksGA, Lifespan, Attributes, EnergyCost, SpecialDmg1, SpecialDmg2, SpecialDPS1, SpecialDPS2, HP2, Armor2, ASString, SplashRadius) " +
                "VALUES (45,'Planetary Fortress', null, 30, 20, null, 0, 2, 0.5, 50, 25, 14, 3.5, null, null, '+15 vs Light, +60 vs Structures'\n" +
                ", 0, null, 8, null, 0.75, 'Ground Weapons Levels 1-3 (+2 each; +4 vs Light; +5 vs Structures), Ground Armor Levels 1-3 (+1 each), & Shields Levels 1-3 (+1 armor to shields each), & Centrifugal Hooks increases Baneling''s speed by 0.63 and HP by 5 researched by Baneling Nest, requires Lair or Hive',\n" +
                "'Explodes upon impact in a decent splash radius, damaging all units in the radius equally.  Due to having only one attack during its life, it does not have DPS values.', null, 'Baneling Nest', null, null, '4.13 with Centrifugal Hooks', 'Roaches, Stalkers, Archons, Marauders, AOE Damage such as Tanks and Storm'," +
                "'Workers, Zerglings, Hydralisks, Marines, Zealots, Other Light Units', 'Zerg    ----  ALL STATS FILLED IN WITH BANELING PLACEHOLDER INFO  ---', '          ','          ', '          ', 'Ground','Hatchery, Lair, or Hive','Ground', 'Until destroyed', 'BL', null, '35 vs Light', '80 vs Structures', null, null, '35 with Centrifugal Hooks', null, null, null)");

        db.execSQL("INSERT INTO " + TABLE_NAME + "(unitID, NAME, Pic1, HP, Dmg1, Dmg2, Armor, Cargo, Supply, Minerals, Vespene, BuildTime, Speed, AttackSpeed1, AttackSpeed2, " +
                "Bonuses, RangevsGround, RangevsAir, LOS, LOS2, unitSize, Upgrades, SpecialAbilities, Energy, TechRequired, Shields, WarpgateCooldown, Speed2, NaturalEnemies, NaturalPrey," +
                "Race, Description, Uses, Lore, GroundAir, BuildsFrom, AttacksGA, Lifespan, Attributes, EnergyCost, SpecialDmg1, SpecialDmg2, SpecialDPS1, SpecialDPS2, HP2, Armor2, ASString, SplashRadius) " +
                "VALUES (46,'Probe', null, 30, 20, null, 0, 2, 0.5, 50, 25, 14, 3.5, null, null, '+15 vs Light, +60 vs Structures'\n" +
                ", 0, null, 8, null, 0.75, 'Ground Weapons Levels 1-3 (+2 each; +4 vs Light; +5 vs Structures), Ground Armor Levels 1-3 (+1 each), & Shields Levels 1-3 (+1 armor to shields each), & Centrifugal Hooks increases Baneling''s speed by 0.63 and HP by 5 researched by Baneling Nest, requires Lair or Hive',\n" +
                "'Explodes upon impact in a decent splash radius, damaging all units in the radius equally.  Due to having only one attack during its life, it does not have DPS values.', null, 'Baneling Nest', null, null, '4.13 with Centrifugal Hooks', 'Roaches, Stalkers, Archons, Marauders, AOE Damage such as Tanks and Storm'," +
                "'Workers, Zerglings, Hydralisks, Marines, Zealots, Other Light Units', 'Zerg    ----  ALL STATS FILLED IN WITH BANELING PLACEHOLDER INFO  ---', '          ','          ', '          ', 'Ground','Hatchery, Lair, or Hive','Ground', 'Until destroyed', 'BL', null, '35 vs Light', '80 vs Structures', null, null, '35 with Centrifugal Hooks', null, null, null)");

        db.execSQL("INSERT INTO " + TABLE_NAME + "(unitID, NAME, Pic1, HP, Dmg1, Dmg2, Armor, Cargo, Supply, Minerals, Vespene, BuildTime, Speed, AttackSpeed1, AttackSpeed2, " +
                "Bonuses, RangevsGround, RangevsAir, LOS, LOS2, unitSize, Upgrades, SpecialAbilities, Energy, TechRequired, Shields, WarpgateCooldown, Speed2, NaturalEnemies, NaturalPrey," +
                "Race, Description, Uses, Lore, GroundAir, BuildsFrom, AttacksGA, Lifespan, Attributes, EnergyCost, SpecialDmg1, SpecialDmg2, SpecialDPS1, SpecialDPS2, HP2, Armor2, ASString, SplashRadius) " +
                "VALUES (47,'Queen', null, 30, 20, null, 0, 2, 0.5, 50, 25, 14, 3.5, null, null, '+15 vs Light, +60 vs Structures'\n" +
                ", 0, null, 8, null, 0.75, 'Ground Weapons Levels 1-3 (+2 each; +4 vs Light; +5 vs Structures), Ground Armor Levels 1-3 (+1 each), & Shields Levels 1-3 (+1 armor to shields each), & Centrifugal Hooks increases Baneling''s speed by 0.63 and HP by 5 researched by Baneling Nest, requires Lair or Hive',\n" +
                "'Explodes upon impact in a decent splash radius, damaging all units in the radius equally.  Due to having only one attack during its life, it does not have DPS values.', null, 'Baneling Nest', null, null, '4.13 with Centrifugal Hooks', 'Roaches, Stalkers, Archons, Marauders, AOE Damage such as Tanks and Storm'," +
                "'Workers, Zerglings, Hydralisks, Marines, Zealots, Other Light Units', 'Zerg    ----  ALL STATS FILLED IN WITH BANELING PLACEHOLDER INFO  ---', '          ','          ', '          ', 'Ground','Hatchery, Lair, or Hive','Ground', 'Until destroyed', 'BL', null, '35 vs Light', '80 vs Structures', null, null, '35 with Centrifugal Hooks', null, null, null)");

        db.execSQL("INSERT INTO " + TABLE_NAME + "(unitID, NAME, Pic1, HP, Dmg1, Dmg2, Armor, Cargo, Supply, Minerals, Vespene, BuildTime, Speed, AttackSpeed1, AttackSpeed2, " +
                "Bonuses, RangevsGround, RangevsAir, LOS, LOS2, unitSize, Upgrades, SpecialAbilities, Energy, TechRequired, Shields, WarpgateCooldown, Speed2, NaturalEnemies, NaturalPrey," +
                "Race, Description, Uses, Lore, GroundAir, BuildsFrom, AttacksGA, Lifespan, Attributes, EnergyCost, SpecialDmg1, SpecialDmg2, SpecialDPS1, SpecialDPS2, HP2, Armor2, ASString, SplashRadius) " +
                "VALUES (48,'Ravager', null, 30, 20, null, 0, 2, 0.5, 50, 25, 14, 3.5, null, null, '+15 vs Light, +60 vs Structures'\n" +
                ", 0, null, 8, null, 0.75, 'Ground Weapons Levels 1-3 (+2 each; +4 vs Light; +5 vs Structures), Ground Armor Levels 1-3 (+1 each), & Shields Levels 1-3 (+1 armor to shields each), & Centrifugal Hooks increases Baneling''s speed by 0.63 and HP by 5 researched by Baneling Nest, requires Lair or Hive',\n" +
                "'Explodes upon impact in a decent splash radius, damaging all units in the radius equally.  Due to having only one attack during its life, it does not have DPS values.', null, 'Baneling Nest', null, null, '4.13 with Centrifugal Hooks', 'Roaches, Stalkers, Archons, Marauders, AOE Damage such as Tanks and Storm'," +
                "'Workers, Zerglings, Hydralisks, Marines, Zealots, Other Light Units', 'Zerg    ----  ALL STATS FILLED IN WITH BANELING PLACEHOLDER INFO  ---', '          ','          ', '          ', 'Ground','Hatchery, Lair, or Hive','Ground', 'Until destroyed', 'BL', null, '35 vs Light', '80 vs Structures', null, null, '35 with Centrifugal Hooks', null, null, null)");

        db.execSQL("INSERT INTO " + TABLE_NAME + "(unitID, NAME, Pic1, HP, Dmg1, Dmg2, Armor, Cargo, Supply, Minerals, Vespene, BuildTime, Speed, AttackSpeed1, AttackSpeed2, " +
                "Bonuses, RangevsGround, RangevsAir, LOS, LOS2, unitSize, Upgrades, SpecialAbilities, Energy, TechRequired, Shields, WarpgateCooldown, Speed2, NaturalEnemies, NaturalPrey," +
                "Race, Description, Uses, Lore, GroundAir, BuildsFrom, AttacksGA, Lifespan, Attributes, EnergyCost, SpecialDmg1, SpecialDmg2, SpecialDPS1, SpecialDPS2, HP2, Armor2, ASString, SplashRadius) " +
                "VALUES (49,'Raven', null, 30, 20, null, 0, 2, 0.5, 50, 25, 14, 3.5, null, null, '+15 vs Light, +60 vs Structures'\n" +
                ", 0, null, 8, null, 0.75, 'Ground Weapons Levels 1-3 (+2 each; +4 vs Light; +5 vs Structures), Ground Armor Levels 1-3 (+1 each), & Shields Levels 1-3 (+1 armor to shields each), & Centrifugal Hooks increases Baneling''s speed by 0.63 and HP by 5 researched by Baneling Nest, requires Lair or Hive',\n" +
                "'Explodes upon impact in a decent splash radius, damaging all units in the radius equally.  Due to having only one attack during its life, it does not have DPS values.', null, 'Baneling Nest', null, null, '4.13 with Centrifugal Hooks', 'Roaches, Stalkers, Archons, Marauders, AOE Damage such as Tanks and Storm'," +
                "'Workers, Zerglings, Hydralisks, Marines, Zealots, Other Light Units', 'Zerg    ----  ALL STATS FILLED IN WITH BANELING PLACEHOLDER INFO  ---', '          ','          ', '          ', 'Ground','Hatchery, Lair, or Hive','Ground', 'Until destroyed', 'BL', null, '35 vs Light', '80 vs Structures', null, null, '35 with Centrifugal Hooks', null, null, null)");

        db.execSQL("INSERT INTO " + TABLE_NAME + "(unitID, NAME, Pic1, HP, Dmg1, Dmg2, Armor, Cargo, Supply, Minerals, Vespene, BuildTime, Speed, AttackSpeed1, AttackSpeed2, " +
                "Bonuses, RangevsGround, RangevsAir, LOS, LOS2, unitSize, Upgrades, SpecialAbilities, Energy, TechRequired, Shields, WarpgateCooldown, Speed2, NaturalEnemies, NaturalPrey," +
                "Race, Description, Uses, Lore, GroundAir, BuildsFrom, AttacksGA, Lifespan, Attributes, EnergyCost, SpecialDmg1, SpecialDmg2, SpecialDPS1, SpecialDPS2, HP2, Armor2, ASString, SplashRadius) " +
                "VALUES (50,'Reaper', null, 30, 20, null, 0, 2, 0.5, 50, 25, 14, 3.5, null, null, '+15 vs Light, +60 vs Structures'\n" +
                ", 0, null, 8, null, 0.75, 'Ground Weapons Levels 1-3 (+2 each; +4 vs Light; +5 vs Structures), Ground Armor Levels 1-3 (+1 each), & Shields Levels 1-3 (+1 armor to shields each), & Centrifugal Hooks increases Baneling''s speed by 0.63 and HP by 5 researched by Baneling Nest, requires Lair or Hive',\n" +
                "'Explodes upon impact in a decent splash radius, damaging all units in the radius equally.  Due to having only one attack during its life, it does not have DPS values.', null, 'Baneling Nest', null, null, '4.13 with Centrifugal Hooks', 'Roaches, Stalkers, Archons, Marauders, AOE Damage such as Tanks and Storm'," +
                "'Workers, Zerglings, Hydralisks, Marines, Zealots, Other Light Units', 'Zerg    ----  ALL STATS FILLED IN WITH BANELING PLACEHOLDER INFO  ---', '          ','          ', '          ', 'Ground','Hatchery, Lair, or Hive','Ground', 'Until destroyed', 'BL', null, '35 vs Light', '80 vs Structures', null, null, '35 with Centrifugal Hooks', null, null, null)");

        db.execSQL("INSERT INTO " + TABLE_NAME + "(unitID, NAME, Pic1, HP, Dmg1, Dmg2, Armor, Cargo, Supply, Minerals, Vespene, BuildTime, Speed, AttackSpeed1, AttackSpeed2, " +
                "Bonuses, RangevsGround, RangevsAir, LOS, LOS2, unitSize, Upgrades, SpecialAbilities, Energy, TechRequired, Shields, WarpgateCooldown, Speed2, NaturalEnemies, NaturalPrey," +
                "Race, Description, Uses, Lore, GroundAir, BuildsFrom, AttacksGA, Lifespan, Attributes, EnergyCost, SpecialDmg1, SpecialDmg2, SpecialDPS1, SpecialDPS2, HP2, Armor2, ASString, SplashRadius) " +
                "VALUES (51,'Roach', null, 30, 20, null, 0, 2, 0.5, 50, 25, 14, 3.5, null, null, '+15 vs Light, +60 vs Structures'\n" +
                ", 0, null, 8, null, 0.75, 'Ground Weapons Levels 1-3 (+2 each; +4 vs Light; +5 vs Structures), Ground Armor Levels 1-3 (+1 each), & Shields Levels 1-3 (+1 armor to shields each), & Centrifugal Hooks increases Baneling''s speed by 0.63 and HP by 5 researched by Baneling Nest, requires Lair or Hive',\n" +
                "'Explodes upon impact in a decent splash radius, damaging all units in the radius equally.  Due to having only one attack during its life, it does not have DPS values.', null, 'Baneling Nest', null, null, '4.13 with Centrifugal Hooks', 'Roaches, Stalkers, Archons, Marauders, AOE Damage such as Tanks and Storm'," +
                "'Workers, Zerglings, Hydralisks, Marines, Zealots, Other Light Units', 'Zerg    ----  ALL STATS FILLED IN WITH BANELING PLACEHOLDER INFO  ---', '          ','          ', '          ', 'Ground','Hatchery, Lair, or Hive','Ground', 'Until destroyed', 'BL', null, '35 vs Light', '80 vs Structures', null, null, '35 with Centrifugal Hooks', null, null, null)");

        db.execSQL("INSERT INTO " + TABLE_NAME + "(unitID, NAME, Pic1, HP, Dmg1, Dmg2, Armor, Cargo, Supply, Minerals, Vespene, BuildTime, Speed, AttackSpeed1, AttackSpeed2, " +
                "Bonuses, RangevsGround, RangevsAir, LOS, LOS2, unitSize, Upgrades, SpecialAbilities, Energy, TechRequired, Shields, WarpgateCooldown, Speed2, NaturalEnemies, NaturalPrey," +
                "Race, Description, Uses, Lore, GroundAir, BuildsFrom, AttacksGA, Lifespan, Attributes, EnergyCost, SpecialDmg1, SpecialDmg2, SpecialDPS1, SpecialDPS2, HP2, Armor2, ASString, SplashRadius) " +
                "VALUES (52,'SCV', null, 30, 20, null, 0, 2, 0.5, 50, 25, 14, 3.5, null, null, '+15 vs Light, +60 vs Structures'\n" +
                ", 0, null, 8, null, 0.75, 'Ground Weapons Levels 1-3 (+2 each; +4 vs Light; +5 vs Structures), Ground Armor Levels 1-3 (+1 each), & Shields Levels 1-3 (+1 armor to shields each), & Centrifugal Hooks increases Baneling''s speed by 0.63 and HP by 5 researched by Baneling Nest, requires Lair or Hive',\n" +
                "'Explodes upon impact in a decent splash radius, damaging all units in the radius equally.  Due to having only one attack during its life, it does not have DPS values.', null, 'Baneling Nest', null, null, '4.13 with Centrifugal Hooks', 'Roaches, Stalkers, Archons, Marauders, AOE Damage such as Tanks and Storm'," +
                "'Workers, Zerglings, Hydralisks, Marines, Zealots, Other Light Units', 'Zerg    ----  ALL STATS FILLED IN WITH BANELING PLACEHOLDER INFO  ---', '          ','          ', '          ', 'Ground','Hatchery, Lair, or Hive','Ground', 'Until destroyed', 'BL', null, '35 vs Light', '80 vs Structures', null, null, '35 with Centrifugal Hooks', null, null, null)");

        db.execSQL("INSERT INTO " + TABLE_NAME + "(unitID, NAME, Pic1, HP, Dmg1, Dmg2, Armor, Cargo, Supply, Minerals, Vespene, BuildTime, Speed, AttackSpeed1, AttackSpeed2, " +
                "Bonuses, RangevsGround, RangevsAir, LOS, LOS2, unitSize, Upgrades, SpecialAbilities, Energy, TechRequired, Shields, WarpgateCooldown, Speed2, NaturalEnemies, NaturalPrey," +
                "Race, Description, Uses, Lore, GroundAir, BuildsFrom, AttacksGA, Lifespan, Attributes, EnergyCost, SpecialDmg1, SpecialDmg2, SpecialDPS1, SpecialDPS2, HP2, Armor2, ASString, SplashRadius) " +
                "VALUES (53,'Sentry', null, 30, 20, null, 0, 2, 0.5, 50, 25, 14, 3.5, null, null, '+15 vs Light, +60 vs Structures'\n" +
                ", 0, null, 8, null, 0.75, 'Ground Weapons Levels 1-3 (+2 each; +4 vs Light; +5 vs Structures), Ground Armor Levels 1-3 (+1 each), & Shields Levels 1-3 (+1 armor to shields each), & Centrifugal Hooks increases Baneling''s speed by 0.63 and HP by 5 researched by Baneling Nest, requires Lair or Hive',\n" +
                "'Explodes upon impact in a decent splash radius, damaging all units in the radius equally.  Due to having only one attack during its life, it does not have DPS values.', null, 'Baneling Nest', null, null, '4.13 with Centrifugal Hooks', 'Roaches, Stalkers, Archons, Marauders, AOE Damage such as Tanks and Storm'," +
                "'Workers, Zerglings, Hydralisks, Marines, Zealots, Other Light Units', 'Zerg    ----  ALL STATS FILLED IN WITH BANELING PLACEHOLDER INFO  ---', '          ','          ', '          ', 'Ground','Hatchery, Lair, or Hive','Ground', 'Until destroyed', 'BL', null, '35 vs Light', '80 vs Structures', null, null, '35 with Centrifugal Hooks', null, null, null)");

        db.execSQL("INSERT INTO " + TABLE_NAME + "(unitID, NAME, Pic1, HP, Dmg1, Dmg2, Armor, Cargo, Supply, Minerals, Vespene, BuildTime, Speed, AttackSpeed1, AttackSpeed2, " +
                "Bonuses, RangevsGround, RangevsAir, LOS, LOS2, unitSize, Upgrades, SpecialAbilities, Energy, TechRequired, Shields, WarpgateCooldown, Speed2, NaturalEnemies, NaturalPrey," +
                "Race, Description, Uses, Lore, GroundAir, BuildsFrom, AttacksGA, Lifespan, Attributes, EnergyCost, SpecialDmg1, SpecialDmg2, SpecialDPS1, SpecialDPS2, HP2, Armor2, ASString, SplashRadius) " +
                "VALUES (54,'Siege Tank (sieged)', null, 30, 20, null, 0, 2, 0.5, 50, 25, 14, 3.5, null, null, '+15 vs Light, +60 vs Structures'\n" +
                ", 0, null, 8, null, 0.75, 'Ground Weapons Levels 1-3 (+2 each; +4 vs Light; +5 vs Structures), Ground Armor Levels 1-3 (+1 each), & Shields Levels 1-3 (+1 armor to shields each), & Centrifugal Hooks increases Baneling''s speed by 0.63 and HP by 5 researched by Baneling Nest, requires Lair or Hive',\n" +
                "'Explodes upon impact in a decent splash radius, damaging all units in the radius equally.  Due to having only one attack during its life, it does not have DPS values.', null, 'Baneling Nest', null, null, '4.13 with Centrifugal Hooks', 'Roaches, Stalkers, Archons, Marauders, AOE Damage such as Tanks and Storm'," +
                "'Workers, Zerglings, Hydralisks, Marines, Zealots, Other Light Units', 'Zerg    ----  ALL STATS FILLED IN WITH BANELING PLACEHOLDER INFO  ---', '          ','          ', '          ', 'Ground','Hatchery, Lair, or Hive','Ground', 'Until destroyed', 'BL', null, '35 vs Light', '80 vs Structures', null, null, '35 with Centrifugal Hooks', null, null, null)");

        db.execSQL("INSERT INTO " + TABLE_NAME + "(unitID, NAME, Pic1, HP, Dmg1, Dmg2, Armor, Cargo, Supply, Minerals, Vespene, BuildTime, Speed, AttackSpeed1, AttackSpeed2, " +
                "Bonuses, RangevsGround, RangevsAir, LOS, LOS2, unitSize, Upgrades, SpecialAbilities, Energy, TechRequired, Shields, WarpgateCooldown, Speed2, NaturalEnemies, NaturalPrey," +
                "Race, Description, Uses, Lore, GroundAir, BuildsFrom, AttacksGA, Lifespan, Attributes, EnergyCost, SpecialDmg1, SpecialDmg2, SpecialDPS1, SpecialDPS2, HP2, Armor2, ASString, SplashRadius) " +
                "VALUES (55,'Siege Tank (tank mode)', null, 30, 20, null, 0, 2, 0.5, 50, 25, 14, 3.5, null, null, '+15 vs Light, +60 vs Structures'\n" +
                ", 0, null, 8, null, 0.75, 'Ground Weapons Levels 1-3 (+2 each; +4 vs Light; +5 vs Structures), Ground Armor Levels 1-3 (+1 each), & Shields Levels 1-3 (+1 armor to shields each), & Centrifugal Hooks increases Baneling''s speed by 0.63 and HP by 5 researched by Baneling Nest, requires Lair or Hive',\n" +
                "'Explodes upon impact in a decent splash radius, damaging all units in the radius equally.  Due to having only one attack during its life, it does not have DPS values.', null, 'Baneling Nest', null, null, '4.13 with Centrifugal Hooks', 'Roaches, Stalkers, Archons, Marauders, AOE Damage such as Tanks and Storm'," +
                "'Workers, Zerglings, Hydralisks, Marines, Zealots, Other Light Units', 'Zerg    ----  ALL STATS FILLED IN WITH BANELING PLACEHOLDER INFO  ---', '          ','          ', '          ', 'Ground','Hatchery, Lair, or Hive','Ground', 'Until destroyed', 'BL', null, '35 vs Light', '80 vs Structures', null, null, '35 with Centrifugal Hooks', null, null, null)");

        db.execSQL("INSERT INTO " + TABLE_NAME + "(unitID, NAME, Pic1, HP, Dmg1, Dmg2, Armor, Cargo, Supply, Minerals, Vespene, BuildTime, Speed, AttackSpeed1, AttackSpeed2, " +
                "Bonuses, RangevsGround, RangevsAir, LOS, LOS2, unitSize, Upgrades, SpecialAbilities, Energy, TechRequired, Shields, WarpgateCooldown, Speed2, NaturalEnemies, NaturalPrey," +
                "Race, Description, Uses, Lore, GroundAir, BuildsFrom, AttacksGA, Lifespan, Attributes, EnergyCost, SpecialDmg1, SpecialDmg2, SpecialDPS1, SpecialDPS2, HP2, Armor2, ASString, SplashRadius) " +
                "VALUES (56,'Spine Crawler', null, 30, 20, null, 0, 2, 0.5, 50, 25, 14, 3.5, null, null, '+15 vs Light, +60 vs Structures'\n" +
                ", 0, null, 8, null, 0.75, 'Ground Weapons Levels 1-3 (+2 each; +4 vs Light; +5 vs Structures), Ground Armor Levels 1-3 (+1 each), & Shields Levels 1-3 (+1 armor to shields each), & Centrifugal Hooks increases Baneling''s speed by 0.63 and HP by 5 researched by Baneling Nest, requires Lair or Hive',\n" +
                "'Explodes upon impact in a decent splash radius, damaging all units in the radius equally.  Due to having only one attack during its life, it does not have DPS values.', null, 'Baneling Nest', null, null, '4.13 with Centrifugal Hooks', 'Roaches, Stalkers, Archons, Marauders, AOE Damage such as Tanks and Storm'," +
                "'Workers, Zerglings, Hydralisks, Marines, Zealots, Other Light Units', 'Zerg    ----  ALL STATS FILLED IN WITH BANELING PLACEHOLDER INFO  ---', '          ','          ', '          ', 'Ground','Hatchery, Lair, or Hive','Ground', 'Until destroyed', 'BL', null, '35 vs Light', '80 vs Structures', null, null, '35 with Centrifugal Hooks', null, null, null)");

        db.execSQL("INSERT INTO " + TABLE_NAME + "(unitID, NAME, Pic1, HP, Dmg1, Dmg2, Armor, Cargo, Supply, Minerals, Vespene, BuildTime, Speed, AttackSpeed1, AttackSpeed2, " +
                "Bonuses, RangevsGround, RangevsAir, LOS, LOS2, unitSize, Upgrades, SpecialAbilities, Energy, TechRequired, Shields, WarpgateCooldown, Speed2, NaturalEnemies, NaturalPrey," +
                "Race, Description, Uses, Lore, GroundAir, BuildsFrom, AttacksGA, Lifespan, Attributes, EnergyCost, SpecialDmg1, SpecialDmg2, SpecialDPS1, SpecialDPS2, HP2, Armor2, ASString, SplashRadius) " +
                "VALUES (57,'Spore Crawler', null, 30, 20, null, 0, 2, 0.5, 50, 25, 14, 3.5, null, null, '+15 vs Light, +60 vs Structures'\n" +
                ", 0, null, 8, null, 0.75, 'Ground Weapons Levels 1-3 (+2 each; +4 vs Light; +5 vs Structures), Ground Armor Levels 1-3 (+1 each), & Shields Levels 1-3 (+1 armor to shields each), & Centrifugal Hooks increases Baneling''s speed by 0.63 and HP by 5 researched by Baneling Nest, requires Lair or Hive',\n" +
                "'Explodes upon impact in a decent splash radius, damaging all units in the radius equally.  Due to having only one attack during its life, it does not have DPS values.', null, 'Baneling Nest', null, null, '4.13 with Centrifugal Hooks', 'Roaches, Stalkers, Archons, Marauders, AOE Damage such as Tanks and Storm'," +
                "'Workers, Zerglings, Hydralisks, Marines, Zealots, Other Light Units', 'Zerg    ----  ALL STATS FILLED IN WITH BANELING PLACEHOLDER INFO  ---', '          ','          ', '          ', 'Ground','Hatchery, Lair, or Hive','Ground', 'Until destroyed', 'BL', null, '35 vs Light', '80 vs Structures', null, null, '35 with Centrifugal Hooks', null, null, null)");

        db.execSQL("INSERT INTO " + TABLE_NAME + "(unitID, NAME, Pic1, HP, Dmg1, Dmg2, Armor, Cargo, Supply, Minerals, Vespene, BuildTime, Speed, AttackSpeed1, AttackSpeed2, " +
                "Bonuses, RangevsGround, RangevsAir, LOS, LOS2, unitSize, Upgrades, SpecialAbilities, Energy, TechRequired, Shields, WarpgateCooldown, Speed2, NaturalEnemies, NaturalPrey," +
                "Race, Description, Uses, Lore, GroundAir, BuildsFrom, AttacksGA, Lifespan, Attributes, EnergyCost, SpecialDmg1, SpecialDmg2, SpecialDPS1, SpecialDPS2, HP2, Armor2, ASString, SplashRadius) " +
                "VALUES (58,'Stalker', null, 30, 20, null, 0, 2, 0.5, 50, 25, 14, 3.5, null, null, '+15 vs Light, +60 vs Structures'\n" +
                ", 0, null, 8, null, 0.75, 'Ground Weapons Levels 1-3 (+2 each; +4 vs Light; +5 vs Structures), Ground Armor Levels 1-3 (+1 each), & Shields Levels 1-3 (+1 armor to shields each), & Centrifugal Hooks increases Baneling''s speed by 0.63 and HP by 5 researched by Baneling Nest, requires Lair or Hive',\n" +
                "'Explodes upon impact in a decent splash radius, damaging all units in the radius equally.  Due to having only one attack during its life, it does not have DPS values.', null, 'Baneling Nest', null, null, '4.13 with Centrifugal Hooks', 'Roaches, Stalkers, Archons, Marauders, AOE Damage such as Tanks and Storm'," +
                "'Workers, Zerglings, Hydralisks, Marines, Zealots, Other Light Units', 'Zerg    ----  ALL STATS FILLED IN WITH BANELING PLACEHOLDER INFO  ---', '          ','          ', '          ', 'Ground','Hatchery, Lair, or Hive','Ground', 'Until destroyed', 'BL', null, '35 vs Light', '80 vs Structures', null, null, '35 with Centrifugal Hooks', null, null, null)");

        db.execSQL("INSERT INTO " + TABLE_NAME + "(unitID, NAME, Pic1, HP, Dmg1, Dmg2, Armor, Cargo, Supply, Minerals, Vespene, BuildTime, Speed, AttackSpeed1, AttackSpeed2, " +
                "Bonuses, RangevsGround, RangevsAir, LOS, LOS2, unitSize, Upgrades, SpecialAbilities, Energy, TechRequired, Shields, WarpgateCooldown, Speed2, NaturalEnemies, NaturalPrey," +
                "Race, Description, Uses, Lore, GroundAir, BuildsFrom, AttacksGA, Lifespan, Attributes, EnergyCost, SpecialDmg1, SpecialDmg2, SpecialDPS1, SpecialDPS2, HP2, Armor2, ASString, SplashRadius) " +
                "VALUES (59,'Swarm Host', null, 30, 20, null, 0, 2, 0.5, 50, 25, 14, 3.5, null, null, '+15 vs Light, +60 vs Structures'\n" +
                ", 0, null, 8, null, 0.75, 'Ground Weapons Levels 1-3 (+2 each; +4 vs Light; +5 vs Structures), Ground Armor Levels 1-3 (+1 each), & Shields Levels 1-3 (+1 armor to shields each), & Centrifugal Hooks increases Baneling''s speed by 0.63 and HP by 5 researched by Baneling Nest, requires Lair or Hive',\n" +
                "'Explodes upon impact in a decent splash radius, damaging all units in the radius equally.  Due to having only one attack during its life, it does not have DPS values.', null, 'Baneling Nest', null, null, '4.13 with Centrifugal Hooks', 'Roaches, Stalkers, Archons, Marauders, AOE Damage such as Tanks and Storm'," +
                "'Workers, Zerglings, Hydralisks, Marines, Zealots, Other Light Units', 'Zerg    ----  ALL STATS FILLED IN WITH BANELING PLACEHOLDER INFO  ---', '          ','          ', '          ', 'Ground','Hatchery, Lair, or Hive','Ground', 'Until destroyed', 'BL', null, '35 vs Light', '80 vs Structures', null, null, '35 with Centrifugal Hooks', null, null, null)");

        db.execSQL("INSERT INTO " + TABLE_NAME + "(unitID, NAME, Pic1, HP, Dmg1, Dmg2, Armor, Cargo, Supply, Minerals, Vespene, BuildTime, Speed, AttackSpeed1, AttackSpeed2, " +
                "Bonuses, RangevsGround, RangevsAir, LOS, LOS2, unitSize, Upgrades, SpecialAbilities, Energy, TechRequired, Shields, WarpgateCooldown, Speed2, NaturalEnemies, NaturalPrey," +
                "Race, Description, Uses, Lore, GroundAir, BuildsFrom, AttacksGA, Lifespan, Attributes, EnergyCost, SpecialDmg1, SpecialDmg2, SpecialDPS1, SpecialDPS2, HP2, Armor2, ASString, SplashRadius) " +
                "VALUES (60,'Tempest', null, 30, 20, null, 0, 2, 0.5, 50, 25, 14, 3.5, null, null, '+15 vs Light, +60 vs Structures'\n" +
                ", 0, null, 8, null, 0.75, 'Ground Weapons Levels 1-3 (+2 each; +4 vs Light; +5 vs Structures), Ground Armor Levels 1-3 (+1 each), & Shields Levels 1-3 (+1 armor to shields each), & Centrifugal Hooks increases Baneling''s speed by 0.63 and HP by 5 researched by Baneling Nest, requires Lair or Hive',\n" +
                "'Explodes upon impact in a decent splash radius, damaging all units in the radius equally.  Due to having only one attack during its life, it does not have DPS values.', null, 'Baneling Nest', null, null, '4.13 with Centrifugal Hooks', 'Roaches, Stalkers, Archons, Marauders, AOE Damage such as Tanks and Storm'," +
                "'Workers, Zerglings, Hydralisks, Marines, Zealots, Other Light Units', 'Zerg    ----  ALL STATS FILLED IN WITH BANELING PLACEHOLDER INFO  ---', '          ','          ', '          ', 'Ground','Hatchery, Lair, or Hive','Ground', 'Until destroyed', 'BL', null, '35 vs Light', '80 vs Structures', null, null, '35 with Centrifugal Hooks', null, null, null)");

        db.execSQL("INSERT INTO " + TABLE_NAME + "(unitID, NAME, Pic1, HP, Dmg1, Dmg2, Armor, Cargo, Supply, Minerals, Vespene, BuildTime, Speed, AttackSpeed1, AttackSpeed2, " +
                "Bonuses, RangevsGround, RangevsAir, LOS, LOS2, unitSize, Upgrades, SpecialAbilities, Energy, TechRequired, Shields, WarpgateCooldown, Speed2, NaturalEnemies, NaturalPrey," +
                "Race, Description, Uses, Lore, GroundAir, BuildsFrom, AttacksGA, Lifespan, Attributes, EnergyCost, SpecialDmg1, SpecialDmg2, SpecialDPS1, SpecialDPS2, HP2, Armor2, ASString, SplashRadius) " +
                "VALUES (61,'Thor (explosive)', null, 30, 20, null, 0, 2, 0.5, 50, 25, 14, 3.5, null, null, '+15 vs Light, +60 vs Structures'\n" +
                ", 0, null, 8, null, 0.75, 'Ground Weapons Levels 1-3 (+2 each; +4 vs Light; +5 vs Structures), Ground Armor Levels 1-3 (+1 each), & Shields Levels 1-3 (+1 armor to shields each), & Centrifugal Hooks increases Baneling''s speed by 0.63 and HP by 5 researched by Baneling Nest, requires Lair or Hive',\n" +
                "'Explodes upon impact in a decent splash radius, damaging all units in the radius equally.  Due to having only one attack during its life, it does not have DPS values.', null, 'Baneling Nest', null, null, '4.13 with Centrifugal Hooks', 'Roaches, Stalkers, Archons, Marauders, AOE Damage such as Tanks and Storm'," +
                "'Workers, Zerglings, Hydralisks, Marines, Zealots, Other Light Units', 'Zerg    ----  ALL STATS FILLED IN WITH BANELING PLACEHOLDER INFO  ---', '          ','          ', '          ', 'Ground','Hatchery, Lair, or Hive','Ground', 'Until destroyed', 'BL', null, '35 vs Light', '80 vs Structures', null, null, '35 with Centrifugal Hooks', null, null, null)");

        db.execSQL("INSERT INTO " + TABLE_NAME + "(unitID, NAME, Pic1, HP, Dmg1, Dmg2, Armor, Cargo, Supply, Minerals, Vespene, BuildTime, Speed, AttackSpeed1, AttackSpeed2, " +
                "Bonuses, RangevsGround, RangevsAir, LOS, LOS2, unitSize, Upgrades, SpecialAbilities, Energy, TechRequired, Shields, WarpgateCooldown, Speed2, NaturalEnemies, NaturalPrey," +
                "Race, Description, Uses, Lore, GroundAir, BuildsFrom, AttacksGA, Lifespan, Attributes, EnergyCost, SpecialDmg1, SpecialDmg2, SpecialDPS1, SpecialDPS2, HP2, Armor2, ASString, SplashRadius) " +
                "VALUES (62,'Thor (high impact)', null, 30, 20, null, 0, 2, 0.5, 50, 25, 14, 3.5, null, null, '+15 vs Light, +60 vs Structures'\n" +
                ", 0, null, 8, null, 0.75, 'Ground Weapons Levels 1-3 (+2 each; +4 vs Light; +5 vs Structures), Ground Armor Levels 1-3 (+1 each), & Shields Levels 1-3 (+1 armor to shields each), & Centrifugal Hooks increases Baneling''s speed by 0.63 and HP by 5 researched by Baneling Nest, requires Lair or Hive',\n" +
                "'Explodes upon impact in a decent splash radius, damaging all units in the radius equally.  Due to having only one attack during its life, it does not have DPS values.', null, 'Baneling Nest', null, null, '4.13 with Centrifugal Hooks', 'Roaches, Stalkers, Archons, Marauders, AOE Damage such as Tanks and Storm'," +
                "'Workers, Zerglings, Hydralisks, Marines, Zealots, Other Light Units', 'Zerg    ----  ALL STATS FILLED IN WITH BANELING PLACEHOLDER INFO  ---', '          ','          ', '          ', 'Ground','Hatchery, Lair, or Hive','Ground', 'Until destroyed', 'BL', null, '35 vs Light', '80 vs Structures', null, null, '35 with Centrifugal Hooks', null, null, null)");

        db.execSQL("INSERT INTO " + TABLE_NAME + "(unitID, NAME, Pic1, HP, Dmg1, Dmg2, Armor, Cargo, Supply, Minerals, Vespene, BuildTime, Speed, AttackSpeed1, AttackSpeed2, " +
                "Bonuses, RangevsGround, RangevsAir, LOS, LOS2, unitSize, Upgrades, SpecialAbilities, Energy, TechRequired, Shields, WarpgateCooldown, Speed2, NaturalEnemies, NaturalPrey," +
                "Race, Description, Uses, Lore, GroundAir, BuildsFrom, AttacksGA, Lifespan, Attributes, EnergyCost, SpecialDmg1, SpecialDmg2, SpecialDPS1, SpecialDPS2, HP2, Armor2, ASString, SplashRadius) " +
                "VALUES (63,'Ultralisk', null, 30, 20, null, 0, 2, 0.5, 50, 25, 14, 3.5, null, null, '+15 vs Light, +60 vs Structures'\n" +
                ", 0, null, 8, null, 0.75, 'Ground Weapons Levels 1-3 (+2 each; +4 vs Light; +5 vs Structures), Ground Armor Levels 1-3 (+1 each), & Shields Levels 1-3 (+1 armor to shields each), & Centrifugal Hooks increases Baneling''s speed by 0.63 and HP by 5 researched by Baneling Nest, requires Lair or Hive',\n" +
                "'Explodes upon impact in a decent splash radius, damaging all units in the radius equally.  Due to having only one attack during its life, it does not have DPS values.', null, 'Baneling Nest', null, null, '4.13 with Centrifugal Hooks', 'Roaches, Stalkers, Archons, Marauders, AOE Damage such as Tanks and Storm'," +
                "'Workers, Zerglings, Hydralisks, Marines, Zealots, Other Light Units', 'Zerg    ----  ALL STATS FILLED IN WITH BANELING PLACEHOLDER INFO  ---', '          ','          ', '          ', 'Ground','Hatchery, Lair, or Hive','Ground', 'Until destroyed', 'BL', null, '35 vs Light', '80 vs Structures', null, null, '35 with Centrifugal Hooks', null, null, null)");

        db.execSQL("INSERT INTO " + TABLE_NAME + "(unitID, NAME, Pic1, HP, Dmg1, Dmg2, Armor, Cargo, Supply, Minerals, Vespene, BuildTime, Speed, AttackSpeed1, AttackSpeed2, " +
                "Bonuses, RangevsGround, RangevsAir, LOS, LOS2, unitSize, Upgrades, SpecialAbilities, Energy, TechRequired, Shields, WarpgateCooldown, Speed2, NaturalEnemies, NaturalPrey," +
                "Race, Description, Uses, Lore, GroundAir, BuildsFrom, AttacksGA, Lifespan, Attributes, EnergyCost, SpecialDmg1, SpecialDmg2, SpecialDPS1, SpecialDPS2, HP2, Armor2, ASString, SplashRadius) " +
                "VALUES (64,'Viking (assault mode)', null, 30, 20, null, 0, 2, 0.5, 50, 25, 14, 3.5, null, null, '+15 vs Light, +60 vs Structures'\n" +
                ", 0, null, 8, null, 0.75, 'Ground Weapons Levels 1-3 (+2 each; +4 vs Light; +5 vs Structures), Ground Armor Levels 1-3 (+1 each), & Shields Levels 1-3 (+1 armor to shields each), & Centrifugal Hooks increases Baneling''s speed by 0.63 and HP by 5 researched by Baneling Nest, requires Lair or Hive',\n" +
                "'Explodes upon impact in a decent splash radius, damaging all units in the radius equally.  Due to having only one attack during its life, it does not have DPS values.', null, 'Baneling Nest', null, null, '4.13 with Centrifugal Hooks', 'Roaches, Stalkers, Archons, Marauders, AOE Damage such as Tanks and Storm'," +
                "'Workers, Zerglings, Hydralisks, Marines, Zealots, Other Light Units', 'Zerg    ----  ALL STATS FILLED IN WITH BANELING PLACEHOLDER INFO  ---', '          ','          ', '          ', 'Ground','Hatchery, Lair, or Hive','Ground', 'Until destroyed', 'BL', null, '35 vs Light', '80 vs Structures', null, null, '35 with Centrifugal Hooks', null, null, null)");

        db.execSQL("INSERT INTO " + TABLE_NAME + "(unitID, NAME, Pic1, HP, Dmg1, Dmg2, Armor, Cargo, Supply, Minerals, Vespene, BuildTime, Speed, AttackSpeed1, AttackSpeed2, " +
                "Bonuses, RangevsGround, RangevsAir, LOS, LOS2, unitSize, Upgrades, SpecialAbilities, Energy, TechRequired, Shields, WarpgateCooldown, Speed2, NaturalEnemies, NaturalPrey," +
                "Race, Description, Uses, Lore, GroundAir, BuildsFrom, AttacksGA, Lifespan, Attributes, EnergyCost, SpecialDmg1, SpecialDmg2, SpecialDPS1, SpecialDPS2, HP2, Armor2, ASString, SplashRadius) " +
                "VALUES (65,'Viking (fighter mode)', null, 30, 20, null, 0, 2, 0.5, 50, 25, 14, 3.5, null, null, '+15 vs Light, +60 vs Structures'\n" +
                ", 0, null, 8, null, 0.75, 'Ground Weapons Levels 1-3 (+2 each; +4 vs Light; +5 vs Structures), Ground Armor Levels 1-3 (+1 each), & Shields Levels 1-3 (+1 armor to shields each), & Centrifugal Hooks increases Baneling''s speed by 0.63 and HP by 5 researched by Baneling Nest, requires Lair or Hive',\n" +
                "'Explodes upon impact in a decent splash radius, damaging all units in the radius equally.  Due to having only one attack during its life, it does not have DPS values.', null, 'Baneling Nest', null, null, '4.13 with Centrifugal Hooks', 'Roaches, Stalkers, Archons, Marauders, AOE Damage such as Tanks and Storm'," +
                "'Workers, Zerglings, Hydralisks, Marines, Zealots, Other Light Units', 'Zerg    ----  ALL STATS FILLED IN WITH BANELING PLACEHOLDER INFO  ---', '          ','          ', '          ', 'Ground','Hatchery, Lair, or Hive','Ground', 'Until destroyed', 'BL', null, '35 vs Light', '80 vs Structures', null, null, '35 with Centrifugal Hooks', null, null, null)");

        db.execSQL("INSERT INTO " + TABLE_NAME + "(unitID, NAME, Pic1, HP, Dmg1, Dmg2, Armor, Cargo, Supply, Minerals, Vespene, BuildTime, Speed, AttackSpeed1, AttackSpeed2, " +
                "Bonuses, RangevsGround, RangevsAir, LOS, LOS2, unitSize, Upgrades, SpecialAbilities, Energy, TechRequired, Shields, WarpgateCooldown, Speed2, NaturalEnemies, NaturalPrey," +
                "Race, Description, Uses, Lore, GroundAir, BuildsFrom, AttacksGA, Lifespan, Attributes, EnergyCost, SpecialDmg1, SpecialDmg2, SpecialDPS1, SpecialDPS2, HP2, Armor2, ASString, SplashRadius) " +
                "VALUES (66,'Viper', null, 30, 20, null, 0, 2, 0.5, 50, 25, 14, 3.5, null, null, '+15 vs Light, +60 vs Structures'\n" +
                ", 0, null, 8, null, 0.75, 'Ground Weapons Levels 1-3 (+2 each; +4 vs Light; +5 vs Structures), Ground Armor Levels 1-3 (+1 each), & Shields Levels 1-3 (+1 armor to shields each), & Centrifugal Hooks increases Baneling''s speed by 0.63 and HP by 5 researched by Baneling Nest, requires Lair or Hive',\n" +
                "'Explodes upon impact in a decent splash radius, damaging all units in the radius equally.  Due to having only one attack during its life, it does not have DPS values.', null, 'Baneling Nest', null, null, '4.13 with Centrifugal Hooks', 'Roaches, Stalkers, Archons, Marauders, AOE Damage such as Tanks and Storm'," +
                "'Workers, Zerglings, Hydralisks, Marines, Zealots, Other Light Units', 'Zerg    ----  ALL STATS FILLED IN WITH BANELING PLACEHOLDER INFO  ---', '          ','          ', '          ', 'Ground','Hatchery, Lair, or Hive','Ground', 'Until destroyed', 'BL', null, '35 vs Light', '80 vs Structures', null, null, '35 with Centrifugal Hooks', null, null, null)");

        db.execSQL("INSERT INTO " + TABLE_NAME + "(unitID, NAME, Pic1, HP, Dmg1, Dmg2, Armor, Cargo, Supply, Minerals, Vespene, BuildTime, Speed, AttackSpeed1, AttackSpeed2, " +
                "Bonuses, RangevsGround, RangevsAir, LOS, LOS2, unitSize, Upgrades, SpecialAbilities, Energy, TechRequired, Shields, WarpgateCooldown, Speed2, NaturalEnemies, NaturalPrey," +
                "Race, Description, Uses, Lore, GroundAir, BuildsFrom, AttacksGA, Lifespan, Attributes, EnergyCost, SpecialDmg1, SpecialDmg2, SpecialDPS1, SpecialDPS2, HP2, Armor2, ASString, SplashRadius) " +
                "VALUES (67,'Void Ray', null, 30, 20, null, 0, 2, 0.5, 50, 25, 14, 3.5, null, null, '+15 vs Light, +60 vs Structures'\n" +
                ", 0, null, 8, null, 0.75, 'Ground Weapons Levels 1-3 (+2 each; +4 vs Light; +5 vs Structures), Ground Armor Levels 1-3 (+1 each), & Shields Levels 1-3 (+1 armor to shields each), & Centrifugal Hooks increases Baneling''s speed by 0.63 and HP by 5 researched by Baneling Nest, requires Lair or Hive',\n" +
                "'Explodes upon impact in a decent splash radius, damaging all units in the radius equally.  Due to having only one attack during its life, it does not have DPS values.', null, 'Baneling Nest', null, null, '4.13 with Centrifugal Hooks', 'Roaches, Stalkers, Archons, Marauders, AOE Damage such as Tanks and Storm'," +
                "'Workers, Zerglings, Hydralisks, Marines, Zealots, Other Light Units', 'Zerg    ----  ALL STATS FILLED IN WITH BANELING PLACEHOLDER INFO  ---', '          ','          ', '          ', 'Ground','Hatchery, Lair, or Hive','Ground', 'Until destroyed', 'BL', null, '35 vs Light', '80 vs Structures', null, null, '35 with Centrifugal Hooks', null, null, null)");

        db.execSQL("INSERT INTO " + TABLE_NAME + "(unitID, NAME, Pic1, HP, Dmg1, Dmg2, Armor, Cargo, Supply, Minerals, Vespene, BuildTime, Speed, AttackSpeed1, AttackSpeed2, " +
                "Bonuses, RangevsGround, RangevsAir, LOS, LOS2, unitSize, Upgrades, SpecialAbilities, Energy, TechRequired, Shields, WarpgateCooldown, Speed2, NaturalEnemies, NaturalPrey," +
                "Race, Description, Uses, Lore, GroundAir, BuildsFrom, AttacksGA, Lifespan, Attributes, EnergyCost, SpecialDmg1, SpecialDmg2, SpecialDPS1, SpecialDPS2, HP2, Armor2, ASString, SplashRadius) " +
                "VALUES (68,'Warp Prism', null, 30, 20, null, 0, 2, 0.5, 50, 25, 14, 3.5, null, null, '+15 vs Light, +60 vs Structures'\n" +
                ", 0, null, 8, null, 0.75, 'Ground Weapons Levels 1-3 (+2 each; +4 vs Light; +5 vs Structures), Ground Armor Levels 1-3 (+1 each), & Shields Levels 1-3 (+1 armor to shields each), & Centrifugal Hooks increases Baneling''s speed by 0.63 and HP by 5 researched by Baneling Nest, requires Lair or Hive',\n" +
                "'Explodes upon impact in a decent splash radius, damaging all units in the radius equally.  Due to having only one attack during its life, it does not have DPS values.', null, 'Baneling Nest', null, null, '4.13 with Centrifugal Hooks', 'Roaches, Stalkers, Archons, Marauders, AOE Damage such as Tanks and Storm'," +
                "'Workers, Zerglings, Hydralisks, Marines, Zealots, Other Light Units', 'Zerg    ----  ALL STATS FILLED IN WITH BANELING PLACEHOLDER INFO  ---', '          ','          ', '          ', 'Ground','Hatchery, Lair, or Hive','Ground', 'Until destroyed', 'BL', null, '35 vs Light', '80 vs Structures', null, null, '35 with Centrifugal Hooks', null, null, null)");

        db.execSQL("INSERT INTO " + TABLE_NAME + "(unitID, NAME, Pic1, HP, Dmg1, Dmg2, Armor, Cargo, Supply, Minerals, Vespene, BuildTime, Speed, AttackSpeed1, AttackSpeed2, " +
                "Bonuses, RangevsGround, RangevsAir, LOS, LOS2, unitSize, Upgrades, SpecialAbilities, Energy, TechRequired, Shields, WarpgateCooldown, Speed2, NaturalEnemies, NaturalPrey," +
                "Race, Description, Uses, Lore, GroundAir, BuildsFrom, AttacksGA, Lifespan, Attributes, EnergyCost, SpecialDmg1, SpecialDmg2, SpecialDPS1, SpecialDPS2, HP2, Armor2, ASString, SplashRadius) " +
                "VALUES (69,'Widow Mine', null, 30, 20, null, 0, 2, 0.5, 50, 25, 14, 3.5, null, null, '+15 vs Light, +60 vs Structures'\n" +
                ", 0, null, 8, null, 0.75, 'Ground Weapons Levels 1-3 (+2 each; +4 vs Light; +5 vs Structures), Ground Armor Levels 1-3 (+1 each), & Shields Levels 1-3 (+1 armor to shields each), & Centrifugal Hooks increases Baneling''s speed by 0.63 and HP by 5 researched by Baneling Nest, requires Lair or Hive',\n" +
                "'Explodes upon impact in a decent splash radius, damaging all units in the radius equally.  Due to having only one attack during its life, it does not have DPS values.', null, 'Baneling Nest', null, null, '4.13 with Centrifugal Hooks', 'Roaches, Stalkers, Archons, Marauders, AOE Damage such as Tanks and Storm'," +
                "'Workers, Zerglings, Hydralisks, Marines, Zealots, Other Light Units', 'Zerg    ----  ALL STATS FILLED IN WITH BANELING PLACEHOLDER INFO  ---', '          ','          ', '          ', 'Ground','Hatchery, Lair, or Hive','Ground', 'Until destroyed', 'BL', null, '35 vs Light', '80 vs Structures', null, null, '35 with Centrifugal Hooks', null, null, null)");

        db.execSQL("INSERT INTO " + TABLE_NAME + "(unitID, NAME, Pic1, HP, Dmg1, Dmg2, Armor, Cargo, Supply, Minerals, Vespene, BuildTime, Speed, AttackSpeed1, AttackSpeed2, " +
                "Bonuses, RangevsGround, RangevsAir, LOS, LOS2, unitSize, Upgrades, SpecialAbilities, Energy, TechRequired, Shields, WarpgateCooldown, Speed2, NaturalEnemies, NaturalPrey," +
                "Race, Description, Uses, Lore, GroundAir, BuildsFrom, AttacksGA, Lifespan, Attributes, EnergyCost, SpecialDmg1, SpecialDmg2, SpecialDPS1, SpecialDPS2, HP2, Armor2, ASString, SplashRadius) " +
                "VALUES (70,'Zealot', null, 30, 20, null, 0, 2, 0.5, 50, 25, 14, 3.5, null, null, '+15 vs Light, +60 vs Structures'\n" +
                ", 0, null, 8, null, 0.75, 'Ground Weapons Levels 1-3 (+2 each; +4 vs Light; +5 vs Structures), Ground Armor Levels 1-3 (+1 each), & Shields Levels 1-3 (+1 armor to shields each), & Centrifugal Hooks increases Baneling''s speed by 0.63 and HP by 5 researched by Baneling Nest, requires Lair or Hive',\n" +
                "'Explodes upon impact in a decent splash radius, damaging all units in the radius equally.  Due to having only one attack during its life, it does not have DPS values.', null, 'Baneling Nest', null, null, '4.13 with Centrifugal Hooks', 'Roaches, Stalkers, Archons, Marauders, AOE Damage such as Tanks and Storm'," +
                "'Workers, Zerglings, Hydralisks, Marines, Zealots, Other Light Units', 'Zerg    ----  ALL STATS FILLED IN WITH BANELING PLACEHOLDER INFO  ---', '          ','          ', '          ', 'Ground','Hatchery, Lair, or Hive','Ground', 'Until destroyed', 'BL', null, '35 vs Light', '80 vs Structures', null, null, '35 with Centrifugal Hooks', null, null, null)");

        db.execSQL("INSERT INTO " + TABLE_NAME + "(unitID, NAME, Pic1, HP, Dmg1, Dmg2, Armor, Cargo, Supply, Minerals, Vespene, BuildTime, Speed, AttackSpeed1, AttackSpeed2, " +
                "Bonuses, RangevsGround, RangevsAir, LOS, LOS2, unitSize, Upgrades, SpecialAbilities, Energy, TechRequired, Shields, WarpgateCooldown, Speed2, NaturalEnemies, NaturalPrey," +
                "Race, Description, Uses, Lore, GroundAir, BuildsFrom, AttacksGA, Lifespan, Attributes, EnergyCost, SpecialDmg1, SpecialDmg2, SpecialDPS1, SpecialDPS2, HP2, Armor2, ASString, SplashRadius) " +
                "VALUES (71,'Zergling', null, 30, 20, null, 0, 2, 0.5, 50, 25, 14, 3.5, null, null, '+15 vs Light, +60 vs Structures'\n" +
                ", 0, null, 8, null, 0.75, 'Ground Weapons Levels 1-3 (+2 each; +4 vs Light; +5 vs Structures), Ground Armor Levels 1-3 (+1 each), & Shields Levels 1-3 (+1 armor to shields each), & Centrifugal Hooks increases Baneling''s speed by 0.63 and HP by 5 researched by Baneling Nest, requires Lair or Hive',\n" +
                "'Explodes upon impact in a decent splash radius, damaging all units in the radius equally.  Due to having only one attack during its life, it does not have DPS values.', null, 'Baneling Nest', null, null, '4.13 with Centrifugal Hooks', 'Roaches, Stalkers, Archons, Marauders, AOE Damage such as Tanks and Storm'," +
                "'Workers, Zerglings, Hydralisks, Marines, Zealots, Other Light Units', 'Zerg    ----  ALL STATS FILLED IN WITH BANELING PLACEHOLDER INFO  ---', '          ','          ', '          ', 'Ground','Hatchery, Lair, or Hive','Ground', 'Until destroyed', 'BL', null, '35 vs Light', '80 vs Structures', null, null, '35 with Centrifugal Hooks', null, null, null)");








    }
}
