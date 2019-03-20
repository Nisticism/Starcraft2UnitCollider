package com.Icantbelievedefaultisexample.nistic.starcraft2unitcollider;

import android.app.ActivityManager;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.GradientDrawable;
import android.media.Image;
import android.os.Bundle;
import android.os.Debug;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.content.ContextCompat;
import android.text.method.ScrollingMovementMethod;
import android.util.DisplayMetrics;
import android.view.Gravity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.io.ByteArrayOutputStream;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;

public class UnitVUnit extends MainActivity{

    Float pixelDensity = 0.0f;

    Button calculate;
    Button clear;
    Button home;
    TextView results;
    TextView instructions;
    TextView instructions2;
    TextView unit1RaceFilter;
    TextView unit2RaceFilter;
    TextView vs;
    RadioGroup unitOne;
    RadioGroup unitTwo;

    RadioButton unit1Zerg;
    RadioButton unit1Protoss;
    RadioButton unit1Terran;

    RadioButton unit2Zerg;
    RadioButton unit2Protoss;
    RadioButton unit2Terran;

    Integer selectionError = 0;

    Spinner unit1Name;
    Spinner unit1AttackUps;
    Spinner unit1ArmorUps;
    Spinner unit1SpecialMod;
    Spinner unit1ShieldUps;
    Spinner options;

    Spinner unit2Name;
    Spinner unit2AttackUps;
    Spinner unit2ArmorUps;
    Spinner unit2Quantity;
    Spinner unit2SpecialMod;
    Spinner unit2ShieldUps;

    ImageButton imageIcon1;
    ImageButton imageIcon2;

    String[] unitNameArray;

    //String[] unit2NameArray;

    String[] terranUnitArrray;

    String[] protossUnitArrray;

    String[] zergUnitArrray;

    String[] unitUpgrades;

    String[] unitQuantity;

    String[] specialMod;

    String[] adeptArray;

    String[] marineArray;

    String[] marauderArray;

    String[] banelingArray;

    String[] zerglingArray;

    String[] ultraliskArray;

    String[] cycloneArray;

    String[] voidRayArray;

    String[] corruptorArray;

    String[] hellionHellbatArray;

    String[] terranBuildingArray;

    String [] noneArray;

    String [] unitArmorUps;

    String [] unitAttackUps;

    String [] unitShieldsUps;

    Spinner [] spinnerList;

    ArrayList<unitItem> zUnitArray;

    ArrayList<unitItem> tUnitArray;

    ArrayList<unitItem> pUnitArray;

    ArrayList<unitItem> genUnitArray;

    String result;

    String unit1;
    Integer unit1AttVsGround;
    Integer unit1AttVsAir;
    Double unit1AttSpeed;
    Double unit1AttSpeedVsAir;
    Integer unit1Arm;
    Integer unit1AttUps;
    Integer unit1ArmUps;
    Integer unit1HP;
    String unit1Attributes;
    Integer unit1Shields;
    Integer unit1AttackCount;
    Boolean unit1IsGround;
    Double unit1LifeSpan;
    Integer unit1TotalHP;
    String unit1RaceTag;

    Integer unit1AirBonusVsA;
    Integer unit1AirBonusVsP;
    Integer unit1AirBonusVsX;
    Integer unit1AirBonusVsL;
    Integer unit1AirBonusVsB;
    Integer unit1AirBonusVsM;
    Integer unit1AirBonusVsS;
    Integer unit1GBonusVsA;
    Integer unit1GBonusVsP;
    Integer unit1GBonusVsX;
    Integer unit1GBonusVsL;
    Integer unit1GBonusVsB;
    Integer unit1GBonusVsM;
    Integer unit1GBonusVsS;

    String unit2;
    Integer unit2AttVsGround;
    Integer unit2AttVsAir;
    Double unit2AttSpeed;
    Double unit2AttSpeedVsAir;
    Integer unit2Arm;
    Integer unit2AttUps;
    Integer unit2ArmUps;
    Integer unit2Qua;
    Integer unit2HP;
    Integer unit2Shields;
    String unit2Attributes;
    Integer unit2AttackCount;
    Boolean unit2IsGround;
    Double unit2LifeSpan;
    Integer unit2TotalHP;
    String unit2RaceTag;

    Integer unit2AirBonusVsA;
    Integer unit2AirBonusVsP;
    Integer unit2AirBonusVsX;
    Integer unit2AirBonusVsL;
    Integer unit2AirBonusVsB;
    Integer unit2AirBonusVsM;
    Integer unit2AirBonusVsS;
    Integer unit2GBonusVsA;
    Integer unit2GBonusVsP;
    Integer unit2GBonusVsX;
    Integer unit2GBonusVsL;
    Integer unit2GBonusVsB;
    Integer unit2GBonusVsM;
    Integer unit2GBonusVsS;

    Double unit1AbilityTimespan;
    Double unit1AbilityCooldown;
    Double unit1AbilityDamage2;

    Double unit2AbilityTimespan;
    Double unit2AbilityCooldown;
    Double unit2AbilityDamage2;

    //private Boolean toggle = false;

    public void specialModifier(Integer mod, Integer unitNum) {
        if (unitNum == 1) {
            if (mod == 0) {
            }
            if (mod == 1) {
            }
            if (mod == 2) {
                unit1HP += 10;
                unit1AttSpeed = unit1AttSpeed / 1.5;
                if (unit1AttSpeedVsAir != null && unit1AttSpeedVsAir != 0.0) {
                    unit1AttSpeedVsAir = unit1AttSpeedVsAir / 1.5;
                }
            }
            if (mod == 3) {
                unit1AttSpeed = unit1AttSpeed / 1.5;
                if (unit1AttSpeedVsAir != null && unit1AttSpeedVsAir != 0.0) {
                    unit1AttSpeedVsAir = unit1AttSpeedVsAir / 1.5;
                }
            }
            if (mod == 4) {
                unit1HP += 10;
            }
            if (mod == 5) {
                if (unit2Attributes.contains("L")) {
                    unit1AttVsGround += 5;
                    if (unit1.equals("Hellbat")) {
                        unit1AttVsGround += 12;
                    }
                }
            }
            if (mod == 6) {
                unit1Arm += 2;
            }
            if (mod == 7) {
                unit1HP += 5;
            }
            if (mod == 8) {
                unit1AttSpeed -= 0.143;
                if (unit1AttSpeedVsAir != null && unit1AttSpeedVsAir != 0.0) {
                    unit1AttSpeedVsAir -= 1.43;
                }
            }
            if (mod == 9) {
                unit1Arm += 2;
            }
            if (mod == 10) {
                unit1AttSpeed = unit1AttSpeed / 1.45;
                if (unit1AttSpeedVsAir != null && unit1AttSpeedVsAir != 0.0) {
                    unit1AttSpeedVsAir = unit1AttSpeedVsAir / 1.45;
                }
            }
            if (mod == 11) {
                unit1AttVsGround = 20;
                unit1AttVsAir = 20;
                unit1AbilityCooldown = 4.3;
                unit1AbilityTimespan = 14.3;
            }
            if (mod == 12) {
                unit1AttVsGround = 20;
                unit1AttVsAir = 20;
                unit1GBonusVsA = 20;
                unit1AirBonusVsA = 20;
                unit1AbilityCooldown = 4.3;
                unit1AbilityTimespan = 14.3;
            }
            if (mod == 13) {
                if (unit1GBonusVsA != null) {
                    unit1GBonusVsA += 6;
                }
                if (unit1AirBonusVsA != null) {
                    unit1AirBonusVsA += 6;
                }

                if (unit1GBonusVsA == null) {
                    unit1GBonusVsA = 6;
                }
                if (unit1AirBonusVsA == null) {
                    unit1AirBonusVsA = 6;
                }

                unit1AbilityCooldown = 42.9;
                unit1AbilityTimespan = 14.3;
            }

            //  Caustic Spray
            if (mod == 14) {
                unit1GBonusVsS = 1;
                unit1AirBonusVsS = 1;
                unit1AbilityCooldown = 32.0;
                unit1AbilityTimespan = 4.3;
            }
        }
        if (unitNum == 2) {
            if (mod == 0) {
            }
            if (mod == 1) {
            }
            if (mod == 2) {
                unit2HP += 10;
                unit2AttSpeed = unit2AttSpeed / 1.5;
                if (unit2AttSpeedVsAir != null && unit2AttSpeedVsAir != 0.0) {
                    unit2AttSpeedVsAir = unit2AttSpeedVsAir / 1.5;
                }
            }
            if (mod == 3) {
                unit2AttSpeed = unit2AttSpeed / 1.5;
                if (unit2AttSpeedVsAir != null && unit2AttSpeedVsAir != 0.0) {
                    unit2AttSpeedVsAir = unit2AttSpeedVsAir / 1.5;
                }
            }
            if (mod == 4) {
                unit2HP += 10;
            }
            if (mod == 5) {
                if (unit1Attributes.contains("L")) {
                    unit2AttVsGround += 5;
                    if (unit2.equals("Hellbat")) {
                        unit2AttVsGround += 12;
                    }
                }
            }
            if (mod == 6) {
                unit2Arm += 2;
            }
            if (mod == 7) {
                unit2HP += 5;
            }
            if (mod == 8) {
                unit2AttSpeed -= 0.143;
                if (unit2AttSpeedVsAir != null && unit2AttSpeedVsAir != 0.0) {
                    unit2AttSpeedVsAir -= 1.43;
                }
            }
            if (mod == 9) {
                unit2Arm += 2;
            }
            if (mod == 10) {
                unit2AttSpeed = unit2AttSpeed / 1.45;
                if (unit2AttSpeedVsAir != null && unit2AttSpeedVsAir != 0.0) {
                    unit2AttSpeedVsAir = unit2AttSpeedVsAir / 1.45;
                }
            }
            if (mod == 11) {
                unit2AttVsGround = 20;
                unit2AttVsAir = 20;
                unit2AbilityCooldown = 4.3;
                unit2AbilityTimespan = 14.3;
            }
            if (mod == 12) {
                unit2AttVsGround = 20;
                unit2AttVsAir = 20;
                unit2GBonusVsA = 20;
                unit2AirBonusVsA = 20;
                unit2AbilityCooldown = 4.3;
                unit2AbilityTimespan = 14.3;
            }
            if (mod == 13) {
                if (unit2GBonusVsA != null) {
                    unit2GBonusVsA += 6;
                }
                if (unit2AirBonusVsA != null) {
                    unit2AirBonusVsA += 6;
                }

                if (unit2GBonusVsA == null) {
                    unit2GBonusVsA = 6;
                }
                if (unit2AirBonusVsA == null) {
                    unit2AirBonusVsA = 6;
                }

                unit2AbilityCooldown = 42.9;
                unit2AbilityTimespan = 14.3;
            }

            //  Caustic Spray
            if (mod == 14) {
                unit2GBonusVsS = 1;
                unit2AirBonusVsS = 1;
                unit2AbilityCooldown = 32.0;
                unit2AbilityTimespan = 4.3;
            }
        }
    }

    public void marineModifier (Integer mod, Integer unitNum) {
        if (unitNum == 1) {
            if (mod == 0) {
            }
            if (mod == 1) {
                unit1AttSpeed = unit1AttSpeed / 1.5;
                if (unit1AttSpeedVsAir != null && unit1AttSpeedVsAir != 0.0) {
                    unit1AttSpeedVsAir = unit1AttSpeedVsAir / 1.5;
                }
            }
            if (mod == 2) {
                unit1HP -= 10;
                unit1AttSpeed = unit1AttSpeed / 1.5;
                if (unit1AttSpeedVsAir != null && unit1AttSpeedVsAir != 0.0) {
                    unit1AttSpeedVsAir = unit1AttSpeedVsAir / 1.5;
                }
            }
            if (mod == 3) {
                unit1HP += 10;
            }
            if (mod == 4) {
                unit1HP += 10;
                unit1AttSpeed = unit1AttSpeed / 1.5;
                if (unit1AttSpeedVsAir != null && unit1AttSpeedVsAir != 0.0) {
                    unit1AttSpeedVsAir = unit1AttSpeedVsAir / 1.5;
                }
            }
        }
        if (unitNum == 2) {
            if (mod == 0) {
            }
            if (mod == 1) {
                unit2AttSpeed = unit2AttSpeed / 1.5;
                if (unit2AttSpeedVsAir != null && unit2AttSpeedVsAir != 0.0) {
                    unit2AttSpeedVsAir = unit2AttSpeedVsAir / 1.5;
                }
            }
            if (mod == 2) {
                unit2HP -= 10;
                unit2AttSpeed = unit2AttSpeed / 1.5;
                if (unit2AttSpeedVsAir != null && unit2AttSpeedVsAir != 0.0) {
                    unit2AttSpeedVsAir = unit2AttSpeedVsAir / 1.5;
                }
            }
            if (mod == 3) {
                unit2HP += 10;
            }
            if (mod == 4) {
                unit2HP += 10;
                unit2AttSpeed = unit2AttSpeed / 1.5;
                if (unit2AttSpeedVsAir != null && unit2AttSpeedVsAir != 0.0) {
                    unit2AttSpeedVsAir = unit2AttSpeedVsAir / 1.5;
                }
            }
        }
    }
    public void adeptModifier (Integer mod, Integer unitNum) {
        if (unitNum == 1) {
            if (mod == 0) {
            }
            if (mod == 1) {
                unit1AttSpeed = unit1AttSpeed / 1.45;
            }
        }
        if (unitNum == 2) {
            if (mod == 0) {
            }
            if (mod == 1) {
                unit2AttSpeed = unit2AttSpeed / 1.45;
            }
        }
    }
    public void marauderModifier (Integer mod, Integer unitNum) {
        if (unitNum == 1) {
            if (mod == 0) {
            }
            if (mod == 1) {
                unit1AttSpeed /= 1.5;
            }
            if (mod == 2) {
                unit1HP -= 20;
                unit1AttSpeed /= 1.5;
            }
        }
        if (unitNum == 2) {
            if (mod == 0) {
            }
            if (mod == 1) {
                unit2AttSpeed /= 1.5;
            }
            if (mod == 2) {
                unit2HP -= 20;
                unit2AttSpeed /= 1.5;
            }
        }
    }
    public void ultraliskModifier (Integer mod, Integer unitNum) {
        if (unitNum == 1) {
            if (mod == 0) {
            }
            if (mod == 1) {
                unit1Arm += 2;
            }
        }
        if (unitNum == 2) {
            if (mod == 0) {
            }
            if (mod == 1) {
                unit2Arm += 2;
            }
        }
    }
    public void banelingModifier (Integer mod, Integer unitNum) {
        if (unitNum == 1) {
            if (mod == 0) {
            }
            if (mod == 1) {
                unit1HP += 5;
            }
        }
        if (unitNum == 2) {
            if (mod == 0) {
            }
            if (mod == 1) {
                unit2HP += 5;
            }
        }
    }
    public void zerglingModifier (Integer mod, Integer unitNum) {
        if (unitNum == 1) {
            if (mod == 0) {
            }
            if (mod == 1) {
                unit1AttSpeed -= 0.143;
            }
        }
        if (unitNum == 2) {
            if (mod == 0) {
            }
            if (mod == 1) {
                unit2AttSpeed -= 0.143;
            }
        }
    }
    public void terranBuildingModifier (Integer mod, Integer unitNum) {
        if (unitNum == 1) {
            if (mod == 0) {
            }
            if (mod == 1) {
                unit1Arm += 2;
            }
        }
        if (unitNum == 2) {
            if (mod == 0) {
            }
            if (mod == 1) {
                unit2Arm += 2;
            }
        }
    }

    //  Infernal Pre-Igniter
    public void hellionHellbatModifier (Integer mod, Integer unitNum) {
        if (unitNum == 1) {
            if (mod == 0) {
            }
            if (mod == 1) {
                if (unit2Attributes.contains("L")) {
                    unit1AttVsGround += 5;
                    if (unit1.equals("Hellbat")) {
                        unit1AttVsGround += 12;
                    }
                }
            }
        }
        if (unitNum == 2) {
            if (mod == 0) {
            }
            if (mod == 1) {
                if (unit1Attributes.contains("L")) {
                    unit2AttVsGround += 5;
                    if (unit2.equals("Hellbat")) {
                        unit2AttVsGround += 12;
                    }
                }
            }
        }
    }
    public void cycloneModifier (Integer mod, Integer unitNum) {
        if (unitNum == 1) {
            if (mod == 0) {
            }
            if (mod == 1) {
                unit1AttVsGround = 20;
                unit1AttVsAir = 20;
                unit1AbilityCooldown = 4.3;
                unit1AbilityTimespan = 14.3;
            }
            if (mod == 2) {
                unit1AttVsGround = 20;
                unit1AttVsAir = 20;
                unit1GBonusVsA = 20;
                unit1AirBonusVsA = 20;
                unit1AbilityCooldown = 4.3;
                unit1AbilityTimespan = 14.3;
            }
        }
        if (unitNum == 2) {
            if (mod == 0) {
            }
            if (mod == 1) {
                unit2AttVsGround = 20;
                unit2AttVsAir = 20;
                unit2AbilityCooldown = 4.3;
                unit2AbilityTimespan = 14.3;
            }
            if (mod == 2) {
                unit2AttVsGround = 20;
                unit2AttVsAir = 20;
                unit2GBonusVsA = 20;
                unit2AirBonusVsA = 20;
                unit2AbilityCooldown = 4.3;
                unit2AbilityTimespan = 14.3;
            }
        }
    }
    public void voidRayModifier (Integer mod, Integer unitNum) {
        if (unitNum == 1) {
            if (mod == 0) {
            }
            if (mod == 1) {
                if (unit1GBonusVsA != null) {
                    unit1GBonusVsA += 6;
                }
                if (unit1AirBonusVsA != null) {
                    unit1AirBonusVsA += 6;
                }

                if (unit1GBonusVsA == null) {
                    unit1GBonusVsA = 6;
                }
                if (unit1AirBonusVsA == null) {
                    unit1AirBonusVsA = 6;
                }

                unit1AbilityCooldown = 42.9;
                unit1AbilityTimespan = 14.3;
            }
        }
        if (unitNum == 2) {
            if (mod == 0) {
            }
            if (mod == 1) {
                if (unit2GBonusVsA != null) {
                    unit2GBonusVsA += 6;
                }
                if (unit2AirBonusVsA != null) {
                    unit2AirBonusVsA += 6;
                }

                if (unit2GBonusVsA == null) {
                    unit2GBonusVsA = 6;
                }
                if (unit2AirBonusVsA == null) {
                    unit2AirBonusVsA = 6;
                }

                unit2AbilityCooldown = 42.9;
                unit2AbilityTimespan = 14.3;
            }
        }
    }

    //  Caustic spray
    public void corruptorModifier (Integer mod, Integer unitNum) {
        if (unitNum == 1) {
            if (mod == 0) {
            }
            if (mod == 1) {
                unit1GBonusVsS = 1;
                unit1AirBonusVsS = 1;
                unit1AbilityCooldown = 32.0;
                unit1AbilityTimespan = 4.3;
            }
        }
        if (unitNum == 2) {
            if (mod == 0) {
            }
            if (mod == 1) {
                unit2GBonusVsS = 1;
                unit2AirBonusVsS = 1;
                unit2AbilityCooldown = 32.0;
                unit2AbilityTimespan = 4.3;
            }
        }
    }



    public void terranSetter(Integer unitNum) {
        if (unitNum == 1) {
            if (unit1.equals("Auto-Turret")) {
                unit1AttVsGround = 18;
                unit1AttVsAir = 18;
                unit1AttSpeed = 0.57;
                unit1AttSpeedVsAir = 0.57;
                unit1Arm = 1;
                unit1HP = 150;
                unit1Attributes = "AMS";
                unit1IsGround = true;
                unit1AttackCount = 1;
                unit1LifeSpan = 10.0;
                unit1RaceTag = "t";
            }
            if (unit1.equals("Banshee")) {
                unit1AttVsGround = (12+unit1AttUps)*2;
                unit1AttVsAir = 0;
                unit1AttSpeed = 0.89;
                unit1Arm = unit1ArmUps;
                unit1HP = 140;
                unit1Attributes = "LM";
                unit1IsGround = false;
                unit1AttackCount = 2;
                unit1RaceTag = "t";
            }
            if (unit1.equals("Battlecruiser")) {
                unit1AttVsGround = 8 + unit1AttUps;
                unit1AttVsAir = 5 + unit1AttUps;
                unit1AttSpeed = 0.16;
                unit1AttSpeedVsAir = 0.16;
                unit1Arm = 3 + unit1ArmUps;
                unit1HP = 550;
                unit1Attributes = "AMX";
                unit1IsGround = false;
                unit1AttackCount = 1;
                unit1RaceTag = "t";
            }
            if (unit1.equals("Cyclone")) {
                unit1AttVsGround = 18 + unit1AttUps * 2;
                unit1AttVsAir = 18 + unit1AttUps * 2;
                unit1AttSpeed = 0.71;
                unit1AttSpeedVsAir = 0.71;
                unit1Arm = 1 + unit1ArmUps;
                unit1HP = 120;
                unit1Attributes = "AM";
                unit1IsGround = true;
                //unit1GBonusVsA = 2 + unit1AttUps;
                unit1AttackCount = 1;
                unit1RaceTag = "t";
            }
            if (unit1.equals("Ghost")) {
                unit1AttVsGround = 10 + unit1AttUps;
                unit1AttVsAir = 10 + unit1AttUps;
                unit1AttSpeed = 1.07;
                unit1AttSpeedVsAir = 1.07;
                unit1Arm = unit1ArmUps;
                unit1HP = 100;
                unit1Attributes = "BP";
                unit1IsGround = true;
                unit1GBonusVsL = 10 + unit1AttUps;
                unit1AirBonusVsL = 10 + unit1AttUps;
                unit1AttackCount = 1;
                unit1RaceTag = "t";
            }
            if (unit1.equals("Hellbat")) {
                unit1AttVsGround = 18 + 2 * unit1AttUps;
                unit1AttVsAir = 0;
                unit1AttSpeed = 1.43;
                unit1Arm = unit1ArmUps;
                unit1HP = 135;
                unit1Attributes = "LBM";
                unit1IsGround = true;
                unit1GBonusVsL = unit1AttUps;
                unit1AttackCount = 1;
                unit1RaceTag = "t";
            }
            if (unit1.equals("Hellion")) {
                unit1AttVsGround = 8 + unit1AttUps;
                unit1AttVsAir = 0;
                unit1AttSpeed = 1.79;
                unit1Arm = unit1ArmUps;
                unit1HP = 90;
                unit1Attributes = "LM";
                unit1IsGround = true;
                unit1GBonusVsL = 6 + unit1AttUps;
                unit1AttackCount = 1;
                unit1RaceTag = "t";
            }
            if (unit1.equals("Liberator (defender mode)")) {
                unit1AttVsGround = 75 + 5*unit1AttUps;
                unit1AttVsAir = 0;
                unit1AttSpeed = 1.14;
                unit1AttSpeedVsAir = 0.0;
                unit1Arm = unit1ArmUps;
                unit1HP = 180;
                unit1Attributes = "AM";
                unit1IsGround = false;
                unit1AttackCount = 1;
                unit1RaceTag = "t";
            }
            if (unit1.equals("Liberator (fighter mode)")) {
                unit1AttVsGround = 0;
                unit1AttVsAir = (7 + unit1AttUps) * 2;
                unit1AttSpeed = 0.0;
                unit1AttSpeedVsAir = 1.29;
                unit1Arm = unit1ArmUps;
                unit1HP = 180;
                unit1Attributes = "AM";
                unit1IsGround = false;
                unit1AttackCount = 2;
                unit1RaceTag = "t";
            }
            if (unit1.equals("Marauder")) {
                unit1AttVsGround = (5+unit1AttUps)*2;
                unit1AttVsAir = 0;
                unit1AttSpeed = 1.07;
                //unit1AttSpeed2 = 0.71;
                unit1Arm = 1 + unit1ArmUps;
                unit1HP = 125;
                unit1Attributes = "AB";
                unit1IsGround = true;
                unit1GBonusVsA = 5;
                unit1AttackCount = 2;
                unit1RaceTag = "t";
            }
            if (unit1.equals("Marine")) {
                unit1AttVsGround = 6 + unit1AttUps;
                unit1AttVsAir = 6 + unit1AttUps;
                unit1AttSpeed = 0.61;
                //unit1AttSpeed2 = .40;
                unit1AttSpeedVsAir = 0.61;
                unit1Arm = unit1ArmUps;
                unit1HP = 45;
                unit1Attributes = "LB";
                unit1IsGround = true;
                unit1AttackCount = 1;
                unit1RaceTag = "t";
            }
            if (unit1.equals("Medivac")) {
                unit1AttVsGround = 0;
                unit1AttVsAir = 0;
                unit1AttSpeed = 0.0;
                unit1Arm = 1 + unit1ArmUps;
                unit1HP = 150;
                unit1Attributes = "AM";
                unit1IsGround = false;
                unit1RaceTag = "t";
            }
            if (unit1.equals("Missile Turret")) {
                unit1AttVsGround = 0;
                unit1AttVsAir = 12*2;
                unit1AttSpeed = 0.0;
                unit1AttSpeedVsAir = 0.61;
                unit1Arm = 0;
//                if (!unit1ArmorUps.getSelectedItem().toString().equals("0")) {
//                    unit1ArmorUps.setSelection(3);
//                    unit1Arm = 2;
//                }
                unit1HP = 250;
                unit1Attributes = "AMS";
                unit1IsGround = true;
                unit1AttackCount = 2;
                unit1RaceTag = "t";
            }
            if (unit1.equals("MULE")) {
                unit1AttVsGround = 0;
                unit1AttVsAir = 0;
                unit1AttSpeed = 0.0;
                unit1Arm = unit1ArmUps;
                unit1HP = 60;
                unit1Attributes = "LM";
                unit1IsGround = true;
                unit1LifeSpan = 64.0;
                unit1RaceTag = "t";
            }
            if (unit1.equals("Planetary Fortress")) {
                unit1AttVsGround = 40;
                unit1AttVsAir = 0;
                unit1AttSpeed = 1.43;
                unit1Arm = 3;
//                if (!unit1ArmorUps.getSelectedItem().toString().equals("0")) {
//                    unit1Arm = 5;
//                }
                unit1HP = 1500;
                unit1Attributes = "AMS";
                unit1IsGround = true;
                unit1AttackCount = 1;
                unit1RaceTag = "t";
            }
            if (unit1.equals("Raven")) {
                unit1AttVsGround = 0;
                unit1AttVsAir = 0;
                unit1AttSpeed = 0.0;
                unit1Arm = 1 + unit1ArmUps;
                unit1HP = 140;
                unit1Attributes = "LM";
                unit1IsGround = false;
                unit1RaceTag = "t";
            }
            if (unit1.equals("Reaper")) {
                unit1AttVsGround = (4+unit1AttUps)*2;
                unit1AttVsAir = 0;
                unit1AttSpeed = 0.79;
                unit1Arm = unit1ArmUps;
                unit1HP = 60;
                unit1Attributes = "LB";
                unit1IsGround = true;
                unit1AttackCount = 2;
                unit1RaceTag = "t";
            }
            if (unit1.equals("SCV")) {
                unit1AttVsGround = 5;
                unit1AttVsAir = 0;
                unit1AttSpeed = 1.07;
                unit1Arm = unit1ArmUps;
                unit1HP = 45;
                unit1Attributes = "LBM";
                unit1IsGround = true;
                unit1AttackCount = 1;
                unit1RaceTag = "t";
            }
            if (unit1.equals("Siege Tank (sieged)")) {
                unit1AttVsGround = 40 + 3*unit1AttUps;
                unit1AttVsAir = 0;
                unit1AttSpeed = 2.14;
                unit1Arm = 1 + unit1ArmUps;
                unit1HP = 175;
                unit1Attributes = "AM";
                unit1IsGround = true;
                unit1GBonusVsA = 30 + 2 * unit1AttUps;
                unit1AttackCount = 1;
                unit1RaceTag = "t";
            }
            if (unit1.equals("Siege Tank (tank mode)")) {
                unit1AttVsGround = 15 + 2*unit1AttUps;
                unit1AttVsAir = 18;
                unit1AttSpeed = 0.74;
                unit1Arm = 1 + unit1ArmUps;
                unit1HP = 175;
                unit1Attributes = "AM";
                unit1IsGround = true;
                unit1GBonusVsA = 10 + unit1AttUps;
                unit1AttackCount = 1;
                unit1RaceTag = "t";
            }
            if (unit1.equals("Thor (explosive)")) {
                unit1AttVsGround = (30 + 3*unit1AttUps)*2;
                unit1AttVsAir = (6+unit1AttUps)*4;
                unit1AttSpeed = 0.91;
                unit1AttSpeedVsAir = 2.14;
                unit1Arm = 1 + unit1ArmUps;
                unit1HP = 400;
                unit1Attributes = "AMX";
                unit1IsGround = true;
                unit1AirBonusVsL = 6 + unit1AttUps;
                unit1AttackCount = 2;
                unit1RaceTag = "t";
            }
            if (unit1.equals("Thor (high impact)")) {
                unit1AttVsGround = (30 + 3*unit1AttUps)*2;
                unit1AttVsAir = 40+4*unit1AttUps;
                unit1AttSpeed = 0.91;
                unit1AttSpeedVsAir = 1.71;
                unit1Arm = 1 + unit1ArmUps;
                unit1HP = 400;
                unit1Attributes = "AMX";
                unit1IsGround = true;
                unit1AirBonusVsX = 15 + 2 * unit1AttUps;
                unit1AttackCount = 2;
                unit1RaceTag = "t";
            }
            if (unit1.equals("Viking (assault mode)")) {
                unit1AttVsGround = 12 + unit1AttUps;
                unit1AttVsAir = 0;
                unit1AttSpeed = 0.71;
                unit1Arm = unit1ArmUps;
                unit1HP = 135;
                unit1Attributes = "AM";
                unit1IsGround = true;
                unit1GBonusVsM = 8;
                unit1AttackCount = 1;
                unit1RaceTag = "t";
            }
            if (unit1.equals("Viking (fighter mode)")) {
                unit1AttVsGround = 0;
                unit1AttVsAir = (10 + unit1AttUps)*2;
                unit1AttSpeed = 0.0;
                unit1AttSpeedVsAir = 1.43;
                unit1Arm = unit1ArmUps;
                unit1HP = 135;
                unit1Attributes = "AM";
                unit1IsGround = false;
                unit1AirBonusVsA = 4;
                unit1AttackCount = 2;
                unit1RaceTag = "t";
            }
            if (unit1.equals("Widow Mine")) {
                unit1AttVsGround = 125;
                unit1AttVsAir = 125;
                unit1AttSpeed = 29.0;
                unit1AttSpeedVsAir = 29.0;
                unit1Arm = unit1ArmUps;
                unit1HP = 90;
                unit1Attributes = "LM";
                unit1IsGround = true;
                unit1AttackCount = 1;
                unit1RaceTag = "t";
            }
        }
        else if (unitNum == 2) {
            if (unit2.equals("Auto-Turret")) {
                unit2AttVsGround = 18;
                unit2AttVsAir = 18;
                unit2AttSpeed = 0.57;
                unit2AttSpeedVsAir = 0.57;
                unit2Arm = 1;
                unit2HP = 150;
                unit2Attributes = "AMS";
                unit2IsGround = true;
                unit2AttackCount = 1;
                unit2LifeSpan = 10.0;
                unit2RaceTag = "t";
            }
            if (unit2.equals("Banshee")) {
                unit2AttVsGround = (12+unit2AttUps)*2;
                unit2AttVsAir = 0;
                unit2AttSpeed = 0.89;
                unit2Arm = unit2ArmUps;
                unit2HP = 140;
                unit2Attributes = "LM";
                unit2IsGround = false;
                unit2AttackCount = 2;
                unit2RaceTag = "t";
            }
            if (unit2.equals("Battlecruiser")) {
                unit2AttVsGround = 8 + unit2AttUps;
                unit2AttVsAir = 5 + unit2AttUps;
                unit2AttSpeed = 0.16;
                unit2AttSpeedVsAir = 0.16;
                unit2Arm = 3 + unit2ArmUps;
                unit2HP = 550;
                unit2Attributes = "AMX";
                unit2IsGround = false;
                unit2AttackCount = 1;
                unit2RaceTag = "t";
            }
            if (unit2.equals("Cyclone")) {
                unit2AttVsGround = 18 + unit2AttUps * 2;
                unit2AttVsAir = 18 + unit2AttUps * 2;
                unit2AttSpeed = 0.71;
                unit2AttSpeedVsAir = 0.71;
                unit2Arm = 1 + unit2ArmUps;
                unit2HP = 120;
                unit2Attributes = "AM";
                unit2IsGround = true;
                //unit2GBonusVsA = 2 + unit2AttUps;
                unit2AttackCount = 1;
                unit2RaceTag = "t";
            }
            if (unit2.equals("Ghost")) {
                unit2AttVsGround = 10 + unit2AttUps;
                unit2AttVsAir = 10 + unit2AttUps;
                unit2AttSpeed = 1.07;
                unit2AttSpeedVsAir = 1.07;
                unit2Arm = unit2ArmUps;
                unit2HP = 100;
                unit2Attributes = "BP";
                unit2IsGround = true;
                unit2GBonusVsL = 10 + unit2AttUps;
                unit2AirBonusVsL = 10 + unit2AttUps;
                unit2AttackCount = 1;
                unit2RaceTag = "t";
            }
            if (unit2.equals("Hellbat")) {
                unit2AttVsGround = 18 + 2 * unit2AttUps;
                unit2AttVsAir = 0;
                unit2AttSpeed = 1.43;
                unit2Arm = unit2ArmUps;
                unit2HP = 135;
                unit2Attributes = "LBM";
                unit2IsGround = true;
                unit2GBonusVsL = unit2AttUps;
                unit2AttackCount = 1;
                unit2RaceTag = "t";
            }
            if (unit2.equals("Hellion")) {
                unit2AttVsGround = 8 + unit2AttUps;
                unit2AttVsAir = 0;
                unit2AttSpeed = 1.79;
                unit2Arm = unit2ArmUps;
                unit2HP = 90;
                unit2Attributes = "LM";
                unit2IsGround = true;
                unit2GBonusVsL = 6 + unit2AttUps;
                unit2AttackCount = 1;
                unit2RaceTag = "t";
            }
            if (unit2.equals("Liberator (defender mode)")) {
                unit2AttVsGround = 75 + 5*unit2AttUps;
                unit2AttVsAir = 0;
                unit2AttSpeed = 1.14;
                unit2Arm = unit2ArmUps;
                unit2HP = 180;
                unit2Attributes = "AM";
                unit2IsGround = false;
                unit2AttackCount = 1;
                unit2RaceTag = "t";
            }
            if (unit2.equals("Liberator (fighter mode)")) {
                unit2AttVsGround = 0;
                unit2AttVsAir = (7 + unit2AttUps) * 2;
                unit2AttSpeed = 0.0;
                unit2AttSpeedVsAir = 1.29;
                unit2Arm = unit2ArmUps;
                unit2HP = 180;
                unit2Attributes = "AM";
                unit2IsGround = false;
                unit2AttackCount = 2;
                unit2RaceTag = "t";
            }
            if (unit2.equals("Marauder")) {
                unit2AttVsGround = (5+unit2AttUps)*2;
                unit2AttVsAir = 0;
                unit2AttSpeed = 1.07;
                //unit2AttSpeed2 = 0.71;
                unit2Arm = 1 + unit2ArmUps;
                unit2HP = 125;
                unit2Attributes = "AB";
                unit2IsGround = true;
                unit2GBonusVsA = 5;
                unit2AttackCount = 2;
                unit2RaceTag = "t";
            }
            if (unit2.equals("Marine")) {
                unit2AttVsGround = 6 + unit2AttUps;
                unit2AttVsAir = 6 + unit2AttUps;
                unit2AttSpeed = 0.61;
                //unit2AttSpeed2 = .40;
                unit2AttSpeedVsAir = 0.61;
                unit2Arm = unit2ArmUps;
                unit2HP = 45;
                unit2Attributes = "LB";
                unit2IsGround = true;
                unit2AttackCount = 1;
                unit2RaceTag = "t";
            }
            if (unit2.equals("Medivac")) {
                unit2AttVsGround = 0;
                unit2AttVsAir = 0;
                unit2AttSpeed = 0.0;
                unit2Arm = 1 + unit2ArmUps;
                unit2HP = 150;
                unit2Attributes = "AM";
                unit2IsGround = false;
                unit2RaceTag = "t";
            }
            if (unit2.equals("Missile Turret")) {
                unit2AttVsGround = 0;
                unit2AttVsAir = 12*2;
                unit2AttSpeed = 0.0;
                unit2AttSpeedVsAir = 0.61;
                unit2Arm = 0;
//                if (!unit2ArmorUps.getSelectedItem().toString().equals("0")) {
//                    unit2ArmorUps.setSelection(3);
//                    unit2Arm = 2;
//                }
                unit2HP = 250;
                unit2Attributes = "AMS";
                unit2IsGround = true;
                unit2AttackCount = 2;
                unit2RaceTag = "t";
            }
            if (unit2.equals("MULE")) {
                unit2AttVsGround = 0;
                unit2AttVsAir = 0;
                unit2AttSpeed = 0.0;
                unit2Arm = unit2ArmUps;
                unit2HP = 60;
                unit2Attributes = "LM";
                unit2IsGround = true;
                unit2LifeSpan = 64.0;
                unit2RaceTag = "t";
            }
            if (unit2.equals("Planetary Fortress")) {
                unit2AttVsGround = 40;
                unit2AttVsAir = 0;
                unit2AttSpeed = 1.43;
                unit2Arm = 3;
//                if (!unit2ArmorUps.getSelectedItem().toString().equals("0")) {
//                    unit2Arm = 5;
//                }
                unit2HP = 1500;
                unit2Attributes = "AMS";
                unit2IsGround = true;
                unit2AttackCount = 1;
                unit2RaceTag = "t";
            }
            if (unit2.equals("Raven")) {
                unit2AttVsGround = 0;
                unit2AttVsAir = 0;
                unit2AttSpeed = 0.0;
                unit2Arm = 1 + unit2ArmUps;
                unit2HP = 140;
                unit2Attributes = "LM";
                unit2IsGround = false;
                unit2RaceTag = "t";
            }
            if (unit2.equals("Reaper")) {
                unit2AttVsGround = (4+unit2AttUps)*2;
                unit2AttVsAir = 0;
                unit2AttSpeed = 0.79;
                unit2Arm = unit2ArmUps;
                unit2HP = 60;
                unit2Attributes = "LB";
                unit2IsGround = true;
                unit2AttackCount = 2;
                unit2RaceTag = "t";
            }
            if (unit2.equals("SCV")) {
                unit2AttVsGround = 5;
                unit2AttVsAir = 0;
                unit2AttSpeed = 1.07;
                unit2Arm = unit2ArmUps;
                unit2HP = 45;
                unit2Attributes = "LBM";
                unit2IsGround = true;
                unit2AttackCount = 1;
                unit2RaceTag = "t";
            }
            if (unit2.equals("Siege Tank (sieged)")) {
                unit2AttVsGround = 40 + 3*unit2AttUps;
                unit2AttVsAir = 0;
                unit2AttSpeed = 2.14;
                unit2Arm = 1 + unit2ArmUps;
                unit2HP = 175;
                unit2Attributes = "AM";
                unit2IsGround = true;
                unit2GBonusVsA = 30 + 2 * unit2AttUps;
                unit2AttackCount = 1;
                unit2RaceTag = "t";
            }
            if (unit2.equals("Siege Tank (tank mode)")) {
                unit2AttVsGround = 15 + 2*unit2AttUps;
                unit2AttVsAir = 18;
                unit2AttSpeed = 0.74;
                unit2Arm = 1 + unit2ArmUps;
                unit2HP = 175;
                unit2Attributes = "AM";
                unit2IsGround = true;
                unit2GBonusVsA = 10 + unit2AttUps;
                unit2AttackCount = 1;
                unit2RaceTag = "t";
            }
            if (unit2.equals("Thor (explosive)")) {
                unit2AttVsGround = (30 + 3*unit2AttUps)*2;
                unit2AttVsAir = (6+unit2AttUps)*4;
                unit2AttSpeed = 0.91;
                unit2AttSpeedVsAir = 2.14;
                unit2Arm = 1 + unit2ArmUps;
                unit2HP = 400;
                unit2Attributes = "AMX";
                unit2IsGround = true;
                unit2AirBonusVsL = 6 + unit2AttUps;
                unit2AttackCount = 2;
                unit2RaceTag = "t";
            }
            if (unit2.equals("Thor (high impact)")) {
                unit2AttVsGround = (30 + 3*unit2AttUps)*2;
                unit2AttVsAir = 40+4*unit2AttUps;
                unit2AttSpeed = 0.91;
                unit2AttSpeedVsAir = 1.71;
                unit2Arm = 1 + unit2ArmUps;
                unit2HP = 400;
                unit2Attributes = "AMX";
                unit2IsGround = true;
                unit2AirBonusVsX = 15 + 2 * unit2AttUps;
                unit2AttackCount = 2;
                unit2RaceTag = "t";
            }
            if (unit2.equals("Viking (assault mode)")) {
                unit2AttVsGround = 12 + unit2AttUps;
                unit2AttVsAir = 0;
                unit2AttSpeed = 0.71;
                unit2Arm = unit2ArmUps;
                unit2HP = 135;
                unit2Attributes = "AM";
                unit2IsGround = true;
                unit2GBonusVsM = 8;
                unit2AttackCount = 1;
                unit2RaceTag = "t";
            }
            if (unit2.equals("Viking (fighter mode)")) {
                unit2AttVsGround = 0;
                unit2AttVsAir = (10 + unit2AttUps)*2;
                unit2AttSpeed = 0.0;
                unit2AttSpeedVsAir = 1.43;
                unit2Arm = unit2ArmUps;
                unit2HP = 135;
                unit2Attributes = "AM";
                unit2IsGround = false;
                unit2AirBonusVsA = 4;
                unit2AttackCount = 2;
                unit2RaceTag = "t";
            }
            if (unit2.equals("Widow Mine")) {
                unit2AttVsGround = 125;
                unit2AttVsAir = 125;
                unit2AttSpeed = 29.0;
                unit2AttSpeedVsAir = 29.0;
                unit2Arm = unit2ArmUps;
                unit2HP = 90;
                unit2Attributes = "LM";
                unit2IsGround = true;
                unit2AttackCount = 1;
                unit2RaceTag = "t";
            }
        }
    }

    public void protossSetter(Integer unitNum) {
        if (unitNum == 1) {
            if (unit1.equals("Adept")) {
                unit1AttVsGround = 10 + unit1AttUps;
                unit1AttVsAir = 0;
                unit1AttSpeed = 1.61;
                //unit1AttSpeed2 = 1.11;
                unit1Arm = 1 + unit1ArmUps;
                unit1HP = 70;
                unit1Shields = 70;
                unit1Attributes = "LB";
                unit1IsGround = true;
                unit1GBonusVsL = 12;
                unit1AttackCount = 1;
                unit1RaceTag = "p";
            }
            if (unit1.equals("Archon")) {
                unit1AttVsGround = 25 + 3*unit1AttUps;
                unit1AttVsAir = 25 + 3*unit1AttUps;
                unit1AttSpeed = 1.25;
                unit1AttSpeedVsAir = 1.25;
                unit1Arm = unit1ArmUps;
                unit1HP = 10;
                unit1Shields = 350;
                unit1Attributes = "PX";
                unit1IsGround = true;
                unit1GBonusVsB = 10 + unit1AttUps;
                unit1AirBonusVsB = 10 + unit1AttUps;
                unit1AttackCount = 1;
                unit1RaceTag = "p";
            }
            if (unit1.equals("Carrier")) {
                unit1AttVsGround = (5 + unit1AttUps) * 2;
                unit1AttVsAir = (5 + unit1AttUps) * 2;
                unit1AttSpeed = 0.2675;
                unit1AttSpeedVsAir = 0.2675;
                unit1Arm = 2 + unit1ArmUps;
                unit1HP = 300;
                unit1Shields = 150;
                unit1Attributes = "AMX";
                unit1IsGround = false;
                unit1AttackCount = 2;
                unit1RaceTag = "p";
            }
            if (unit1.equals("Colossus")) {
                unit1AttVsGround = (10 + unit1AttUps) * 2;
                unit1AttVsAir = 0;
                unit1AttSpeed = 1.07;
                unit1Arm = 1 + unit1ArmUps;
                unit1HP = 200;
                unit1Shields = 150;
                unit1Attributes = "AMX";
                unit1IsGround = true;
                unit1GBonusVsL = 5 + unit1AttUps;
                unit1AttackCount = 2;
                unit1RaceTag = "p";
            }
            if (unit1.equals("Dark Templar")) {
                unit1AttVsGround = 45 + 5 * unit1AttUps;
                unit1AttVsAir = 0;
                unit1AttSpeed = 1.21;
                unit1Arm = 1 + unit1ArmUps;
                unit1HP = 40;
                unit1Shields = 80;
                unit1Attributes = "LBP";
                unit1IsGround = true;
                unit1AttackCount = 1;
                unit1RaceTag = "p";
            }
            if (unit1.equals("Disruptor")) {
                unit1AttVsGround = 145;
                unit1AttVsAir = 0;
                unit1AttSpeed = 14.3;
                unit1Arm = 1 + unit1ArmUps;
                unit1HP = 100;
                unit1Shields = 100;
                unit1Attributes = "AM";
                unit1IsGround = true;
                unit1AttackCount = 1;
                unit1RaceTag = "p";
            }
            if (unit1.equals("High Templar")) {
                unit1AttVsGround = 4+unit1AttUps;
                unit1AttVsAir = 0;
                unit1AttSpeed = 1.25;
                unit1Arm = unit1ArmUps;
                unit1HP = 40;
                unit1Shields = 40;
                unit1Attributes = "LBP";
                unit1IsGround = true;
                unit1AttackCount = 1;
                unit1RaceTag = "p";
            }
            if (unit1.equals("Immortal")) {
                unit1AttVsGround = 20 + 2*unit1AttUps;
                unit1AttVsAir = 0;
                unit1AttSpeed = 1.04;
                unit1Arm = 1 + unit1ArmUps;
                unit1HP = 200;
                unit1Shields = 100;
                unit1Attributes = "AM";
                unit1IsGround = true;
                unit1GBonusVsA = 30 + 3 * unit1AttUps;
                unit1AttackCount = 1;
                unit1RaceTag = "p";
            }
            if (unit1.equals("Interceptor")) {
                unit1AttVsGround = (5+unit1AttUps) * 2;
                unit1AttVsAir = (5+unit1AttUps)*2;
                unit1AttSpeed = 2.14;
                unit1AttSpeedVsAir = 2.14;
                unit1Arm = unit1ArmUps;
                unit1HP = 40;
                unit1Shields = 40;
                unit1Attributes = "LM";
                unit1IsGround = false;
                unit1AttackCount = 2;
                unit1RaceTag = "p";
            }
            if (unit1.equals("Mothership")) {
                unit1AttVsGround = (6+unit1AttUps)*6;
                unit1AttVsAir = (6+unit1AttUps)*6;
                unit1AttSpeed = 1.58;
                unit1AttSpeedVsAir = 1.58;
                unit1Arm = 2 + unit1ArmUps;
                unit1HP = 350;
                unit1Shields = 350;
                unit1Attributes = "AMPX";
                unit1IsGround = false;
                unit1AttackCount = 6;
                unit1RaceTag = "p";
            }
            if (unit1.equals("Observer")) {
                unit1AttVsGround = 0;
                unit1AttVsAir = 0;
                unit1AttSpeed = 0.0;
                unit1Arm = unit1ArmUps;
                unit1HP = 40;
                unit1Shields = 20;
                unit1Attributes = "LM";
                unit1IsGround = false;
                unit1RaceTag = "p";
            }
            if (unit1.equals("Oracle")) {
                unit1AttVsGround = 15;
                unit1AttVsAir = 0;
                unit1AttSpeed = 0.61;
                unit1Arm = unit1ArmUps;
                unit1HP = 100;
                unit1Shields = 60;
                unit1Attributes = "AMP";
                unit1IsGround = false;
                unit1GBonusVsL = 7;
                unit1AttackCount = 1;
                unit1RaceTag = "p";
            }
            if (unit1.equals("Phoenix")) {
                unit1AttVsGround = 0;
                unit1AttVsAir = (5 + unit1AttUps)*2;
                unit1AttSpeed = 0.0;
                unit1AttSpeedVsAir = 0.79;
                unit1Arm = unit1ArmUps;
                unit1HP = 120;
                unit1Shields = 60;
                unit1Attributes = "LM";
                unit1IsGround = false;
                unit1AirBonusVsL = 5;
                unit1AttackCount = 2;
                unit1RaceTag = "p";
            }
            if (unit1.equals("Photon Cannon")) {
                unit1AttVsGround = 20;
                unit1AttVsAir = 20;
                unit1AttSpeed = 0.89;
                unit1AttSpeedVsAir = 0.89;
                unit1Arm = 1;
                unit1HP = 150;
                unit1Shields = 150;
                unit1Attributes = "AS";
                unit1IsGround = true;
                unit1AttackCount = 1;
                unit1RaceTag = "p";
            }
                if (unit1.equals("Probe")) {
                unit1AttVsGround = 5;
                unit1AttVsAir = 0;
                unit1AttSpeed = 1.07;
                unit1Arm = unit1ArmUps;
                unit1HP = 20;
                unit1Shields = 20;
                unit1Attributes = "LM";
                unit1IsGround = true;
                unit1AttackCount = 1;
                unit1RaceTag = "p";
            }
            if (unit1.equals("Sentry")) {
                unit1AttVsGround = 6 + unit1AttUps;
                unit1AttVsAir = 6 + unit1AttUps;
                unit1AttSpeed = 0.71;
                unit1AttSpeedVsAir = 0.71;
                unit1Arm = 1 + unit1ArmUps;
                unit1HP = 40;
                unit1Shields = 40;
                unit1Attributes = "LMP";
                unit1IsGround = true;
                unit1AttackCount = 1;
                unit1RaceTag = "p";
            }
            if (unit1.equals("Stalker")) {
                unit1AttVsGround = 13+unit1AttUps;
                unit1AttVsAir = 13+unit1AttUps;
                unit1AttSpeed = 1.34;
                unit1AttSpeedVsAir = 1.34;
                unit1Arm = 1 + unit1ArmUps;
                unit1HP = 80;
                unit1Shields = 80;
                unit1Attributes = "AM";
                unit1IsGround = true;
                unit1GBonusVsA = 5 + unit1AttUps;
                unit1AirBonusVsA = 5 + unit1AttUps;
                unit1AttackCount = 1;
                unit1RaceTag = "p";
            }
            if (unit1.equals("Tempest")) {
                unit1AttVsGround = 40+4*unit1AttUps;
                unit1AttVsAir = 30+3*unit1AttUps;
                unit1AttSpeed = 2.36;
                unit1AttSpeedVsAir = 2.36;
                unit1Arm = 2 + unit1ArmUps;
                unit1HP = 150;
                unit1Shields = 125;
                unit1Attributes = "AMX";
                unit1IsGround = false;
                unit1AirBonusVsX = 22 + 2 * unit1AttUps;
                unit1AttackCount = 1;
                unit1RaceTag = "p";
            }
            if (unit1.equals("Void Ray")) {
                unit1AttVsGround = 6+unit1AttUps;
                unit1AttVsAir = 6+unit1AttUps;
                unit1AttSpeed = 0.36;
                unit1AttSpeedVsAir = 0.36;
                unit1Arm = unit1ArmUps;
                unit1HP = 150;
                unit1Shields = 100;
                unit1Attributes = "AM";
                unit1IsGround = false;
                unit1GBonusVsA = 4;
                unit1AirBonusVsA = 4;
                unit1AttackCount = 1;
                unit1RaceTag = "p";
            }
            if (unit1.equals("Warp Prism")) {
                unit1AttVsGround = 0;
                unit1AttVsAir = 0;
                unit1AttSpeed = 0.0;
                unit1Arm = unit1ArmUps;
                unit1HP = 80;
                unit1Shields = 100;
                unit1Attributes = "AMP";
                unit1IsGround = false;
                unit1RaceTag = "p";
            }
            if (unit1.equals("Zealot")) {
                unit1AttVsGround = (8+unit1AttUps)*2;
                unit1AttVsAir = 0;
                unit1AttSpeed = 0.86;
                unit1Arm = 1 + unit1ArmUps;
                unit1HP = 100;
                unit1Shields = 50;
                unit1Attributes = "LB";
                unit1IsGround = true;
                unit1AttackCount = 2;
                unit1RaceTag = "p";
            }
        }
        else if (unitNum == 2) {
            if (unit2.equals("Adept")) {
                unit2AttVsGround = 10 + unit2AttUps;
                unit2AttVsAir = 0;
                unit2AttSpeed = 1.61;
                //unit2AttSpeed2 = 1.11;
                unit2Arm = 1 + unit2ArmUps;
                unit2HP = 70;
                unit2Shields = 70;
                unit2Attributes = "LB";
                unit2IsGround = true;
                unit2GBonusVsL = 12;
                unit2AttackCount = 1;
                unit2RaceTag = "p";
            }
            if (unit2.equals("Archon")) {
                unit2AttVsGround = 25 + 3*unit2AttUps;
                unit2AttVsAir = 25 + 3*unit2AttUps;
                unit2AttSpeed = 1.25;
                unit2AttSpeedVsAir = 1.25;
                unit2Arm = unit2ArmUps;
                unit2HP = 10;
                unit2Shields = 350;
                unit2Attributes = "PX";
                unit2IsGround = true;
                unit2GBonusVsB = 10 + unit2AttUps;
                unit2AirBonusVsB = 10 + unit2AttUps;
                unit2AttackCount = 1;
                unit2RaceTag = "p";
            }
            if (unit2.equals("Carrier")) {
                unit2AttVsGround = (5 + unit2AttUps) * 2;
                unit2AttVsAir = (5 + unit2AttUps) * 2;
                unit2AttSpeed = 0.2675;
                unit2AttSpeedVsAir = 0.2675;
                unit2Arm = 2 + unit2ArmUps;
                unit2HP = 300;
                unit2Shields = 150;
                unit2Attributes = "AMX";
                unit2IsGround = false;
                unit2AttackCount = 2;
                unit2RaceTag = "p";
            }
            if (unit2.equals("Colossus")) {
                unit2AttVsGround = (10 + unit2AttUps) * 2;
                unit2AttVsAir = 0;
                unit2AttSpeed = 1.07;
                unit2Arm = 1 + unit2ArmUps;
                unit2HP = 200;
                unit2Shields = 150;
                unit2Attributes = "AMX";
                unit2IsGround = true;
                unit2GBonusVsL = 5 + unit2AttUps;
                unit2AttackCount = 2;
                unit2RaceTag = "p";
            }
            if (unit2.equals("Dark Templar")) {
                unit2AttVsGround = 45 + 5 * unit2AttUps;
                unit2AttVsAir = 0;
                unit2AttSpeed = 1.21;
                unit2Arm = 1 + unit2ArmUps;
                unit2HP = 40;
                unit2Shields = 80;
                unit2Attributes = "LBP";
                unit2IsGround = true;
                unit2AttackCount = 1;
                unit2RaceTag = "p";
            }
            if (unit2.equals("Disruptor")) {
                unit2AttVsGround = 145;
                unit2AttVsAir = 0;
                unit2AttSpeed = 14.3;
                unit2Arm = 1 + unit2ArmUps;
                unit2HP = 100;
                unit2Shields = 100;
                unit2Attributes = "AM";
                unit2IsGround = true;
                unit2AttackCount = 1;
                unit2RaceTag = "p";
            }
            if (unit2.equals("High Templar")) {
                unit2AttVsGround = 4+unit2AttUps;
                unit2AttVsAir = 0;
                unit2AttSpeed = 1.25;
                unit2Arm = unit2ArmUps;
                unit2HP = 40;
                unit2Shields = 40;
                unit2Attributes = "LBP";
                unit2IsGround = true;
                unit2AttackCount = 1;
                unit2RaceTag = "p";
            }
            if (unit2.equals("Immortal")) {
                unit2AttVsGround = 20 + 2*unit2AttUps;
                unit2AttVsAir = 0;
                unit2AttSpeed = 1.04;
                unit2Arm = 1 + unit2ArmUps;
                unit2HP = 200;
                unit2Shields = 100;
                unit2Attributes = "AM";
                unit2IsGround = true;
                unit2GBonusVsA = 30 + 3 * unit2AttUps;
                unit2AttackCount = 1;
                unit2RaceTag = "p";
            }
            if (unit2.equals("Interceptor")) {
                unit2AttVsGround = (5+unit2AttUps) * 2;
                unit2AttVsAir = (5+unit2AttUps)*2;
                unit2AttSpeed = 2.14;
                unit2AttSpeedVsAir = 2.14;
                unit2Arm = unit2ArmUps;
                unit2HP = 40;
                unit2Shields = 40;
                unit2Attributes = "LM";
                unit2IsGround = false;
                unit2AttackCount = 2;
                unit2RaceTag = "p";
            }
            if (unit2.equals("Mothership")) {
                unit2AttVsGround = (6+unit2AttUps)*6;
                unit2AttVsAir = (6+unit2AttUps)*6;
                unit2AttSpeed = 1.58;
                unit2AttSpeedVsAir = 1.58;
                unit2Arm = 2 + unit2ArmUps;
                unit2HP = 350;
                unit2Shields = 350;
                unit2Attributes = "AMPX";
                unit2IsGround = false;
                unit2AttackCount = 6;
                unit2RaceTag = "p";
            }
            if (unit2.equals("Observer")) {
                unit2AttVsGround = 0;
                unit2AttVsAir = 0;
                unit2AttSpeed = 0.0;
                unit2Arm = unit2ArmUps;
                unit2HP = 40;
                unit2Shields = 20;
                unit2Attributes = "LM";
                unit2IsGround = false;
                unit2RaceTag = "p";
            }
            if (unit2.equals("Oracle")) {
                unit2AttVsGround = 15;
                unit2AttVsAir = 0;
                unit2AttSpeed = 0.61;
                unit2Arm = unit2ArmUps;
                unit2HP = 100;
                unit2Shields = 60;
                unit2Attributes = "AMP";
                unit2IsGround = false;
                unit2GBonusVsL = 7;
                unit2AttackCount = 1;
                unit2RaceTag = "p";
            }
            if (unit2.equals("Phoenix")) {
                unit2AttVsGround = 0;
                unit2AttVsAir = (5 + unit2AttUps)*2;
                unit2AttSpeed = 0.0;
                unit2AttSpeedVsAir = 0.79;
                unit2Arm = unit2ArmUps;
                unit2HP = 120;
                unit2Shields = 60;
                unit2Attributes = "LM";
                unit2IsGround = false;
                unit2AirBonusVsL = 5;
                unit2AttackCount = 2;
                unit2RaceTag = "p";
            }
            if (unit2.equals("Photon Cannon")) {
                unit2AttVsGround = 20;
                unit2AttVsAir = 20;
                unit2AttSpeed = 0.89;
                unit2AttSpeedVsAir = 0.89;
                unit2Arm = 1;
                unit2HP = 150;
                unit2Shields = 150;
                unit2Attributes = "AS";
                unit2IsGround = true;
                unit2AttackCount = 1;
                unit2RaceTag = "p";
            }
            if (unit2.equals("Probe")) {
                unit2AttVsGround = 5;
                unit2AttVsAir = 0;
                unit2AttSpeed = 1.07;
                unit2Arm = unit2ArmUps;
                unit2HP = 20;
                unit2Shields = 20;
                unit2Attributes = "LM";
                unit2IsGround = true;
                unit2AttackCount = 1;
                unit2RaceTag = "p";
            }
            if (unit2.equals("Sentry")) {
                unit2AttVsGround = 6 + unit2AttUps;
                unit2AttVsAir = 6 + unit2AttUps;
                unit2AttSpeed = 0.71;
                unit2AttSpeedVsAir = 0.71;
                unit2Arm = 1 + unit2ArmUps;
                unit2HP = 40;
                unit2Shields = 40;
                unit2Attributes = "LMP";
                unit2IsGround = true;
                unit2AttackCount = 1;
                unit2RaceTag = "p";
            }
            if (unit2.equals("Stalker")) {
                unit2AttVsGround = 13+unit2AttUps;
                unit2AttVsAir = 13+unit2AttUps;
                unit2AttSpeed = 1.34;
                unit2AttSpeedVsAir = 1.34;
                unit2Arm = 1 + unit2ArmUps;
                unit2HP = 80;
                unit2Shields = 80;
                unit2Attributes = "AM";
                unit2IsGround = true;
                unit2GBonusVsA = 5 + unit2AttUps;
                unit2AirBonusVsA = 5 + unit2AttUps;
                unit2AttackCount = 1;
                unit2RaceTag = "p";
            }
            if (unit2.equals("Tempest")) {
                unit2AttVsGround = 40+4*unit2AttUps;
                unit2AttVsAir = 30+3*unit2AttUps;
                unit2AttSpeed = 2.36;
                unit2AttSpeedVsAir = 2.36;
                unit2Arm = 2 + unit2ArmUps;
                unit2HP = 150;
                unit2Shields = 125;
                unit2Attributes = "AMX";
                unit2IsGround = false;
                unit2AirBonusVsX = 22 + 2 * unit2AttUps;
                unit2AttackCount = 1;
                unit2RaceTag = "p";
            }
            if (unit2.equals("Void Ray")) {
                unit2AttVsGround = 6+unit2AttUps;
                unit2AttVsAir = 6+unit2AttUps;
                unit2AttSpeed = 0.36;
                unit2AttSpeedVsAir = 0.36;
                unit2Arm = unit2ArmUps;
                unit2HP = 150;
                unit2Shields = 100;
                unit2Attributes = "AM";
                unit2IsGround = false;
                unit2GBonusVsA = 4;
                unit2AirBonusVsA = 4;
                unit2AttackCount = 1;
                unit2RaceTag = "p";
            }
            if (unit2.equals("Warp Prism")) {
                unit2AttVsGround = 0;
                unit2AttVsAir = 0;
                unit2AttSpeed = 0.0;
                unit2Arm = unit2ArmUps;
                unit2HP = 80;
                unit2Shields = 100;
                unit2Attributes = "AMP";
                unit2IsGround = false;
                unit2RaceTag = "p";
            }
            if (unit2.equals("Zealot")) {
                unit2AttVsGround = (8+unit2AttUps)*2;
                unit2AttVsAir = 0;
                unit2AttSpeed = 0.86;
                unit2Arm = 1 + unit2ArmUps;
                unit2HP = 100;
                unit2Shields = 50;
                unit2Attributes = "LB";
                unit2IsGround = true;
                unit2AttackCount = 2;
                unit2RaceTag = "p";
            }
        }
    }

    public void zergSetter(Integer unitNum) {
        if (unitNum == 1) {
            if (unit1.equals("Baneling")) {
                unit1AttVsGround = 20 + 2*unit1AttUps;
                unit1AttVsAir = 0;
                unit1Arm = unit1ArmUps;
                unit1HP = 30;
                unit1Attributes = "B";
                unit1GBonusVsL = 15 + 2 * unit1AttUps;
                unit1GBonusVsS = 60 + 3 * unit1AttUps;
                unit1IsGround = true;
                unit1AttackCount = 1;
                unit1RaceTag = "z";
            }
            if (unit1.equals("Brood Lord")) {
                unit1AttVsGround = 20 + 2*unit1AttUps;
                unit1AttVsAir = 0;
                unit1AttSpeed = 1.79;
                unit1AttSpeedVsAir = 0.0;
                unit1Arm = 1 + unit1ArmUps;
                unit1HP = 225;
                unit1Attributes = "ABX";
                unit1IsGround = false;
                unit1AttackCount = 1;
                unit1RaceTag = "z";
            }
            if (unit1.equals("Broodling")) {
                unit1AttVsGround = 4 + unit1AttUps;
                unit1AttVsAir = 0;
                unit1AttSpeed = 0.46;
                unit1Arm = unit1ArmUps;
                unit1HP = 30;
                unit1Attributes = "LB";
                unit1IsGround = true;
                unit1AttackCount = 1;
                unit1LifeSpan = 5.71;
                unit1RaceTag = "z";
            }
            if (unit1.equals("Changeling")) {
                unit1AttVsGround = 0;
                unit1AttVsAir = 0;
                unit1AttSpeed = 0.0;
                unit1Arm = 0;
                unit1HP = 5;
                unit1Attributes = "LB";
                unit1IsGround = true;
                unit1LifeSpan = 150.0;
                unit1RaceTag = "z";
            }
            if (unit1.equals("Corruptor")) {
                unit1AttVsGround = 0;
                unit1AttVsAir = 14 + unit1AttUps;
                unit1AttSpeed = 0.0;
                unit1AttSpeedVsAir = 1.36;
                unit1Arm = 2 + unit1ArmUps;
                unit1HP = 200;
                unit1Attributes = "AB";
                unit1IsGround = false;
                unit1AirBonusVsX = 6 + unit1AttUps;
                unit1AttackCount = 1;
                unit1RaceTag = "z";
            }
            if (unit1.equals("Drone")) {
                unit1AttVsGround = 5;
                unit1AttVsAir = 0;
                unit1AttSpeed = 1.07;
                unit1Arm = unit1ArmUps;
                unit1HP = 40;
                unit1Attributes = "LB";
                unit1IsGround = true;
                unit1AttackCount = 1;
                unit1RaceTag = "z";
            }
            if (unit1.equals("Hydralisk")) {
                unit1AttVsGround = 12 + unit1AttUps;
                unit1AttVsAir = 12 + unit1AttUps;
                unit1AttSpeed = 0.59;
                unit1AttSpeedVsAir = 0.59;
                unit1Arm = unit1ArmUps;
                unit1HP = 90;
                unit1Attributes = "LB";
                unit1IsGround = true;
                unit1AttackCount = 1;
                unit1RaceTag = "z";
            }
            if (unit1.equals("Infested Terran")) {
                unit1AttVsGround = 6 + unit1AttUps;
                unit1AttVsAir = 14 + unit1AttUps;
                unit1AttSpeed = 0.61;
                unit1AttSpeedVsAir = 0.95;
                unit1Arm = 0;
                unit1HP = 50;
                unit1Attributes = "LB";
                unit1IsGround = true;
                unit1AttackCount = 1;
                unit1LifeSpan = 21.0;
                unit1RaceTag = "z";
            }
            if (unit1.equals("Infestor")) {
                unit1AttVsGround = 0;
                unit1AttVsAir = 0;
                unit1AttSpeed = 0.0;
                unit1Arm = unit1ArmUps;
                unit1HP = 90;
                unit1Attributes = "ABP";
                unit1IsGround = true;
                unit1RaceTag = "z";
            }
            if (unit1.equals("Larva")) {
                unit1AttVsGround = 0;
                unit1AttVsAir = 0;
                unit1AttSpeed = 0.0;
                unit1Arm = 10;
                unit1HP = 25;
                unit1Attributes = "LB";
                unit1IsGround = true;
                unit1RaceTag = "z";
            }
            if (unit1.equals("Locust")) {
                unit1AttVsGround = 10 + unit1AttUps;
                unit1AttVsAir = 0;
                unit1AttSpeed = 0.43;
                unit1Arm = unit1ArmUps;
                unit1HP = 50;
                unit1Attributes = "LB";
                unit1IsGround = true;
                unit1AttackCount = 1;
                unit1LifeSpan = 18.0;
                unit1RaceTag = "z";
            }
            if (unit1.equals("Lurker")) {
                unit1AttVsGround = 20 + 2 * unit1AttUps;
                unit1AttVsAir = 0;
                unit1AttSpeed = 1.43;
                unit1Arm = 1 + unit1ArmUps;
                unit1HP = 200;
                unit1Attributes = "AB";
                unit1IsGround = true;
                unit1GBonusVsA = 10 + unit1AttUps;
                unit1AttackCount = 1;
                unit1RaceTag = "z";
            }
            if (unit1.equals("Mutalisk")) {
                unit1AttVsGround = 9 + unit1AttUps;
                unit1AttVsAir = 9 + unit1AttUps;
                unit1AttSpeed = 1.09;
                unit1AttSpeedVsAir = 1.09;
                unit1Arm = unit1ArmUps;
                unit1HP = 120;
                unit1Attributes = "LB";
                unit1IsGround = false;
                unit1AttackCount = 1;
                unit1RaceTag = "z";
            }
            if (unit1.equals("Nydus Worm")) {
                unit1AttVsGround = 0;
                unit1AttVsAir = 0;
                unit1AttSpeed = 0.0;
                unit1Arm = 1;
                unit1HP = 300;
                unit1Attributes = "ABS";
                unit1IsGround = true;
                unit1RaceTag = "z";
            }
            if (unit1.equals("Overlord")) {
                unit1AttVsGround = 0;
                unit1AttVsAir = 0;
                unit1AttSpeed = 0.0;
                unit1Arm = unit1ArmUps;
                unit1HP = 200;
                unit1Attributes = "AB";
                unit1IsGround = false;
                unit1RaceTag = "z";
            }
            if (unit1.equals("Overseer")) {
                unit1AttVsGround = 0;
                unit1AttVsAir = 0;
                unit1AttSpeed = 0.0;
                unit1Arm = 1 + unit1ArmUps;
                unit1HP = 200;
                unit1Attributes = "AB";
                unit1IsGround = false;
                unit1RaceTag = "z";
            }
            if (unit1.equals("Queen")) {
                unit1AttVsGround = (4+ unit1AttUps)*2;
                unit1AttVsAir = 9 + unit1AttUps;
                unit1AttSpeed = 0.71;
                unit1AttSpeedVsAir = 0.71;
                unit1Arm = 1 + unit1ArmUps;
                unit1HP = 175;
                unit1Attributes = "BP";
                unit1IsGround = true;
                unit1AttackCount = 2;
                unit1RaceTag = "z";
            }
            if (unit1.equals("Ravager")) {
                unit1AttVsGround = 16 + 2*unit1AttUps;
                unit1AttVsAir = 0;
                unit1AttSpeed = 1.14;
                unit1Arm = 1 + unit1ArmUps;
                unit1HP = 120;
                unit1Attributes = "B";
                unit1IsGround = true;
                unit1AttackCount = 1;
                unit1RaceTag = "z";
            }
            if (unit1.equals("Roach")) {
                unit1AttVsGround = 16 + 2 * unit1AttUps;
                unit1AttVsAir = 0;
                unit1AttSpeed = 1.43;
                unit1Arm = 1 + unit1ArmUps;
                unit1HP = 145;
                unit1Attributes = "AB";
                unit1IsGround = true;
                unit1AttackCount = 1;
                unit1RaceTag = "z";
            }
            if (unit1.equals("Spine Crawler")) {
                unit1AttVsGround = 25;
                unit1AttVsAir = 0;
                unit1AttSpeed = 1.32;
                unit1Arm = 2;
                unit1HP = 300;
                unit1Attributes = "ABS";
                unit1IsGround = true;
                unit1GBonusVsA = 5;
                unit1AttackCount = 1;
                unit1RaceTag = "z";
            }
            if (unit1.equals("Spore Crawler")) {
                unit1AttVsGround = 0;
                unit1AttVsAir = 15;
                unit1AttSpeed = 0.0;
                unit1AttSpeedVsAir = 0.61;
                unit1Arm = 1;
                unit1HP = 400;
                unit1Attributes = "ABS";
                unit1IsGround = true;
                unit1AirBonusVsB = 15;
                unit1AttackCount = 1;
                unit1RaceTag = "z";
            }
            if (unit1.equals("Swarm Host")) {
                unit1AttVsGround = 0;
                unit1AttVsAir = 0;
                unit1AttSpeed = 0.0;
                unit1Arm = 1 + unit1ArmUps;
                unit1HP = 160;
                unit1Attributes = "AB";
                unit1IsGround = true;
                unit1RaceTag = "z";
            }
            if (unit1.equals("Ultralisk")) {
                unit1AttVsGround = 35 + 3 * unit1AttUps;
                unit1AttVsAir = 0;
                unit1AttSpeed = 0.61;
                unit1Arm = 2 + unit1ArmUps;
                unit1HP = 500;
                unit1Attributes = "ABX";
                unit1IsGround = true;
                unit1AttackCount = 1;
                unit1RaceTag = "z";
            }
            if (unit1.equals("Viper")) {
                unit1AttVsGround = 0;
                unit1AttVsAir = 0;
                unit1AttSpeed = 0.0;
                unit1Arm = 1 + unit1ArmUps;
                unit1HP = 150;
                unit1Attributes = "ABP";
                unit1IsGround = false;
                unit1RaceTag = "z";
            }
            if (unit1.equals("Zergling")) {
                unit1AttVsGround = 5 + unit1AttUps;
                unit1AttVsAir = 0;
                unit1AttSpeed = 0.497;
                //unit1AttSpeed2 = 0.354;
                unit1Arm = unit1ArmUps;
                unit1HP = 35;
                unit1Attributes = "LB";
                unit1IsGround = true;
                unit1AttackCount = 1;
                unit1RaceTag = "z";
            }
        }
        else if (unitNum == 2) {
            if (unit2.equals("Baneling")) {
                unit2AttVsGround = 20 + 2*unit2AttUps;
                unit2AttVsAir = 0;
                unit2Arm = unit2ArmUps;
                unit2HP = 30;
                unit2Attributes = "B";
                unit2GBonusVsL = 15 + 2*unit2AttUps;
                unit2GBonusVsS = 60 + 3 * unit2AttUps;
                unit2IsGround = true;
                unit2AttackCount = 1;
                unit2RaceTag = "z";
            }
            if (unit2.equals("Brood Lord")) {
                unit2AttVsGround = 20 + 2*unit2AttUps;
                unit2AttVsAir = 0;
                unit2AttSpeed = 1.79;
                unit2AttSpeedVsAir = 0.0;
                unit2Arm = 1 + unit2ArmUps;
                unit2HP = 225;
                unit2Attributes = "ABX";
                unit2IsGround = false;
                unit2AttackCount = 1;
                unit2RaceTag = "z";
            }
            if (unit2.equals("Broodling")) {
                unit2AttVsGround = 4 + unit2AttUps;
                unit2AttVsAir = 0;
                unit2AttSpeed = 0.46;
                unit2Arm = unit2ArmUps;
                unit2HP = 30;
                unit2Attributes = "LB";
                unit2IsGround = true;
                unit2AttackCount = 1;
                unit2LifeSpan = 5.71;
                unit2RaceTag = "z";
            }
            if (unit2.equals("Changeling")) {
                unit2AttVsGround = 0;
                unit2AttVsAir = 0;
                unit2AttSpeed = 0.0;
                unit2Arm = 0;
                unit2HP = 5;
                unit2Attributes = "LB";
                unit2IsGround = true;
                unit2LifeSpan = 150.0;
                unit2RaceTag = "z";
            }
            if (unit2.equals("Corruptor")) {
                unit2AttVsGround = 0;
                unit2AttVsAir = 14 + unit2AttUps;
                unit2AttSpeed = 0.0;
                unit2AttSpeedVsAir = 1.36;
                unit2Arm = 2 + unit2ArmUps;
                unit2HP = 200;
                unit2Attributes = "AB";
                unit2IsGround = false;
                unit2AirBonusVsX = 6 + unit2AttUps;
                unit2AttackCount = 1;
                unit2RaceTag = "z";
            }
            if (unit2.equals("Drone")) {
                unit2AttVsGround = 5;
                unit2AttVsAir = 0;
                unit2AttSpeed = 1.07;
                unit2Arm = unit2ArmUps;
                unit2HP = 40;
                unit2Attributes = "LB";
                unit2IsGround = true;
                unit2AttackCount = 1;
                unit2RaceTag = "z";
            }
            if (unit2.equals("Hydralisk")) {
                unit2AttVsGround = 12 + unit2AttUps;
                unit2AttVsAir = 12 + unit2AttUps;
                unit2AttSpeed = 0.59;
                unit2AttSpeedVsAir = 0.59;
                unit2Arm = unit2ArmUps;
                unit2HP = 90;
                unit2Attributes = "LB";
                unit2IsGround = true;
                unit2AttackCount = 1;
                unit2RaceTag = "z";
            }
            if (unit2.equals("Infested Terran")) {
                unit2AttVsGround = 6 + unit2AttUps;
                unit2AttVsAir = 14 + unit2AttUps;
                unit2AttSpeed = 0.61;
                unit2AttSpeedVsAir = 0.95;
                unit2Arm = 0;
                unit2HP = 50;
                unit2Attributes = "LB";
                unit2IsGround = true;
                unit2AttackCount = 1;
                unit2LifeSpan = 21.0;
                unit2RaceTag = "z";
            }
            if (unit2.equals("Infestor")) {
                unit2AttVsGround = 0;
                unit2AttVsAir = 0;
                unit2AttSpeed = 0.0;
                unit2Arm = unit2ArmUps;
                unit2HP = 90;
                unit2Attributes = "ABP";
                unit2IsGround = true;
                unit2RaceTag = "z";
            }
            if (unit2.equals("Larva")) {
                unit2AttVsGround = 0;
                unit2AttVsAir = 0;
                unit2AttSpeed = 0.0;
                unit2Arm = 10;
                unit2HP = 25;
                unit2Attributes = "LB";
                unit2IsGround = true;
                unit2RaceTag = "z";
            }
            if (unit2.equals("Locust")) {
                unit2AttVsGround = 10 + unit2AttUps;
                unit2AttVsAir = 0;
                unit2AttSpeed = 0.43;
                unit2Arm = unit2ArmUps;
                unit2HP = 50;
                unit2Attributes = "LB";
                unit2IsGround = true;
                unit2AttackCount = 1;
                unit2LifeSpan = 18.0;
                unit2RaceTag = "z";
            }
            if (unit2.equals("Lurker")) {
                unit2AttVsGround = 20 + 2 * unit2AttUps;
                unit2AttVsAir = 0;
                unit2AttSpeed = 1.43;
                unit2Arm = 1 + unit2ArmUps;
                unit2HP = 200;
                unit2Attributes = "AB";
                unit2IsGround = true;
                unit2GBonusVsA = 10 + unit2AttUps;
                unit2AttackCount = 1;
                unit2RaceTag = "z";
            }
            if (unit2.equals("Mutalisk")) {
                unit2AttVsGround = 9 + unit2AttUps;
                unit2AttVsAir = 9 + unit2AttUps;
                unit2AttSpeed = 1.09;
                unit2AttSpeedVsAir = 1.09;
                unit2Arm = unit2ArmUps;
                unit2HP = 120;
                unit2Attributes = "LB";
                unit2IsGround = false;
                unit2AttackCount = 1;
                unit2RaceTag = "z";
            }
            if (unit2.equals("Nydus Worm")) {
                unit2AttVsGround = 0;
                unit2AttVsAir = 0;
                unit2AttSpeed = 0.0;
                unit2Arm = 1;
                unit2HP = 300;
                unit2Attributes = "ABS";
                unit2IsGround = true;
                unit2RaceTag = "z";
            }
            if (unit2.equals("Overlord")) {
                unit2AttVsGround = 0;
                unit2AttVsAir = 0;
                unit2AttSpeed = 0.0;
                unit2Arm = unit1ArmUps;
                unit2HP = 200;
                unit2Attributes = "AB";
                unit2IsGround = false;
                unit2RaceTag = "z";
            }
            if (unit2.equals("Overseer")) {
                unit2AttVsGround = 0;
                unit2AttVsAir = 0;
                unit2AttSpeed = 0.0;
                unit2Arm = 1 + unit2ArmUps;
                unit2HP = 200;
                unit2Attributes = "AB";
                unit2IsGround = false;
                unit2RaceTag = "z";
            }
            if (unit2.equals("Queen")) {
                unit2AttVsGround = (4+ unit2AttUps)*2;
                unit2AttVsAir = 9 + unit2AttUps;
                unit2AttSpeed = 0.71;
                unit2AttSpeedVsAir = 0.71;
                unit2Arm = 1 + unit2ArmUps;
                unit2HP = 175;
                unit2Attributes = "BP";
                unit2IsGround = true;
                unit2AttackCount = 2;
                unit2RaceTag = "z";
            }
            if (unit2.equals("Ravager")) {
                unit2AttVsGround = 16 + 2*unit2AttUps;
                unit2AttVsAir = 0;
                unit2AttSpeed = 1.14;
                unit2Arm = 1 + unit2ArmUps;
                unit2HP = 120;
                unit2Attributes = "B";
                unit2IsGround = true;
                unit2AttackCount = 1;
                unit2RaceTag = "z";
            }
            if (unit2.equals("Roach")) {
                unit2AttVsGround = 16 + 2 * unit2AttUps;
                unit2AttVsAir = 0;
                unit2AttSpeed = 1.43;
                unit2Arm = 1 + unit2ArmUps;
                unit2HP = 145;
                unit2Attributes = "AB";
                unit2IsGround = true;
                unit2AttackCount = 1;
                unit2RaceTag = "z";
            }
            if (unit2.equals("Spine Crawler")) {
                unit2AttVsGround = 25;
                unit2AttVsAir = 0;
                unit2AttSpeed = 1.32;
                unit2Arm = 2;
                unit2HP = 300;
                unit2Attributes = "ABS";
                unit2IsGround = true;
                unit2GBonusVsA = 5;
                unit2AttackCount = 1;
                unit2RaceTag = "z";
            }
            if (unit2.equals("Spore Crawler")) {
                unit2AttVsGround = 0;
                unit2AttVsAir = 15;
                unit2AttSpeed = 0.0;
                unit2AttSpeedVsAir = 0.61;
                unit2Arm = 1;
                unit2HP = 400;
                unit2Attributes = "ABS";
                unit2IsGround = true;
                unit2AirBonusVsB = 15;
                unit2AttackCount = 1;
                unit2RaceTag = "z";
            }
            if (unit2.equals("Swarm Host")) {
                unit2AttVsGround = 0;
                unit2AttVsAir = 0;
                unit2AttSpeed = 0.0;
                unit2Arm = 1 + unit2ArmUps;
                unit2HP = 160;
                unit2Attributes = "AB";
                unit2IsGround = true;
                unit2RaceTag = "z";
            }
            if (unit2.equals("Ultralisk")) {
                unit2AttVsGround = 35 + 3 * unit2AttUps;
                unit2AttVsAir = 0;
                unit2AttSpeed = 0.61;
                unit2Arm = 2 + unit2ArmUps;
                unit2HP = 500;
                unit2Attributes = "ABX";
                unit2IsGround = true;
                unit2AttackCount = 1;
                unit2RaceTag = "z";
            }
            if (unit2.equals("Viper")) {
                unit2AttVsGround = 0;
                unit2AttVsAir = 0;
                unit2AttSpeed = 0.0;
                unit2Arm = 1 + unit2ArmUps;
                unit2HP = 150;
                unit2Attributes = "ABP";
                unit2IsGround = false;
                unit2RaceTag = "z";
            }
            if (unit2.equals("Zergling")) {
                unit2AttVsGround = 5 + unit2AttUps;
                unit2AttVsAir = 0;
                unit2AttSpeed = 0.497;
                //unit2AttSpeed2 = 0.354;
                unit2Arm = unit2ArmUps;
                unit2HP = 35;
                unit2Attributes = "LB";
                unit2IsGround = true;
                unit2AttackCount = 1;
                unit2RaceTag = "z";
            }
        }
    }

    public void generalSetter(Integer unitNum) {
        if (unitNum == 1) {
            if (unit1.equals("Baneling")) {
                unit1AttVsGround = 20 + 2*unit1AttUps;
                unit1AttVsAir = 0;
                unit1Arm = unit1ArmUps;
                unit1HP = 30;
                unit1Attributes = "B";
                unit1GBonusVsL = 15 + 2 * unit1AttUps;
                unit1GBonusVsS = 60 + 3 * unit1AttUps;
                unit1IsGround = true;
                unit1AttackCount = 1;
                unit1RaceTag = "z";
            }
            if (unit1.equals("Brood Lord")) {
                unit1AttVsGround = 20 + 2*unit1AttUps;
                unit1AttVsAir = 0;
                unit1AttSpeed = 1.79;
                unit1AttSpeedVsAir = 0.0;
                unit1Arm = 1 + unit1ArmUps;
                unit1HP = 225;
                unit1Attributes = "ABX";
                unit1IsGround = false;
                unit1AttackCount = 1;
                unit1RaceTag = "z";
            }
            if (unit1.equals("Broodling")) {
                unit1AttVsGround = 4 + unit1AttUps;
                unit1AttVsAir = 0;
                unit1AttSpeed = 0.46;
                unit1Arm = unit1ArmUps;
                unit1HP = 30;
                unit1Attributes = "LB";
                unit1IsGround = true;
                unit1AttackCount = 1;
                unit1LifeSpan = 5.71;
                unit1RaceTag = "z";
            }
            if (unit1.equals("Changeling")) {
                unit1AttVsGround = 0;
                unit1AttVsAir = 0;
                unit1AttSpeed = 0.0;
                unit1Arm = 0;
                unit1HP = 5;
                unit1Attributes = "LB";
                unit1IsGround = true;
                unit1LifeSpan = 150.0;
                unit1RaceTag = "z";
            }
            if (unit1.equals("Corruptor")) {
                unit1AttVsGround = 0;
                unit1AttVsAir = 14 + unit1AttUps;
                unit1AttSpeed = 0.0;
                unit1AttSpeedVsAir = 1.36;
                unit1Arm = 2 + unit1ArmUps;
                unit1HP = 200;
                unit1Attributes = "AB";
                unit1IsGround = false;
                unit1AirBonusVsX = 6 + unit1AttUps;
                unit1AttackCount = 1;
                unit1RaceTag = "z";
            }
            if (unit1.equals("Drone")) {
                unit1AttVsGround = 5;
                unit1AttVsAir = 0;
                unit1AttSpeed = 1.07;
                unit1Arm = unit1ArmUps;
                unit1HP = 40;
                unit1Attributes = "LB";
                unit1IsGround = true;
                unit1AttackCount = 1;
                unit1RaceTag = "z";
            }
            if (unit1.equals("Hydralisk")) {
                unit1AttVsGround = 12 + unit1AttUps;
                unit1AttVsAir = 12 + unit1AttUps;
                unit1AttSpeed = 0.59;
                unit1AttSpeedVsAir = 0.59;
                unit1Arm = unit1ArmUps;
                unit1HP = 90;
                unit1Attributes = "LB";
                unit1IsGround = true;
                unit1AttackCount = 1;
                unit1RaceTag = "z";
            }
            if (unit1.equals("Infested Terran")) {
                unit1AttVsGround = 6 + unit1AttUps;
                unit1AttVsAir = 14 + unit1AttUps;
                unit1AttSpeed = 0.61;
                unit1AttSpeedVsAir = 0.95;
                unit1Arm = 0;
                unit1HP = 50;
                unit1Attributes = "LB";
                unit1IsGround = true;
                unit1AttackCount = 1;
                unit1LifeSpan = 21.0;
                unit1RaceTag = "z";
            }
            if (unit1.equals("Infestor")) {
                unit1AttVsGround = 0;
                unit1AttVsAir = 0;
                unit1AttSpeed = 0.0;
                unit1Arm = unit1ArmUps;
                unit1HP = 90;
                unit1Attributes = "ABP";
                unit1IsGround = true;
                unit1RaceTag = "z";
            }
            if (unit1.equals("Larva")) {
                unit1AttVsGround = 0;
                unit1AttVsAir = 0;
                unit1AttSpeed = 0.0;
                unit1Arm = 10;
                unit1HP = 25;
                unit1Attributes = "LB";
                unit1IsGround = true;
                unit1RaceTag = "z";
            }
            if (unit1.equals("Locust")) {
                unit1AttVsGround = 10 + unit1AttUps;
                unit1AttVsAir = 0;
                unit1AttSpeed = 0.43;
                unit1Arm = unit1ArmUps;
                unit1HP = 50;
                unit1Attributes = "LB";
                unit1IsGround = true;
                unit1AttackCount = 1;
                unit1LifeSpan = 18.0;
                unit1RaceTag = "z";
            }
            if (unit1.equals("Lurker")) {
                unit1AttVsGround = 20 + 2 * unit1AttUps;
                unit1AttVsAir = 0;
                unit1AttSpeed = 1.43;
                unit1Arm = 1 + unit1ArmUps;
                unit1HP = 200;
                unit1Attributes = "AB";
                unit1IsGround = true;
                unit1GBonusVsA = 10 + unit1AttUps;
                unit1AttackCount = 1;
                unit1RaceTag = "z";
            }
            if (unit1.equals("Mutalisk")) {
                unit1AttVsGround = 9 + unit1AttUps;
                unit1AttVsAir = 9 + unit1AttUps;
                unit1AttSpeed = 1.09;
                unit1AttSpeedVsAir = 1.09;
                unit1Arm = unit1ArmUps;
                unit1HP = 120;
                unit1Attributes = "LB";
                unit1IsGround = false;
                unit1AttackCount = 1;
                unit1RaceTag = "z";
            }
            if (unit1.equals("Nydus Worm")) {
                unit1AttVsGround = 0;
                unit1AttVsAir = 0;
                unit1AttSpeed = 0.0;
                unit1Arm = 1;
                unit1HP = 300;
                unit1Attributes = "ABS";
                unit1IsGround = true;
                unit1RaceTag = "z";
            }
            if (unit1.equals("Overlord")) {
                unit1AttVsGround = 0;
                unit1AttVsAir = 0;
                unit1AttSpeed = 0.0;
                unit1Arm = unit1ArmUps;
                unit1HP = 200;
                unit1Attributes = "AB";
                unit1IsGround = false;
                unit1RaceTag = "z";
            }
            if (unit1.equals("Overseer")) {
                unit1AttVsGround = 0;
                unit1AttVsAir = 0;
                unit1AttSpeed = 0.0;
                unit1Arm = 1 + unit1ArmUps;
                unit1HP = 200;
                unit1Attributes = "AB";
                unit1IsGround = false;
                unit1RaceTag = "z";
            }
            if (unit1.equals("Queen")) {
                unit1AttVsGround = (4+ unit1AttUps)*2;
                unit1AttVsAir = 9 + unit1AttUps;
                unit1AttSpeed = 0.71;
                unit1AttSpeedVsAir = 0.71;
                unit1Arm = 1 + unit1ArmUps;
                unit1HP = 175;
                unit1Attributes = "BP";
                unit1IsGround = true;
                unit1AttackCount = 2;
                unit1RaceTag = "z";
            }
            if (unit1.equals("Ravager")) {
                unit1AttVsGround = 16 + 2*unit1AttUps;
                unit1AttVsAir = 0;
                unit1AttSpeed = 1.14;
                unit1Arm = 1 + unit1ArmUps;
                unit1HP = 120;
                unit1Attributes = "B";
                unit1IsGround = true;
                unit1AttackCount = 1;
                unit1RaceTag = "z";
            }
            if (unit1.equals("Roach")) {
                unit1AttVsGround = 16 + 2 * unit1AttUps;
                unit1AttVsAir = 0;
                unit1AttSpeed = 1.43;
                unit1Arm = 1 + unit1ArmUps;
                unit1HP = 145;
                unit1Attributes = "AB";
                unit1IsGround = true;
                unit1AttackCount = 1;
                unit1RaceTag = "z";
            }
            if (unit1.equals("Spine Crawler")) {
                unit1AttVsGround = 25;
                unit1AttVsAir = 0;
                unit1AttSpeed = 1.32;
                unit1Arm = 2;
                unit1HP = 300;
                unit1Attributes = "ABS";
                unit1IsGround = true;
                unit1GBonusVsA = 5;
                unit1AttackCount = 1;
                unit1RaceTag = "z";
            }
            if (unit1.equals("Spore Crawler")) {
                unit1AttVsGround = 0;
                unit1AttVsAir = 15;
                unit1AttSpeed = 0.0;
                unit1AttSpeedVsAir = 0.61;
                unit1Arm = 1;
                unit1HP = 400;
                unit1Attributes = "ABS";
                unit1IsGround = true;
                unit1AirBonusVsB = 15;
                unit1AttackCount = 1;
                unit1RaceTag = "z";
            }
            if (unit1.equals("Swarm Host")) {
                unit1AttVsGround = 0;
                unit1AttVsAir = 0;
                unit1AttSpeed = 0.0;
                unit1Arm = 1 + unit1ArmUps;
                unit1HP = 160;
                unit1Attributes = "AB";
                unit1IsGround = true;
                unit1RaceTag = "z";
            }
            if (unit1.equals("Ultralisk")) {
                unit1AttVsGround = 35 + 3 * unit1AttUps;
                unit1AttVsAir = 0;
                unit1AttSpeed = 0.61;
                unit1Arm = 2 + unit1ArmUps;
                unit1HP = 500;
                unit1Attributes = "ABX";
                unit1IsGround = true;
                unit1AttackCount = 1;
                unit1RaceTag = "z";
            }
            if (unit1.equals("Viper")) {
                unit1AttVsGround = 0;
                unit1AttVsAir = 0;
                unit1AttSpeed = 0.0;
                unit1Arm = 1 + unit1ArmUps;
                unit1HP = 150;
                unit1Attributes = "ABP";
                unit1IsGround = false;
                unit1RaceTag = "z";
            }
            if (unit1.equals("Zergling")) {
                unit1AttVsGround = 5 + unit1AttUps;
                unit1AttVsAir = 0;
                unit1AttSpeed = 0.497;
                //unit1AttSpeed2 = 0.354;
                unit1Arm = unit1ArmUps;
                unit1HP = 35;
                unit1Attributes = "LB";
                unit1IsGround = true;
                unit1AttackCount = 1;
                unit1RaceTag = "z";
            }
            if (unit1.equals("Adept")) {
                unit1AttVsGround = 10 + unit1AttUps;
                unit1AttVsAir = 0;
                unit1AttSpeed = 1.61;
                //unit1AttSpeed2 = 1.11;
                unit1Arm = 1 + unit1ArmUps;
                unit1HP = 70;
                unit1Shields = 70;
                unit1Attributes = "LB";
                unit1IsGround = true;
                unit1GBonusVsL = 12;
                unit1AttackCount = 1;
                unit1RaceTag = "p";
            }
            if (unit1.equals("Archon")) {
                unit1AttVsGround = 25 + 3*unit1AttUps;
                unit1AttVsAir = 25 + 3*unit1AttUps;
                unit1AttSpeed = 1.25;
                unit1AttSpeedVsAir = 1.25;
                unit1Arm = unit1ArmUps;
                unit1HP = 10;
                unit1Shields = 350;
                unit1Attributes = "PX";
                unit1IsGround = true;
                unit1GBonusVsB = 10 + unit1AttUps;
                unit1AirBonusVsB = 10 + unit1AttUps;
                unit1AttackCount = 1;
                unit1RaceTag = "p";
            }
            if (unit1.equals("Carrier")) {
                unit1AttVsGround = (5 + unit1AttUps) * 2;
                unit1AttVsAir = (5 + unit1AttUps) * 2;
                unit1AttSpeed = 0.2675;
                unit1AttSpeedVsAir = 0.2675;
                unit1Arm = 2 + unit1ArmUps;
                unit1HP = 300;
                unit1Shields = 150;
                unit1Attributes = "AMX";
                unit1IsGround = false;
                unit1AttackCount = 2;
                unit1RaceTag = "p";
            }
            if (unit1.equals("Colossus")) {
                unit1AttVsGround = (10 + unit1AttUps) * 2;
                unit1AttVsAir = 0;
                unit1AttSpeed = 1.07;
                unit1Arm = 1 + unit1ArmUps;
                unit1HP = 200;
                unit1Shields = 150;
                unit1Attributes = "AMX";
                unit1IsGround = true;
                unit1GBonusVsL = 5 + unit1AttUps;
                unit1AttackCount = 2;
                unit1RaceTag = "p";
            }
            if (unit1.equals("Dark Templar")) {
                unit1AttVsGround = 45 + 5 * unit1AttUps;
                unit1AttVsAir = 0;
                unit1AttSpeed = 1.21;
                unit1Arm = 1 + unit1ArmUps;
                unit1HP = 40;
                unit1Shields = 80;
                unit1Attributes = "LBP";
                unit1IsGround = true;
                unit1AttackCount = 1;
                unit1RaceTag = "p";
            }
            if (unit1.equals("Disruptor")) {
                unit1AttVsGround = 145;
                unit1AttVsAir = 0;
                unit1AttSpeed = 14.3;
                unit1Arm = 1 + unit1ArmUps;
                unit1HP = 100;
                unit1Shields = 100;
                unit1Attributes = "AM";
                unit1IsGround = true;
                unit1AttackCount = 1;
                unit1RaceTag = "p";
            }
            if (unit1.equals("High Templar")) {
                unit1AttVsGround = 4+unit1AttUps;
                unit1AttVsAir = 0;
                unit1AttSpeed = 1.25;
                unit1Arm = unit1ArmUps;
                unit1HP = 40;
                unit1Shields = 40;
                unit1Attributes = "LBP";
                unit1IsGround = true;
                unit1AttackCount = 1;
                unit1RaceTag = "p";
            }
            if (unit1.equals("Immortal")) {
                unit1AttVsGround = 20 + 2*unit1AttUps;
                unit1AttVsAir = 0;
                unit1AttSpeed = 1.04;
                unit1Arm = 1 + unit1ArmUps;
                unit1HP = 200;
                unit1Shields = 100;
                unit1Attributes = "AM";
                unit1IsGround = true;
                unit1GBonusVsA = 30 + 3 * unit1AttUps;
                unit1AttackCount = 1;
                unit1RaceTag = "p";
            }
            if (unit1.equals("Interceptor")) {
                unit1AttVsGround = (5+unit1AttUps) * 2;
                unit1AttVsAir = (5+unit1AttUps)*2;
                unit1AttSpeed = 2.14;
                unit1AttSpeedVsAir = 2.14;
                unit1Arm = unit1ArmUps;
                unit1HP = 40;
                unit1Shields = 40;
                unit1Attributes = "LM";
                unit1IsGround = false;
                unit1AttackCount = 2;
                unit1RaceTag = "p";
            }
            if (unit1.equals("Mothership")) {
                unit1AttVsGround = (6+unit1AttUps)*6;
                unit1AttVsAir = (6+unit1AttUps)*6;
                unit1AttSpeed = 1.58;
                unit1AttSpeedVsAir = 1.58;
                unit1Arm = 2 + unit1ArmUps;
                unit1HP = 350;
                unit1Shields = 350;
                unit1Attributes = "AMPX";
                unit1IsGround = false;
                unit1AttackCount = 6;
                unit1RaceTag = "p";
            }
            if (unit1.equals("Observer")) {
                unit1AttVsGround = 0;
                unit1AttVsAir = 0;
                unit1AttSpeed = 0.0;
                unit1Arm = unit1ArmUps;
                unit1HP = 40;
                unit1Shields = 20;
                unit1Attributes = "LM";
                unit1IsGround = false;
                unit1RaceTag = "p";
            }
            if (unit1.equals("Oracle")) {
                unit1AttVsGround = 15;
                unit1AttVsAir = 0;
                unit1AttSpeed = 0.61;
                unit1Arm = unit1ArmUps;
                unit1HP = 100;
                unit1Shields = 60;
                unit1Attributes = "AMP";
                unit1IsGround = false;
                unit1GBonusVsL = 7;
                unit1AttackCount = 1;
                unit1RaceTag = "p";
            }
            if (unit1.equals("Phoenix")) {
                unit1AttVsGround = 0;
                unit1AttVsAir = (5 + unit1AttUps)*2;
                unit1AttSpeed = 0.0;
                unit1AttSpeedVsAir = 0.79;
                unit1Arm = unit1ArmUps;
                unit1HP = 120;
                unit1Shields = 60;
                unit1Attributes = "LM";
                unit1IsGround = false;
                unit1AirBonusVsL = 5;
                unit1AttackCount = 2;
                unit1RaceTag = "p";
            }
            if (unit1.equals("Photon Cannon")) {
                unit1AttVsGround = 20;
                unit1AttVsAir = 20;
                unit1AttSpeed = 0.89;
                unit1AttSpeedVsAir = 0.89;
                unit1Arm = 1;
                unit1HP = 150;
                unit1Shields = 150;
                unit1Attributes = "AS";
                unit1IsGround = true;
                unit1AttackCount = 1;
                unit1RaceTag = "p";
            }
            if (unit1.equals("Probe")) {
                unit1AttVsGround = 5;
                unit1AttVsAir = 0;
                unit1AttSpeed = 1.07;
                unit1Arm = unit1ArmUps;
                unit1HP = 20;
                unit1Shields = 20;
                unit1Attributes = "LM";
                unit1IsGround = true;
                unit1AttackCount = 1;
                unit1RaceTag = "p";
            }
            if (unit1.equals("Sentry")) {
                unit1AttVsGround = 6 + unit1AttUps;
                unit1AttVsAir = 6 + unit1AttUps;
                unit1AttSpeed = 0.71;
                unit1AttSpeedVsAir = 0.71;
                unit1Arm = 1 + unit1ArmUps;
                unit1HP = 40;
                unit1Shields = 40;
                unit1Attributes = "LMP";
                unit1IsGround = true;
                unit1AttackCount = 1;
                unit1RaceTag = "p";
            }
            if (unit1.equals("Stalker")) {
                unit1AttVsGround = 13+unit1AttUps;
                unit1AttVsAir = 13+unit1AttUps;
                unit1AttSpeed = 1.34;
                unit1AttSpeedVsAir = 1.34;
                unit1Arm = 1 + unit1ArmUps;
                unit1HP = 80;
                unit1Shields = 80;
                unit1Attributes = "AM";
                unit1IsGround = true;
                unit1GBonusVsA = 5 + unit1AttUps;
                unit1AirBonusVsA = 5 + unit1AttUps;
                unit1AttackCount = 1;
                unit1RaceTag = "p";
            }
            if (unit1.equals("Tempest")) {
                unit1AttVsGround = 40+4*unit1AttUps;
                unit1AttVsAir = 30+3*unit1AttUps;
                unit1AttSpeed = 2.36;
                unit1AttSpeedVsAir = 2.36;
                unit1Arm = 2 + unit1ArmUps;
                unit1HP = 150;
                unit1Shields = 125;
                unit1Attributes = "AMX";
                unit1IsGround = false;
                unit1AirBonusVsX = 22 + 2 * unit1AttUps;
                unit1AttackCount = 1;
                unit1RaceTag = "p";
            }
            if (unit1.equals("Void Ray")) {
                unit1AttVsGround = 6+unit1AttUps;
                unit1AttVsAir = 6+unit1AttUps;
                unit1AttSpeed = 0.36;
                unit1AttSpeedVsAir = 0.36;
                unit1Arm = unit1ArmUps;
                unit1HP = 150;
                unit1Shields = 100;
                unit1Attributes = "AM";
                unit1IsGround = false;
                unit1GBonusVsA = 4;
                unit1AirBonusVsA = 4;
                unit1AttackCount = 1;
                unit1RaceTag = "p";
            }
            if (unit1.equals("Warp Prism")) {
                unit1AttVsGround = 0;
                unit1AttVsAir = 0;
                unit1AttSpeed = 0.0;
                unit1Arm = unit1ArmUps;
                unit1HP = 80;
                unit1Shields = 100;
                unit1Attributes = "AMP";
                unit1IsGround = false;
                unit1RaceTag = "p";
            }
            if (unit1.equals("Zealot")) {
                unit1AttVsGround = (8+unit1AttUps)*2;
                unit1AttVsAir = 0;
                unit1AttSpeed = 0.86;
                unit1Arm = 1 + unit1ArmUps;
                unit1HP = 100;
                unit1Shields = 50;
                unit1Attributes = "LB";
                unit1IsGround = true;
                unit1AttackCount = 2;
                unit1RaceTag = "p";
            }
            if (unit1.equals("Auto-Turret")) {
                unit1AttVsGround = 18;
                unit1AttVsAir = 18;
                unit1AttSpeed = 0.57;
                unit1AttSpeedVsAir = 0.57;
                unit1Arm = 1 + 2 * unit1ArmUps;
                unit1HP = 150;
                unit1Attributes = "AMS";
                unit1IsGround = true;
                unit1AttackCount = 1;
                unit1LifeSpan = 10.0;
                unit1RaceTag = "t";
            }
            if (unit1.equals("Banshee")) {
                unit1AttVsGround = (12+unit1AttUps)*2;
                unit1AttVsAir = 0;
                unit1AttSpeed = 0.89;
                unit1Arm = unit1ArmUps;
                unit1HP = 140;
                unit1Attributes = "LM";
                unit1IsGround = false;
                unit1AttackCount = 2;
                unit1RaceTag = "t";
            }
            if (unit1.equals("Battlecruiser")) {
                unit1AttVsGround = 8 + unit1AttUps;
                unit1AttVsAir = 5 + unit1AttUps;
                unit1AttSpeed = 0.16;
                unit1AttSpeedVsAir = 0.16;
                unit1Arm = 3 + unit1ArmUps;
                unit1HP = 550;
                unit1Attributes = "AMX";
                unit1IsGround = false;
                unit1AttackCount = 1;
                unit1RaceTag = "t";
            }
            if (unit1.equals("Cyclone")) {
                unit1AttVsGround = 18 + unit1AttUps * 2;
                unit1AttVsAir = 18 + unit1AttUps * 2;
                unit1AttSpeed = 0.71;
                unit1AttSpeedVsAir = 0.71;
                unit1Arm = 1 + unit1ArmUps;
                unit1HP = 120;
                unit1Attributes = "AM";
                unit1IsGround = true;
                //unit1GBonusVsA = 2 + unit1AttUps;
                unit1AttackCount = 1;
                unit1RaceTag = "t";
            }
            if (unit1.equals("Ghost")) {
                unit1AttVsGround = 10 + unit1AttUps;
                unit1AttVsAir = 10 + unit1AttUps;
                unit1AttSpeed = 1.07;
                unit1AttSpeedVsAir = 1.07;
                unit1Arm = unit1ArmUps;
                unit1HP = 100;
                unit1Attributes = "BP";
                unit1IsGround = true;
                unit1GBonusVsL = 10 + unit1AttUps;
                unit1AirBonusVsL = 10 + unit1AttUps;
                unit1AttackCount = 1;
                unit1RaceTag = "t";
            }
            if (unit1.equals("Hellbat")) {
                unit1AttVsGround = 18 + 2 * unit1AttUps;
                unit1AttVsAir = 0;
                unit1AttSpeed = 1.43;
                unit1Arm = unit1ArmUps;
                unit1HP = 135;
                unit1Attributes = "LBM";
                unit1IsGround = true;
                unit1GBonusVsL = unit1AttUps;
                unit1AttackCount = 1;
                unit1RaceTag = "t";
            }
            if (unit1.equals("Hellion")) {
                unit1AttVsGround = 8 + unit1AttUps;
                unit1AttVsAir = 0;
                unit1AttSpeed = 1.79;
                unit1Arm = unit1ArmUps;
                unit1HP = 90;
                unit1Attributes = "LM";
                unit1IsGround = true;
                unit1GBonusVsL = 6 + unit1AttUps;
                unit1AttackCount = 1;
                unit1RaceTag = "t";
            }
            if (unit1.equals("Liberator (defender mode)")) {
                unit1AttVsGround = 75 + 5*unit1AttUps;
                unit1AttVsAir = 0;
                unit1AttSpeed = 1.14;
                unit1AttSpeedVsAir = 0.0;
                unit1Arm = unit1ArmUps;
                unit1HP = 180;
                unit1Attributes = "AM";
                unit1IsGround = false;
                unit1AttackCount = 1;
                unit1RaceTag = "t";
            }
            if (unit1.equals("Liberator (fighter mode)")) {
                unit1AttVsGround = 0;
                unit1AttVsAir = (7 + unit1AttUps) * 2;
                unit1AttSpeed = 0.0;
                unit1AttSpeedVsAir = 1.29;
                unit1Arm = unit1ArmUps;
                unit1HP = 180;
                unit1Attributes = "AM";
                unit1IsGround = false;
                unit1AttackCount = 2;
                unit1RaceTag = "t";
            }
            if (unit1.equals("Marauder")) {
                unit1AttVsGround = (5+unit1AttUps)*2;
                unit1AttVsAir = 0;
                unit1AttSpeed = 1.07;
                //unit1AttSpeed2 = 0.71;
                unit1Arm = 1 + unit1ArmUps;
                unit1HP = 125;
                unit1Attributes = "AB";
                unit1IsGround = true;
                unit1GBonusVsA = 5;
                unit1AttackCount = 2;
                unit1RaceTag = "t";
            }
            if (unit1.equals("Marine")) {
                unit1AttVsGround = 6 + unit1AttUps;
                unit1AttVsAir = 6 + unit1AttUps;
                unit1AttSpeed = 0.61;
                //unit1AttSpeed2 = .40;
                unit1AttSpeedVsAir = 0.61;
                unit1Arm = unit1ArmUps;
                unit1HP = 45;
                unit1Attributes = "LB";
                unit1IsGround = true;
                unit1AttackCount = 1;
                unit1RaceTag = "t";
            }
            if (unit1.equals("Medivac")) {
                unit1AttVsGround = 0;
                unit1AttVsAir = 0;
                unit1AttSpeed = 0.0;
                unit1Arm = 1 + unit1ArmUps;
                unit1HP = 150;
                unit1Attributes = "AM";
                unit1IsGround = false;
                unit1RaceTag = "t";
            }
            if (unit1.equals("Missile Turret")) {
                unit1AttVsGround = 0;
                unit1AttVsAir = 12*2;
                unit1AttSpeed = 0.0;
                unit1AttSpeedVsAir = 0.61;
                unit1Arm = 0;
//                if (!unit1ArmorUps.getSelectedItem().toString().equals("0")) {
//                    unit1ArmorUps.setSelection(3);
//                    unit1Arm = 2;
//                }
                unit1HP = 250;
                unit1Attributes = "AMS";
                unit1IsGround = true;
                unit1AttackCount = 2;
                unit1RaceTag = "t";
            }
            if (unit1.equals("MULE")) {
                unit1AttVsGround = 0;
                unit1AttVsAir = 0;
                unit1AttSpeed = 0.0;
                unit1Arm = unit1ArmUps;
                unit1HP = 60;
                unit1Attributes = "LM";
                unit1IsGround = true;
                unit1LifeSpan = 64.0;
                unit1RaceTag = "t";
            }
            if (unit1.equals("Planetary Fortress")) {
                unit1AttVsGround = 40;
                unit1AttVsAir = 0;
                unit1AttSpeed = 1.43;
                unit1Arm = 3;
//                if (!unit1ArmorUps.getSelectedItem().toString().equals("0")) {
//                    unit1Arm = 5;
//                }
                unit1HP = 1500;
                unit1Attributes = "AMS";
                unit1IsGround = true;
                unit1AttackCount = 1;
                unit1RaceTag = "t";
            }
            if (unit1.equals("Raven")) {
                unit1AttVsGround = 0;
                unit1AttVsAir = 0;
                unit1AttSpeed = 0.0;
                unit1Arm = 1 + unit1ArmUps;
                unit1HP = 140;
                unit1Attributes = "LM";
                unit1IsGround = false;
                unit1RaceTag = "t";
            }
            if (unit1.equals("Reaper")) {
                unit1AttVsGround = (4+unit1AttUps)*2;
                unit1AttVsAir = 0;
                unit1AttSpeed = 0.79;
                unit1Arm = unit1ArmUps;
                unit1HP = 60;
                unit1Attributes = "LB";
                unit1IsGround = true;
                unit1AttackCount = 2;
                unit1RaceTag = "t";
            }
            if (unit1.equals("SCV")) {
                unit1AttVsGround = 5;
                unit1AttVsAir = 0;
                unit1AttSpeed = 1.07;
                unit1Arm = unit1ArmUps;
                unit1HP = 45;
                unit1Attributes = "LBM";
                unit1IsGround = true;
                unit1AttackCount = 1;
                unit1RaceTag = "t";
            }
            if (unit1.equals("Siege Tank (sieged)")) {
                unit1AttVsGround = 40 + 3*unit1AttUps;
                unit1AttVsAir = 0;
                unit1AttSpeed = 2.14;
                unit1Arm = 1 + unit1ArmUps;
                unit1HP = 175;
                unit1Attributes = "AM";
                unit1IsGround = true;
                unit1GBonusVsA = 30 + 2 * unit1AttUps;
                unit1AttackCount = 1;
                unit1RaceTag = "t";
            }
            if (unit1.equals("Siege Tank (tank mode)")) {
                unit1AttVsGround = 15 + 2*unit1AttUps;
                unit1AttVsAir = 18;
                unit1AttSpeed = 0.74;
                unit1Arm = 1 + unit1ArmUps;
                unit1HP = 175;
                unit1Attributes = "AM";
                unit1IsGround = true;
                unit1GBonusVsA = 10 + unit1AttUps;
                unit1AttackCount = 1;
                unit1RaceTag = "t";
            }
            if (unit1.equals("Thor (explosive)")) {
                unit1AttVsGround = (30 + 3*unit1AttUps)*2;
                unit1AttVsAir = (6+unit1AttUps)*4;
                unit1AttSpeed = 0.91;
                unit1AttSpeedVsAir = 2.14;
                unit1Arm = 1 + unit1ArmUps;
                unit1HP = 400;
                unit1Attributes = "AMX";
                unit1IsGround = true;
                unit1AirBonusVsL = 6 + unit1AttUps;
                unit1AttackCount = 2;
                unit1RaceTag = "t";
            }
            if (unit1.equals("Thor (high impact)")) {
                unit1AttVsGround = (30 + 3*unit1AttUps)*2;
                unit1AttVsAir = 40+4*unit1AttUps;
                unit1AttSpeed = 0.91;
                unit1AttSpeedVsAir = 1.71;
                unit1Arm = 1 + unit1ArmUps;
                unit1HP = 400;
                unit1Attributes = "AMX";
                unit1IsGround = true;
                unit1AirBonusVsX = 15 + 2 * unit1AttUps;
                unit1AttackCount = 2;
                unit1RaceTag = "t";
            }
            if (unit1.equals("Viking (assault mode)")) {
                unit1AttVsGround = 12 + unit1AttUps;
                unit1AttVsAir = 0;
                unit1AttSpeed = 0.71;
                unit1Arm = unit1ArmUps;
                unit1HP = 135;
                unit1Attributes = "AM";
                unit1IsGround = true;
                unit1GBonusVsM = 8;
                unit1AttackCount = 1;
                unit1RaceTag = "t";
            }
            if (unit1.equals("Viking (fighter mode)")) {
                unit1AttVsGround = 0;
                unit1AttVsAir = (10 + unit1AttUps)*2;
                unit1AttSpeed = 0.0;
                unit1AttSpeedVsAir = 1.43;
                unit1Arm = unit1ArmUps;
                unit1HP = 135;
                unit1Attributes = "AM";
                unit1IsGround = false;
                unit1AirBonusVsA = 4;
                unit1AttackCount = 2;
                unit1RaceTag = "t";
            }
            if (unit1.equals("Widow Mine")) {
                unit1AttVsGround = 125;
                unit1AttVsAir = 125;
                unit1AttSpeed = 29.0;
                unit1AttSpeedVsAir = 29.0;
                unit1Arm = unit1ArmUps;
                unit1HP = 90;
                unit1Attributes = "LM";
                unit1IsGround = true;
                unit1AttackCount = 1;
                unit1RaceTag = "t";
            }
        }
        else if (unitNum == 2) {
            if (unit2.equals("Baneling")) {
                unit2AttVsGround = 20 + 2*unit2AttUps;
                unit2AttVsAir = 0;
                unit2Arm = unit2ArmUps;
                unit2HP = 30;
                unit2Attributes = "B";
                unit2GBonusVsL = 15 + 2*unit2AttUps;
                unit2GBonusVsS = 60 + 3 * unit2AttUps;
                unit2IsGround = true;
                unit2AttackCount = 1;
                unit2RaceTag = "z";
            }
            if (unit2.equals("Brood Lord")) {
                unit2AttVsGround = 20 + 2*unit2AttUps;
                unit2AttVsAir = 0;
                unit2AttSpeed = 1.79;
                unit2AttSpeedVsAir = 0.0;
                unit2Arm = 1 + unit2ArmUps;
                unit2HP = 225;
                unit2Attributes = "ABX";
                unit2IsGround = false;
                unit2AttackCount = 1;
                unit2RaceTag = "z";
            }
            if (unit2.equals("Broodling")) {
                unit2AttVsGround = 4 + unit2AttUps;
                unit2AttVsAir = 0;
                unit2AttSpeed = 0.46;
                unit2Arm = unit2ArmUps;
                unit2HP = 30;
                unit2Attributes = "LB";
                unit2IsGround = true;
                unit2AttackCount = 1;
                unit2LifeSpan = 5.71;
                unit2RaceTag = "z";
            }
            if (unit2.equals("Changeling")) {
                unit2AttVsGround = 0;
                unit2AttVsAir = 0;
                unit2AttSpeed = 0.0;
                unit2Arm = 0;
                unit2HP = 5;
                unit2Attributes = "LB";
                unit2IsGround = true;
                unit2LifeSpan = 150.0;
                unit2RaceTag = "z";
            }
            if (unit2.equals("Corruptor")) {
                unit2AttVsGround = 0;
                unit2AttVsAir = 14 + unit2AttUps;
                unit2AttSpeed = 0.0;
                unit2AttSpeedVsAir = 1.36;
                unit2Arm = 2 + unit2ArmUps;
                unit2HP = 200;
                unit2Attributes = "AB";
                unit2IsGround = false;
                unit2AirBonusVsX = 6 + unit2AttUps;
                unit2AttackCount = 1;
                unit2RaceTag = "z";
            }
            if (unit2.equals("Drone")) {
                unit2AttVsGround = 5;
                unit2AttVsAir = 0;
                unit2AttSpeed = 1.07;
                unit2Arm = unit2ArmUps;
                unit2HP = 40;
                unit2Attributes = "LB";
                unit2IsGround = true;
                unit2AttackCount = 1;
                unit2RaceTag = "z";
            }
            if (unit2.equals("Hydralisk")) {
                unit2AttVsGround = 12 + unit2AttUps;
                unit2AttVsAir = 12 + unit2AttUps;
                unit2AttSpeed = 0.59;
                unit2AttSpeedVsAir = 0.59;
                unit2Arm = unit2ArmUps;
                unit2HP = 90;
                unit2Attributes = "LB";
                unit2IsGround = true;
                unit2AttackCount = 1;
                unit2RaceTag = "z";
            }
            if (unit2.equals("Infested Terran")) {
                unit2AttVsGround = 6 + unit2AttUps;
                unit2AttVsAir = 14 + unit2AttUps;
                unit2AttSpeed = 0.61;
                unit2AttSpeedVsAir = 0.95;
                unit2Arm = 0;
                unit2HP = 50;
                unit2Attributes = "LB";
                unit2IsGround = true;
                unit2AttackCount = 1;
                unit2LifeSpan = 21.0;
                unit2RaceTag = "z";
            }
            if (unit2.equals("Infestor")) {
                unit2AttVsGround = 0;
                unit2AttVsAir = 0;
                unit2AttSpeed = 0.0;
                unit2Arm = unit2ArmUps;
                unit2HP = 90;
                unit2Attributes = "ABP";
                unit2IsGround = true;
                unit2RaceTag = "z";
            }
            if (unit2.equals("Larva")) {
                unit2AttVsGround = 0;
                unit2AttVsAir = 0;
                unit2AttSpeed = 0.0;
                unit2Arm = 10;
                unit2HP = 25;
                unit2Attributes = "LB";
                unit2IsGround = true;
                unit2RaceTag = "z";
            }
            if (unit2.equals("Locust")) {
                unit2AttVsGround = 10 + unit2AttUps;
                unit2AttVsAir = 0;
                unit2AttSpeed = 0.43;
                unit2Arm = unit2ArmUps;
                unit2HP = 50;
                unit2Attributes = "LB";
                unit2IsGround = true;
                unit2AttackCount = 1;
                unit2LifeSpan = 18.0;
                unit2RaceTag = "z";
            }
            if (unit2.equals("Lurker")) {
                unit2AttVsGround = 20 + 2 * unit2AttUps;
                unit2AttVsAir = 0;
                unit2AttSpeed = 1.43;
                unit2Arm = 1 + unit2ArmUps;
                unit2HP = 200;
                unit2Attributes = "AB";
                unit2IsGround = true;
                unit2GBonusVsA = 10 + unit2AttUps;
                unit2AttackCount = 1;
                unit2RaceTag = "z";
            }
            if (unit2.equals("Mutalisk")) {
                unit2AttVsGround = 9 + unit2AttUps;
                unit2AttVsAir = 9 + unit2AttUps;
                unit2AttSpeed = 1.09;
                unit2AttSpeedVsAir = 1.09;
                unit2Arm = unit2ArmUps;
                unit2HP = 120;
                unit2Attributes = "LB";
                unit2IsGround = false;
                unit2AttackCount = 1;
                unit2RaceTag = "z";
            }
            if (unit2.equals("Nydus Worm")) {
                unit2AttVsGround = 0;
                unit2AttVsAir = 0;
                unit2AttSpeed = 0.0;
                unit2Arm = 1;
                unit2HP = 300;
                unit2Attributes = "ABS";
                unit2IsGround = true;
                unit2RaceTag = "z";
            }
            if (unit2.equals("Overlord")) {
                unit2AttVsGround = 0;
                unit2AttVsAir = 0;
                unit2AttSpeed = 0.0;
                unit2Arm = unit1ArmUps;
                unit2HP = 200;
                unit2Attributes = "AB";
                unit2IsGround = false;
                unit2RaceTag = "z";
            }
            if (unit2.equals("Overseer")) {
                unit2AttVsGround = 0;
                unit2AttVsAir = 0;
                unit2AttSpeed = 0.0;
                unit2Arm = 1 + unit2ArmUps;
                unit2HP = 200;
                unit2Attributes = "AB";
                unit2IsGround = false;
                unit2RaceTag = "z";
            }
            if (unit2.equals("Queen")) {
                unit2AttVsGround = (4+ unit2AttUps)*2;
                unit2AttVsAir = 9 + unit2AttUps;
                unit2AttSpeed = 0.71;
                unit2AttSpeedVsAir = 0.71;
                unit2Arm = 1 + unit2ArmUps;
                unit2HP = 175;
                unit2Attributes = "BP";
                unit2IsGround = true;
                unit2AttackCount = 2;
                unit2RaceTag = "z";
            }
            if (unit2.equals("Ravager")) {
                unit2AttVsGround = 16 + 2*unit2AttUps;
                unit2AttVsAir = 0;
                unit2AttSpeed = 1.14;
                unit2Arm = 1 + unit2ArmUps;
                unit2HP = 120;
                unit2Attributes = "B";
                unit2IsGround = true;
                unit2AttackCount = 1;
                unit2RaceTag = "z";
            }
            if (unit2.equals("Roach")) {
                unit2AttVsGround = 16 + 2 * unit2AttUps;
                unit2AttVsAir = 0;
                unit2AttSpeed = 1.43;
                unit2Arm = 1 + unit2ArmUps;
                unit2HP = 145;
                unit2Attributes = "AB";
                unit2IsGround = true;
                unit2AttackCount = 1;
                unit2RaceTag = "z";
            }
            if (unit2.equals("Spine Crawler")) {
                unit2AttVsGround = 25;
                unit2AttVsAir = 0;
                unit2AttSpeed = 1.32;
                unit2Arm = 2;
                unit2HP = 300;
                unit2Attributes = "ABS";
                unit2IsGround = true;
                unit2GBonusVsA = 5;
                unit2AttackCount = 1;
                unit2RaceTag = "z";
            }
            if (unit2.equals("Spore Crawler")) {
                unit2AttVsGround = 0;
                unit2AttVsAir = 15;
                unit2AttSpeed = 0.0;
                unit2AttSpeedVsAir = 0.61;
                unit2Arm = 1;
                unit2HP = 400;
                unit2Attributes = "ABS";
                unit2IsGround = true;
                unit2AirBonusVsB = 15;
                unit2AttackCount = 1;
                unit2RaceTag = "z";
            }
            if (unit2.equals("Swarm Host")) {
                unit2AttVsGround = 0;
                unit2AttVsAir = 0;
                unit2AttSpeed = 0.0;
                unit2Arm = 1 + unit2ArmUps;
                unit2HP = 160;
                unit2Attributes = "AB";
                unit2IsGround = true;
                unit2RaceTag = "z";
            }
            if (unit2.equals("Ultralisk")) {
                unit2AttVsGround = 35 + 3 * unit2AttUps;
                unit2AttVsAir = 0;
                unit2AttSpeed = 0.61;
                unit2Arm = 2 + unit2ArmUps;
                unit2HP = 500;
                unit2Attributes = "ABX";
                unit2IsGround = true;
                unit2AttackCount = 1;
                unit2RaceTag = "z";
            }
            if (unit2.equals("Viper")) {
                unit2AttVsGround = 0;
                unit2AttVsAir = 0;
                unit2AttSpeed = 0.0;
                unit2Arm = 1 + unit2ArmUps;
                unit2HP = 150;
                unit2Attributes = "ABP";
                unit2IsGround = false;
                unit2RaceTag = "z";
            }
            if (unit2.equals("Zergling")) {
                unit2AttVsGround = 5 + unit2AttUps;
                unit2AttVsAir = 0;
                unit2AttSpeed = 0.497;
                //unit2AttSpeed2 = 0.354;
                unit2Arm = unit2ArmUps;
                unit2HP = 35;
                unit2Attributes = "LB";
                unit2IsGround = true;
                unit2AttackCount = 1;
                unit2RaceTag = "z";
            }
            if (unit2.equals("Adept")) {
                unit2AttVsGround = 10 + unit2AttUps;
                unit2AttVsAir = 0;
                unit2AttSpeed = 1.61;
                //unit2AttSpeed2 = 1.11;
                unit2Arm = 1 + unit2ArmUps;
                unit2HP = 70;
                unit2Shields = 70;
                unit2Attributes = "LB";
                unit2IsGround = true;
                unit2GBonusVsL = 12;
                unit2AttackCount = 1;
                unit2RaceTag = "p";
            }
            if (unit2.equals("Archon")) {
                unit2AttVsGround = 25 + 3*unit2AttUps;
                unit2AttVsAir = 25 + 3*unit2AttUps;
                unit2AttSpeed = 1.25;
                unit2AttSpeedVsAir = 1.25;
                unit2Arm = unit2ArmUps;
                unit2HP = 10;
                unit2Shields = 350;
                unit2Attributes = "PX";
                unit2IsGround = true;
                unit2GBonusVsB = 10 + unit2AttUps;
                unit2AirBonusVsB = 10 + unit2AttUps;
                unit2AttackCount = 1;
                unit2RaceTag = "p";
            }
            if (unit2.equals("Carrier")) {
                unit2AttVsGround = (5 + unit2AttUps) * 2;
                unit2AttVsAir = (5 + unit2AttUps) * 2;
                unit2AttSpeed = 0.2675;
                unit2AttSpeedVsAir = 0.2675;
                unit2Arm = 2 + unit2ArmUps;
                unit2HP = 300;
                unit2Shields = 150;
                unit2Attributes = "AMX";
                unit2IsGround = false;
                unit2AttackCount = 2;
                unit2RaceTag = "p";
            }
            if (unit2.equals("Colossus")) {
                unit2AttVsGround = (10 + unit2AttUps) * 2;
                unit2AttVsAir = 0;
                unit2AttSpeed = 1.07;
                unit2Arm = 1 + unit2ArmUps;
                unit2HP = 200;
                unit2Shields = 150;
                unit2Attributes = "AMX";
                unit2IsGround = true;
                unit2GBonusVsL = 5 + unit2AttUps;
                unit2AttackCount = 2;
                unit2RaceTag = "p";
            }
            if (unit2.equals("Dark Templar")) {
                unit2AttVsGround = 45 + 5 * unit2AttUps;
                unit2AttVsAir = 0;
                unit2AttSpeed = 1.21;
                unit2Arm = 1 + unit2ArmUps;
                unit2HP = 40;
                unit2Shields = 80;
                unit2Attributes = "LBP";
                unit2IsGround = true;
                unit2AttackCount = 1;
                unit2RaceTag = "p";
            }
            if (unit2.equals("Disruptor")) {
                unit2AttVsGround = 145;
                unit2AttVsAir = 0;
                unit2AttSpeed = 14.3;
                unit2Arm = 1 + unit2ArmUps;
                unit2HP = 100;
                unit2Shields = 100;
                unit2Attributes = "AM";
                unit2IsGround = true;
                unit2AttackCount = 1;
                unit2RaceTag = "p";
            }
            if (unit2.equals("High Templar")) {
                unit2AttVsGround = 4+unit2AttUps;
                unit2AttVsAir = 0;
                unit2AttSpeed = 1.25;
                unit2Arm = unit2ArmUps;
                unit2HP = 40;
                unit2Shields = 40;
                unit2Attributes = "LBP";
                unit2IsGround = true;
                unit2AttackCount = 1;
                unit2RaceTag = "p";
            }
            if (unit2.equals("Immortal")) {
                unit2AttVsGround = 20 + 2*unit2AttUps;
                unit2AttVsAir = 0;
                unit2AttSpeed = 1.04;
                unit2Arm = 1 + unit2ArmUps;
                unit2HP = 200;
                unit2Shields = 100;
                unit2Attributes = "AM";
                unit2IsGround = true;
                unit2GBonusVsA = 30 + 3 * unit2AttUps;
                unit2AttackCount = 1;
                unit2RaceTag = "p";
            }
            if (unit2.equals("Interceptor")) {
                unit2AttVsGround = (5+unit2AttUps) * 2;
                unit2AttVsAir = (5+unit2AttUps)*2;
                unit2AttSpeed = 2.14;
                unit2AttSpeedVsAir = 2.14;
                unit2Arm = unit2ArmUps;
                unit2HP = 40;
                unit2Shields = 40;
                unit2Attributes = "LM";
                unit2IsGround = false;
                unit2AttackCount = 2;
                unit2RaceTag = "p";
            }
            if (unit2.equals("Mothership")) {
                unit2AttVsGround = (6+unit2AttUps)*6;
                unit2AttVsAir = (6+unit2AttUps)*6;
                unit2AttSpeed = 1.58;
                unit2AttSpeedVsAir = 1.58;
                unit2Arm = 2 + unit2ArmUps;
                unit2HP = 350;
                unit2Shields = 350;
                unit2Attributes = "AMPX";
                unit2IsGround = false;
                unit2AttackCount = 6;
                unit2RaceTag = "p";
            }
            if (unit2.equals("Observer")) {
                unit2AttVsGround = 0;
                unit2AttVsAir = 0;
                unit2AttSpeed = 0.0;
                unit2Arm = unit2ArmUps;
                unit2HP = 40;
                unit2Shields = 20;
                unit2Attributes = "LM";
                unit2IsGround = false;
                unit2RaceTag = "p";
            }
            if (unit2.equals("Oracle")) {
                unit2AttVsGround = 15;
                unit2AttVsAir = 0;
                unit2AttSpeed = 0.61;
                unit2Arm = unit2ArmUps;
                unit2HP = 100;
                unit2Shields = 60;
                unit2Attributes = "AMP";
                unit2IsGround = false;
                unit2GBonusVsL = 7;
                unit2AttackCount = 1;
                unit2RaceTag = "p";
            }
            if (unit2.equals("Phoenix")) {
                unit2AttVsGround = 0;
                unit2AttVsAir = (5 + unit2AttUps)*2;
                unit2AttSpeed = 0.0;
                unit2AttSpeedVsAir = 0.79;
                unit2Arm = unit2ArmUps;
                unit2HP = 120;
                unit2Shields = 60;
                unit2Attributes = "LM";
                unit2IsGround = false;
                unit2AirBonusVsL = 5;
                unit2AttackCount = 2;
                unit2RaceTag = "p";
            }
            if (unit2.equals("Photon Cannon")) {
                unit2AttVsGround = 20;
                unit2AttVsAir = 20;
                unit2AttSpeed = 0.89;
                unit2AttSpeedVsAir = 0.89;
                unit2Arm = 1;
                unit2HP = 150;
                unit2Shields = 150;
                unit2Attributes = "AS";
                unit2IsGround = true;
                unit2AttackCount = 1;
                unit2RaceTag = "p";
            }
            if (unit2.equals("Probe")) {
                unit2AttVsGround = 5;
                unit2AttVsAir = 0;
                unit2AttSpeed = 1.07;
                unit2Arm = unit2ArmUps;
                unit2HP = 20;
                unit2Shields = 20;
                unit2Attributes = "LM";
                unit2IsGround = true;
                unit2AttackCount = 1;
                unit2RaceTag = "p";
            }
            if (unit2.equals("Sentry")) {
                unit2AttVsGround = 6 + unit2AttUps;
                unit2AttVsAir = 6 + unit2AttUps;
                unit2AttSpeed = 0.71;
                unit2AttSpeedVsAir = 0.71;
                unit2Arm = 1 + unit2ArmUps;
                unit2HP = 40;
                unit2Shields = 40;
                unit2Attributes = "LMP";
                unit2IsGround = true;
                unit2AttackCount = 1;
                unit2RaceTag = "p";
            }
            if (unit2.equals("Stalker")) {
                unit2AttVsGround = 13+unit2AttUps;
                unit2AttVsAir = 13+unit2AttUps;
                unit2AttSpeed = 1.34;
                unit2AttSpeedVsAir = 1.34;
                unit2Arm = 1 + unit2ArmUps;
                unit2HP = 80;
                unit2Shields = 80;
                unit2Attributes = "AM";
                unit2IsGround = true;
                unit2GBonusVsA = 5 + unit2AttUps;
                unit2AirBonusVsA = 5 + unit2AttUps;
                unit2AttackCount = 1;
                unit2RaceTag = "p";
            }
            if (unit2.equals("Tempest")) {
                unit2AttVsGround = 40+4*unit2AttUps;
                unit2AttVsAir = 30+3*unit2AttUps;
                unit2AttSpeed = 2.36;
                unit2AttSpeedVsAir = 2.36;
                unit2Arm = 2 + unit2ArmUps;
                unit2HP = 150;
                unit2Shields = 125;
                unit2Attributes = "AMX";
                unit2IsGround = false;
                unit2AirBonusVsX = 22 + 2 * unit2AttUps;
                unit2AttackCount = 1;
                unit2RaceTag = "p";
            }
            if (unit2.equals("Void Ray")) {
                unit2AttVsGround = 6+unit2AttUps;
                unit2AttVsAir = 6+unit2AttUps;
                unit2AttSpeed = 0.36;
                unit2AttSpeedVsAir = 0.36;
                unit2Arm = unit2ArmUps;
                unit2HP = 150;
                unit2Shields = 100;
                unit2Attributes = "AM";
                unit2IsGround = false;
                unit2GBonusVsA = 4;
                unit2AirBonusVsA = 4;
                unit2AttackCount = 1;
                unit2RaceTag = "p";
            }
            if (unit2.equals("Warp Prism")) {
                unit2AttVsGround = 0;
                unit2AttVsAir = 0;
                unit2AttSpeed = 0.0;
                unit2Arm = unit2ArmUps;
                unit2HP = 80;
                unit2Shields = 100;
                unit2Attributes = "AMP";
                unit2IsGround = false;
                unit2RaceTag = "p";
            }
            if (unit2.equals("Zealot")) {
                unit2AttVsGround = (8+unit2AttUps)*2;
                unit2AttVsAir = 0;
                unit2AttSpeed = 0.86;
                unit2Arm = 1 + unit2ArmUps;
                unit2HP = 100;
                unit2Shields = 50;
                unit2Attributes = "LB";
                unit2IsGround = true;
                unit2AttackCount = 2;
                unit2RaceTag = "p";
            }
            if (unit2.equals("Auto-Turret")) {
                unit2AttVsGround = 18;
                unit2AttVsAir = 18;
                unit2AttSpeed = 0.57;
                unit2AttSpeedVsAir = 0.57;
                unit2Arm = 1 + 2 * unit2ArmUps;
                unit2HP = 150;
                unit2Attributes = "AMS";
                unit2IsGround = true;
                unit2AttackCount = 1;
                unit2LifeSpan = 10.0;
                unit2RaceTag = "t";
            }
            if (unit2.equals("Banshee")) {
                unit2AttVsGround = (12+unit2AttUps)*2;
                unit2AttVsAir = 0;
                unit2AttSpeed = 0.89;
                unit2Arm = unit2ArmUps;
                unit2HP = 140;
                unit2Attributes = "LM";
                unit2IsGround = false;
                unit2AttackCount = 2;
                unit2RaceTag = "t";
            }
            if (unit2.equals("Battlecruiser")) {
                unit2AttVsGround = 8 + unit2AttUps;
                unit2AttVsAir = 5 + unit2AttUps;
                unit2AttSpeed = 0.16;
                unit2AttSpeedVsAir = 0.16;
                unit2Arm = 3 + unit2ArmUps;
                unit2HP = 550;
                unit2Attributes = "AMX";
                unit2IsGround = false;
                unit2AttackCount = 1;
                unit2RaceTag = "t";
            }
            if (unit2.equals("Cyclone")) {
                unit2AttVsGround = 18 + unit2AttUps * 2;
                unit2AttVsAir = 18 + unit2AttUps * 2;
                unit2AttSpeed = 0.71;
                unit2AttSpeedVsAir = 0.71;
                unit2Arm = 1 + unit2ArmUps;
                unit2HP = 120;
                unit2Attributes = "AM";
                unit2IsGround = true;
                //unit2GBonusVsA = 2 + unit2AttUps;
                unit2AttackCount = 1;
                unit2RaceTag = "t";
            }
            if (unit2.equals("Ghost")) {
                unit2AttVsGround = 10 + unit2AttUps;
                unit2AttVsAir = 10 + unit2AttUps;
                unit2AttSpeed = 1.07;
                unit2AttSpeedVsAir = 1.07;
                unit2Arm = unit2ArmUps;
                unit2HP = 100;
                unit2Attributes = "BP";
                unit2IsGround = true;
                unit2GBonusVsL = 10 + unit2AttUps;
                unit2AirBonusVsL = 10 + unit2AttUps;
                unit2AttackCount = 1;
                unit2RaceTag = "t";
            }
            if (unit2.equals("Hellbat")) {
                unit2AttVsGround = 18 + 2 * unit2AttUps;
                unit2AttVsAir = 0;
                unit2AttSpeed = 1.43;
                unit2Arm = unit2ArmUps;
                unit2HP = 135;
                unit2Attributes = "LBM";
                unit2IsGround = true;
                unit2GBonusVsL = unit2AttUps;
                unit2AttackCount = 1;
                unit2RaceTag = "t";
            }
            if (unit2.equals("Hellion")) {
                unit2AttVsGround = 8 + unit2AttUps;
                unit2AttVsAir = 0;
                unit2AttSpeed = 1.79;
                unit2Arm = unit2ArmUps;
                unit2HP = 90;
                unit2Attributes = "LM";
                unit2IsGround = true;
                unit2GBonusVsL = 6 + unit2AttUps;
                unit2AttackCount = 1;
                unit2RaceTag = "t";
            }
            if (unit2.equals("Liberator (defender mode)")) {
                unit2AttVsGround = 75 + 5*unit2AttUps;
                unit2AttVsAir = 0;
                unit2AttSpeed = 1.14;
                unit2Arm = unit2ArmUps;
                unit2HP = 180;
                unit2Attributes = "AM";
                unit2IsGround = false;
                unit2AttackCount = 1;
                unit2RaceTag = "t";
            }
            if (unit2.equals("Liberator (fighter mode)")) {
                unit2AttVsGround = 0;
                unit2AttVsAir = (7 + unit2AttUps) * 2;
                unit2AttSpeed = 0.0;
                unit2AttSpeedVsAir = 1.29;
                unit2Arm = unit2ArmUps;
                unit2HP = 180;
                unit2Attributes = "AM";
                unit2IsGround = false;
                unit2AttackCount = 2;
                unit2RaceTag = "t";
            }
            if (unit2.equals("Marauder")) {
                unit2AttVsGround = (5+unit2AttUps)*2;
                unit2AttVsAir = 0;
                unit2AttSpeed = 1.07;
                //unit2AttSpeed2 = 0.71;
                unit2Arm = 1 + unit2ArmUps;
                unit2HP = 125;
                unit2Attributes = "AB";
                unit2IsGround = true;
                unit2GBonusVsA = 5;
                unit2AttackCount = 2;
                unit2RaceTag = "t";
            }
            if (unit2.equals("Marine")) {
                unit2AttVsGround = 6 + unit2AttUps;
                unit2AttVsAir = 6 + unit2AttUps;
                unit2AttSpeed = 0.61;
                //unit2AttSpeed2 = .40;
                unit2AttSpeedVsAir = 0.61;
                unit2Arm = unit2ArmUps;
                unit2HP = 45;
                unit2Attributes = "LB";
                unit2IsGround = true;
                unit2AttackCount = 1;
                unit2RaceTag = "t";
            }
            if (unit2.equals("Medivac")) {
                unit2AttVsGround = 0;
                unit2AttVsAir = 0;
                unit2AttSpeed = 0.0;
                unit2Arm = 1 + unit2ArmUps;
                unit2HP = 150;
                unit2Attributes = "AM";
                unit2IsGround = false;
                unit2RaceTag = "t";
            }
            if (unit2.equals("Missile Turret")) {
                unit2AttVsGround = 0;
                unit2AttVsAir = 12*2;
                unit2AttSpeed = 0.0;
                unit2AttSpeedVsAir = 0.61;
                unit2Arm = 0;
//                if (!unit2ArmorUps.getSelectedItem().toString().equals("0")) {
//                    unit2ArmorUps.setSelection(3);
//                    unit2Arm = 2;
//                }
                unit2HP = 250;
                unit2Attributes = "AMS";
                unit2IsGround = true;
                unit2AttackCount = 2;
                unit2RaceTag = "t";
            }
            if (unit2.equals("MULE")) {
                unit2AttVsGround = 0;
                unit2AttVsAir = 0;
                unit2AttSpeed = 0.0;
                unit2Arm = unit2ArmUps;
                unit2HP = 60;
                unit2Attributes = "LM";
                unit2IsGround = true;
                unit2LifeSpan = 64.0;
                unit2RaceTag = "t";
            }
            if (unit2.equals("Planetary Fortress")) {
                unit2AttVsGround = 40;
                unit2AttVsAir = 0;
                unit2AttSpeed = 1.43;
                unit2Arm = 3;
//                if (!unit2ArmorUps.getSelectedItem().toString().equals("0")) {
//                    unit2Arm = 5;
//                }
                unit2HP = 1500;
                unit2Attributes = "AMS";
                unit2IsGround = true;
                unit2AttackCount = 1;
                unit2RaceTag = "t";
            }
            if (unit2.equals("Raven")) {
                unit2AttVsGround = 0;
                unit2AttVsAir = 0;
                unit2AttSpeed = 0.0;
                unit2Arm = 1 + unit2ArmUps;
                unit2HP = 140;
                unit2Attributes = "LM";
                unit2IsGround = false;
                unit2RaceTag = "t";
            }
            if (unit2.equals("Reaper")) {
                unit2AttVsGround = (4+unit2AttUps)*2;
                unit2AttVsAir = 0;
                unit2AttSpeed = 0.79;
                unit2Arm = unit2ArmUps;
                unit2HP = 60;
                unit2Attributes = "LB";
                unit2IsGround = true;
                unit2AttackCount = 2;
                unit2RaceTag = "t";
            }
            if (unit2.equals("SCV")) {
                unit2AttVsGround = 5;
                unit2AttVsAir = 0;
                unit2AttSpeed = 1.07;
                unit2Arm = unit2ArmUps;
                unit2HP = 45;
                unit2Attributes = "LBM";
                unit2IsGround = true;
                unit2AttackCount = 1;
                unit2RaceTag = "t";
            }
            if (unit2.equals("Siege Tank (sieged)")) {
                unit2AttVsGround = 40 + 3*unit2AttUps;
                unit2AttVsAir = 0;
                unit2AttSpeed = 2.14;
                unit2Arm = 1 + unit2ArmUps;
                unit2HP = 175;
                unit2Attributes = "AM";
                unit2IsGround = true;
                unit2GBonusVsA = 30 + 2 * unit2AttUps;
                unit2AttackCount = 1;
                unit2RaceTag = "t";
            }
            if (unit2.equals("Siege Tank (tank mode)")) {
                unit2AttVsGround = 15 + 2*unit2AttUps;
                unit2AttVsAir = 18;
                unit2AttSpeed = 0.74;
                unit2Arm = 1 + unit2ArmUps;
                unit2HP = 175;
                unit2Attributes = "AM";
                unit2IsGround = true;
                unit2GBonusVsA = 10 + unit2AttUps;
                unit2AttackCount = 1;
                unit2RaceTag = "t";
            }
            if (unit2.equals("Thor (explosive)")) {
                unit2AttVsGround = (30 + 3*unit2AttUps)*2;
                unit2AttVsAir = (6+unit2AttUps)*4;
                unit2AttSpeed = 0.91;
                unit2AttSpeedVsAir = 2.14;
                unit2Arm = 1 + unit2ArmUps;
                unit2HP = 400;
                unit2Attributes = "AMX";
                unit2IsGround = true;
                unit2AirBonusVsL = 6 + unit2AttUps;
                unit2AttackCount = 2;
                unit2RaceTag = "t";
            }
            if (unit2.equals("Thor (high impact)")) {
                unit2AttVsGround = (30 + 3*unit2AttUps)*2;
                unit2AttVsAir = 40+4*unit2AttUps;
                unit2AttSpeed = 0.91;
                unit2AttSpeedVsAir = 1.71;
                unit2Arm = 1 + unit2ArmUps;
                unit2HP = 400;
                unit2Attributes = "AMX";
                unit2IsGround = true;
                unit2AirBonusVsX = 15 + 2 * unit2AttUps;
                unit2AttackCount = 2;
                unit2RaceTag = "t";
            }
            if (unit2.equals("Viking (assault mode)")) {
                unit2AttVsGround = 12 + unit2AttUps;
                unit2AttVsAir = 0;
                unit2AttSpeed = 0.71;
                unit2Arm = unit2ArmUps;
                unit2HP = 135;
                unit2Attributes = "AM";
                unit2IsGround = true;
                unit2GBonusVsM = 8;
                unit2AttackCount = 1;
                unit2RaceTag = "t";
            }
            if (unit2.equals("Viking (fighter mode)")) {
                unit2AttVsGround = 0;
                unit2AttVsAir = (10 + unit2AttUps)*2;
                unit2AttSpeed = 0.0;
                unit2AttSpeedVsAir = 1.43;
                unit2Arm = unit2ArmUps;
                unit2HP = 135;
                unit2Attributes = "AM";
                unit2IsGround = false;
                unit2AirBonusVsA = 4;
                unit2AttackCount = 2;
                unit2RaceTag = "t";
            }
            if (unit2.equals("Widow Mine")) {
                unit2AttVsGround = 125;
                unit2AttVsAir = 125;
                unit2AttSpeed = 29.0;
                unit2AttSpeedVsAir = 29.0;
                unit2Arm = unit2ArmUps;
                unit2HP = 90;
                unit2Attributes = "LM";
                unit2IsGround = true;
                unit2AttackCount = 1;
                unit2RaceTag = "t";
            }
        }
    }

    public void infoSetter() {

        int unitOnePosition = unit1Name.getSelectedItemPosition();
        unitItem unitOneX = genUnitArray.get(unitOnePosition);
        unit1 = unitOneX.getUnitName();
        if (unit1AttackUps.getSelectedItemPosition() != 0) {
            unit1AttUps = Integer.parseInt(unit1AttackUps.getSelectedItem().toString());
        }
        if (unit1AttackUps.getSelectedItemPosition() == 0) {
            unit1AttUps = 0;
        }
        if (unit1ArmorUps.getSelectedItemPosition() != 0) {
            unit1ArmUps = Integer.parseInt(unit1ArmorUps.getSelectedItem().toString());
        }
        if (unit1ArmorUps.getSelectedItemPosition() == 0) {
            unit1ArmUps = 0;
        }

        int unitTwoPosition = unit2Name.getSelectedItemPosition();
        unitItem unitTwoX = genUnitArray.get(unitTwoPosition);
        unit2 = unitTwoX.getUnitName();
        if (unit2AttackUps.getSelectedItemPosition() != 0) {
            unit2AttUps = Integer.parseInt(unit2AttackUps.getSelectedItem().toString());
        }
        if (unit2AttackUps.getSelectedItemPosition() == 0) {
            unit2AttUps = 0;
        }
        if (unit2ArmorUps.getSelectedItemPosition() != 0) {
            unit2ArmUps = Integer.parseInt(unit2ArmorUps.getSelectedItem().toString());
        }
        if (unit2ArmorUps.getSelectedItemPosition() == 0) {
            unit2ArmUps = 0;
        }
        //unit2Qua = Integer.parseInt(unit2Quantity.getSelectedItem().toString());

        if (unit1Terran.isChecked()) {
            unitOneX = tUnitArray.get(unitOnePosition);
            unit1 = unitOneX.getUnitName();
            terranSetter(1);
        }
        if (unit1Zerg.isChecked()) {
            unitOneX = zUnitArray.get(unitOnePosition);
            unit1 = unitOneX.getUnitName();
            zergSetter(1);
        }
        if (unit1Protoss.isChecked()) {
            unitOneX = pUnitArray.get(unitOnePosition);
            unit1 = unitOneX.getUnitName();
            protossSetter(1);
        }
        if (unit2Terran.isChecked()) {
            unitTwoX = tUnitArray.get(unitTwoPosition);
            unit2 = unitTwoX.getUnitName();
            terranSetter(2);
        }
        if (unit2Zerg.isChecked()) {
            unitTwoX = zUnitArray.get(unitTwoPosition);
            unit2 = unitTwoX.getUnitName();
            zergSetter(2);
        }
        if (unit2Protoss.isChecked()) {
            unitTwoX = pUnitArray.get(unitTwoPosition);
            unit2 = unitTwoX.getUnitName();
            protossSetter(2);
        }
        if (!unit1Terran.isChecked() && !unit1Protoss.isChecked() && !unit1Zerg.isChecked()) {
            generalSetter(1);
        }
        if (!unit2Terran.isChecked() && !unit2Protoss.isChecked() && !unit2Zerg.isChecked()) {
            generalSetter(2);
        }
    }

    public void resultMaker() {
        result = "hi";
        Double time = 0.0;
        Double movingTime = 0.0;
        Integer unit1FinalDmg = 0;
        Integer unit2FinalDmg = 0;
        Double unit1FinalAttackSpeed;
        Double unit2FinalAttackSpeed;
        Integer unit1HitsTillDead = null;
        Integer unit2HitsTillDead = null;
        Double unit1TimeTillDead = null;
        Double unit2TimeTillDead = null;
        Boolean bothTie = false;
        Boolean unit1Peaceful = false;
        Boolean unit2Peaceful = false;
        String winner = "";
        String loser = "";
        String winnerUnit = "";
        String loserUnit = "";
        Integer winnerAttacksDealt = 0;
        Integer loserAttacksDealt = 0;
        String hpRemaining = "";
        Integer unit1ShieldAttack = 0;
        Integer unit2ShieldAttack = 0;
        Integer unit1TempHP = unit1HP;
        Integer unit2TempHP = unit2HP;
        Integer unit1HitsTillShields = 0;
        Integer unit2HitsTillShields = 0;
        Integer unit1HitsOnShields = 0;
        Integer unit2HitsOnShields = 0;
        Integer allOtherAttacks = 0;
        Double unit1RegenBonus = 0.0;
        Double unit2RegenBonus = 0.0;
        Integer unit1TempShields = 0;
        Integer unit2TempShields = 0;
        Integer unit1PlasmaShieldUps = 0;
        Integer unit2PlasmaShieldUps = 0;
        Integer dmgToHP = 0;

        //  For when we need to show how long the other unit would have taken to die, and how many hits it would need.
        Double altUnit1Regen = 0.0;
        Double altUnit2Regen = 0.0;

        Integer altUnit1HitsTillDead = 0;
        Integer altUnit2HitsTillDead = 0;

        String winnerStillSucks = "";

        unit1TotalHP = unit1HP;
        unit2TotalHP = unit2HP;

        if (unit1Shields != null && unit1Shields != 0) {
            unit1TotalHP += unit1Shields;
        }
        if (unit2Shields != null && unit2Shields != 0) {
            unit2TotalHP += unit2Shields;
        }

        if (unit1ShieldUps.getSelectedItemPosition() != 0) {
            unit1PlasmaShieldUps = Integer.parseInt(unit1ShieldUps.getSelectedItem().toString());
        }
        if (unit2ShieldUps.getSelectedItemPosition() != 0) {
            unit2PlasmaShieldUps = Integer.parseInt(unit2ShieldUps.getSelectedItem().toString());
        }

        //Calculate Final Unit Damage
        if (unit2IsGround && unit1AttVsGround != 0 && unit1AttVsGround != null) {
            unit1FinalDmg = unit1AttVsGround - unit2Arm * unit1AttackCount;
            unit1ShieldAttack = unit1AttVsGround - unit2PlasmaShieldUps;
            //  If the units deals spell damage, armor is ignored.  Bonus vs shield added later.
            if (unit1.equals("Widow Mine")) {
                unit1FinalDmg = unit1AttVsGround;
                unit1ShieldAttack = unit1AttVsGround;
            }
            if (unit1.equals("Disruptor")) {
                unit1FinalDmg = unit1AttVsGround;
                unit1ShieldAttack = unit1AttVsGround;
            }
            if (unit1.equals("Oracle")) {
                unit1FinalDmg = unit1AttVsGround;
                unit1ShieldAttack = unit1AttVsGround;
            }
        }
        if ((!unit2IsGround || unit2.equals("Colossus")) && unit1AttVsAir != 0 && unit1AttVsAir != null) {
            unit1FinalDmg = unit1AttVsAir;
            unit1ShieldAttack = unit1AttVsAir;
            if (unit2.equals("Colossus") && (unit1AttVsGround == null || unit1AttVsGround == 0)) {
                if (unit1AirBonusVsA != null) {
                    unit1ShieldAttack += unit1AirBonusVsA * unit1AttackCount;
                    unit1FinalDmg += unit1AirBonusVsA * unit1AttackCount;
                }
                if (unit1AirBonusVsM != null) {
                    unit1ShieldAttack += unit1AirBonusVsM * unit1AttackCount;
                    unit1FinalDmg += unit1AirBonusVsM * unit1AttackCount;
                }
                if (unit1AirBonusVsX != null) {
                    unit1ShieldAttack += unit1AirBonusVsX * unit1AttackCount;
                    unit1FinalDmg += unit1AirBonusVsX * unit1AttackCount;
                }
            }
            unit1FinalDmg -= unit2Arm * unit1AttackCount;
            unit1ShieldAttack -= unit2PlasmaShieldUps;
            if (unit1.equals("Queen")) {
                unit1FinalDmg = unit1AttVsAir - unit2Arm;
            }
            if (unit1.equals("Thor (explosive)")) {
                unit1FinalDmg = unit1AttVsAir - unit2Arm * 4;
            }
            //  If the units deals spell damage, armor is ignored.  Bonus vs shield added later.
            if (unit1.equals("Widow Mine")) {
                unit1FinalDmg = unit1AttVsAir;
                unit1ShieldAttack = unit1AttVsAir;
            }
        }

        //  Unit 2
        if (unit1IsGround && unit2AttVsGround != 0 && unit2AttVsGround != null) {
            unit2FinalDmg = unit2AttVsGround - unit1Arm * unit2AttackCount;
            unit2ShieldAttack = unit2AttVsGround - unit1PlasmaShieldUps;
            //  If the units deals spell damage, armor is ignored.  Bonus vs shield added later.
            if (unit2.equals("Widow Mine")) {
                unit2FinalDmg = unit2AttVsGround;
                unit2ShieldAttack = unit2AttVsGround;
            }
            if (unit2.equals("Disruptor")) {
                unit2FinalDmg = unit2AttVsGround;
                unit2ShieldAttack = unit2AttVsGround;
            }
            if (unit2.equals("Oracle")) {
                unit2FinalDmg = unit2AttVsGround;
                unit2ShieldAttack = unit2AttVsGround;
            }
        }
        if ((!unit1IsGround || unit1.equals("Colossus")) && unit2AttVsAir != 0 && unit2AttVsAir != null) {
            unit2FinalDmg = unit2AttVsAir;
            unit2ShieldAttack = unit2AttVsAir;

            if (unit1.equals("Colossus") && (unit2AttVsGround == null || unit2AttVsGround == 0)) {
                if (unit2AirBonusVsA != null) {
                    unit2ShieldAttack += unit2AirBonusVsA * unit2AttackCount;
                    unit2FinalDmg += unit2AirBonusVsA * unit2AttackCount;
                }
                if (unit2AirBonusVsM != null) {
                    unit2ShieldAttack += unit2AirBonusVsM * unit2AttackCount;
                    unit2FinalDmg += unit2AirBonusVsM * unit2AttackCount;
                }
                if (unit2AirBonusVsX != null) {
                    unit2ShieldAttack += unit2AirBonusVsX * unit2AttackCount;
                    unit2FinalDmg += unit2AirBonusVsX * unit2AttackCount;
                }
            }
            unit2FinalDmg -= unit1Arm * unit2AttackCount;
            unit2ShieldAttack -= unit1PlasmaShieldUps;
            if (unit2.equals("Queen")) {
                unit2FinalDmg = unit2AttVsAir - unit1Arm;
            }
            if (unit2.equals("Thor (explosive)")) {
                unit2FinalDmg = unit2AttVsAir - unit1Arm * 4;
            }
            //  If the units deals spell damage, armor is ignored.  Bonus vs shield added later.
            if (unit2.equals("Widow Mine")) {
                unit2FinalDmg = unit2AttVsGround;
                unit2ShieldAttack = unit2AttVsGround;
            }
        }
        // Add all the attribute bonuses, ground first
        if (unit2Attributes.contains("B") && unit1GBonusVsB != null && unit2IsGround) {
            unit1FinalDmg += unit1GBonusVsB * unit1AttackCount;
            unit1ShieldAttack += unit1GBonusVsB * unit1AttackCount;
        }
        if (unit2Attributes.contains("L") && unit1GBonusVsL != null && unit2IsGround) {
            unit1FinalDmg += unit1GBonusVsL * unit1AttackCount;
            unit1ShieldAttack += unit1GBonusVsL * unit1AttackCount;
        }
        if (unit2Attributes.contains("A") && unit1GBonusVsA != null && unit2IsGround) {
            unit1FinalDmg += unit1GBonusVsA * unit1AttackCount;
            unit1ShieldAttack += unit1GBonusVsA * unit1AttackCount;
        }
        if (unit2Attributes.contains("M") && unit1GBonusVsM != null && unit2IsGround) {
            unit1FinalDmg += unit1GBonusVsM * unit1AttackCount;
            unit1ShieldAttack += unit1GBonusVsM * unit1AttackCount;
        }
        if (unit2Attributes.contains("P") && unit1GBonusVsP != null && unit2IsGround) {
            unit1FinalDmg += unit1GBonusVsP * unit1AttackCount;
            unit1ShieldAttack += unit1GBonusVsP * unit1AttackCount;
        }
        if (unit2Attributes.contains("S") && unit1GBonusVsS != null && unit2IsGround) {
            unit1FinalDmg += unit1GBonusVsS * unit1AttackCount;
            unit1ShieldAttack += unit1GBonusVsS * unit1AttackCount;
        }
        if (unit2Attributes.contains("X") && unit1GBonusVsX != null && unit2IsGround) {
            unit1FinalDmg += unit1GBonusVsX * unit1AttackCount;
            unit1ShieldAttack += unit1GBonusVsX * unit1AttackCount;
        }

        // Unit 2
        if (unit1Attributes.contains("B") && unit2GBonusVsB != null && unit1IsGround) {
            unit2FinalDmg += unit2GBonusVsB * unit2AttackCount;
            unit2ShieldAttack += unit2GBonusVsB * unit2AttackCount;
        }
        if (unit1Attributes.contains("L") && unit2GBonusVsL != null && unit1IsGround) {
            unit2FinalDmg += unit2GBonusVsL * unit2AttackCount;
            unit2ShieldAttack += unit2GBonusVsL * unit2AttackCount;
        }
        if (unit1Attributes.contains("A") && unit2GBonusVsA != null && unit1IsGround) {
            unit2FinalDmg += unit2GBonusVsA * unit2AttackCount;
            unit2ShieldAttack += unit2GBonusVsA * unit2AttackCount;
        }
        if (unit1Attributes.contains("M") && unit2GBonusVsM != null && unit1IsGround) {
            unit2FinalDmg += unit2GBonusVsM * unit2AttackCount;
            unit2ShieldAttack += unit2GBonusVsM * unit2AttackCount;
        }
        if (unit1Attributes.contains("P") && unit2GBonusVsP != null && unit1IsGround) {
            unit2FinalDmg += unit2GBonusVsP * unit2AttackCount;
            unit2ShieldAttack += unit2GBonusVsP * unit2AttackCount;
        }
        if (unit1Attributes.contains("S") && unit2GBonusVsS != null && unit1IsGround) {
            unit2FinalDmg += unit2GBonusVsS * unit2AttackCount;
            unit2ShieldAttack += unit2GBonusVsS * unit2AttackCount;
        }
        if (unit1Attributes.contains("X") && unit2GBonusVsX != null && unit1IsGround) {
            unit2FinalDmg += unit2GBonusVsX * unit2AttackCount;
            unit2ShieldAttack += unit2GBonusVsX * unit2AttackCount;
        }

        //All the air attribute bonuses
        if (unit2Attributes.contains("B") && unit1AirBonusVsB != null && !unit2IsGround) {
            unit1FinalDmg += unit1AirBonusVsB * unit1AttackCount;
            unit1ShieldAttack += unit1AirBonusVsB * unit1AttackCount;
        }
        if (unit2Attributes.contains("L") && unit1AirBonusVsL != null && !unit2IsGround) {
            if (unit1.equals("Thor (explosive)")){
                unit1AttackCount = 4;
            }
            unit1FinalDmg += unit1AirBonusVsL * unit1AttackCount;
            unit1ShieldAttack += unit1AirBonusVsL * unit1AttackCount;
        }
        if (unit2Attributes.contains("A") && unit1AirBonusVsA != null && !unit2IsGround) {
            unit1FinalDmg += unit1AirBonusVsA * unit1AttackCount;
            unit1ShieldAttack += unit1AirBonusVsA * unit1AttackCount;
        }
        if (unit2Attributes.contains("M") && unit1AirBonusVsM != null && !unit2IsGround) {
            unit1FinalDmg += unit1AirBonusVsM * unit1AttackCount;
            unit1ShieldAttack += unit1AirBonusVsM * unit1AttackCount;
        }
        if (unit2Attributes.contains("P") && unit1AirBonusVsP != null && !unit2IsGround) {
            unit1FinalDmg += unit1AirBonusVsP * unit1AttackCount;
            unit1ShieldAttack += unit1AirBonusVsP * unit1AttackCount;
        }
        if (unit2Attributes.contains("S") && unit1AirBonusVsS != null && !unit2IsGround) {
            unit1FinalDmg += unit1AirBonusVsS * unit1AttackCount;
            unit1ShieldAttack += unit1AirBonusVsS * unit1AttackCount;
        }
        if (unit2Attributes.contains("X") && unit1AirBonusVsX != null && !unit2IsGround) {
            unit1FinalDmg += unit1AirBonusVsX * unit1AttackCount;
            unit1ShieldAttack += unit1AirBonusVsX * unit1AttackCount;
        }

        //Unit 2
        if (unit1Attributes.contains("B") && unit2AirBonusVsB != null && !unit1IsGround) {
            unit2FinalDmg += unit2AirBonusVsB * unit2AttackCount;
            unit2ShieldAttack += unit2AirBonusVsB * unit2AttackCount;
        }
        if (unit1Attributes.contains("L") && unit2AirBonusVsL != null && !unit1IsGround) {
            if (unit2.equals("Thor (explosive)")){
                unit2AttackCount = 4;
            }
            unit2FinalDmg += unit2AirBonusVsL * unit2AttackCount;
            unit2ShieldAttack += unit2AirBonusVsL * unit2AttackCount;
        }
        if (unit1Attributes.contains("A") && unit2AirBonusVsA != null && !unit1IsGround) {
            unit2FinalDmg += unit2AirBonusVsA * unit2AttackCount;
            unit2ShieldAttack += unit2AirBonusVsA * unit2AttackCount;
        }
        if (unit1Attributes.contains("M") && unit2AirBonusVsM != null && !unit1IsGround) {
            unit2FinalDmg += unit2AirBonusVsM * unit2AttackCount;
            unit2ShieldAttack += unit2AirBonusVsM * unit2AttackCount;
        }
        if (unit1Attributes.contains("P") && unit2AirBonusVsP != null && !unit1IsGround) {
            unit2FinalDmg += unit2AirBonusVsP * unit2AttackCount;
            unit2ShieldAttack += unit2AirBonusVsP * unit2AttackCount;
        }
        if (unit1Attributes.contains("S") && unit2AirBonusVsS != null && !unit1IsGround) {
            unit2FinalDmg += unit2AirBonusVsS * unit2AttackCount;
            unit2ShieldAttack += unit2AirBonusVsS * unit2AttackCount;
        }
        if (unit1Attributes.contains("X") && unit2AirBonusVsX != null && !unit1IsGround) {
            unit2FinalDmg += unit2AirBonusVsX * unit2AttackCount;
            unit2ShieldAttack += unit2AirBonusVsX * unit2AttackCount;
        }
        if (unit1.equals("Widow Mine") && unit2Attributes.contains("S")) {
            unit1FinalDmg = 0;
            unit1AttVsGround = null;
            unit1AttVsAir = null;
        }
        if (unit2.equals("Widow Mine") && unit1Attributes.contains("S")) {
            unit2FinalDmg = 0;
            unit2AttVsGround = null;
            unit2AttVsAir = null;
        }
        if (unit1.equals("Liberator (defender mode)") && unit2Attributes.contains("S")) {
            unit1FinalDmg = 0;
            unit1AttVsGround = null;
        }
        if (unit2.equals("Liberator (defender mode)") && unit1Attributes.contains("S")) {
            unit2FinalDmg = 0;
            unit2AttVsGround = null;
        }

        //  If the units cannot target the other unit, they are "peaceful"
        if ((unit2IsGround && (unit1AttVsGround == null || unit1AttVsGround <= 0)) || (!unit2IsGround && (unit1AttVsAir == null || unit1AttVsAir <= 0))) {
            unit1Peaceful = true;
        }
        if ((unit1IsGround && (unit2AttVsGround == null || unit2AttVsGround <= 0)) || (!unit1IsGround && (unit2AttVsAir == null || unit2AttVsAir <= 0))) {
            unit2Peaceful = true;
        }
        if (unit2.equals("Colossus") && unit1AttVsAir != null && unit1AttVsAir != 0) {
            unit1Peaceful = false;
        }
        if (unit1.equals("Colossus") && unit2AttVsAir != null && unit2AttVsAir != 0) {
            unit2Peaceful = false;
        }

        //Attack Speed.  Exceptions made for some units and unit interactions here.


        //  Caustic Spray
        if (unit1.equals("Corruptor") && unit1SpecialMod.getSelectedItemPosition() == 1 && unit2Attributes.contains("S") && unit1Zerg.isChecked()) {
            unit1FinalDmg = unit1GBonusVsS;
            unit1AttSpeed = 0.02857;
            unit1Peaceful = false;
        }
        if (unit2.equals("Corruptor") && unit2SpecialMod.getSelectedItemPosition() == 1 && unit1Attributes.contains("S") && unit2Zerg.isChecked()) {
            unit2FinalDmg = unit2GBonusVsS;
            unit2AttSpeed = 0.02857;
            unit2Peaceful = false;
        }
        if (unit1SpecialMod.getSelectedItemPosition() == 14 && unit2Attributes.contains("S")) {
            unit1FinalDmg = unit1GBonusVsS;
            unit1AttSpeed = 0.02857;
            unit1Peaceful = false;
        }
        if (unit2SpecialMod.getSelectedItemPosition() == 14 && unit1Attributes.contains("S")) {
            unit2FinalDmg = unit2GBonusVsS;
            unit2AttSpeed = 0.02857;
            unit2Peaceful = false;
        }


        //  Mostly for the queen... defaults to attack vs air in case there is a difference
        unit1FinalAttackSpeed = unit1AttSpeed;
        if ((!unit2IsGround || unit2.equals("Colossus")) && (unit1AttSpeedVsAir != null && unit1AttSpeedVsAir != 0)) {
            unit1FinalAttackSpeed = unit1AttSpeedVsAir;
        }
        unit2FinalAttackSpeed = unit2AttSpeed;
        if ((!unit1IsGround || unit1.equals("Colossus")) && (unit2AttSpeedVsAir != null && unit2AttSpeedVsAir != 0)) {
            unit2FinalAttackSpeed = unit2AttSpeedVsAir;
        }


        //  Notable exceptions
        if ((unit1.equals("Cyclone") || unit1.equals("Thor (explosive)") || unit1.equals("Thor (high impact)") || unit1.equals("Battlecruiser")) && unit2.equals("Colossus")) {
            unit1FinalAttackSpeed = unit1AttSpeed;
            unit1FinalDmg = unit1AttVsGround - unit2Arm * unit1AttackCount;
            if (unit1GBonusVsA != null) {
                unit1FinalDmg += unit1GBonusVsA;
            }
            unit1ShieldAttack = unit1AttVsGround - unit2PlasmaShieldUps;
            if (unit1GBonusVsA != null) {
                unit1ShieldAttack += unit1GBonusVsA;
            }
        }
        if ((unit2.equals("Cyclone") || unit2.equals("Thor (explosive)") || unit2.equals("Thor (high impact)") || unit2.equals("Battlecruiser")) && unit1.equals("Colossus")) {
            unit2FinalAttackSpeed = unit2AttSpeed;
            unit2FinalDmg = unit2AttVsGround - unit1Arm * unit2AttackCount;
            if (unit2GBonusVsA != null) {
                unit2FinalDmg += unit2GBonusVsA;
            }
            unit2ShieldAttack = unit2AttVsGround - unit1PlasmaShieldUps;
            if (unit2GBonusVsA != null) {
                unit2ShieldAttack += unit2GBonusVsA;
            }
        }
        if (unit1.equals("Widow Mine") && unit2RaceTag.equals("p")) {
            unit1ShieldAttack += 35;
        }
        if (unit2.equals("Widow Mine") && unit1RaceTag.equals("p")) {
            unit2ShieldAttack += 35;
        }

        // Disruptor shield attack

        if (unit1.equals("Disruptor") && unit2RaceTag.equals("p")) {
            unit1ShieldAttack += 55;
        }
        if (unit2.equals("Disruptor") && unit1RaceTag.equals("p")) {
            unit2ShieldAttack += 55;
        }

        //  Add special mod special cases?

        //  Cyclones! (ignore armor with lock-on)

        if (unit1SpecialMod.getSelectedItemPosition() == 11 || unit1SpecialMod.getSelectedItemPosition() == 12 || (unit1Terran.isChecked() && unit1.equals("Cyclone") && (unit1SpecialMod.getSelectedItemPosition() == 1 || unit1SpecialMod.getSelectedItemPosition() == 2))) {
            unit1FinalDmg = 20;
            unit1ShieldAttack = 20;
            if (unit2Attributes.contains("A") && (unit1SpecialMod.getSelectedItemPosition() == 12 || (unit1Terran.isChecked() && unit1.equals("Cyclone") && unit1SpecialMod.getSelectedItemPosition() == 2))) {
                unit1FinalDmg = 40;
                unit1ShieldAttack = 40;
            }
        }

        if (unit2SpecialMod.getSelectedItemPosition() == 11 || unit2SpecialMod.getSelectedItemPosition() == 12 || (unit2Terran.isChecked() && unit2.equals("Cyclone") && (unit2SpecialMod.getSelectedItemPosition() == 1 || unit2SpecialMod.getSelectedItemPosition() == 2))) {
            unit2FinalDmg = 20;
            unit2ShieldAttack = 20;
            if (unit1Attributes.contains("A") && (unit2SpecialMod.getSelectedItemPosition() == 12 || (unit2Terran.isChecked() && unit2.equals("Cyclone") && unit2SpecialMod.getSelectedItemPosition() == 2))) {
                unit2FinalDmg = 40;
                unit2ShieldAttack = 40;
            }
        }




        // Make sure all units do at least 1 damage if they can do any damage, even if the armor exceeds the attack

        //Shield Attacks
        if (unit2IsGround && unit1AttVsGround != null && unit1AttVsGround != 0 && unit1ShieldAttack <= 0) {
            unit1ShieldAttack = 1;
        }
        if (unit1IsGround && unit2AttVsGround != null && unit2AttVsGround != 0 && unit2ShieldAttack <= 0) {
            unit2ShieldAttack = 1;
        }
        if (!unit2IsGround && unit1AttVsAir != null && unit1AttVsAir != 0 && unit1ShieldAttack <= 0) {
            unit1ShieldAttack = 1;
        }
        if (!unit1IsGround && unit2AttVsAir != null && unit2AttVsAir != 0 && unit2ShieldAttack <= 0) {
            unit2ShieldAttack = 1;
        }


        //  HP Attacks
        if (unit2IsGround && unit1AttVsGround != null && unit1AttVsGround != 0 && unit1FinalDmg <= 0) {
            unit1FinalDmg = 1;
        }
        if (unit1IsGround && unit2AttVsGround != null && unit2AttVsGround != 0 && unit2FinalDmg <= 0) {
            unit2FinalDmg = 1;
        }
        if (!unit2IsGround && unit1AttVsAir != null && unit1AttVsAir != 0 && unit1FinalDmg <= 0) {
            unit1FinalDmg = 1;
        }
        if (!unit1IsGround && unit2AttVsAir != null && unit2AttVsAir != 0 && unit2FinalDmg <= 0) {
            unit2FinalDmg = 1;
        }


        //Calculate hits till shields are gone before hits till dead
        if (!unit2Peaceful) {
            unit1HitsTillShields = unit1Shields / unit2ShieldAttack;
            if (unit1HitsTillShields != null && unit1HitsTillShields != 0 && (unit1HitsTillShields * unit2ShieldAttack < unit1Shields)) {
                unit1HitsTillShields += 1;
            }
            if (unit1Shields < unit2ShieldAttack && unit1Shields != null && unit1Shields != 0) {
                unit1HitsTillShields = 1;
            }
        }
        if (!unit1Peaceful) {
            unit2HitsTillShields = unit2Shields / unit1ShieldAttack;
            if (unit2HitsTillShields != null && unit2HitsTillShields != 0 && (unit2HitsTillShields * unit1ShieldAttack < unit2Shields)) {
                unit2HitsTillShields += 1;
            }
            if (unit2Shields < unit1ShieldAttack && unit2Shields != null && unit2Shields != 0) {
                unit2HitsTillShields = 1;
            }
        }

        Integer unit1Extras = 0;
        Integer unit2Extras = 0;
        if (unit1Shields != null && (unit1HitsTillShields * unit2ShieldAttack) > unit1Shields) {
            unit1Extras = (unit1HitsTillShields * unit2ShieldAttack) - unit1Shields;
            if (unit1Arm >= unit1Extras) {
                unit1Extras = 0;
            }
            if (unit1Arm < unit1Extras) {
                unit1Extras -= unit1Arm;
            }
//            if (!unit2.equals("Widow Mine")) {
//                if (unit1Arm >= unit1Extras) {
//                    unit1Extras = 0;
//                }
//                if (unit1Arm < unit1Extras) {
//                    unit1Extras -= unit1Arm;
//                }
//            }
        }
        //  Define tempHP as the HP left after the shields are gone.
        unit1TempHP = unit1HP - unit1Extras;

        //  If unit 2 is a Widow Mine, and unit 1's shields survives the first hit, unit 1's shields should regenerate before every shot until the shields are gone
        if (unit2.equals("Widow Mine") && unit1Shields != null && unit1Shields > unit2ShieldAttack) {
            unit1TempShields = unit1Shields;
            unit1HitsTillShields = 0;
            while (unit1TempShields >= 0) {
                unit1HitsTillShields += 1;
                if ((unit1TempShields - unit2ShieldAttack) <= 0) {
                    dmgToHP = unit2ShieldAttack - unit1TempShields;
                }
                unit1TempShields -= unit2ShieldAttack;
                if (unit1TempShields >= 0) {
                    unit1TempShields += 38;
                }
            }
            unit1TempHP = unit2HP - dmgToHP;
        }

        if (unit2Shields != null && (unit2HitsTillShields * unit1ShieldAttack) > unit2Shields) {
            unit2Extras = (unit2HitsTillShields * unit1ShieldAttack) - unit2Shields;
            if (unit2Arm >= unit2Extras) {
                unit2Extras = 0;
            }
            if (unit2Arm < unit2Extras) {
                unit2Extras -= unit2Arm;
            }
//            if (!unit1.equals("Widow Mine")) {
//                if (unit2Arm >= unit2Extras) {
//                    unit2Extras = 0;
//                }
//                if (unit2Arm < unit2Extras) {
//                    unit2Extras -= unit2Arm;
//                }
//            }
        }
        unit2TempHP = unit2HP - unit2Extras;

        //  If unit 1 is a Widow Mine, and unit 2's shields survives the first hit, unit 2's shields should regenerate before every shot until the shields are gone
        if (unit1.equals("Widow Mine") && unit2Shields != null && unit2Shields > unit1ShieldAttack) {
            unit2TempShields = unit2Shields;
            unit2HitsTillShields = 0;
            while (unit2TempShields >= 0) {
                unit2HitsTillShields += 1;
                if ((unit2TempShields - unit1ShieldAttack) <= 0) {
                    dmgToHP = unit1ShieldAttack - unit2TempShields;
                }
                unit2TempShields -= unit1ShieldAttack;
                if (unit2TempShields >= 0) {
                    unit2TempShields += 38;
                }
            }
            unit2TempHP = unit2HP - dmgToHP;
        }

        //  If unit 2 has a final attack more than 0, calculate how many attacks to kill unit 1 (hits till dead)
        //  If unit 2 has a final attack that = 0 or less, it's peaceful, and it's attack is 0


        //  Add exceptions for abilities that last only a certain amount of time, and cast them again after cooldown is up



        // Now calculate the unit1RegenBonus for zerg units
        Integer unit1HitsTillDeadRegen = 0;
        if (!unit2Peaceful) {
            unit1HitsTillDeadRegen = unit1TotalHP / unit2FinalDmg;
        }
        if (unit1HitsTillDeadRegen * unit2FinalDmg < unit1TotalHP) {
            unit1HitsTillDeadRegen += 1;
        }
        Double unit1TimeTillDeadRegen = ((unit1HitsTillDeadRegen - 1) * unit2FinalAttackSpeed);
        Integer unit2HitsTillDeadRegen = 0;
        if (!unit1Peaceful) {
            unit2HitsTillDeadRegen = unit2TotalHP / unit1FinalDmg;
        }
        if (unit2HitsTillDeadRegen * unit1FinalDmg < unit2TotalHP) {
            unit2HitsTillDeadRegen += 1;
        }
        Double unit2TimeTillDeadRegen = ((unit2HitsTillDeadRegen - 1) * unit1FinalAttackSpeed);

        if (unit1RaceTag.equals("z") && !unit2Peaceful) {
            //  If unit1TimeTillDead > unit2TimeTillDead
            if (!unit1Peaceful && (unit1TimeTillDeadRegen > unit2TimeTillDeadRegen)) {
                //  Regen bonus = Regen rate * unit 1 attack speed * unit2 hits till dead (because unit 2 is alive for less time)
                Integer numHits = unit2TotalHP / unit1FinalDmg;
                if ((numHits * unit1FinalDmg < unit2TotalHP || unit2RaceTag.equals("z")) && unit1TotalHP != unit2FinalDmg) {
                    numHits += 1;
                }
                unit1RegenBonus = (0.38 * unit1FinalAttackSpeed) * (numHits - 1);
                if (unit1LifeSpan != null && unit2TimeTillDeadRegen > unit1LifeSpan) {
                    unit1RegenBonus = (0.38) * unit1LifeSpan;
                }
                if (unit2FinalDmg != 0 && unit2FinalDmg != null) {
                    altUnit1Regen = (0.38 * unit2FinalAttackSpeed) * (unit1TotalHP / unit2FinalDmg);
                }

                // Regen due to regen added to ALT regen
                if (unit2FinalDmg < altUnit1Regen) {
                    altUnit1Regen += (0.38 * unit2FinalAttackSpeed) * (altUnit1Regen / unit2FinalDmg);
                }
            }
            //  If unit 2 is the winner
            else if (unit1Peaceful || (unit1TimeTillDeadRegen <= unit2TimeTillDeadRegen)) {
                Integer numHits = unit1TotalHP / unit2FinalDmg;
                if ((numHits * unit2FinalDmg < unit1TotalHP || unit1RaceTag.equals("z")) && unit1TotalHP != unit2FinalDmg) {
                    numHits += 1;
                }
                unit1RegenBonus = (0.38 * unit2FinalAttackSpeed) * (numHits - 1);
                if (unit1FinalDmg != 0 && unit1FinalDmg != null) {
                    altUnit1Regen = (0.38 * unit1FinalAttackSpeed) * (unit2TotalHP / unit1FinalDmg);
                }

                //  The theoretical regen for zerg units attacked by timed units indefinitely
                if (!unit2Peaceful && (unit1FinalDmg == 0 || unit1FinalDmg == null) && unit2LifeSpan != null && ((unit2LifeSpan/unit2FinalAttackSpeed) * unit2FinalDmg) < unit1TotalHP) {
                    unit1RegenBonus = (0.38 * unit2LifeSpan);
                    altUnit1Regen = (0.38 * unit2FinalAttackSpeed) * (unit1TotalHP / unit2FinalDmg);
                }

                // Regen due to regen added only if unit 2 is winner, cuz if unit 1 is winner, the time is calculated differently, and should be accurate as is.
                //unit1RegenBonus += (0.38 * unit2FinalAttackSpeed) * (unit1RegenBonus/ unit2FinalDmg);  Or just 0.38 * the attack speed, because that attack speed is the only time getting added to the TOB
                Double secondIterationRegen = (0.38 * unit2FinalAttackSpeed) * ((int)(unit1RegenBonus/unit2FinalDmg));
                Double thirdIterationRegen = (0.38 * unit2FinalAttackSpeed) * ((int)(secondIterationRegen / unit2FinalDmg));
                Double fourthIterationRegen = (0.38 * unit2FinalAttackSpeed) * ((int)(thirdIterationRegen / unit2FinalDmg));
                if (unit2FinalDmg < unit1RegenBonus) {
                    unit1RegenBonus += secondIterationRegen;
                }
                if (unit2FinalDmg < secondIterationRegen) {
                    unit1RegenBonus += thirdIterationRegen;
                }
                if (unit2FinalDmg < thirdIterationRegen) {
                    unit1RegenBonus += fourthIterationRegen;
                }
            }
        }

        //  Regen bonus for unit1 Mutalisks:
        if (unit1.equals("Mutalisk") && !unit2Peaceful) {
            //  If unit1TimeTillDead > unit2TimeTillDead
            if (unit1TimeTillDeadRegen > unit2TimeTillDeadRegen) {
                Integer numHits = unit2TotalHP / unit1FinalDmg;
                if ((numHits * unit1FinalDmg < unit2TotalHP || unit2RaceTag.equals("z")) && unit1TotalHP != unit2FinalDmg) {
                    numHits += 1;
                }
                //  Regen bonus = Regen rate * unit 1 attack speed * unit2 hits till dead (because unit 2 is alive for less time)
                unit1RegenBonus = (1.4 * unit1FinalAttackSpeed) * (numHits - 1);

                //  Alt regen is to calculate the attacks needed to defeat the mutalisk.  For example marine's alt regen no ups comes out to be 19.5111
                if (unit2FinalDmg != 0 && unit2FinalDmg != null) {
                    altUnit1Regen = (1.4 * unit2FinalAttackSpeed) * (unit1TotalHP / unit2FinalDmg);
                }
                // Regen due to regen added to ALT regen
                if (unit2FinalDmg < altUnit1Regen) {
                    altUnit1Regen += (1.4 * unit2FinalAttackSpeed) * (altUnit1Regen / unit2FinalDmg);
                }
            }
            //  If unit 2 is the winner
            else if (unit1TimeTillDeadRegen <= unit2TimeTillDeadRegen) {
                Integer numHits = unit1TotalHP / unit2FinalDmg;
                if ((numHits * unit2FinalDmg < unit1TotalHP || unit1RaceTag.equals("z"))  && unit1TotalHP != unit2FinalDmg) {
                    numHits += 1;
                }
                unit1RegenBonus = (1.4 * unit2FinalAttackSpeed) * (numHits - 1);
                //  If the muta is going to lose, make sure to add on the regen due to regen if applicable
                if (unit2FinalDmg < unit1RegenBonus) {
                    unit1RegenBonus += (1.4 * unit2FinalAttackSpeed);
                }
            }
        }


        // While loop that can potentially do everything but for now handles zergs:
//        if (unit1RaceTag.equals("z")) {
//            unit1TempHPR = unit1TotalHP * 1.0;
//            movingTime = 0.0;
//            unit1HitsTillDead = 0;
//            unit1TimeTillDead = 0.0;
//            if (!unit2Peaceful) {
//                while (unit1TempHPR > 0) {
//                    unit1TempHPR -= unit2FinalDmg;
//                    unit1HitsTillDead += 1;
//                    movingTime += unit2FinalAttackSpeed;
//                    if (unit1RaceTag.equals("z")) {
//                        unit1TempHPR += 0.38 * unit2FinalAttackSpeed;
//                    }
//                }
//                unit1TimeTillDead = movingTime;
//            }
//            unit2TempHPR = unit2TotalHP * 1.0;
//            movingTime = 0.0;
//            unit2HitsTillDead = 0;
//            unit2TimeTillDead = 0.0;
//            if (!unit1Peaceful) {
//                while (unit2TempHPR > 0) {
//                    unit2HitsTillDead += 1;
//                    unit2TempHPR -= unit1FinalDmg;
//                    movingTime += unit1FinalAttackSpeed;
//                    if (unit2RaceTag.equals("z")) {
//                        unit2TempHPR += 0.38 * unit1FinalAttackSpeed;
//                    }
//                }
//                unit2TimeTillDead = movingTime;
//            }
//        }

        // Now calculate the unit2RegenBonus for zerg units

        if (unit2RaceTag.equals("z") && !unit1Peaceful) {
            //  If unit2TimeTillDead > unit1TimeTillDead
            if (!unit2Peaceful && (unit2TimeTillDeadRegen > unit1TimeTillDeadRegen)) {
                //  RegenBonus = Regen rate * unit 2 attack speed * unit1 hits till dead (because unit 1 is alive for less time)
                Integer numHits = unit1TotalHP / unit2FinalDmg;
                if (((numHits * unit2FinalDmg) < unit1TotalHP || unit1RaceTag.equals("z")) && unit2TotalHP != unit1FinalDmg) {
                    numHits += 1;
                }
                unit2RegenBonus = (0.38 * unit2FinalAttackSpeed) * (numHits - 1);
                if (unit2LifeSpan != null && unit1TimeTillDeadRegen > unit2LifeSpan) {
                    unit2RegenBonus = (0.38) * unit2LifeSpan;
                }
                if (unit1FinalDmg != 0 && unit1FinalDmg != null) {
                    altUnit2Regen = (0.38 * unit1FinalAttackSpeed) * (unit2TotalHP / unit1FinalDmg);
                }
                // Regen due to regen added to ALT regen
                if (unit1FinalDmg < altUnit2Regen) {
                    altUnit2Regen += (0.38 * unit1FinalAttackSpeed) * (altUnit2Regen / unit1FinalDmg);
                }
            }
            //  If unit 1 is the winner
            else if (unit2Peaceful || (unit2TimeTillDeadRegen <= unit1TimeTillDeadRegen)) {
                Integer numHits = unit2TotalHP / unit1FinalDmg;
                if ((numHits * unit1FinalDmg < unit2TotalHP || unit2RaceTag.equals("z"))  && unit2TotalHP != unit1FinalDmg) {
                    numHits += 1;
                }
                unit2RegenBonus = (0.38 * unit1FinalAttackSpeed) * (numHits - 1);
                if (unit2FinalDmg != 0 && unit2FinalDmg != null) {
                    altUnit2Regen = (0.38 * unit2FinalAttackSpeed) * (unit1TotalHP / unit2FinalDmg);
                }

                //  The theoretical regen for zerg units attacked by timed units indefinitely
                if (!unit1Peaceful && (unit2FinalDmg == 0 || unit2FinalDmg == null) && unit1LifeSpan != null && ((unit1LifeSpan/unit1FinalAttackSpeed) * unit1FinalDmg) < unit2TotalHP) {
                    unit2RegenBonus = (0.38 * unit1LifeSpan);
                    altUnit2Regen = (0.38 * unit1FinalAttackSpeed) * (unit2TotalHP / unit1FinalDmg);
                }

                // Regen due to regen added only if unit 1 is winner, cuz if unit 2 is winner, the time is calculated differently.  This is needed because the unit has not yet battled and could have more hp.
                //unit2RegenBonus += (0.38 * unit1FinalAttackSpeed) * (unit2RegenBonus/ unit1FinalDmg);
                Double secondIterationRegen = (0.38 * unit1FinalAttackSpeed) * ((int)(unit2RegenBonus/unit1FinalDmg));
                Double thirdIterationRegen = (0.38 * unit1FinalAttackSpeed) * ((int)(secondIterationRegen / unit1FinalDmg));
                Double fourthIterationRegen = (0.38 * unit1FinalAttackSpeed) * ((int)(thirdIterationRegen / unit1FinalDmg));
                if (unit1FinalDmg < unit2RegenBonus) {
                    unit2RegenBonus += secondIterationRegen;
                }
                if (unit1FinalDmg < secondIterationRegen) {
                    unit2RegenBonus += thirdIterationRegen;
                }
                if (unit1FinalDmg < thirdIterationRegen) {
                    unit2RegenBonus += fourthIterationRegen;
                }
            }
        }

        //  Regen bonus for unit 2 Mutalisks

        if (unit2.equals("Mutalisk") && !unit1Peaceful) {
            //  If unit2TimeTillDead > unit1TimeTillDead
            if (unit2TimeTillDeadRegen > unit1TimeTillDeadRegen) {
                //  RegenBonus = Regen rate * unit 2 attack speed * unit1 hits till dead (because unit 1 is alive for less time)
                Integer numHits = unit1TotalHP / unit2FinalDmg;
                if ((numHits * unit2FinalDmg < unit1TotalHP || unit1RaceTag.equals("z")) && unit2TotalHP != unit1FinalDmg) {
                    numHits += 1;
                }
                unit2RegenBonus = (1.4 * unit2FinalAttackSpeed) * (numHits - 1);

                //  Alt regen is to calculate the attacks needed to defeat the mutalisk.  For example marine's alt regen no ups comes out to be 19.5111
                if (unit1FinalDmg != 0 && unit1FinalDmg != null) {
                    altUnit2Regen = (1.4 * unit1FinalAttackSpeed) * (unit2TotalHP / unit1FinalDmg);
                }
                // Regen due to regen added to ALT regen
                if (unit1FinalDmg < altUnit2Regen) {
                    altUnit2Regen += (1.4 * unit1FinalAttackSpeed) * (altUnit2Regen / unit1FinalDmg);
                }
            }
            //  If unit 1 is the winner
            else if (unit2TimeTillDeadRegen <= unit1TimeTillDeadRegen) {
                Integer numHits = unit2TotalHP / unit1FinalDmg;
                if ((numHits * unit1FinalDmg < unit2TotalHP || unit2RaceTag.equals("z")) && unit2TotalHP != unit1FinalDmg) {
                    numHits += 1;
                }
                unit2RegenBonus = (1.4 * unit1FinalAttackSpeed) * (numHits - 1);
                //  If the muta is going to lose, make sure to add on the regen due to regen if applicable, we are only interested in the time to kill the mutalisk changing (since we are finding
                //  unit 2 muta regen.
                if (unit1FinalDmg < unit2RegenBonus) {
                    unit2RegenBonus += (1.4 * unit1FinalAttackSpeed);
                }
            }
        }

        // Now calculate hits till dead for unit 1

        if (unit2FinalDmg > 0) {
            unit1HitsTillDead = ((int)(unit1TempHP + unit1RegenBonus) / unit2FinalDmg) + unit1HitsTillShields;
        } else if (unit2FinalDmg <= 0) {
            unit2Peaceful = true;
            unit2FinalDmg = 0;
        }

        //  Same thing for unit 1, calculating unit 2 hits until it dies
        if (unit1FinalDmg > 0) {
            unit2HitsTillDead = ((int)(unit2TempHP + unit2RegenBonus) / unit1FinalDmg) + unit2HitsTillShields;
        } else if (unit1FinalDmg <= 0) {
            unit1Peaceful = true;
            unit1FinalDmg = 0;
        }

        //  If the unit has a finite amount of hits until death and the product of that number and unit 2 final attack is still less than the HP of the unit, add 1.
        //  It could be less, because of how hits till dead is calculated.

        if (unit1HitsTillDead != null && (((unit1HitsTillDead - unit1HitsTillShields) * unit2FinalDmg)) < (unit1TempHP + unit1RegenBonus)) {
            unit1HitsTillDead += 1;
        }
        if (unit1TempHP <= 0 && unit1HitsTillShields == 1) {
            unit1HitsTillDead = 1;
        }
        if (unit1.equals("Disruptor") && unit2IsGround && unit2TotalHP == 145) {
            unit2HitsTillDead = 1;
            if (unit2RegenBonus != null) {
                unit2RegenBonus = 0.0;
            }
        }
        if (unit2.equals("Disruptor") && unit1IsGround && unit1TotalHP == 145) {
            unit1HitsTillDead = 1;
            if (unit1RegenBonus != null) {
                unit1RegenBonus = 0.0;
            }
        }

        //  Same thing as we did for unit 1 hits until dead, we do now for unit 2 hits until dead
        if (unit2HitsTillDead != null && (((unit2HitsTillDead - unit2HitsTillShields) * unit1FinalDmg)) < (unit2TempHP + unit2RegenBonus)) {
            unit2HitsTillDead += 1;
        }
        if (unit2TempHP <= 0 && unit2HitsTillShields == 1) {
            unit2HitsTillDead = 1;
        }

        //  If the unit is a changeling, the hits until death is 1 no matter what
        if (unit1.equals("Changeling") && !unit2Peaceful) {
            unit1HitsTillDead = 1;
        }

        if (unit2.equals("Changeling") && !unit1Peaceful) {
            unit2HitsTillDead = 1;
        }

        // ---------------------------------------------
        // Calculate the time it takes for the unit to die.  Whichever dies first is the loser, which means the *higher* time of death would be the winner.
        if (unit1HitsTillDead != null && unit2FinalAttackSpeed != 0 && unit2FinalAttackSpeed != null && !unit2.equals("Baneling")) {
            unit1TimeTillDead = (unit1HitsTillDead - 1) * unit2FinalAttackSpeed;
            if (unit1.equals("Baneling")) {
                unit1TimeTillDead = 0.0;
                if (!unit2IsGround) {
                    unit1TimeTillDead = (unit1HitsTillDead - 1) * unit2FinalAttackSpeed;
                }
                // make more exact with shieldattack final dmg average??
                if ((unit2TotalHP) > unit1FinalDmg) {
                    unit2TimeTillDead = null;
                    if (unit2LifeSpan != null) {
                        unit2TimeTillDead = unit2LifeSpan;
                    }
                } else {
                    unit2TimeTillDead = 0.0;
                }
            }
        }
        if (unit2HitsTillDead != null && unit1FinalAttackSpeed != 0 && unit2FinalAttackSpeed != null && !unit1.equals("Baneling")) {
            unit2TimeTillDead = (unit2HitsTillDead - 1) * unit1FinalAttackSpeed;
            if (unit2.equals("Baneling")) {
                unit2TimeTillDead = 0.0;
                if (!unit1IsGround) {
                    unit2TimeTillDead = (unit2HitsTillDead - 1) * unit1FinalAttackSpeed;
                }
                if ((unit1TotalHP) > unit2FinalDmg) {
                    unit1TimeTillDead = null;
                    if (unit1LifeSpan != null) {
                        unit1TimeTillDead = unit1LifeSpan;
                    }
                } else {
                    unit1TimeTillDead = 0.0;
                }
            }
        }
        if (unit1.equals("Baneling") && unit2.equals("Baneling")) {
            unit1TimeTillDead = 0.0;
            unit2TimeTillDead = 0.0;
        }

        //  Calculate the winner, or if the two units "tie"
        //  Shields of one unit divided by the shield-attack of the other unit gets you "attacks to destroy the shield"

        //  Time format
        DecimalFormat df = new DecimalFormat("#.000");

        // HpRemaining should be the (HP + Shields) - (shieldattack * attacks on shields) - (finaldmg * any other attacks) - extraHPDmg)


        if (unit1TimeTillDead != null && unit2TimeTillDead != null) {
            if (unit1TimeTillDead > unit2TimeTillDead || (unit2LifeSpan != null && unit1TimeTillDead > unit2LifeSpan)) {
                winner = unit1;
                loser = unit2;
                winnerUnit = "unit 1";
                loserUnit = "unit 2";
                time = unit2TimeTillDead;
                winnerAttacksDealt = unit2HitsTillDead;

                //  If unit 2's lifespan is less than the time it takes to kill either unit it's the limiting factor
                if (unit2LifeSpan != null && unit1TimeTillDead > unit2LifeSpan && unit2LifeSpan < unit2TimeTillDead) {
                    winnerAttacksDealt = (int)(unit2LifeSpan / unit1FinalAttackSpeed) + 1;
                }
                loserAttacksDealt = (int) (unit2TimeTillDead / unit2FinalAttackSpeed) + 1;
                if (unit2LifeSpan != null && unit1TimeTillDead > unit2LifeSpan && unit2LifeSpan < unit2TimeTillDead) {
                    loserAttacksDealt = (int)(unit2LifeSpan / unit2FinalAttackSpeed) + 1;
                }
                if (loserAttacksDealt < unit1HitsTillShields) {
                    unit1HitsOnShields = loserAttacksDealt;
                    allOtherAttacks = 0;
                }
                if (loserAttacksDealt >= unit1HitsTillShields) {
                    unit1HitsOnShields = unit1HitsTillShields;
                    allOtherAttacks = loserAttacksDealt - unit1HitsTillShields;
                }
                Integer hp = (int)(unit1HP + unit1Shields + Math.round((unit1RegenBonus))) - (unit1HitsOnShields * unit2ShieldAttack) - (allOtherAttacks * unit2FinalDmg);

                //  This bit is needed to address protoss armor beneath the shields to get accurate hp remaining readings.
                if (unit1Shields != null && unit1Shields != 0 && (unit1Arm != 0 || unit1ArmUps != 0) && !unit2.equals("Widow Mine") && !unit2.equals("Disruptor") && !unit2.equals("Oracle")){
                    if (unit1HitsOnShields * unit2ShieldAttack > unit1Shields) {
                        Integer difference = unit1HitsOnShields * unit2ShieldAttack - unit1Shields;
                        if (difference >= unit1Arm) {
                            hp += unit1Arm;
                        }
                        if (difference < unit1Arm) {
                            hp += difference;
                        }
                    }
                }

                //  Hack to avoid addressing the problem of the first hit into HP being less due to armor, and not equal to shield attack.  This should always be accurate as long as the overkill into
                //  the HP is not less than the unit1's base armor.  If it's less the unit might have 1 extra hp or 2 extra worst case scenario.
                if (hp == 0) {
                    hp += unit1Arm;
                }
                hpRemaining = Integer.toString(hp);


                //  Special case such as broodling vs high templar where the broodling expires before lethal damage takes place on either side

                //  UPDATE, this code is probably never reached, now it's here because it was only an accidental that both unit 1 and 2 being Broodling/High Templar work
                //  in the code below (2 similar paragraphs).  Each case is satisfied by one side of the ||  OR statement (unit2TimeTillDead > unit1TimeTillDead and
                //  the bit about the lifespan.... Going to leave this code up just in case!
                if (unit1LifeSpan != null && unit2TimeTillDead > unit1LifeSpan && (unit1TimeTillDead > unit1LifeSpan)) {
                    winner = unit2;
                    loser = unit1;
                    winnerUnit = "unit 2";
                    loserUnit = "unit 1";
                    time = unit1LifeSpan;
                    winnerAttacksDealt = (int)(unit1LifeSpan/unit2FinalAttackSpeed) + 1;
                    loserAttacksDealt = (int)(unit1LifeSpan/unit1FinalAttackSpeed) + 1;
                    allOtherAttacks = loserAttacksDealt - unit2HitsTillShields;
                    winnerStillSucks = "yup";
                    hp = (int)(unit2HP + unit2Shields + Math.round((unit2RegenBonus))) - (unit2HitsOnShields * unit1ShieldAttack) - (allOtherAttacks * unit1FinalDmg);
                    if (hp == 0) {
                        hp += unit2Arm;
                    }
                    hpRemaining = Integer.toString(hp);
                }
                if (unit2LifeSpan != null && unit1TimeTillDead > unit2LifeSpan && (unit2TimeTillDead > unit2LifeSpan)) {
                    winner = unit1;
                    loser = unit2;
                    winnerUnit = "unit 1";
                    loserUnit = "unit 2";
                    time = unit2LifeSpan;
                    winnerAttacksDealt = (int)(unit2LifeSpan/unit1FinalAttackSpeed) + 1;
                    loserAttacksDealt = (int)(unit2LifeSpan/unit2FinalAttackSpeed) + 1;
                    allOtherAttacks = loserAttacksDealt - unit1HitsTillShields;
                    winnerStillSucks = "yup";
                    hp = (int)(unit1HP + unit1Shields + Math.round((unit1RegenBonus))) - (unit1HitsOnShields * unit2ShieldAttack) - (allOtherAttacks * unit2FinalDmg);

                    //  This bit is needed to address protoss armor beneath the shields to get accurate hp remaining readings.
                    if (unit1Shields != null && unit1Shields != 0 && (unit1Arm != 0 || unit1ArmUps != 0) && !unit2.equals("Widow Mine") && !unit2.equals("Disruptor") && !unit2.equals("Oracle")){
                        if (unit1HitsOnShields * unit2ShieldAttack > unit1Shields) {
                            Integer difference = unit1HitsOnShields * unit2ShieldAttack - unit1Shields;
                            if (difference >= unit1Arm) {
                                hp += unit1Arm;
                            }
                            if (difference < unit1Arm) {
                                hp += difference;
                            }
                        }
                    }

                    if (hp == 0) {
                        hp += unit1Arm;
                    }
                    hpRemaining = Integer.toString(hp);
                }

                //  Back to normal code below :)
            }
            if (unit2TimeTillDead > unit1TimeTillDead  || (unit1LifeSpan != null && unit2TimeTillDead > unit1LifeSpan)) {
                winner = unit2;
                loser = unit1;
                winnerUnit = "unit 2";
                loserUnit = "unit 1";
                time = unit1TimeTillDead;
                winnerAttacksDealt = unit1HitsTillDead;

                //  If unit 1's lifespan is less than the time it takes to kill either unit it's the limiting factor
                if ((unit1LifeSpan != null) && (unit2TimeTillDead > unit1LifeSpan) && (unit1LifeSpan < unit1TimeTillDead)) {
                    winnerAttacksDealt = (int)(unit1LifeSpan / unit2FinalAttackSpeed) + 1;
                }
                loserAttacksDealt = (int) (unit1TimeTillDead / unit1FinalAttackSpeed) + 1;
                if (unit1LifeSpan!= null && unit2TimeTillDead > unit1LifeSpan && unit1LifeSpan < unit1TimeTillDead) {
                    loserAttacksDealt = (int)(unit1LifeSpan / unit1FinalAttackSpeed) + 1;
                }
                if (loserAttacksDealt < unit2HitsTillShields) {
                    unit2HitsOnShields = loserAttacksDealt;
                    allOtherAttacks = 0;
                }
                if (loserAttacksDealt >= unit2HitsTillShields) {
                    unit2HitsOnShields = unit2HitsTillShields;
                    allOtherAttacks = loserAttacksDealt - unit2HitsTillShields;
                }
                //  USE Math.round???  otherwise roach vs queen - roach has 0 hp due to rounding problems
                Integer hp = (int)(unit2HP + unit2Shields + Math.round(unit2RegenBonus)) - (unit2HitsOnShields * unit1ShieldAttack) - (allOtherAttacks * unit1FinalDmg);

                //  This bit is needed to address protoss armor beneath the shields to get accurate hp remaining readings.
                if (unit2Shields != null && unit2Shields != 0 && (unit2Arm != 0 || unit2ArmUps != 0) && !unit1.equals("Widow Mine") && !unit1.equals("Disruptor") && !unit1.equals("Oracle")){
                    if (unit2HitsOnShields * unit1ShieldAttack > unit2Shields) {
                        Integer difference = unit2HitsOnShields * unit1ShieldAttack - unit2Shields;
                        if (difference >= unit2Arm) {
                            hp += unit2Arm;
                        }
                        if (difference < unit2Arm) {
                            hp += difference;
                        }
                    }
                }

                //  Hack to avoid addressing the problem of the first hit into HP being less due to armor, and not equal to shield attack.
                if (hp == 0) {
                    hp += unit2Arm;
                }
                hpRemaining = Integer.toString(hp);

                //  Special case such as broodling vs high templar where the broodling expires before lethal damage takes place on either side
                if (unit2LifeSpan != null && unit1TimeTillDead > unit2LifeSpan && (unit2TimeTillDead > unit2LifeSpan)) {
                    winner = unit1;
                    loser = unit2;
                    winnerUnit = "unit 1";
                    loserUnit = "unit 2";
                    time = unit2LifeSpan;
                    winnerAttacksDealt = (int)(unit2LifeSpan/unit1FinalAttackSpeed) + 1;
                    loserAttacksDealt = (int)(unit2LifeSpan/unit2FinalAttackSpeed) + 1;
                    allOtherAttacks = loserAttacksDealt - unit1HitsTillShields;
                    winnerStillSucks = "yup";
                    hp = (int)(unit1HP + unit1Shields + Math.round((unit1RegenBonus))) - (unit1HitsOnShields * unit2ShieldAttack) - (allOtherAttacks * unit2FinalDmg);
                    if (hp == 0) {
                        hp += unit1Arm;
                    }
                    hpRemaining = Integer.toString(hp);
                }

                //  Special case such as broodling vs high templar where the broodling expires before lethal damage takes place on either side
                if (unit1LifeSpan != null && unit2TimeTillDead > unit1LifeSpan && (unit1TimeTillDead > unit1LifeSpan)) {
                    winner = unit2;
                    loser = unit1;
                    winnerUnit = "unit 2";
                    loserUnit = "unit 1";
                    time = unit1LifeSpan;
                    winnerAttacksDealt = (int)(unit1LifeSpan/unit2FinalAttackSpeed) + 1;
                    loserAttacksDealt = (int)(unit1LifeSpan/unit1FinalAttackSpeed) + 1;
                    allOtherAttacks = loserAttacksDealt - unit2HitsTillShields;
                    winnerStillSucks = "yup";
                    hp = (int)(unit2HP + unit2Shields + Math.round(unit2RegenBonus)) - (unit2HitsOnShields * unit1ShieldAttack) - (allOtherAttacks * unit1FinalDmg);

                    //  This bit is needed to address protoss armor beneath the shields to get accurate hp remaining readings.
                    if (unit2Shields != null && unit2Shields != 0 && (unit2Arm != 0 || unit2ArmUps != 0) && !unit1.equals("Widow Mine") && !unit1.equals("Disruptor") && !unit1.equals("Oracle")){
                        if (unit2HitsOnShields * unit1ShieldAttack > unit2Shields) {
                            Integer difference = unit2HitsOnShields * unit1ShieldAttack - unit2Shields;
                            if (difference >= unit2Arm) {
                                hp += unit2Arm;
                            }
                            if (difference < unit2Arm) {
                                hp += difference;
                            }
                        }
                    }

                    if (hp == 0) {
                        hp += unit2Arm;
                    }
                    hpRemaining = Integer.toString(hp);
                }
            }
            else if ((Double.compare(unit1TimeTillDead, unit2TimeTillDead) == 0) || winner.equals("")) {
                bothTie = true;

            }
        }

//        while (unit1HP > 0 && unit2HP > 0) {
//            unit1HP = unit1HP - unit2FinalDmg;
//            unit2HP = unit2HP - unit1FinalDmg;
//        }

        //  This should be the most common algorithm to find the winner, and the only one between 2 units who can damage each other.
        result = "The " + winner + " (" + winnerUnit + ")" + " defeats the " + loser + " (" + loserUnit + ")!";

        //  Special cases
        if (unit1.equals("Baneling") && !unit2.equals("Baneling")){
            if (unit2TimeTillDead == null || unit2LifeSpan != null) {
                result = "The Baneling blows up and the " + unit2 + " lives on forever!";
                if (unit2LifeSpan != null) {
                    result = "The Baneling blows up and " + unit2 + " lives!";
                }
                time = 0.0;
                winner = unit2;
                loser = unit1;
                winnerUnit = "unit 2";
                loserUnit = "unit 1";
                loserAttacksDealt = 1;
                winnerAttacksDealt = 1;
                hpRemaining = Integer.toString(unit2TotalHP - unit1FinalDmg);
                if (unit2Shields != null && unit2Shields != 0) {
                    hpRemaining = Integer.toString(unit2TotalHP - unit1ShieldAttack);
                }
            }
        }
        if (unit2.equals("Baneling") && !unit1.equals("Baneling")){
            if (unit1TimeTillDead == null || unit1LifeSpan != null) {
                result = "The Baneling blows up and the " + unit1 + " lives on forever!";
                if (unit1LifeSpan != null) {
                    result = "The Baneling blows up and " + unit1 + " lives!";
                }
                time = 0.0;
                winner = unit1;
                loser = unit2;
                winnerUnit = "unit 1";
                loserUnit = "unit 2";
                loserAttacksDealt = 1;
                winnerAttacksDealt = 1;
                hpRemaining = Integer.toString(unit1TotalHP - unit2FinalDmg);
                if (unit1Shields != null && unit1Shields != 0) {
                    hpRemaining = Integer.toString(unit1TotalHP - unit2ShieldAttack);
                }
            }
        }
        if (bothTie) {
            result = "Both units eliminate each other or have equal chances!";
            hpRemaining = Integer.toString(0);
            winner = unit1;
            loser = unit2;
            winnerUnit = "both";
            loserUnit = "both";
            winnerAttacksDealt = unit1HitsTillDead;
            loserAttacksDealt = unit2HitsTillDead;
            time = unit1TimeTillDead;
            if (unit1.equals("Baneling") && unit2.equals("Baneling")) {
                loserAttacksDealt = 1;
                winnerAttacksDealt = 1;
            }
            if (unit1.equals("Baneling") && !unit2.equals("Baneling") || (unit2.equals("Baneling") && !unit1.equals("Baneling"))) {
                loserAttacksDealt = 1;
                winnerAttacksDealt = 1;
                result = "Both units blow up due to the Baneling explosion!";
            }
        }
        if (unit1Peaceful && unit2Peaceful) {
            result = "Both units deal zero damage and live out their lives in the Koprulu Sector peacefully for all of eternity!";
            hpRemaining = Integer.toString(unit1TotalHP) + " and " + Integer.toString(unit2TotalHP);
            time = 999999.7;
            winner = unit1;
            loser = unit2;
            winnerUnit = "unit 1";
            loserUnit = "unit 2";
            winnerAttacksDealt = 0;
            loserAttacksDealt = 0;
            if ((unit1LifeSpan != null && unit2LifeSpan == null) || (unit1LifeSpan != null && unit2LifeSpan != null && unit2LifeSpan > unit1LifeSpan)) {
                result = "Both units deal zero damage, but the " + unit1 + " eventually expires " + df.format(unit1LifeSpan) + " seconds after they meet.";
                time = unit1LifeSpan;
                hpRemaining = Double.toString(unit2TotalHP);
            }
            if ((unit2LifeSpan != null && unit1LifeSpan == null) || (unit2LifeSpan != null && unit1LifeSpan != null && unit1LifeSpan > unit2LifeSpan)) {
                result = "Both units deal zero damage, but the " + unit2 + " eventually expires " + df.format(unit2LifeSpan) + " seconds after they meet.";
                time = unit2LifeSpan;
                hpRemaining = Double.toString(unit1TotalHP);
            }
            if (unit2LifeSpan != null && unit1LifeSpan != null && (Double.compare(unit1LifeSpan, unit2LifeSpan) == 0)) {
                result = "Both units deal zero damage, and both units expire " + df.format(unit2LifeSpan) + " seconds after they meet.";
                time = unit2LifeSpan;
                hpRemaining = Integer.toString(0);
            }
        }
        if (unit2Peaceful && !unit1Peaceful) {
            result = "The " + unit1 + " wins, as the " + unit2 + " can't deal damage!";
            hpRemaining = Integer.toString(unit1TotalHP);
            if (unit2.equals("Changeling")) {
                unit2HitsTillDead = 1;
            }
            winnerAttacksDealt = unit2HitsTillDead;
            loserAttacksDealt = 0;
            winner = unit1;
            loser = unit2;
            winnerUnit = "unit 1";
            loserUnit = "unit 2";
            if (unit2TotalHP <= unit1FinalDmg && unit1.equals("Baneling")) {
                result = "Both units blow up due to the Baneling explosion!";
                winner = unit1;
                loser = unit2;
                winnerUnit = "unit 1";
                loserUnit = "unit 2";
                unit2TimeTillDead = 0.0;
                hpRemaining = Integer.toString(0);
                winnerAttacksDealt = 1;
                loserAttacksDealt = 0;
            }
            time = unit2TimeTillDead;
            if (unit2HitsTillDead == 1) {
                time = 0.0;
            }
            if (unit1LifeSpan != null && unit1LifeSpan < unit2TimeTillDead) {
                result = "Even though the " + unit2 + " can't attack, it wins because the " + unit1 + " expires before the dealing lethal damage";
                winner = unit2;
                loser = unit1;
                winnerUnit = "unit 2";
                loserUnit = "unit 1";
                time = unit1LifeSpan;
                winnerAttacksDealt = 0;
                loserAttacksDealt = (int) (unit1LifeSpan/unit1FinalAttackSpeed);
                hpRemaining = Integer.toString((int)(unit2TotalHP + unit2RegenBonus) - (loserAttacksDealt * unit1FinalDmg));
            }
            if (unit2TotalHP > unit1FinalDmg && unit1.equals("Baneling")) {
                result = "The Baneling blows up and the " + unit2 + " lives on forever!";
                if (unit2LifeSpan != null) {
                    result = "The Baneling blows up and " + unit2 + " lives!";
                }
                winner = unit2;
                loser = unit1;
                winnerUnit = "unit 2";
                loserUnit = "unit 2";
                time = 0.0;
                hpRemaining = Integer.toString(unit2TotalHP - unit1FinalDmg);
                winnerAttacksDealt = 0;
                loserAttacksDealt = 1;
            }
        }
        if (unit1Peaceful && !unit2Peaceful) {
            result = "The " + unit2 + " wins, as the " + unit1 + " can't deal damage!";
            hpRemaining = Integer.toString(unit2TotalHP);
            winnerAttacksDealt = unit1HitsTillDead;
            loserAttacksDealt = 0;
            winner = unit2;
            loser = unit1;
            winnerUnit = "unit 2";
            loserUnit = "unit 1";
            if (unit1TotalHP <= unit2FinalDmg && unit2.equals("Baneling")) {
                result = "Both units blow up due to the Baneling explosion!";
                winner = unit2;
                loser = unit1;
                winnerUnit = "unit 2";
                loserUnit = "unit 1";
                unit1TimeTillDead = 0.0;
                hpRemaining = Integer.toString(0);
                winnerAttacksDealt = 1;
                loserAttacksDealt = 0;
            }
            time = unit1TimeTillDead;
            if (unit1HitsTillDead == 1) {
                time = 0.0;
            }
            if (unit2LifeSpan != null && unit2LifeSpan < unit1TimeTillDead) {
                result = "Even though the " + unit1 + " can't attack, it wins because the " + unit2 + " expires before the dealing lethal damage";
                winner = unit1;
                loser = unit2;
                winnerUnit = "unit 1";
                loserUnit = "unit 2";
                time = unit2LifeSpan;
                winnerAttacksDealt = 0;
                loserAttacksDealt = (int) (unit2LifeSpan/unit2FinalAttackSpeed);
                hpRemaining = Integer.toString((int)(unit1TotalHP + unit1RegenBonus) - (loserAttacksDealt * unit2FinalDmg));
            }
            if (unit1TotalHP > unit2FinalDmg && unit2.equals("Baneling")) {
                result = "The Baneling blows up and the " + unit1 + " lives on forever!";
                if (unit1LifeSpan != null) {
                    result = "The Baneling blows up and " + unit1 + " lives!";
                }
                winner = unit1;
                loser = unit2;
                winnerUnit = "unit 1";
                loserUnit = "unit 2";
                time = 0.0;
                hpRemaining = Integer.toString(unit1TotalHP - unit2FinalDmg);
                winnerAttacksDealt = 0;
                loserAttacksDealt = 1;
            }
        }

        if (unit1LifeSpan != null && winner.equals(unit1) && !(unit1Peaceful && unit2Peaceful) && !winnerUnit.equals("both") && !winnerUnit.equals("unit 2")) {
            result += "  The " + winner + " eventually expires " + df.format(unit1LifeSpan - time) + " seconds after the battle.";
        }
        if (unit1LifeSpan != null && winner.equals(unit2) && !(unit1Peaceful && unit2Peaceful) && !winnerUnit.equals("both") && !winnerUnit.equals("unit 1") && !unit1Peaceful && winnerStillSucks.equals("yup")) {
            result += "  The " + winner + " survives long enough for the " + loser + " to expire, and neither unit deals lethal damage.";
        }
        if (unit2LifeSpan != null && winner.equals(unit2)  && !(unit1Peaceful && unit2Peaceful) && !winnerUnit.equals("both") && !winnerUnit.equals("unit 1")) {
            result += "  The " + winner + " eventually expires " + df.format(unit2LifeSpan - time) + " seconds after the battle.";
        }
        if (unit2LifeSpan != null && winner.equals(unit1) && !(unit1Peaceful && unit2Peaceful) && !winnerUnit.equals("both") && !winnerUnit.equals("unit 2") && !unit2Peaceful && winnerStillSucks.equals("yup")) {
            result += "  The " + winner + " survives long enough for the " + loser + " to expire, and neither unit deals lethal damage.";
        }
        result += "\n" + "HP Remaining: " + hpRemaining;
        //result += "\n" + "Unit 1 regen: " + unit1RegenBonus;
        if (!(unit1Peaceful && unit2Peaceful)) {
            if (winnerUnit.equals("both") && !unit1.equals(unit2)) {
                if ((unit1.equals("Baneling") && !unit2Peaceful) || (unit2.equals("Baneling") && !unit1Peaceful)) {
                    result += "\n" + "Attacks dealt by the " + unit1 + ": 1";
                    result += "\n" + "Attacks dealt by the " + unit2 + ": 1";
                    if (unit1.equals("Baneling") && !unit2Peaceful) {
                        int finalAttacks = unit1HP/unit2FinalDmg;
                        if ((unit2FinalDmg * finalAttacks) < (unit1HP + Math.round(altUnit1Regen))) {
                            finalAttacks += 1;
                        }
                        result += "\n" + "Attacks needed to slay the Baneling" + ": " + finalAttacks;
                    }
                    else if (unit2.equals("Baneling") && !unit1Peaceful) {
                        int finalAttacks2 = unit2HP/unit1FinalDmg;
                        if ((unit1FinalDmg * finalAttacks2) < (unit2HP + Math.round(altUnit2Regen))) {
                            finalAttacks2 += 1;
                        }
                        result += "\n" + "Attacks needed to slay the Baneling" + ": " + finalAttacks2;
                    }
                }
                if (!unit1.equals("Baneling") && !unit2.equals("Baneling")) {
                    result += "\n" + "Attacks dealt by the " + unit1 + ": " + unit2HitsTillDead;
                    result += "\n" + "Attacks dealt by the " + unit2 + ": " + unit1HitsTillDead;
                }
            }
            else if (winnerUnit.equals("both") && unit1.equals(unit2)) {
                if (unit1.equals("Baneling")) {
                    result += "\n" + "Attacks dealt by both units: 1";
                    result += "\n" + "Attacks needed to slay the other Baneling " + ": " + unit2HitsTillDead;
                }
                else if (!unit1.equals("Baneling")) {
                    result += "\n" + "Attacks dealt by both units: " + unit1HitsTillDead;
                }
            }
            else if (!winnerUnit.equals("both")) {
                result += "\n" + "Attacks dealt by the " + winner + " (" + winnerUnit + ") " + ": " + winnerAttacksDealt;
            }
            if (!winnerUnit.equals("both")) {
                result += "\n" + "Attacks dealt by the " + loser + " (" + loserUnit + ") " + ": " + loserAttacksDealt;
            }
            if (!winnerUnit.equals("both")) {
                if (!unit2Peaceful) {
                    if (winner.equals(unit1) && winnerUnit.equals("unit 1")) {
                        altUnit1HitsTillDead = ((int)(unit1HP + altUnit1Regen) / unit2FinalDmg);
                        if (unit1RaceTag.equals("z")) {
                            if ((altUnit1HitsTillDead * unit2FinalDmg) < (unit1HP + Math.round(altUnit1Regen))) {
                                altUnit1HitsTillDead += 1;
                            }
                            result += "\n" + "Attacks needed to defeat the " + winner + " (" + winnerUnit + "): " + altUnit1HitsTillDead;
                        }
                        else if (!unit1RaceTag.equals("z")) {
                            result += "\n" + "Attacks needed to defeat the " + winner + " (" + winnerUnit + "): " + unit1HitsTillDead;
                        }
                        if (winnerStillSucks.equals("yup")) {
                            result += "\n" + "Attacks needed to defeat the " + loser + " (" + loserUnit + "): " + unit2HitsTillDead;
                        }
                    }
                }
                if (!unit1Peaceful) {
                    if (winner.equals(unit2) && winnerUnit.equals("unit 2")) {
                        altUnit2HitsTillDead = ((int)(unit2HP + altUnit2Regen) / unit1FinalDmg);
                        if (unit2RaceTag.equals("z")) {
                            if ((altUnit2HitsTillDead * unit1FinalDmg) < (unit2HP + Math.round(altUnit2Regen))) {
                                altUnit2HitsTillDead += 1;
                            }
                            result += "\n" + "Attacks needed to defeat the " + winner + " (" + winnerUnit + "): " + altUnit2HitsTillDead;
//                            result += "\n" + "Alt regen: " + altUnit2Regen;
//                            result += "\n" + "regen: " + unit2RegenBonus;
                        }
                        else if (!unit2RaceTag.equals("z")) {
                            result += "\n" + "Attacks needed to defeat the " + winner + " (" + winnerUnit + "): " + unit2HitsTillDead;
                        }
                        if (winnerStillSucks.equals("yup")) {
                            result += "\n" + "Attacks needed to defeat the " + loser + " (" + loserUnit + "): " + unit1HitsTillDead;
                        }
                    }
                }
            }

            //  Decided to comment this out, as it's not useful most of the time, when units trade - they will see how much either unit dealt anyway
//            if (winnerUnit.equals("both") && unit1.equals(unit2)) {
//                result += "\n" + "Attacks needed to defeat either unit: " + unit1HitsTillDead;
//
//            }


//            else if (winnerUnit.equals("both") && !unit1.equals(unit2)) {
//                result += "\n" + "Attacks needed to defeat the " + unit1 + ": " + unit1HitsTillDead;
//                result += "\n" + "Attacks needed to defeat the " + unit1 + ": " + unit1HitsTillDead;
//            }
            if (unit1.equals("Baneling") && !unit2.equals("Baneling") && !unit2Peaceful && winnerUnit != "both") {
                int finalAttacks = unit1HP/unit2FinalDmg;
                if ((unit2FinalDmg * finalAttacks) < (unit1HP + Math.round(altUnit1Regen))) {
                    finalAttacks += 1;
                }
                result += "\n" + "Attacks needed to slay the Baneling: " + finalAttacks;
                //result += "\n" + "regen: " + altUnit1Regen;
            }
            if (unit2.equals("Baneling") && !unit1.equals("Baneling") && !unit1Peaceful && winnerUnit != "both") {
                int finalAttacks2 = unit2HP/unit1FinalDmg;
                if ((unit1FinalDmg * finalAttacks2) < (unit2HP + Math.round(altUnit2Regen))) {
                    finalAttacks2 += 1;
                }
                result += "\n" + "Attacks needed to slay the Baneling: " + finalAttacks2;
            }
        }

        if (unit1Peaceful && unit2Peaceful) {
            result += "\n" + "Attacks dealt by the either unit: 0";
        }
//        if (unit2Peaceful) {
//            if (winner.equals(unit1)) {
//                result += "\n" + "Attacks needed to defeat the " + winner + ": None - the " + winner + " would never be defeated";
//            }
//        }
//        if (unit1Peaceful) {
//            if (winner.equals(unit2)) {
//                result += "\n" + "Attacks needed to defeat the " + winner + ": None - the " + winner + " would never be defeated";
//            }
//        }
        if (time == 999999.7) {
            result += "\n" + "Time of battle: it continues infinitely";
        }
        else {
            result += "\n" + "Time of battle: " + df.format(time) + " seconds";
            if (winner.equals(unit1) && winnerUnit.equals("unit 1")) {
                if (unit1RaceTag.equals("z") && !unit2Peaceful && !unit2.equals("Baneling")) {
                    double altUnit1TimeTillDead = (altUnit1HitsTillDead - 1) * unit2FinalAttackSpeed;
                    result += "\n" + "Time needed to defeat the " + winner + " (" + winnerUnit + "): " + df.format(altUnit1TimeTillDead) + " seconds";
                }
                else if (!unit1RaceTag.equals("z") && !unit2Peaceful && !unit2.equals("Baneling")) {
                    result += "\n" + "Time needed to defeat the " + winner + " (" + winnerUnit + "): " + df.format(unit1TimeTillDead) + " seconds";
                }
                if (winnerStillSucks.equals("yup")) {
                    result += "\n" + "Time needed to defeat the " + loser + " (" + loserUnit + "): " + unit2TimeTillDead;
                }
//                if (unit2.equals("Baneling")) {
//                    result += "\n" + "Time needed to slay the Baneling: " + unit2TimeTillDead;
//                }
            }
            else if (winner.equals(unit2) && winnerUnit.equals("unit 2")) {
                if (unit2RaceTag.equals("z") && !unit1Peaceful && !unit1.equals("Baneling")) {
                    double altUnit2TimeTillDead = (altUnit2HitsTillDead - 1) * unit1FinalAttackSpeed;
                    result += "\n" + "Time needed to defeat the " + winner + " (" + winnerUnit + "): " + df.format(altUnit2TimeTillDead) + " seconds";
                }
                else if (!unit2RaceTag.equals("z") && !unit1Peaceful && !unit1.equals("Baneling")) {
                    result += "\n" + "Time needed to defeat the " + winner + " (" + winnerUnit + ")" + ": " + df.format(unit2TimeTillDead) + " seconds";
                }
                if (winnerStillSucks.equals("yup")) {
                    result += "\n" + "Time needed to defeat the " + loser + " (" + loserUnit + "): " + unit1TimeTillDead;
                }
//                if (unit1.equals("Baneling")) {
//                    result += "\n" + "Time needed to slay the Baneling: " + unit1TimeTillDead;
//                }
            }
        }
        result += "\n" + "Unit 1 starting HP: " + unit1TotalHP + "   Unit 2 starting HP: " + unit2TotalHP;
        if (unit1RaceTag.equals("z")) {
            result += "\n" + "HP regenerated by the " + unit1 + " (unit 1): " + df.format(unit1RegenBonus);
        }
        if (unit2RaceTag.equals("z")) {
            result += "\n" + "HP regenerated by the " + unit2 + " (unit 2): " + df.format(unit2RegenBonus);
        }
//        result += "\n" + "unit 1 Shield attack: " + unit1ShieldAttack + " Final dmg: " + unit1FinalDmg;
//        result += "\n" + "unit 2 Shield attack: " + unit2ShieldAttack + " Final dmg: " + unit2FinalDmg;
//        result += "\n" + "unit 1 attack count: " + unit1AttackCount;
//        result += "\n" + "unit 2 attack count: " + unit2AttackCount;
        //result += "\n" + unit1FinalDmg + " " + unit2FinalDmg + " " + bothTie + " " + unit1RegenBonus + " " + unit2RegenBonus;
        //result += "\n" + "Unit 1 regen bonus: " + unit1RegenBonus + "  Unit 2 regen bonus: " + unit2RegenBonus + " Alt unit 1 regen bonus: " + altUnit1Regen + "  Alt unit 2 regen bonus: " + altUnit2Regen;

        // Testing tags:   + " " + unit1FinalDmg + " " + unit2FinalDmg + " "+ unit1FinalAttackSpeed + " " + unit2FinalAttackSpeed + " " + unit1HitsTillDead+ " " + unit2HitsTillDead
        //  + " " + unit1RegenBonus + " " + unit2RegenBonus
    }

//    public Integer zergRegenHP(String unit) {
//        return 8;
//    }

    public void theModifiers() {

        int unitOnePosition = unit1Name.getSelectedItemPosition();
        unitItem unitOneX = genUnitArray.get(unitOnePosition);

        int unitTwoPosition = unit2Name.getSelectedItemPosition();
        unitItem unitTwoX = genUnitArray.get(unitTwoPosition);

        if (unitOne.getCheckedRadioButtonId() == -1) {
            specialModifier(unit1SpecialMod.getSelectedItemPosition(), 1);
        }
        if (unitTwo.getCheckedRadioButtonId() == -1) {
            specialModifier(unit2SpecialMod.getSelectedItemPosition(), 2);
        }
        if (unit1Zerg.isChecked()) {
            unitOneX = zUnitArray.get(unitOnePosition);
            if (unitOneX.getUnitName().equals("Zergling")) {
                zerglingModifier(unit1SpecialMod.getSelectedItemPosition(), 1);
            }
            if (unitOneX.getUnitName().equals("Baneling")) {
                banelingModifier(unit1SpecialMod.getSelectedItemPosition(), 1);
            }
            if (unitOneX.getUnitName().equals("Corruptor")) {
                corruptorModifier(unit1SpecialMod.getSelectedItemPosition(), 1);
            }
            if (unitOneX.getUnitName().equals("Ultralisk")) {
                ultraliskModifier(unit1SpecialMod.getSelectedItemPosition(), 1);
            }
        }
        if (unit1Protoss.isChecked()) {
            unitOneX = pUnitArray.get(unitOnePosition);
            if (unitOneX.getUnitName().equals("Adept")) {
                adeptModifier(unit1SpecialMod.getSelectedItemPosition(), 1);
            }
            if (unitOneX.getUnitName().equals("Void Ray")) {
                voidRayModifier(unit1SpecialMod.getSelectedItemPosition(), 1);
            }
        }
        if (unit1Terran.isChecked()) {
            unitOneX = tUnitArray.get(unitOnePosition);
            if (unitOneX.getUnitName().equals("Marine")) {
                marineModifier(unit1SpecialMod.getSelectedItemPosition(), 1);
            }
            if (unitOneX.getUnitName().equals("Marauder")) {
                marauderModifier(unit1SpecialMod.getSelectedItemPosition(), 1);
            }
            if (unitOneX.getUnitName().equals("Hellion") || unitOneX.getUnitName().equals("Hellbat")) {
                hellionHellbatModifier(unit1SpecialMod.getSelectedItemPosition(), 1);
            }
            if (unitOneX.getUnitName().equals("Auto-Turret") || unitOneX.getUnitName().equals("Missile Turret") || unitOneX.getUnitName().equals("Planetary Fortress")) {
                terranBuildingModifier(unit1SpecialMod.getSelectedItemPosition(), 1);
            }
            if (unitOneX.getUnitName().equals("Cyclone")) {
                cycloneModifier(unit1SpecialMod.getSelectedItemPosition(), 1);
            }
        }
        if (unit2Zerg.isChecked()) {
            unitTwoX = zUnitArray.get(unitTwoPosition);
            if (unitTwoX.getUnitName().equals("Zergling")) {
                zerglingModifier(unit2SpecialMod.getSelectedItemPosition(), 2);
            }
            if (unitTwoX.getUnitName().equals("Baneling")) {
                banelingModifier(unit2SpecialMod.getSelectedItemPosition(), 2);
            }
            if (unitTwoX.getUnitName().equals("Corruptor")) {
                corruptorModifier(unit2SpecialMod.getSelectedItemPosition(), 2);
            }
            if (unitTwoX.getUnitName().equals("Ultralisk")) {
                ultraliskModifier(unit2SpecialMod.getSelectedItemPosition(), 2);
            }
        }
        if (unit2Protoss.isChecked()) {
            unitTwoX = pUnitArray.get(unitTwoPosition);
            if (unitTwoX.getUnitName().equals("Adept")) {
                adeptModifier(unit2SpecialMod.getSelectedItemPosition(), 2);
            }
            if (unitTwoX.getUnitName().equals("Void Ray")) {
                voidRayModifier(unit2SpecialMod.getSelectedItemPosition(), 2);
            }
        }
        if (unit2Terran.isChecked()) {
            unitTwoX = tUnitArray.get(unitTwoPosition);
            if (unitTwoX.getUnitName().equals("Marine")) {
                marineModifier(unit2SpecialMod.getSelectedItemPosition(), 2);
            }
            if (unitTwoX.getUnitName().equals("Marauder")) {
                marauderModifier(unit2SpecialMod.getSelectedItemPosition(), 2);
            }
            if (unitTwoX.getUnitName().equals("Hellion") || unitTwoX.getUnitName().equals("Hellbat")) {
                hellionHellbatModifier(unit2SpecialMod.getSelectedItemPosition(), 2);
            }
            if (unitTwoX.getUnitName().equals("Auto-Turret") || unitTwoX.getUnitName().equals("Missile Turret") || unitTwoX.getUnitName().equals("Planetary Fortress")) {
                terranBuildingModifier(unit2SpecialMod.getSelectedItemPosition(), 2);
            }
            if (unitTwoX.getUnitName().equals("Cyclone")) {
                cycloneModifier(unit2SpecialMod.getSelectedItemPosition(), 2);
            }
        }
    }

    public void unitTitleUpdater(Integer unitNum) {
        if (unitNum == 1) {
            int unitOnePosition = unit1Name.getSelectedItemPosition();
            unitItem unitOneX = genUnitArray.get(unitOnePosition);
            if (unit1Zerg.isChecked()) {
                unitOneX = zUnitArray.get(unitOnePosition);
            }
            if (unit1Protoss.isChecked()) {
                unitOneX = pUnitArray.get(unitOnePosition);
            }
            if (unit1Terran.isChecked()) {
                unitOneX = tUnitArray.get(unitOnePosition);
            }
            String unitOneXUnitName = unitOneX.getUnitName();
            String unitOneXArmorUps = unit1ArmorUps.getSelectedItem().toString();
            String unitOneXAttackUps = unit1AttackUps.getSelectedItem().toString();
            String unitOneXShields = unit1ShieldUps.getSelectedItem().toString();
            if (unit1ShieldUps.getSelectedItemPosition() == 0) {
                unitOneXShields = "0";
            }
            if (unit1ArmorUps.getSelectedItemPosition() == 0) {
                unitOneXArmorUps = "0";
            }
            if (unit1AttackUps.getSelectedItemPosition() == 0) {
                unitOneXAttackUps = "0";
            }
            String Unit1String = "(" + unitOneXAttackUps + " - " + unitOneXArmorUps + ") " + unitOneXUnitName;
            if (unit1Protoss.isChecked()) {
                Unit1String = "(" + unitOneXAttackUps + " - " + unitOneXArmorUps + " - " + unitOneXShields + ") " + unitOneXUnitName;
            }
            if (!unit1SpecialMod.getSelectedItem().toString().equals("None") && !unit1SpecialMod.getSelectedItem().toString().equals("Random") && !unit1SpecialMod.getSelectedItem().toString().equals("Modifications")) {
                Unit1String += " with " + unit1SpecialMod.getSelectedItem().toString();
            }
            instructions.setText(Unit1String);
        }
        if (unitNum == 2) {
            int unitTwoPosition = unit2Name.getSelectedItemPosition();
            unitItem unitTwoX = genUnitArray.get(unitTwoPosition);
            if (unit2Zerg.isChecked()) {
                unitTwoX = zUnitArray.get(unitTwoPosition);
            }
            if (unit2Protoss.isChecked()) {
                unitTwoX = pUnitArray.get(unitTwoPosition);
            }
            if (unit2Terran.isChecked()) {
                unitTwoX = tUnitArray.get(unitTwoPosition);
            }
            String unitTwoXUnitName = unitTwoX.getUnitName();
            String unitTwoXArmorUps = unit2ArmorUps.getSelectedItem().toString();
            String unitTwoXAttackUps = unit2AttackUps.getSelectedItem().toString();
            String unitTwoXShields = unit2ShieldUps.getSelectedItem().toString();
            if (unit2ShieldUps.getSelectedItemPosition() == 0) {
                unitTwoXShields = "0";
            }
            if (unit2ArmorUps.getSelectedItemPosition() == 0) {
                unitTwoXArmorUps = "0";
            }
            if (unit2AttackUps.getSelectedItemPosition() == 0) {
                unitTwoXAttackUps = "0";
            }
            String Unit2String = "(" + unitTwoXAttackUps + " - " + unitTwoXArmorUps + ") " + unitTwoXUnitName;
            if (unit2Protoss.isChecked()) {
                Unit2String = "(" + unitTwoXAttackUps + " - " + unitTwoXArmorUps + " - " + unitTwoXShields + ") " + unitTwoXUnitName;
            }
            if (!unit2SpecialMod.getSelectedItem().toString().equals("None") && !unit2SpecialMod.getSelectedItem().toString().equals("Random") && !unit2SpecialMod.getSelectedItem().toString().equals("Modifications")) {
                Unit2String += " with " + unit2SpecialMod.getSelectedItem().toString();
            }
            instructions2.setText(Unit2String);
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.unit_vs_units);
        pixelDensity = getResources().getDisplayMetrics().density;

        vs = findViewById(R.id.Vs);
        if (pixelDensity < 2.1) {
            vs.setTextSize(12);
        }
        clear = findViewById(R.id.clear);
        if (pixelDensity < 2.1) {
            clear.setTextSize(12);
        }
        calculate = findViewById(R.id.calculate);
        if (pixelDensity < 2.1) {
            calculate.setTextSize(14);
        }
        home = findViewById(R.id.home);
        if (pixelDensity < 2.1) {
            home.setTextSize(12);
        }
        results = findViewById(R.id.resultsView);
        if (pixelDensity < 2.1) {
            results.setTextSize(12);
        }
        instructions = findViewById(R.id.instructions);
        if (pixelDensity < 2.1) {
            instructions.setTextSize(11);
        }
        instructions2 = findViewById(R.id.instructions2);
        if (pixelDensity < 2.1) {
            instructions2.setTextSize(11);
        }
        unitOne = findViewById(R.id.unit1Group);
        unitTwo = findViewById(R.id.unit2Group);

        unit1Zerg = findViewById(R.id.Zerg);
        if (pixelDensity < 2.1) {
            unit1Zerg.setTextSize(10);
        }
        unit1Protoss = findViewById(R.id.Protoss);
        if (pixelDensity < 2.1) {
            unit1Protoss.setTextSize(10);
        }
        unit1Terran = findViewById(R.id.Terran);
        if (pixelDensity < 2.1) {
            unit1Terran.setTextSize(10);
        }

        unit2Zerg = findViewById(R.id.zerg);
        if (pixelDensity < 2.1) {
            unit2Zerg.setTextSize(10);
        }
        unit2Protoss = findViewById(R.id.protoss);
        if (pixelDensity < 2.1) {
            unit2Protoss.setTextSize(10);
        }
        unit2Terran = findViewById(R.id.terran);
        if (pixelDensity < 2.1) {
            unit2Terran.setTextSize(10);
        }

        selectionError = 0;

        unit1Name = findViewById(R.id.unit1Name);
        unit1AttackUps = findViewById(R.id.unit1AttackUps);
        unit1ArmorUps = findViewById(R.id.unit1ArmorUps);
        unit1SpecialMod = findViewById(R.id.unit1SpecialMod);
        unit1ShieldUps = findViewById(R.id.unit1ShieldsUps);

        unit2Name = findViewById(R.id.unit2Name);
        unit2AttackUps = findViewById(R.id.unit2AttackUps);
        unit2ArmorUps = findViewById(R.id.unit2ArmorUps);
        //unit2Quantity = findViewById(R.id.unit2Quantity);
        unit2SpecialMod = findViewById(R.id.unit2SpecialMod);
        unit2ShieldUps = findViewById(R.id.unit2ShieldsUps);

        imageIcon1 = findViewById(R.id.iconButton1);
        imageIcon2 = findViewById(R.id.iconButton2);
        //options = findViewById(R.id.options);

        unit1RaceFilter = findViewById(R.id.unit1RaceFilter);
        if (pixelDensity < 2.1) {
            unit1RaceFilter.setTextSize(11);
        }
        unit2RaceFilter = findViewById(R.id.unit2RaceFilter);
        if (pixelDensity < 2.1) {
            unit2RaceFilter.setTextSize(11);
        }


        // Protoss
        final unitItem adept = new unitItem("Adept", "Light, Biological", R.drawable.adeptj);
        final unitItem archon = new unitItem("Archon", "Psionic, Massive", R.drawable.archonj);
        final unitItem carrier = new unitItem("Carrier", "Armored, Mechanical, Massive", R.drawable.carrierj);
        final unitItem colossus = new unitItem("Colossus", "Armored, Mechanical, Massive", R.drawable.colossusj);
        final unitItem darktemplar = new unitItem("Dark Templar", "Light, Biological, Psionic", R.drawable.darktemplarj);
        final unitItem disruptor = new unitItem("Disruptor", "Armored, Mechanical", R.drawable.disruptorj);
        final unitItem hightemplar = new unitItem("High Templar", "Light, Biological, Psionic", R.drawable.hightemplarj);
        final unitItem immortal = new unitItem("Immortal", "Armored, Mechanical", R.drawable.immortalj);
        final unitItem interceptor = new unitItem("Interceptor", "Light, Mechanical", R.drawable.interceptorj);
        final unitItem mothership = new unitItem("Mothership", "Armored, Mechanical, Psionic, Massive", R.drawable.mothershipj);
        final unitItem observer = new unitItem("Observer", "Light, Mechanical", R.drawable.observerj);
        final unitItem oracle = new unitItem("Oracle", "Armored, Mechanical, Psionic", R.drawable.oraclej);
        final unitItem phoenix = new unitItem("Phoenix", "Light, Mechanical", R.drawable.phoenixj);
        final unitItem photoncannon = new unitItem("Photon Cannon", "Armored, Structure", R.drawable.photoncannonj);
        final unitItem probe = new unitItem("Probe", "Light, Mechanical", R.drawable.probej);
        final unitItem sentry = new unitItem("Sentry", "Light, Mechanical, Psionic", R.drawable.sentryj);
        final unitItem stalker = new unitItem("Stalker", "Armored, Mechanical", R.drawable.stalkerj);
        final unitItem tempest = new unitItem("Tempest", "Armored, Mechanical, Massive", R.drawable.tempestj);
        final unitItem voidray = new unitItem("Void Ray", "Armored, Mechanical", R.drawable.voidrayj);
        final unitItem warpprism = new unitItem("Warp Prism", "Armored, Mechanical, Psionic", R.drawable.warpprismj);
        final unitItem zealot = new unitItem("Zealot", "Light, Biological", R.drawable.zealotj);

        // Terran
        final unitItem autoturret = new unitItem("Auto-Turret", "Armored, Mechanical, Structure", R.drawable.autoturretj);
        final unitItem banshee = new unitItem("Banshee", "Light, Mechanical", R.drawable.bansheej);
        final unitItem battlecruiser = new unitItem("Battlecruiser", "Armored, Mechanical, Massive", R.drawable.battlecruiserj);
        final unitItem cyclone = new unitItem("Cyclone", "Armored, Mechanical", R.drawable.cyclonej);
        final unitItem ghost = new unitItem("Ghost", "Biological, Psionic", R.drawable.ghostj);
        final unitItem hellbat = new unitItem("Hellbat", "Light, Biological, Mechanical", R.drawable.hellbatj);
        final unitItem hellion = new unitItem("Hellion", "Light, Mechanical", R.drawable.hellionj);
        final unitItem liberatordefender = new unitItem("Liberator (defender mode)", "Armored, Mechanical", R.drawable.liberatordefenderj);
        final unitItem liberatorfighter = new unitItem("Liberator (fighter mode)", "Armored, Mechanical", R.drawable.liberatorfighterj);
        final unitItem marauder = new unitItem("Marauder", "Armored, Biological", R.drawable.marauderj);
        final unitItem marine = new unitItem("Marine", "Light, Biological", R.drawable.marinej);
        final unitItem medivac = new unitItem("Medivac", "Armored, Mechanical", R.drawable.medivacj);
        final unitItem missileturret = new unitItem("Missile Turret", "Armored, Mechanical, Structure", R.drawable.missileturretj);
        final unitItem mule = new unitItem("MULE", "Light, Mechanical", R.drawable.mulej);
        final unitItem planetaryfortress = new unitItem("Planetary Fortress", "Armored, Mechanical, Structure", R.drawable.planetaryfortressj);
        final unitItem raven = new unitItem("Raven", "Light, Mechanical", R.drawable.ravenj);
        final unitItem reaper = new unitItem("Reaper", "Light, Biological", R.drawable.reaperj);
        final unitItem scv = new unitItem("SCV", "Light, Biological, Mechanical", R.drawable.scvj);
        final unitItem siegetanksieged = new unitItem("Siege Tank (sieged)", "Armored, Mechanical", R.drawable.siegetanksiegedj);
        final unitItem siegetanktank = new unitItem("Siege Tank (tank mode)", "Armored, Mechanical", R.drawable.siegetankj);
        final unitItem thorexplosive = new unitItem("Thor (explosive)", "Armored, Mechanical, Massive", R.drawable.thorexplosivej);
        final unitItem thorimpact = new unitItem("Thor (high impact)", "Armored, Mechanical, Massive", R.drawable.thorimpactj);
        final unitItem vikingassault = new unitItem("Viking (assault mode)", "Armored, Mechanical", R.drawable.vikingassaultj);
        final unitItem vikingfighter = new unitItem("Viking (fighter mode)", "Armored, Mechanical", R.drawable.vikingfighterj);
        final unitItem widowmine = new unitItem("Widow Mine", "Light, Mechanical", R.drawable.widowminej);

        // Zerg
        final unitItem baneling = new unitItem("Baneling", "Biological", R.drawable.banelingj);
        final unitItem broodlord = new unitItem("Brood Lord", "Armored, Biological, Massive", R.drawable.broodlordj);
        final unitItem broodling = new unitItem("Broodling", "Light, Biological", R.drawable.broodlingj);
        final unitItem changeling = new unitItem("Changeling", "Light, Biological", R.drawable.changelingj);
        final unitItem corruptor = new unitItem("Corruptor", "Armored, Biological", R.drawable.corruptorj);
        final unitItem drone = new unitItem("Drone", "Light Biological", R.drawable.dronej);
        final unitItem hydralisk = new unitItem("Hydralisk", "Light, Biological", R.drawable.hydraliskj);
        final unitItem infestedterran = new unitItem("Infested Terran", "Light, Biological", R.drawable.infestedterranj);
        final unitItem infestor = new unitItem("Infestor", "Armored, Biological, Psionic", R.drawable.infestorj);
        final unitItem larva = new unitItem("Larva", "Light, Biological", R.drawable.larvaj);
        final unitItem locust = new unitItem("Locust", "Light, Biological", R.drawable.locustj);
        final unitItem lurker = new unitItem("Lurker", "Armored, Biological", R.drawable.lurkerj);
        final unitItem mutalisk = new unitItem("Mutalisk", "Light, Biological", R.drawable.mutaliskj);
        final unitItem nydusworm = new unitItem("Nydus Worm", "Armored, Biological, Structure", R.drawable.nyduswormj);
        final unitItem overlord = new unitItem("Overlord", "Armored, Biological", R.drawable.overlordj);
        final unitItem overseer = new unitItem("Overseer", "Armored, Biological", R.drawable.overseerj);
        final unitItem queen = new unitItem("Queen", "Biological, Psionic", R.drawable.queenj);
        final unitItem ravager = new unitItem("Ravager", "Biological", R.drawable.ravagerj);
        final unitItem roach = new unitItem("Roach", "Armored, Biological", R.drawable.roachj);
        final unitItem spinecrawler = new unitItem("Spine Crawler", "Armored, Biological, Structure", R.drawable.spinecrawlerj);
        final unitItem sporecrawler = new unitItem("Spore Crawler", "Armored, Biological, Structure", R.drawable.sporecrawlerj);
        final unitItem swarmhost = new unitItem("Swarm Host", "Armored, Biological", R.drawable.swarmhostj);
        final unitItem ultralisk = new unitItem("Ultralisk", "Armored, Biological, Massive", R.drawable.ultraliskj);
        final unitItem viper = new unitItem("Viper", "Armored, Biological, Psionic", R.drawable.viperj);
        final unitItem zergling = new unitItem("Zergling", "Light, Biological", R.drawable.zerglingj);

        //  General
        final unitItem unitname = new unitItem("Unit Name", "Pick a unit, any unit                              ", R.drawable.sc2unit);

        genUnitArray = new ArrayList<unitItem>(Arrays.asList(unitname,adept,archon,autoturret,baneling, banshee, battlecruiser,broodlord,broodling,carrier,changeling,colossus,corruptor, cyclone,
                darktemplar,disruptor,drone,ghost, hellbat, hellion,hightemplar,hydralisk,immortal,infestedterran,infestor,interceptor,larva, liberatordefender,
                liberatorfighter,locust, lurker, marauder, marine, medivac, missileturret, mothership, mule,mutalisk,nydusworm, observer, oracle,overlord,overseer,phoenix,
                photoncannon,planetaryfortress,probe,queen,ravager, raven, reaper,roach, scv,sentry, siegetanksieged, siegetanktank,spinecrawler,sporecrawler,stalker,
                swarmhost,tempest,thorexplosive, thorimpact,ultralisk, vikingassault, vikingfighter,viper,voidray,warpprism, widowmine,zealot,zergling));

//        ArrayList<unitItem> genUnitArray = new ArrayList<unitItem>();
//        genUnitArray.add(unitname);
//        genUnitArray.add(ravager);
//        genUnitArray.add(roach);

        tUnitArray = new ArrayList<unitItem>(Arrays.asList(autoturret, banshee, battlecruiser, cyclone, ghost, hellbat, hellion, liberatordefender, liberatorfighter, marauder,
                marine, medivac, missileturret, mule, planetaryfortress, raven, reaper, scv, siegetanksieged, siegetanktank, thorexplosive, thorimpact,
                vikingassault, vikingfighter, widowmine));

        pUnitArray = new ArrayList<unitItem>(Arrays.asList(adept, archon, carrier, colossus, darktemplar, disruptor, hightemplar, immortal, interceptor, mothership, observer,
                oracle, phoenix, photoncannon, probe, sentry, stalker, tempest, voidray, warpprism, zealot));

        zUnitArray = new ArrayList<unitItem>(Arrays.asList(baneling,broodlord, broodling, changeling, corruptor, drone, hydralisk, infestedterran, infestor, larva, locust, lurker,
                mutalisk, nydusworm, overlord, overseer, queen, ravager, roach, spinecrawler, sporecrawler, swarmhost, ultralisk, viper, zergling));

//        zUnitArray = new ArrayList<unitItem>();
//        zUnitArray.add(baneling);
//        zUnitArray.add(broodlord);
//        zUnitArray.add(broodling);
//        zUnitArray.add(changeling);
//        zUnitArray.add(corruptor);
//        zUnitArray.add(drone);
//        zUnitArray.add(hydralisk);
//        zUnitArray.add(infestedterran);
//        zUnitArray.add(infestor);
//        zUnitArray.add(larva);
//        zUnitArray.add(locust);
//        zUnitArray.add(lurker);
//        zUnitArray.add(mutalisk);
//        zUnitArray.add(nydusworm);
//        zUnitArray.add(overlord);
//        zUnitArray.add(queen);
//        zUnitArray.add(ravager);
//        zUnitArray.add(roach);
//        zUnitArray.add(spinecrawler);
//        zUnitArray.add(sporecrawler);
//        zUnitArray.add(swarmhost);
//        zUnitArray.add(ultralisk);
//        zUnitArray.add(viper);
//        zUnitArray.add(zergling);


        unitUpgrades = new String[]{"0", "1", "2", "3"};

        unitArmorUps = new String[]{"⛨ Armor Upgrades","0","1","2","3"};

        unitAttackUps = new String[]{"⚔ Attack Upgrades","0","1","2","3"};

        unitShieldsUps = new String[]{"Plasma Shield Upgrades","0","1","2","3"};

        unitQuantity = new String[]{"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};

        specialMod = new String[]{"Modifications","Random","Stimpack & Combat Shield","Stimpack","Combat Shield","Infernal Pre-igniter","Building Armor","Centrifugal Hooks","Adrenal Glands","Chitinous Plating","Resonating Glaves", "Lock On", "Lock On & Mag-Field Accelerator", "Prismatic Alignment", "Caustic Spray"};

        adeptArray = new String[]{"Modifications","Resonating Glaves"};

        marineArray = new String[]{"Modifications","Stimpack","Stimpack -10 HP", "Combat Shield", "Stimpack & Combat Shield"};

        marauderArray = new String[]{"Modifications", "Stimpack", "Stimpack -20 HP"};

        hellionHellbatArray = new String[]{"Modifications","Infernal Pre-igniter"};

        terranBuildingArray = new String[]{"Modifications","Building Armor"};

        banelingArray = new String[]{"Modifications","Centrifugal Hooks"};

        zerglingArray = new String[]{"Modifications","Adrenal Glands"};

        ultraliskArray = new String[]{"Modifications","Chitinous Plating"};

        cycloneArray = new String[]{"Modifications","Lock On", "Lock On & Mag-Field Accelerator"};

        voidRayArray = new String[]{"Modifications", "Prismatic Alignment"};

        corruptorArray = new String[]{"Modifications","Caustic Spray"};

        noneArray = new String [] {"None"};

        spinnerList = new Spinner[] {unit1AttackUps, unit1ArmorUps, unit1ShieldUps, unit1SpecialMod};

        result = "";
        unit1 = "";
        unit1AttVsGround = 0;
        unit1AttVsAir = 0;
        unit1AttSpeed = 0.0;
        unit1AttSpeedVsAir = 0.0;
        unit1Arm = 0;
        unit1AttUps = 0;
        unit1ArmUps = 0;
        unit1HP = 0;
        unit1Shields = 0;
        unit1AirBonusVsA = null;
        unit1AirBonusVsP = null;
        unit1AirBonusVsX = null;
        unit1AirBonusVsL = null;
        unit1AirBonusVsB = null;
        unit1AirBonusVsM = null;
        unit1AirBonusVsS = null;
        unit1GBonusVsA = null;
        unit1GBonusVsP = null;
        unit1GBonusVsX = null;
        unit1GBonusVsL = null;
        unit1GBonusVsB = null;
        unit1GBonusVsM = null;
        unit1GBonusVsS = null;
        unit1IsGround = null;
        unit1LifeSpan = null;
        unit1RaceTag = null;
        unit1AttackCount = 0;

        unit2 = "";
        unit2AttVsGround = 0;
        unit2AttVsAir = 0;
        unit2AttSpeed = 0.0;
        unit2AttSpeedVsAir = 0.0;
        unit2Arm = 0;
        unit2AttUps = 0;
        unit2ArmUps = 0;
        unit2Qua = 0;
        unit2HP = 0;
        unit2Shields = 0;
        unit2AirBonusVsA = null;
        unit2AirBonusVsP = null;
        unit2AirBonusVsX = null;
        unit2AirBonusVsL = null;
        unit2AirBonusVsB = null;
        unit2AirBonusVsM = null;
        unit2AirBonusVsS = null;
        unit2GBonusVsA = null;
        unit2GBonusVsP = null;
        unit2GBonusVsX = null;
        unit2GBonusVsL = null;
        unit2GBonusVsB = null;
        unit2GBonusVsM = null;
        unit2GBonusVsS = null;
        unit2IsGround = null;
        unit2LifeSpan = null;
        unit2RaceTag = null;
        unit2AttackCount = 0;

        final unitAdapter adapterUnitName = new unitAdapter(this, genUnitArray);
        //final ArrayAdapter<String> adapterUnitName2 = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, unit2NameArray);

        final unitAdapter adapterTerranUnit = new unitAdapter(this, tUnitArray);
        final unitAdapter adapterProtossUnit = new unitAdapter(this, pUnitArray);
        final unitAdapter adapterZergUnit = new unitAdapter(this, zUnitArray);

        ArrayAdapter<String> adapterUpgrades = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, unitUpgrades);
        ArrayAdapter<String> adapterArmorUpgrades = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, unitArmorUps);
        ArrayAdapter<String> adapterAttackUpgrades = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, unitAttackUps);
        ArrayAdapter<String> adapterShieldsUpgrades = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, unitShieldsUps);
        //ArrayAdapter<String> adapterQuantity = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, unitQuantity);
        final ArrayAdapter<String> adapterSpecialMod = new ArrayAdapter<>(this,android.R.layout.simple_spinner_dropdown_item, specialMod);

        final ArrayAdapter<String> adapterAdept = new ArrayAdapter<>(this,android.R.layout.simple_spinner_dropdown_item,adeptArray);
        final ArrayAdapter<String> adapterMarine = new ArrayAdapter<>(this,android.R.layout.simple_spinner_dropdown_item,marineArray);
        final ArrayAdapter<String> adapterMarauder = new ArrayAdapter<>(this,android.R.layout.simple_spinner_dropdown_item,marauderArray);
        final ArrayAdapter<String> adapterUltralisk = new ArrayAdapter<>(this,android.R.layout.simple_spinner_dropdown_item,ultraliskArray);
        final ArrayAdapter<String> adapterBaneling = new ArrayAdapter<>(this,android.R.layout.simple_spinner_dropdown_item,banelingArray);
        final ArrayAdapter<String> adapterZergling = new ArrayAdapter<>(this,android.R.layout.simple_spinner_dropdown_item,zerglingArray);
        final ArrayAdapter<String> adapterTerranBuilding = new ArrayAdapter<>(this,android.R.layout.simple_spinner_dropdown_item,terranBuildingArray);
        final ArrayAdapter<String> adapterHellionHellbat = new ArrayAdapter<>(this,android.R.layout.simple_spinner_dropdown_item,hellionHellbatArray);
        final ArrayAdapter<String> adapterCyclone = new ArrayAdapter<>(this,android.R.layout.simple_spinner_dropdown_item,cycloneArray);
        final ArrayAdapter<String> adapterVoidRay = new ArrayAdapter<>(this,android.R.layout.simple_spinner_dropdown_item,voidRayArray);
        final ArrayAdapter<String> adapterCorruptor = new ArrayAdapter<>(this,android.R.layout.simple_spinner_dropdown_item,corruptorArray);

        final ArrayAdapter<String> adapterNone = new ArrayAdapter<>(this,android.R.layout.simple_spinner_dropdown_item,noneArray);

        final ArrayAdapter<Spinner> spinnerAdapt = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, spinnerList);

        unit1Name.setAdapter(adapterUnitName);
        unit1Name.setSelection(0);
        final View root = unit1Name.getRootView();
        //options.setAdapter(spinnerAdapt);

        unit2Name.setAdapter(adapterUnitName);
        unit2Name.setSelection(0);

        unit1ShieldUps.setAdapter(adapterShieldsUpgrades);
        unit2ShieldUps.setAdapter(adapterShieldsUpgrades);

        final GradientDrawable gd = new GradientDrawable();
        gd.setCornerRadius(8);
        gd.setStroke(2, Color.parseColor("#000000"));

        final GradientDrawable gd2 = new GradientDrawable();
        gd2.setCornerRadius(8);
        gd2.setStroke(2, Color.parseColor("#000000"));

        DisplayMetrics displayMetrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        final int screenHeight = displayMetrics.heightPixels;

        Bitmap tIcon = BitmapFactory.decodeResource(getResources(),R.drawable.vector_terran_logo);
        int th = (int)(screenHeight * 0.052);
        int tw = (int)(th * 1.01972);
        final Bitmap Tscaled = Bitmap.createScaledBitmap(tIcon,tw,th, true);
        final BitmapDrawable tIconDraw = new BitmapDrawable(getResources(), Tscaled);

        Bitmap zIcon = BitmapFactory.decodeResource(getResources(),R.drawable.vector_zerg_logo);
        int zh = (int)(screenHeight * 0.052);
        int zw = (int)(zh / 1.11158);
        final Bitmap Zscaled = Bitmap.createScaledBitmap(zIcon,zw,zh, true);
        final BitmapDrawable zIconDraw = new BitmapDrawable(getResources(), Zscaled);

        Bitmap pIcon = BitmapFactory.decodeResource(getResources(),R.drawable.vector_protoss_logo);
        int ph = (int)(screenHeight * 0.052);
        int pw = (int)(ph / 1.98476);
        final Bitmap Pscaled = Bitmap.createScaledBitmap(pIcon,pw,ph, true);
        final BitmapDrawable pIconDraw = new BitmapDrawable(getResources(), Pscaled);

//        Bitmap baneling6 = BitmapFactory.decodeResource(getResources(),R.drawable.banelingj);
//        int baneh = (int)(screenHeight * 0.055);
//        int banew = (int)(ph / 1.98476);
//        final Bitmap banelingScaled = Bitmap.createScaledBitmap(baneling6,banew,baneh, true);
//        final BitmapDrawable banelingDraw = new BitmapDrawable(getResources(), banelingScaled);


        unitOne = findViewById(R.id.unit1Group);
        unitOne.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (unit1Terran.isChecked()) {
                    unit1Name.setAdapter(adapterTerranUnit);
                    gd.setColor(Color.parseColor("#fa8072"));
                    instructions.setBackground(gd);
                    instructions.setCompoundDrawablesWithIntrinsicBounds(tIconDraw,null,null,null);
                }
                if (unit1Zerg.isChecked()) {
                    unit1Name.setAdapter(adapterZergUnit);
                    gd.setColor(Color.parseColor("#90ee90"));
                    instructions.setBackground(gd);
                    instructions.setCompoundDrawablesWithIntrinsicBounds(zIconDraw,null,null,null);
                }
                if (unit1Protoss.isChecked()) {
                    unit1Name.setAdapter(adapterProtossUnit);
                    gd.setColor(Color.parseColor("#a9d6e5"));
                    instructions.setBackground(gd);
                    instructions.setCompoundDrawablesWithIntrinsicBounds(pIconDraw,null,null,null);
                }
            }
        });

        unitTwo = findViewById(R.id.unit2Group);
        unitTwo.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (unit2Terran.isChecked()) {
                    unit2Name.setAdapter(adapterTerranUnit);
                    gd2.setColor(Color.parseColor("#fa8072"));
                    instructions2.setBackground(gd2);
                    instructions2.setCompoundDrawablesWithIntrinsicBounds(tIconDraw,null,null,null);
                }
                if (unit2Zerg.isChecked()) {
                    unit2Name.setAdapter(adapterZergUnit);
                    gd2.setColor(Color.parseColor("#90ee90"));
                    instructions2.setBackground(gd2);
                    instructions2.setCompoundDrawablesWithIntrinsicBounds(zIconDraw,null,null,null);
                }
                if (unit2Protoss.isChecked()) {
                    unit2Name.setAdapter(adapterProtossUnit);
                    gd2.setColor(Color.parseColor("#a9d6e5"));
                    instructions2.setBackground(gd2);
                    instructions2.setCompoundDrawablesWithIntrinsicBounds(pIconDraw,null,null,null);
                }
            }
        });

        unit1SpecialMod.setAdapter(adapterSpecialMod);
        unit2SpecialMod.setAdapter(adapterSpecialMod);

        final Integer modPosition1 = 0;
        unit1Name.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if (!unit1Terran.isChecked() && !unit1Zerg.isChecked() && !unit1Protoss.isChecked()) {
                    if (position != 0) {
                        unitTitleUpdater(1);
                    }
                    if (position == 1) {
                        unit1SpecialMod.setSelection(10);
                    }
                    if (position == 32) {
                        unit1SpecialMod.setSelection(2);
                    }
                    if (position == 31) {
                        unit1SpecialMod.setSelection(3);
                    }
                    if (position == 18 || position == 19) {
                        unit1SpecialMod.setSelection(5);
                    }
                    if (position == 3 || position == 34 || position == 45) {
                        unit1SpecialMod.setSelection(6);
                    }
                    if (position == 4) {
                        unit1SpecialMod.setSelection(7);
                    }
                    if (position == 71) {
                        unit1SpecialMod.setSelection(8);
                    }
                    if (position == 63) {
                        unit1SpecialMod.setSelection(9);
                    }
                    if (position == 13) {
                        unit1SpecialMod.setSelection(11);
                    }
                    if (position == 67) {
                        unit1SpecialMod.setSelection(13);
                    }
                    else if (position != 1 && position != 3 && position != 4 && position != 13 && position != 18 && position != 19 && position != 31 && position != 32 && position != 34 && position != 45 && position != 63 && position != 67 && position != 71) {
                        unit1SpecialMod.setSelection(0);
                    }
                }
                if (unit1Name.getAdapter() == adapterTerranUnit) {
                    unitTitleUpdater(1);
                    instructions.setTextColor(0xff000000);
                    if (position == 10) {
                        unit1SpecialMod.setAdapter(adapterMarine);
                        unit1SpecialMod.setSelection(0);
                    }
                    if (position == 9) {
                        unit1SpecialMod.setAdapter(adapterMarauder);
                        unit1SpecialMod.setSelection(0);
                    }
                    if (position == 5 || position == 6) {
                        unit1SpecialMod.setAdapter(adapterHellionHellbat);
                        unit1SpecialMod.setSelection(0);
                    }
                    if (position == 0 || position == 12 || position ==14) {
                        unit1SpecialMod.setAdapter(adapterTerranBuilding);
                        unit1SpecialMod.setSelection(0);
                    }
                    if (position == 3) {
                        unit1SpecialMod.setAdapter(adapterCyclone);
                        unit1SpecialMod.setSelection(0);
                    }
                    else if (position != 0 && position != 3 && position != 5 && position != 6 && position != 9 && position !=10 && position != 12 && position !=14){
                        unit1SpecialMod.setAdapter(adapterNone);
                        unit1SpecialMod.setSelection(0);
                    }
                }
                if (unit1Name.getAdapter() == adapterZergUnit) {
                    unitTitleUpdater(1);
                    instructions.setTextColor(0xff000000);
                    if (position == 0) {
                        unit1SpecialMod.setAdapter(adapterBaneling);
                        unit1SpecialMod.setSelection(0);
                        //unit1Name.setPopupBackgroundDrawable(banelingDraw);
                    }
                    if (position == 24) {
                        unit1SpecialMod.setAdapter(adapterZergling);
                        unit1SpecialMod.setSelection(0);
                    }
                    if (position == 22) {
                        unit1SpecialMod.setAdapter(adapterUltralisk);
                        unit1SpecialMod.setSelection(0);
                    }
                    if (position == 4) {
                        unit1SpecialMod.setAdapter(adapterCorruptor);
                        unit1SpecialMod.setSelection(0);
                    }
                    else if (position != 0 && position != 4 && position != 24 && position != 22) {
                        unit1SpecialMod.setAdapter(adapterNone);
                        unit1SpecialMod.setSelection(0);
                    }
                }
                if (unit1Name.getAdapter() == adapterProtossUnit) {
                    unitTitleUpdater(1);
                    instructions.setTextColor(0xff000000);
                    if (position == 0) {
                        unit1SpecialMod.setAdapter(adapterAdept);
                        unit1SpecialMod.setSelection(0);
                    }
                    if (position == 18) {
                        unit1SpecialMod.setAdapter(adapterVoidRay);
                        unit1SpecialMod.setSelection(0);
                    }
                    else if (position !=0 && position != 18) {
                        unit1SpecialMod.setAdapter(adapterNone);
                        unit1SpecialMod.setSelection(0);
                    }
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                    unit1SpecialMod.setSelection(0);
            }
        });

        unit2Name.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position2, long id) {
                if (!unit2Terran.isChecked() && !unit2Zerg.isChecked() && !unit2Protoss.isChecked()) {
                    if (position2 != 0) {
                        unitTitleUpdater(2);
                    }
                    if (position2 == 1) {
                        unit2SpecialMod.setSelection(10);
                    }
                    if (position2 == 32) {
                        unit2SpecialMod.setSelection(2);
                    }
                    if (position2 == 31) {
                        unit2SpecialMod.setSelection(3);
                    }
                    if (position2 == 18 || position2 == 19) {
                        unit2SpecialMod.setSelection(5);
                    }
                    if (position2 == 3 || position2 == 34 || position2 == 45) {
                        unit2SpecialMod.setSelection(6);
                    }
                    if (position2 == 4) {
                        unit2SpecialMod.setSelection(7);
                    }
                    if (position2 == 71) {
                        unit2SpecialMod.setSelection(8);
                    }
                    if (position2 == 63) {
                        unit2SpecialMod.setSelection(9);
                    }
                    if (position2 == 13) {
                        unit2SpecialMod.setSelection(11);
                    }
                    if (position2 == 67) {
                        unit2SpecialMod.setSelection(13);
                    }
                    else if (position2 != 1 && position2 != 3 && position2 != 4 && position2 != 13 && position2 != 18 && position2 != 19 && position2 != 31 && position2 != 32 && position2 != 34 && position2 != 45 && position2 != 63 && position2 != 67 && position2 != 71) {
                        unit2SpecialMod.setSelection(0);
                    }
                }
                if (unit2Name.getAdapter() == adapterTerranUnit) {
                    unitTitleUpdater(2);
                    instructions2.setTextColor(0xff000000);
                    if (position2 == 10) {
                        unit2SpecialMod.setAdapter(adapterMarine);
                        unit2SpecialMod.setSelection(0);
                    }
                    if (position2 == 9) {
                        unit2SpecialMod.setAdapter(adapterMarauder);
                        unit2SpecialMod.setSelection(0);
                    }
                    if (position2 == 5 || position2 == 6) {
                        unit2SpecialMod.setAdapter(adapterHellionHellbat);
                        unit2SpecialMod.setSelection(0);
                    }
                    if (position2 == 0 || position2 == 12 || position2 == 14) {
                        unit2SpecialMod.setAdapter(adapterTerranBuilding);
                        unit2SpecialMod.setSelection(0);
                    }
                    if (position2 == 3) {
                        unit2SpecialMod.setAdapter(adapterCyclone);
                        unit2SpecialMod.setSelection(0);
                    }
                    else if (position2 != 0 && position2 != 3 && position2 != 5 && position2 != 6 && position2 != 9 && position2 != 10 && position2 != 12 && position2 != 14) {
                        unit2SpecialMod.setAdapter(adapterNone);
                        unit2SpecialMod.setSelection(0);
                    }
                }
                if (unit2Name.getAdapter() == adapterZergUnit) {
                    unitTitleUpdater(2);
                    instructions2.setTextColor(0xff000000);
                    if (position2 == 0) {
                        unit2SpecialMod.setAdapter(adapterBaneling);
                        unit2SpecialMod.setSelection(0);
                    }
                    if (position2 == 24) {
                        unit2SpecialMod.setAdapter(adapterZergling);
                        unit2SpecialMod.setSelection(0);
                    }
                    if (position2 == 22) {
                        unit2SpecialMod.setAdapter(adapterUltralisk);
                        unit2SpecialMod.setSelection(0);
                    }
                    if (position2 == 4) {
                        unit2SpecialMod.setAdapter(adapterCorruptor);
                        unit2SpecialMod.setSelection(0);
                    }
                    else if (position2 != 0 && position2 != 4 && position2 != 24 && position2 != 22) {
                        unit2SpecialMod.setAdapter(adapterNone);
                        unit2SpecialMod.setSelection(0);
                    }
                }
                if (unit2Name.getAdapter() == adapterProtossUnit) {
                    unitTitleUpdater(2);
                    instructions2.setTextColor(0xff000000);
                    if (position2 == 0) {
                        unit2SpecialMod.setAdapter(adapterAdept);
                        unit2SpecialMod.setSelection(0);
                    }
                    if (position2 == 18) {
                        unit2SpecialMod.setAdapter(adapterVoidRay);
                        unit2SpecialMod.setSelection(0);
                    }
                    else if (position2 != 0 && position2 != 18) {
                        unit2SpecialMod.setAdapter(adapterNone);
                        unit2SpecialMod.setSelection(0);
                    }
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                unit2SpecialMod.setSelection(0);
            }
        });

        unit1ArmorUps.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if (!unit1Name.getSelectedItem().toString().equals("Unit Name")) {
                    unitTitleUpdater(1);
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        unit1AttackUps.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if (!unit1Name.getSelectedItem().toString().equals("Unit Name")) {
                    unitTitleUpdater(1);
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        unit1SpecialMod.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if (!unit1Name.getSelectedItem().toString().equals("Unit Name")) {
                    unitTitleUpdater(1);
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        unit2ArmorUps.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if (!unit2Name.getSelectedItem().toString().equals("Unit Name")) {
                    unitTitleUpdater(2);
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        unit2AttackUps.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if (!unit2Name.getSelectedItem().toString().equals("Unit Name")) {
                    unitTitleUpdater(2);
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        unit2SpecialMod.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if (!unit2Name.getSelectedItem().toString().equals("Unit Name")) {
                    unitTitleUpdater(2);
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        unit1ShieldUps.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                unitTitleUpdater(1);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        unit2ShieldUps.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                unitTitleUpdater(2);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                unitOne.clearCheck();
                unitTwo.clearCheck();
                unit1Name.setAdapter(adapterUnitName);
                unit2Name.setAdapter(adapterUnitName);
                unit1AttackUps.setSelection(0);
                unit1ArmorUps.setSelection(0);
                unit2AttackUps.setSelection(0);
                unit2ArmorUps.setSelection(0);
                //unit2Quantity.setSelection(0);
                results.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.textview_basic_border));
                results.setText("-------------------- R E S U L T S --------------------");
                instructions.setBackgroundResource(R.drawable.text_view_corners);
                instructions2.setBackgroundResource(R.drawable.text_view_corners);
                instructions.setTextColor(0xffffffff);
                instructions2.setTextColor(0xffffffff);
                instructions.setText("Unit 1");
                instructions.setCompoundDrawablesWithIntrinsicBounds(null,null,null,null);
                instructions2.setText("Unit 2");
                instructions2.setCompoundDrawablesWithIntrinsicBounds(null,null,null,null);
                unit1SpecialMod.setAdapter(adapterSpecialMod);
                unit2SpecialMod.setAdapter(adapterSpecialMod);
                unit1SpecialMod.setSelection(0);
                unit2SpecialMod.setSelection(0);
                unit1ShieldUps.setSelection(0);
                unit2ShieldUps.setSelection(0);
                //results.setBackgroundColor(0xffd4ebf7);
            }
        });

        unit1AttackUps.setAdapter(adapterAttackUpgrades);
        unit1AttackUps.setSelection(0);

        unit1ArmorUps.setAdapter(adapterArmorUpgrades);
        unit1ArmorUps.setSelection(0);

        unit2AttackUps.setAdapter(adapterAttackUpgrades);
        unit2AttackUps.setSelection(0);

        unit2ArmorUps.setAdapter(adapterArmorUpgrades);
        unit2ArmorUps.setSelection(0);

        //unit2Quantity.setAdapter(adapterQuantity);
        //unit2Quantity.setSelection(0);

        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
                startActivity(new Intent(getBaseContext(), MainActivity.class));
                overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
            }
        });

        imageIcon1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageZoomer(1);
            }
        });

        imageIcon2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageZoomer(2);
            }
        });
        calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                results.scrollTo(0,0);
                result = "";
                unit1 = "";
                unit1AttVsGround = 0;
                unit1AttVsAir = 0;
                unit1AttSpeed = 0.0;
                unit1AttSpeedVsAir = 0.0;
                unit1Arm = 0;
                unit1AttUps = 0;
                unit1ArmUps = 0;
                unit1HP = 0;
                unit1Shields = 0;
                unit1AttackCount = 0;
                unit1AirBonusVsA = null;
                unit1AirBonusVsP = null;
                unit1AirBonusVsX = null;
                unit1AirBonusVsL = null;
                unit1AirBonusVsB = null;
                unit1AirBonusVsM = null;
                unit1AirBonusVsS = null;
                unit1GBonusVsA = null;
                unit1GBonusVsP = null;
                unit1GBonusVsX = null;
                unit1GBonusVsL = null;
                unit1GBonusVsB = null;
                unit1GBonusVsM = null;
                unit1GBonusVsS = null;
                unit1IsGround = null;
                unit1TotalHP = 0;
                unit1LifeSpan = null;
                unit1RaceTag = null;

                unit2 = "";
                unit2AttVsGround = 0;
                unit2AttVsAir = 0;
                unit2AttSpeed = 0.0;
                unit2AttSpeedVsAir = 0.0;
                unit2Arm = 0;
                unit2AttUps = 0;
                unit2ArmUps = 0;
                unit2Qua = 0;
                unit2HP = 0;
                unit2Shields = 0;
                unit2AttackCount = 0;
                unit2AirBonusVsA = null;
                unit2AirBonusVsP = null;
                unit2AirBonusVsX = null;
                unit2AirBonusVsL = null;
                unit2AirBonusVsB = null;
                unit2AirBonusVsM = null;
                unit2AirBonusVsS = null;
                unit2GBonusVsA = null;
                unit2GBonusVsP = null;
                unit2GBonusVsX = null;
                unit2GBonusVsL = null;
                unit2GBonusVsB = null;
                unit2GBonusVsM = null;
                unit2GBonusVsS = null;
                unit2IsGround = null;
                unit2TotalHP = 0;
                unit2LifeSpan = null;
                unit2RaceTag = null;
                infoSetter();
                int nameIndex = unit1Name.getSelectedItemPosition();
                int nameIndex2 = unit2Name.getSelectedItemPosition();
                if ((nameIndex == 0 && unit1Name.getAdapter() == adapterUnitName)|| (nameIndex2 == 0 && unit2Name.getAdapter()== adapterUnitName)) {
                    selectionError = 1;
                }
                else {
                    selectionError = 0;
                }
                if (selectionError == 0) {
                    theModifiers();
                    resultMaker();
                    results.setText(result);
                    results.setMovementMethod(new ScrollingMovementMethod());
                }
                else if (selectionError == 1 ) {
                    Toast toast= Toast.makeText(getApplicationContext(), "Must choose both units before colliding!", Toast.LENGTH_SHORT);
                    toast.setGravity(Gravity.BOTTOM|Gravity.CENTER_HORIZONTAL, 0, 210);
                    toast.show();
                }
            }
        });

        BottomNavigationView navigation = findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
        navigation.getMenu().getItem(0).setChecked(true);
    }

    public void imageZoomer(Integer unitNum) {
        unitItem newUnit = genUnitArray.get(unit1Name.getSelectedItemPosition());
        if (unitNum == 1) {
            if (unit1Zerg.isChecked()) {
                newUnit = zUnitArray.get(unit1Name.getSelectedItemPosition());
            }
            if (unit1Terran.isChecked()) {
                newUnit = tUnitArray.get(unit1Name.getSelectedItemPosition());
            }
            if (unit1Protoss.isChecked()) {
                newUnit = pUnitArray.get(unit1Name.getSelectedItemPosition());
            }
        }
        if (unitNum == 2) {
            newUnit = genUnitArray.get(unit2Name.getSelectedItemPosition());
            if (unit2Zerg.isChecked()) {
                newUnit = zUnitArray.get(unit2Name.getSelectedItemPosition());
            }
            if (unit2Terran.isChecked()) {
                newUnit = tUnitArray.get(unit2Name.getSelectedItemPosition());
            }
            if (unit2Protoss.isChecked()) {
                newUnit = pUnitArray.get(unit2Name.getSelectedItemPosition());
            }
        }

        Intent intent = new Intent(this, popUpImage.class);
        intent.putExtra("picture", newUnit.getUnitImage());
        startActivity(intent);
    }
}
