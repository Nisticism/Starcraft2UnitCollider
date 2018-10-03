package com.Icantbelievedefaultisexample.nistic.starcraft2unitcollider;

import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.support.design.widget.BottomNavigationView;
import android.view.Gravity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;

public class UnitVUnit extends MainActivity{

    Button calculate;
    Button clear;
    TextView results;
    TextView instructions;
    TextView instructions2;
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

    Spinner unit2Name;
    Spinner unit2AttackUps;
    Spinner unit2ArmorUps;
    Spinner unit2Quantity;

    String[] unitNameArray;

    String[] unit2NameArray;

    String[] terranUnitArrray;

    String[] protossUnitArrray;

    String[] zergUnitArrray;

    String[] unitUpgrades;

    String[] unitQuantity;

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

    private Boolean toggle = false;

    public void terranSetter(Integer unitNum) {
        if (unitNum == 1) {
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
            }
            if (unit1.equals("Battlecruiser")) {
                unit1AttVsGround = 8 + unit1AttUps;
                unit1AttVsAir = 6 + unit1AttUps;
                unit1AttSpeed = 0.16;
                unit1AttSpeedVsAir = 0.16;
                unit1Arm = 3 + unit1ArmUps;
                unit1HP = 550;
                unit1Attributes = "AMX";
                unit1IsGround = false;
                unit1AttackCount = 1;
            }
            if (unit1.equals("Cyclone")) {
                unit1AttVsGround = 3 + unit1AttUps;
                unit1AttVsAir = 8 + unit1AttUps;
                unit1AttSpeed = 0.1;
                unit1AttSpeedVsAir = 0.7;
                unit1Arm = 1 + unit1ArmUps;
                unit1HP = 180;
                unit1Attributes = "AM";
                unit1IsGround = true;
                unit1GBonusVsA = 2 + unit1AttUps;
                unit1AttackCount = 1;
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
            }
            if (unit1.equals("Hellbat")) {
                unit1AttVsGround = 18 + 2 * unit1AttUps;
                unit1AttVsAir = 0;
                unit1AttSpeed = 1.43;
                unit1Arm = 1 + 2 * unit1ArmUps;
                unit1HP = 150;
                unit1Attributes = "LBM";
                unit1IsGround = true;
                unit1GBonusVsL = unit1AttUps;
                unit1AttackCount = 1;
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
            }
            if (unit1.equals("Medivac")) {
                unit1AttVsGround = 0;
                unit1AttVsAir = 0;
                unit1AttSpeed = 0.0;
                unit1Arm = 1 + unit1ArmUps;
                unit1HP = 150;
                unit1Attributes = "AM";
                unit1IsGround = false;
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
            }
            if (unit1.equals("Raven")) {
                unit1AttVsGround = 0;
                unit1AttVsAir = 0;
                unit1AttSpeed = 0.0;
                unit1Arm = 1 + unit1ArmUps;
                unit1HP = 140;
                unit1Attributes = "LM";
                unit1IsGround = false;
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
            }
            if (unit1.equals("Thor (high impact)")) {
                unit1AttVsGround = (30 + 3*unit1AttUps)*2;
                unit1AttVsAir = 35+3*unit1AttUps;
                unit1AttSpeed = 0.91;
                unit1AttSpeedVsAir = 2.14;
                unit1Arm = 1 + unit1ArmUps;
                unit1HP = 400;
                unit1Attributes = "AMX";
                unit1IsGround = true;
                unit1AirBonusVsA = 15 + 2 * unit1AttUps;
                unit1AttackCount = 2;
            }
            if (unit1.equals("Viking (assault mode)")) {
                unit1AttVsGround = 12 + unit1AttUps;
                unit1AttVsAir = 0;
                unit1AttSpeed = 0.71;
                unit1Arm = unit1ArmUps;
                unit1HP = 125;
                unit1Attributes = "AM";
                unit1IsGround = true;
                unit1GBonusVsM = 8;
                unit1AttackCount = 1;
            }
            if (unit1.equals("Viking (fighter mode)")) {
                unit1AttVsGround = 0;
                unit1AttVsAir = (10 + unit1AttUps)*2;
                unit1AttSpeed = 0.0;
                unit1AttSpeedVsAir = 1.43;
                unit1Arm = unit1ArmUps;
                unit1HP = 125;
                unit1Attributes = "AM";
                unit1IsGround = false;
                unit1AirBonusVsA = 4;
                unit1AttackCount = 2;
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
            }
        }
        else if (unitNum == 2) {
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
            }
            if (unit2.equals("Battlecruiser")) {
                unit2AttVsGround = 8 + unit2AttUps;
                unit2AttVsAir = 6 + unit2AttUps;
                unit2AttSpeed = 0.16;
                unit2AttSpeedVsAir = 0.16;
                unit2Arm = 3 + unit2ArmUps;
                unit2HP = 550;
                unit2Attributes = "AMX";
                unit2IsGround = false;
                unit2AttackCount = 1;
            }
            if (unit2.equals("Cyclone")) {
                unit2AttVsGround = 3 + unit2AttUps;
                unit2AttVsAir = 8 + unit2AttUps;
                unit2AttSpeed = 0.1;
                unit2AttSpeedVsAir = 0.7;
                unit2Arm = 1 + unit2ArmUps;
                unit2HP = 180;
                unit2Attributes = "AM";
                unit2IsGround = true;
                unit2GBonusVsA = 2 + unit2AttUps;
                unit2AttackCount = 1;
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
                unit2AttackCount = 1;
            }
            if (unit2.equals("Hellbat")) {
                unit2AttVsGround = 18 + 2 * unit2AttUps;
                unit2AttVsAir = 0;
                unit2AttSpeed = 1.43;
                unit2Arm = 1 + 2 * unit2ArmUps;
                unit2HP = 150;
                unit2Attributes = "LBM";
                unit2IsGround = true;
                unit2GBonusVsL = unit2AttUps;
                unit2AttackCount = 1;
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
            }
            if (unit2.equals("Medivac")) {
                unit2AttVsGround = 0;
                unit2AttVsAir = 0;
                unit2AttSpeed = 0.0;
                unit2Arm = 1 + unit2ArmUps;
                unit2HP = 150;
                unit2Attributes = "AM";
                unit2IsGround = false;
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
            }
            if (unit2.equals("Raven")) {
                unit2AttVsGround = 0;
                unit2AttVsAir = 0;
                unit2AttSpeed = 0.0;
                unit2Arm = 1 + unit2ArmUps;
                unit2HP = 140;
                unit2Attributes = "LM";
                unit2IsGround = false;
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
                unit2AttackCount = 4;
            }
            if (unit2.equals("Thor (high impact)")) {
                unit2AttVsGround = (30 + 3*unit2AttUps)*2;
                unit2AttVsAir = 35+3*unit2AttUps;
                unit2AttSpeed = 0.91;
                unit2AttSpeedVsAir = 2.14;
                unit2Arm = 1 + unit2ArmUps;
                unit2HP = 400;
                unit2Attributes = "AMX";
                unit2IsGround = true;
                unit2AirBonusVsA = 15 + 2 * unit2AttUps;
                unit2AttackCount = 1;
            }
            if (unit2.equals("Viking (assault mode)")) {
                unit2AttVsGround = 12 + unit2AttUps;
                unit2AttVsAir = 0;
                unit2AttSpeed = 0.71;
                unit2Arm = unit2ArmUps;
                unit2HP = 125;
                unit2Attributes = "AM";
                unit2IsGround = true;
                unit2GBonusVsM = 8;
                unit2AttackCount = 1;
            }
            if (unit2.equals("Viking (fighter mode)")) {
                unit2AttVsGround = 0;
                unit2AttVsAir = (10 + unit2AttUps)*2;
                unit2AttSpeed = 0.0;
                unit2AttSpeedVsAir = 1.43;
                unit2Arm = unit2ArmUps;
                unit2HP = 125;
                unit2Attributes = "AM";
                unit2IsGround = false;
                unit2AirBonusVsA = 4;
                unit2AttackCount = 2;
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
            }
        }
    }

    public void protossSetter(Integer unitNum) {
        if (unitNum == 1) {
            if (unit1.equals("Adept")) {
                unit1AttVsGround = 10 + unit2AttUps;
                unit1AttVsAir = 0;
                unit1AttSpeed = 1.61;
                //unit1AttSpeed2 = 1.11;
                unit1Arm = 1 + unit2ArmUps;
                unit1HP = 70;
                unit1Shields = 70;
                unit1Attributes = "LB";
                unit1IsGround = true;
                unit1GBonusVsL = 12;
                unit1AttackCount = 1;
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
            }
            if (unit1.equals("Carrier")) {
                unit1AttVsGround = (5 + unit1AttUps) * 2;
                unit1AttVsAir = (5 + unit1AttUps) * 2;
                unit1AttSpeed = 0.2675;
                unit1AttSpeedVsAir = 0.2675;
                unit1Arm = 2 + unit1ArmUps;
                unit1HP = 250;
                unit1Shields = 150;
                unit1Attributes = "AMX";
                unit1IsGround = false;
                unit1AttackCount = 2;
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
            }
            if (unit1.equals("Oracle")) {
                unit1AttVsGround = 15;
                unit1AttVsAir = 0;
                unit1AttSpeed = 0.61;
                unit1Arm = unit1ArmUps;
                unit1HP = 100;
                unit1Shields = 60;
                unit1Attributes = "LMP";
                unit1IsGround = false;
                unit1GBonusVsL = 7;
                unit1AttackCount = 1;
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
            }
            if (unit1.equals("Tempest")) {
                unit1AttVsGround = 40+4*unit1AttUps;
                unit1AttVsAir = 30+3*unit1AttUps;
                unit1AttSpeed = 2.36;
                unit1AttSpeedVsAir = 2.36;
                unit1Arm = 2 + unit1ArmUps;
                unit1HP = 300;
                unit1Shields = 150;
                unit1Attributes = "AMX";
                unit1IsGround = false;
                unit1AirBonusVsX = 22 + 2 * unit1AttUps;
                unit1AttackCount = 1;
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
            }
            if (unit2.equals("Carrier")) {
                unit2AttVsGround = (5 + unit2AttUps) * 2;
                unit2AttVsAir = (5 + unit2AttUps) * 2;
                unit2AttSpeed = 0.2675;
                unit2AttSpeedVsAir = 0.2675;
                unit2Arm = 2 + unit1ArmUps;
                unit2HP = 250;
                unit2Shields = 150;
                unit2Attributes = "AMX";
                unit2IsGround = false;
                unit2AttackCount = 2;
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
            }
            if (unit2.equals("Immortal")) {
                unit2AttVsGround = 20 + 2*unit2AttUps;
                unit2AttVsAir = 0;
                unit2AttSpeed = 1.04;
                unit2Arm = 1 + unit1ArmUps;
                unit2HP = 200;
                unit2Shields = 100;
                unit2Attributes = "AM";
                unit2IsGround = true;
                unit2GBonusVsA = 30 + 3 * unit2AttUps;
                unit2AttackCount = 1;
            }
            if (unit2.equals("Interceptor")) {
                unit2AttVsGround = (5+unit2AttUps) * 2;
                unit2AttVsAir = (5+unit2AttUps)*2;
                unit2AttSpeed = 2.14;
                unit2AttSpeedVsAir = 2.14;
                unit2Arm = unit1ArmUps;
                unit2HP = 40;
                unit2Shields = 40;
                unit2Attributes = "LM";
                unit2IsGround = false;
                unit2AttackCount = 2;
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
            }
            if (unit2.equals("Oracle")) {
                unit2AttVsGround = 15;
                unit2AttVsAir = 0;
                unit2AttSpeed = 0.61;
                unit2Arm = unit2ArmUps;
                unit2HP = 100;
                unit2Shields = 60;
                unit2Attributes = "LMP";
                unit2IsGround = false;
                unit2GBonusVsL = 7;
                unit2AttackCount = 1;
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
                unit1AirBonusVsL = 5;
                unit2AttackCount = 2;
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
            }
            if (unit2.equals("Tempest")) {
                unit2AttVsGround = 40+4*unit2AttUps;
                unit2AttVsAir = 30+3*unit2AttUps;
                unit2AttSpeed = 2.36;
                unit2AttSpeedVsAir = 2.36;
                unit2Arm = 2 + unit2ArmUps;
                unit2HP = 300;
                unit2Shields = 150;
                unit2Attributes = "AMX";
                unit2IsGround = false;
                unit2AirBonusVsX = 22 + 2 * unit2AttUps;
                unit2AttackCount = 1;
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
            }
        }
    }

    public void zergSetter(Integer unitNum) {
        if (unitNum == 1) {
            if (unit1.equals("Baneling")) {
                unit1AttVsGround = 20 + 2*unit1AttUps;
                unit1AttVsAir = 0;
                unit1Arm = 1 + 2 * unit1ArmUps;
                unit1HP = 35;
                unit1Attributes = "B";
                unit1GBonusVsL = 15 + 2 * unit1AttUps;
                unit1GBonusVsS = 60 + 3 * unit1AttUps;
                unit1IsGround = true;
                unit1AttackCount = 1;
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
                unit1LifeSpan = 8.0;
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
                unit1AirBonusVsM = 6 + unit1AttUps;
                unit1AttackCount = 1;
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
            }
            if (unit1.equals("Hydralisk")) {
                unit1AttVsGround = 12 + unit1AttUps;
                unit1AttVsAir = 12 + unit1AttUps;
                unit1AttSpeed = 0.54;
                unit1AttSpeedVsAir = 0.54;
                unit1Arm = unit1ArmUps;
                unit1HP = 90;
                unit1Attributes = "LB";
                unit1IsGround = true;
                unit1AttackCount = 1;
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
            }
            if (unit1.equals("Infestor")) {
                unit1AttVsGround = 0;
                unit1AttVsAir = 0;
                unit1AttSpeed = 0.0;
                unit1Arm = unit1ArmUps;
                unit1HP = 90;
                unit1Attributes = "ABP";
                unit1IsGround = true;
            }
            if (unit1.equals("Larva")) {
                unit1AttVsGround = 0;
                unit1AttVsAir = 0;
                unit1AttSpeed = 0.0;
                unit1Arm = 10;
                unit1HP = 25;
                unit1Attributes = "LB";
                unit1IsGround = true;
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
            }
            if (unit1.equals("Nydus Worm")) {
                unit1AttVsGround = 0;
                unit1AttVsAir = 0;
                unit1AttSpeed = 0.0;
                unit1Arm = 1;
                unit1HP = 200;
                unit1Attributes = "ABS";
                unit1IsGround = true;
            }
            if (unit1.equals("Overlord")) {
                unit1AttVsGround = 0;
                unit1AttVsAir = 0;
                unit1AttSpeed = 0.0;
                unit1Arm = unit1ArmUps;
                unit1HP = 200;
                unit1Attributes = "AB";
                unit1IsGround = false;
            }
            if (unit1.equals("Overseer")) {
                unit1AttVsGround = 0;
                unit1AttVsAir = 0;
                unit1AttSpeed = 0.0;
                unit1Arm = 1 + unit1ArmUps;
                unit1HP = 200;
                unit1Attributes = "AB";
                unit1IsGround = false;
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
            }
            if (unit1.equals("Roach")) {
                unit1AttVsGround = 16 + 2 * unit1AttUps;
                unit1AttVsAir = 18;
                unit1AttSpeed = 1.43;
                unit1Arm = 1 + unit1ArmUps;
                unit1HP = 145;
                unit1Attributes = "AB";
                unit1IsGround = true;
                unit1AttackCount = 1;
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
            }
            if (unit1.equals("Spore Crawler")) {
                unit1AttVsGround = 15;
                unit1AttVsAir = 0;
                unit1AttSpeed = 0.0;
                unit1AttSpeedVsAir = 0.61;
                unit1Arm = 1;
                unit1HP = 400;
                unit1Attributes = "ABS";
                unit1IsGround = true;
                unit1GBonusVsB = 15;
                unit1AttackCount = 1;
            }
            if (unit1.equals("Swarm Host")) {
                unit1AttVsGround = 0;
                unit1AttVsAir = 0;
                unit1AttSpeed = 0.0;
                unit1Arm = 1 + unit1ArmUps;
                unit1HP = 160;
                unit1Attributes = "AB";
                unit1IsGround = true;
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
            }
            if (unit1.equals("Viper")) {
                unit1AttVsGround = 0;
                unit1AttVsAir = 0;
                unit1AttSpeed = 0.0;
                unit1Arm = 1 + unit1ArmUps;
                unit1HP = 150;
                unit1Attributes = "ABP";
                unit1IsGround = false;
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
            }
        }
        else if (unitNum == 2) {
            if (unit2.equals("Baneling")) {
                unit2AttVsGround = 20 + 2*unit2AttUps;
                unit2AttVsAir = 0;
                unit2Arm = 1 + 2 * unit2ArmUps;
                unit2HP = 35;
                unit2Attributes = "B";
                unit2GBonusVsL = 15 + 2*unit2AttUps;
                unit2GBonusVsS = 60 + 3 * unit2AttUps;
                unit2IsGround = true;
                unit2AttackCount = 1;
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
                unit2LifeSpan = 8.0;
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
                unit2AirBonusVsM = 6 + unit2AttUps;
                unit2AttackCount = 1;
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
            }
            if (unit2.equals("Hydralisk")) {
                unit2AttVsGround = 12 + unit2AttUps;
                unit2AttVsAir = 12 + unit2AttUps;
                unit2AttSpeed = 0.54;
                unit2AttSpeedVsAir = 0.54;
                unit2Arm = unit2ArmUps;
                unit2HP = 90;
                unit2Attributes = "LB";
                unit2IsGround = true;
                unit2AttackCount = 1;
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
            }
            if (unit2.equals("Infestor")) {
                unit2AttVsGround = 0;
                unit2AttVsAir = 0;
                unit2AttSpeed = 0.0;
                unit2Arm = unit2ArmUps;
                unit2HP = 90;
                unit2Attributes = "ABP";
                unit2IsGround = true;
            }
            if (unit2.equals("Larva")) {
                unit2AttVsGround = 0;
                unit2AttVsAir = 0;
                unit2AttSpeed = 0.0;
                unit2Arm = 10;
                unit2HP = 25;
                unit2Attributes = "LB";
                unit2IsGround = true;
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
            }
            if (unit2.equals("Nydus Worm")) {
                unit2AttVsGround = 0;
                unit2AttVsAir = 0;
                unit2AttSpeed = 0.0;
                unit2Arm = 1;
                unit2HP = 200;
                unit2Attributes = "ABS";
                unit2IsGround = true;
            }
            if (unit2.equals("Overlord")) {
                unit2AttVsGround = 0;
                unit2AttVsAir = 0;
                unit2AttSpeed = 0.0;
                unit2Arm = unit1ArmUps;
                unit2HP = 200;
                unit2Attributes = "AB";
                unit2IsGround = false;
            }
            if (unit2.equals("Overseer")) {
                unit2AttVsGround = 0;
                unit2AttVsAir = 0;
                unit2AttSpeed = 0.0;
                unit2Arm = 1 + unit2ArmUps;
                unit2HP = 200;
                unit2Attributes = "AB";
                unit2IsGround = false;
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
            }
            if (unit2.equals("Roach")) {
                unit2AttVsGround = 16 + 2 * unit2AttUps;
                unit2AttVsAir = 18;
                unit2AttSpeed = 1.43;
                unit2Arm = 1 + unit2ArmUps;
                unit2HP = 145;
                unit2Attributes = "AB";
                unit2IsGround = true;
                unit2AttackCount = 1;
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
            }
            if (unit2.equals("Spore Crawler")) {
                unit2AttVsGround = 15;
                unit2AttVsAir = 0;
                unit2AttSpeed = 0.0;
                unit2AttSpeedVsAir = 0.61;
                unit2Arm = 1;
                unit2HP = 400;
                unit2Attributes = "ABS";
                unit2IsGround = true;
                unit2GBonusVsB = 15;
                unit2AttackCount = 1;
            }
            if (unit2.equals("Swarm Host")) {
                unit2AttVsGround = 0;
                unit2AttVsAir = 0;
                unit2AttSpeed = 0.0;
                unit2Arm = 1 + unit2ArmUps;
                unit2HP = 160;
                unit2Attributes = "AB";
                unit2IsGround = true;
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
            }
            if (unit2.equals("Viper")) {
                unit2AttVsGround = 0;
                unit2AttVsAir = 0;
                unit2AttSpeed = 0.0;
                unit2Arm = 1 + unit2ArmUps;
                unit2HP = 150;
                unit2Attributes = "ABP";
                unit2IsGround = false;
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
            }
        }
    }

    public void generalSetter(Integer unitNum) {
        if (unitNum == 1) {
            if (unit1.equals("Baneling")) {
                unit1AttVsGround = 20 + 2*unit1AttUps;
                unit1AttVsAir = 0;
                unit1Arm = 1 + 2 * unit1ArmUps;
                unit1HP = 35;
                unit1Attributes = "B";
                unit1GBonusVsL = 15 + 2 * unit1AttUps;
                unit1GBonusVsS = 60 + 3 * unit1AttUps;
                unit1IsGround = true;
                unit1AttackCount = 1;
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
                unit1LifeSpan = 8.0;
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
                unit1AirBonusVsM = 6 + unit1AttUps;
                unit1AttackCount = 1;
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
            }
            if (unit1.equals("Hydralisk")) {
                unit1AttVsGround = 12 + unit1AttUps;
                unit1AttVsAir = 12 + unit1AttUps;
                unit1AttSpeed = 0.54;
                unit1AttSpeedVsAir = 0.54;
                unit1Arm = unit1ArmUps;
                unit1HP = 90;
                unit1Attributes = "LB";
                unit1IsGround = true;
                unit1AttackCount = 1;
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
            }
            if (unit1.equals("Infestor")) {
                unit1AttVsGround = 0;
                unit1AttVsAir = 0;
                unit1AttSpeed = 0.0;
                unit1Arm = unit1ArmUps;
                unit1HP = 90;
                unit1Attributes = "ABP";
                unit1IsGround = true;
            }
            if (unit1.equals("Larva")) {
                unit1AttVsGround = 0;
                unit1AttVsAir = 0;
                unit1AttSpeed = 0.0;
                unit1Arm = 10;
                unit1HP = 25;
                unit1Attributes = "LB";
                unit1IsGround = true;
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
            }
            if (unit1.equals("Nydus Worm")) {
                unit1AttVsGround = 0;
                unit1AttVsAir = 0;
                unit1AttSpeed = 0.0;
                unit1Arm = 1;
                unit1HP = 200;
                unit1Attributes = "ABS";
                unit1IsGround = true;
            }
            if (unit1.equals("Overlord")) {
                unit1AttVsGround = 0;
                unit1AttVsAir = 0;
                unit1AttSpeed = 0.0;
                unit1Arm = unit1ArmUps;
                unit1HP = 200;
                unit1Attributes = "AB";
                unit1IsGround = false;
            }
            if (unit1.equals("Overseer")) {
                unit1AttVsGround = 0;
                unit1AttVsAir = 0;
                unit1AttSpeed = 0.0;
                unit1Arm = 1 + unit1ArmUps;
                unit1HP = 200;
                unit1Attributes = "AB";
                unit1IsGround = false;
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
            }
            if (unit1.equals("Roach")) {
                unit1AttVsGround = 16 + 2 * unit1AttUps;
                unit1AttVsAir = 18;
                unit1AttSpeed = 1.43;
                unit1Arm = 1 + unit1ArmUps;
                unit1HP = 145;
                unit1Attributes = "AB";
                unit1IsGround = true;
                unit1AttackCount = 1;
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
            }
            if (unit1.equals("Spore Crawler")) {
                unit1AttVsGround = 15;
                unit1AttVsAir = 0;
                unit1AttSpeed = 0.0;
                unit1AttSpeedVsAir = 0.61;
                unit1Arm = 1;
                unit1HP = 400;
                unit1Attributes = "ABS";
                unit1IsGround = true;
                unit1GBonusVsB = 15;
                unit1AttackCount = 1;
            }
            if (unit1.equals("Swarm Host")) {
                unit1AttVsGround = 0;
                unit1AttVsAir = 0;
                unit1AttSpeed = 0.0;
                unit1Arm = 1 + unit1ArmUps;
                unit1HP = 160;
                unit1Attributes = "AB";
                unit1IsGround = true;
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
            }
            if (unit1.equals("Viper")) {
                unit1AttVsGround = 0;
                unit1AttVsAir = 0;
                unit1AttSpeed = 0.0;
                unit1Arm = 1 + unit1ArmUps;
                unit1HP = 150;
                unit1Attributes = "ABP";
                unit1IsGround = false;
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
            }
            if (unit1.equals("Adept")) {
                unit1AttVsGround = 10 + unit2AttUps;
                unit1AttVsAir = 0;
                unit1AttSpeed = 1.61;
                //unit1AttSpeed2 = 1.11;
                unit1Arm = 1 + unit2ArmUps;
                unit1HP = 70;
                unit1Shields = 70;
                unit1Attributes = "LB";
                unit1IsGround = true;
                unit1GBonusVsL = 12;
                unit1AttackCount = 1;
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
            }
            if (unit1.equals("Carrier")) {
                unit1AttVsGround = (5 + unit1AttUps) * 2;
                unit1AttVsAir = (5 + unit1AttUps) * 2;
                unit1AttSpeed = 0.2675;
                unit1AttSpeedVsAir = 0.2675;
                unit1Arm = 2 + unit1ArmUps;
                unit1HP = 250;
                unit1Shields = 150;
                unit1Attributes = "AMX";
                unit1IsGround = false;
                unit1AttackCount = 2;
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
            }
            if (unit1.equals("Oracle")) {
                unit1AttVsGround = 15;
                unit1AttVsAir = 0;
                unit1AttSpeed = 0.61;
                unit1Arm = unit1ArmUps;
                unit1HP = 100;
                unit1Shields = 60;
                unit1Attributes = "LMP";
                unit1IsGround = false;
                unit1GBonusVsL = 7;
                unit1AttackCount = 1;
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
            }
            if (unit1.equals("Tempest")) {
                unit1AttVsGround = 40+4*unit1AttUps;
                unit1AttVsAir = 30+3*unit1AttUps;
                unit1AttSpeed = 2.36;
                unit1AttSpeedVsAir = 2.36;
                unit1Arm = 2 + unit1ArmUps;
                unit1HP = 300;
                unit1Shields = 150;
                unit1Attributes = "AMX";
                unit1IsGround = false;
                unit1AirBonusVsX = 22 + 2 * unit1AttUps;
                unit1AttackCount = 1;
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
            }
            if (unit1.equals("Battlecruiser")) {
                unit1AttVsGround = 8 + unit1AttUps;
                unit1AttVsAir = 6 + unit1AttUps;
                unit1AttSpeed = 0.16;
                unit1AttSpeedVsAir = 0.16;
                unit1Arm = 3 + unit1ArmUps;
                unit1HP = 550;
                unit1Attributes = "AMX";
                unit1IsGround = false;
                unit1AttackCount = 1;
            }
            if (unit1.equals("Cyclone")) {
                unit1AttVsGround = 3 + unit1AttUps;
                unit1AttVsAir = 8 + unit1AttUps;
                unit1AttSpeed = 0.1;
                unit1AttSpeedVsAir = 0.7;
                unit1Arm = 1 + unit1ArmUps;
                unit1HP = 180;
                unit1Attributes = "AM";
                unit1IsGround = true;
                unit1GBonusVsA = 2 + unit1AttUps;
                unit1AttackCount = 1;
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
            }
            if (unit1.equals("Hellbat")) {
                unit1AttVsGround = 18 + 2 * unit1AttUps;
                unit1AttVsAir = 0;
                unit1AttSpeed = 1.43;
                unit1Arm = 1 + 2 * unit1ArmUps;
                unit1HP = 150;
                unit1Attributes = "LBM";
                unit1IsGround = true;
                unit1GBonusVsL = unit1AttUps;
                unit1AttackCount = 1;
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
            }
            if (unit1.equals("Medivac")) {
                unit1AttVsGround = 0;
                unit1AttVsAir = 0;
                unit1AttSpeed = 0.0;
                unit1Arm = 1 + unit1ArmUps;
                unit1HP = 150;
                unit1Attributes = "AM";
                unit1IsGround = false;
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
            }
            if (unit1.equals("Raven")) {
                unit1AttVsGround = 0;
                unit1AttVsAir = 0;
                unit1AttSpeed = 0.0;
                unit1Arm = 1 + unit1ArmUps;
                unit1HP = 140;
                unit1Attributes = "LM";
                unit1IsGround = false;
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
            }
            if (unit1.equals("Thor (high impact)")) {
                unit1AttVsGround = (30 + 3*unit1AttUps)*2;
                unit1AttVsAir = 35+3*unit1AttUps;
                unit1AttSpeed = 0.91;
                unit1AttSpeedVsAir = 2.14;
                unit1Arm = 1 + unit1ArmUps;
                unit1HP = 400;
                unit1Attributes = "AMX";
                unit1IsGround = true;
                unit1AirBonusVsA = 15 + 2 * unit1AttUps;
                unit1AttackCount = 2;
            }
            if (unit1.equals("Viking (assault mode)")) {
                unit1AttVsGround = 12 + unit1AttUps;
                unit1AttVsAir = 0;
                unit1AttSpeed = 0.71;
                unit1Arm = unit1ArmUps;
                unit1HP = 125;
                unit1Attributes = "AM";
                unit1IsGround = true;
                unit1GBonusVsM = 8;
                unit1AttackCount = 1;
            }
            if (unit1.equals("Viking (fighter mode)")) {
                unit1AttVsGround = 0;
                unit1AttVsAir = (10 + unit1AttUps)*2;
                unit1AttSpeed = 0.0;
                unit1AttSpeedVsAir = 1.43;
                unit1Arm = unit1ArmUps;
                unit1HP = 125;
                unit1Attributes = "AM";
                unit1IsGround = false;
                unit1AirBonusVsA = 4;
                unit1AttackCount = 2;
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
            }
        }
        else if (unitNum == 2) {
            if (unit2.equals("Baneling")) {
                unit2AttVsGround = 20 + 2*unit2AttUps;
                unit2AttVsAir = 0;
                unit2Arm = 1 + 2 * unit2ArmUps;
                unit2HP = 35;
                unit2Attributes = "B";
                unit2GBonusVsL = 15 + 2*unit2AttUps;
                unit2GBonusVsS = 60 + 3 * unit2AttUps;
                unit2IsGround = true;
                unit2AttackCount = 1;
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
                unit2LifeSpan = 8.0;
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
                unit2AirBonusVsM = 6 + unit2AttUps;
                unit2AttackCount = 1;
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
            }
            if (unit2.equals("Hydralisk")) {
                unit2AttVsGround = 12 + unit2AttUps;
                unit2AttVsAir = 12 + unit2AttUps;
                unit2AttSpeed = 0.54;
                unit2AttSpeedVsAir = 0.54;
                unit2Arm = unit2ArmUps;
                unit2HP = 90;
                unit2Attributes = "LB";
                unit2IsGround = true;
                unit2AttackCount = 1;
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
            }
            if (unit2.equals("Infestor")) {
                unit2AttVsGround = 0;
                unit2AttVsAir = 0;
                unit2AttSpeed = 0.0;
                unit2Arm = unit2ArmUps;
                unit2HP = 90;
                unit2Attributes = "ABP";
                unit2IsGround = true;
            }
            if (unit2.equals("Larva")) {
                unit2AttVsGround = 0;
                unit2AttVsAir = 0;
                unit2AttSpeed = 0.0;
                unit2Arm = 10;
                unit2HP = 25;
                unit2Attributes = "LB";
                unit2IsGround = true;
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
            }
            if (unit2.equals("Nydus Worm")) {
                unit2AttVsGround = 0;
                unit2AttVsAir = 0;
                unit2AttSpeed = 0.0;
                unit2Arm = 1;
                unit2HP = 200;
                unit2Attributes = "ABS";
                unit2IsGround = true;
            }
            if (unit2.equals("Overlord")) {
                unit2AttVsGround = 0;
                unit2AttVsAir = 0;
                unit2AttSpeed = 0.0;
                unit2Arm = unit1ArmUps;
                unit2HP = 200;
                unit2Attributes = "AB";
                unit2IsGround = false;
            }
            if (unit2.equals("Overseer")) {
                unit2AttVsGround = 0;
                unit2AttVsAir = 0;
                unit2AttSpeed = 0.0;
                unit2Arm = 1 + unit2ArmUps;
                unit2HP = 200;
                unit2Attributes = "AB";
                unit2IsGround = false;
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
            }
            if (unit2.equals("Roach")) {
                unit2AttVsGround = 16 + 2 * unit2AttUps;
                unit2AttVsAir = 18;
                unit2AttSpeed = 1.43;
                unit2Arm = 1 + unit2ArmUps;
                unit2HP = 145;
                unit2Attributes = "AB";
                unit2IsGround = true;
                unit2AttackCount = 1;
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
            }
            if (unit2.equals("Spore Crawler")) {
                unit2AttVsGround = 15;
                unit2AttVsAir = 0;
                unit2AttSpeed = 0.0;
                unit2AttSpeedVsAir = 0.61;
                unit2Arm = 1;
                unit2HP = 400;
                unit2Attributes = "ABS";
                unit2IsGround = true;
                unit2GBonusVsB = 15;
                unit2AttackCount = 1;
            }
            if (unit2.equals("Swarm Host")) {
                unit2AttVsGround = 0;
                unit2AttVsAir = 0;
                unit2AttSpeed = 0.0;
                unit2Arm = 1 + unit2ArmUps;
                unit2HP = 160;
                unit2Attributes = "AB";
                unit2IsGround = true;
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
            }
            if (unit2.equals("Viper")) {
                unit2AttVsGround = 0;
                unit2AttVsAir = 0;
                unit2AttSpeed = 0.0;
                unit2Arm = 1 + unit2ArmUps;
                unit2HP = 150;
                unit2Attributes = "ABP";
                unit2IsGround = false;
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
            }
            if (unit2.equals("Carrier")) {
                unit2AttVsGround = (5 + unit2AttUps) * 2;
                unit2AttVsAir = (5 + unit2AttUps) * 2;
                unit2AttSpeed = 0.2675;
                unit2AttSpeedVsAir = 0.2675;
                unit2Arm = 2 + unit1ArmUps;
                unit2HP = 250;
                unit2Shields = 150;
                unit2Attributes = "AMX";
                unit2IsGround = false;
                unit2AttackCount = 2;
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
            }
            if (unit2.equals("Immortal")) {
                unit2AttVsGround = 20 + 2*unit2AttUps;
                unit2AttVsAir = 0;
                unit2AttSpeed = 1.04;
                unit2Arm = 1 + unit1ArmUps;
                unit2HP = 200;
                unit2Shields = 100;
                unit2Attributes = "AM";
                unit2IsGround = true;
                unit2GBonusVsA = 30 + 3 * unit2AttUps;
                unit2AttackCount = 1;
            }
            if (unit2.equals("Interceptor")) {
                unit2AttVsGround = (5+unit2AttUps) * 2;
                unit2AttVsAir = (5+unit2AttUps)*2;
                unit2AttSpeed = 2.14;
                unit2AttSpeedVsAir = 2.14;
                unit2Arm = unit1ArmUps;
                unit2HP = 40;
                unit2Shields = 40;
                unit2Attributes = "LM";
                unit2IsGround = false;
                unit2AttackCount = 2;
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
            }
            if (unit2.equals("Oracle")) {
                unit2AttVsGround = 15;
                unit2AttVsAir = 0;
                unit2AttSpeed = 0.61;
                unit2Arm = unit2ArmUps;
                unit2HP = 100;
                unit2Shields = 60;
                unit2Attributes = "LMP";
                unit2IsGround = false;
                unit2GBonusVsL = 7;
                unit2AttackCount = 1;
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
                unit1AirBonusVsL = 5;
                unit2AttackCount = 2;
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
            }
            if (unit2.equals("Tempest")) {
                unit2AttVsGround = 40+4*unit2AttUps;
                unit2AttVsAir = 30+3*unit2AttUps;
                unit2AttSpeed = 2.36;
                unit2AttSpeedVsAir = 2.36;
                unit2Arm = 2 + unit2ArmUps;
                unit2HP = 300;
                unit2Shields = 150;
                unit2Attributes = "AMX";
                unit2IsGround = false;
                unit2AirBonusVsX = 22 + 2 * unit2AttUps;
                unit2AttackCount = 1;
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
            }
            if (unit2.equals("Battlecruiser")) {
                unit2AttVsGround = 8 + unit2AttUps;
                unit2AttVsAir = 6 + unit2AttUps;
                unit2AttSpeed = 0.16;
                unit2AttSpeedVsAir = 0.16;
                unit2Arm = 3 + unit2ArmUps;
                unit2HP = 550;
                unit2Attributes = "AMX";
                unit2IsGround = false;
                unit2AttackCount = 1;
            }
            if (unit2.equals("Cyclone")) {
                unit2AttVsGround = 3 + unit2AttUps;
                unit2AttVsAir = 8 + unit2AttUps;
                unit2AttSpeed = 0.1;
                unit2AttSpeedVsAir = 0.7;
                unit2Arm = 1 + unit2ArmUps;
                unit2HP = 180;
                unit2Attributes = "AM";
                unit2IsGround = true;
                unit2GBonusVsA = 2 + unit2AttUps;
                unit2AttackCount = 1;
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
                unit2AttackCount = 1;
            }
            if (unit2.equals("Hellbat")) {
                unit2AttVsGround = 18 + 2 * unit2AttUps;
                unit2AttVsAir = 0;
                unit2AttSpeed = 1.43;
                unit2Arm = 1 + 2 * unit2ArmUps;
                unit2HP = 150;
                unit2Attributes = "LBM";
                unit2IsGround = true;
                unit2GBonusVsL = unit2AttUps;
                unit2AttackCount = 1;
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
            }
            if (unit2.equals("Medivac")) {
                unit2AttVsGround = 0;
                unit2AttVsAir = 0;
                unit2AttSpeed = 0.0;
                unit2Arm = 1 + unit2ArmUps;
                unit2HP = 150;
                unit2Attributes = "AM";
                unit2IsGround = false;
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
            }
            if (unit2.equals("Raven")) {
                unit2AttVsGround = 0;
                unit2AttVsAir = 0;
                unit2AttSpeed = 0.0;
                unit2Arm = 1 + unit2ArmUps;
                unit2HP = 140;
                unit2Attributes = "LM";
                unit2IsGround = false;
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
                unit2AttackCount = 4;
            }
            if (unit2.equals("Thor (high impact)")) {
                unit2AttVsGround = (30 + 3*unit2AttUps)*2;
                unit2AttVsAir = 35+3*unit2AttUps;
                unit2AttSpeed = 0.91;
                unit2AttSpeedVsAir = 2.14;
                unit2Arm = 1 + unit2ArmUps;
                unit2HP = 400;
                unit2Attributes = "AMX";
                unit2IsGround = true;
                unit2AirBonusVsA = 15 + 2 * unit2AttUps;
                unit2AttackCount = 1;
            }
            if (unit2.equals("Viking (assault mode)")) {
                unit2AttVsGround = 12 + unit2AttUps;
                unit2AttVsAir = 0;
                unit2AttSpeed = 0.71;
                unit2Arm = unit2ArmUps;
                unit2HP = 125;
                unit2Attributes = "AM";
                unit2IsGround = true;
                unit2GBonusVsM = 8;
                unit2AttackCount = 1;
            }
            if (unit2.equals("Viking (fighter mode)")) {
                unit2AttVsGround = 0;
                unit2AttVsAir = (10 + unit2AttUps)*2;
                unit2AttSpeed = 0.0;
                unit2AttSpeedVsAir = 1.43;
                unit2Arm = unit2ArmUps;
                unit2HP = 125;
                unit2Attributes = "AM";
                unit2IsGround = false;
                unit2AirBonusVsA = 4;
                unit2AttackCount = 2;
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
            }
        }
    }

    public void infoSetter() {
        unit1 = unit1Name.getSelectedItem().toString();
        unit1AttUps = Integer.parseInt(unit1AttackUps.getSelectedItem().toString());
        unit1ArmUps = Integer.parseInt(unit1ArmorUps.getSelectedItem().toString());

        unit2 = unit2Name.getSelectedItem().toString();
        unit2AttUps = Integer.parseInt(unit2AttackUps.getSelectedItem().toString());
        unit2ArmUps = Integer.parseInt(unit2ArmorUps.getSelectedItem().toString());
        unit2Qua = Integer.parseInt(unit2Quantity.getSelectedItem().toString());

        if (unit1Terran.isChecked()) {
            terranSetter(1);
        }
        if (unit1Zerg.isChecked()) {
            zergSetter(1);
        }
        if (unit1Protoss.isChecked()) {
            protossSetter(1);
        }
        if (unit2Terran.isChecked()) {
            terranSetter(2);
        }
        if (unit2Zerg.isChecked()) {
            zergSetter(2);
        }
        if (unit2Protoss.isChecked()) {
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
        Integer unit1ExtraHPDmg = 0;
        Integer unit2ExtraHPDmg = 0;
        Integer unit1TempHP = unit1HP;
        Integer unit2TempHP = unit2HP;
        Integer unit1HitsTillShields = 0;
        Integer unit2HitsTillShields = 0;
        Integer unit1HitsOnShields = 0;
        Integer unit2HitsOnShields = 0;
        Integer allOtherAttacks = 0;
        unit1TotalHP = unit1HP;
        unit2TotalHP = unit2HP;

        if (unit1Shields != null && unit1Shields != 0) {
            unit1TotalHP += unit1Shields;
        }
        if (unit2Shields != null && unit2Shields != 0) {
            unit2TotalHP += unit2Shields;
        }

        //Calculate Final Unit Damage
        if (unit2IsGround && unit1AttVsGround != 0 && unit1AttVsGround != null) {
            unit1FinalDmg = unit1AttVsGround - unit2Arm * unit1AttackCount;
            unit1ShieldAttack = unit1AttVsGround;
        }
        if ((!unit2IsGround || unit2.equals("Colossus")) && unit1AttVsAir != 0 && unit1AttVsAir != null) {
            unit1FinalDmg = unit1AttVsAir - unit2Arm * unit1AttackCount;
            unit1ShieldAttack = unit1AttVsAir;
            if (unit1.equals("Queen")) {
                unit1FinalDmg = unit1AttVsAir - unit2Arm;
            }
            if (unit1.equals("Thor (explosive)")) {
                unit1FinalDmg = unit1AttVsAir - unit2Arm * 4;
            }
        }
        if (unit1IsGround && unit2AttVsGround != 0 && unit2AttVsGround != null) {
            unit2FinalDmg = unit2AttVsGround - unit1Arm * unit2AttackCount;
            unit2ShieldAttack = unit2AttVsGround;
        }
        if ((!unit1IsGround || unit1.equals("Colossus")) && unit2AttVsAir != 0 && unit2AttVsAir != null) {
            unit2FinalDmg = unit2AttVsAir - unit1Arm * unit2AttackCount;
            unit2ShieldAttack = unit2AttVsAir;
            if (unit2.equals("Queen")) {
                unit2FinalDmg = unit2AttVsAir - unit1Arm;
            }
            if (unit2.equals("Thor (explosive)")) {
                unit2FinalDmg = unit2AttVsAir - unit1Arm * 4;
            }
        }
        // Add all the attribute bonuses, ground first
        if (unit2Attributes.contains("B") && unit1GBonusVsB != null && unit2IsGround) {
            unit1FinalDmg += unit1GBonusVsB;
            unit1ShieldAttack += unit1GBonusVsB;
        }
        if (unit2Attributes.contains("L") && unit1GBonusVsL != null && unit2IsGround) {
            unit1FinalDmg += unit1GBonusVsL;
            unit1ShieldAttack += unit1GBonusVsL;
        }
        if (unit2Attributes.contains("A") && unit1GBonusVsA != null && unit2IsGround) {
            unit1FinalDmg += unit1GBonusVsA;
            unit1ShieldAttack += unit1GBonusVsA;
        }
        if (unit2Attributes.contains("M") && unit1GBonusVsM != null && unit2IsGround) {
            unit1FinalDmg += unit1GBonusVsM;
            unit1ShieldAttack += unit1GBonusVsM;
        }
        if (unit2Attributes.contains("P") && unit1GBonusVsP != null && unit2IsGround) {
            unit1FinalDmg += unit1GBonusVsP;
            unit1ShieldAttack += unit1GBonusVsP;
        }
        if (unit2Attributes.contains("S") && unit1GBonusVsS != null && unit2IsGround) {
            unit1FinalDmg += unit1GBonusVsS;
            unit1ShieldAttack += unit1GBonusVsS;
        }
        if (unit2Attributes.contains("X") && unit1GBonusVsX != null && unit2IsGround) {
            unit1FinalDmg += unit1GBonusVsX;
            unit1ShieldAttack += unit1GBonusVsX;
        }

        // Unit 2
        if (unit1Attributes.contains("B") && unit2GBonusVsB != null && unit1IsGround) {
            unit2FinalDmg += unit2GBonusVsB;
            unit2ShieldAttack += unit2GBonusVsB;
        }
        if (unit1Attributes.contains("L") && unit2GBonusVsL != null && unit1IsGround) {
            unit2FinalDmg += unit2GBonusVsL;
            unit2ShieldAttack += unit2GBonusVsL;
        }
        if (unit1Attributes.contains("A") && unit2GBonusVsA != null && unit1IsGround) {
            unit2FinalDmg += unit2GBonusVsA;
            unit2ShieldAttack += unit2GBonusVsA;
        }
        if (unit1Attributes.contains("M") && unit2GBonusVsM != null && unit1IsGround) {
            unit2FinalDmg += unit2GBonusVsM;
            unit2ShieldAttack += unit2GBonusVsM;
        }
        if (unit1Attributes.contains("P") && unit2GBonusVsP != null && unit1IsGround) {
            unit2FinalDmg += unit2GBonusVsP;
            unit2ShieldAttack += unit2GBonusVsP;
        }
        if (unit1Attributes.contains("S") && unit2GBonusVsS != null && unit1IsGround) {
            unit2FinalDmg += unit2GBonusVsS;
            unit2ShieldAttack += unit2GBonusVsS;
        }
        if (unit1Attributes.contains("X") && unit2GBonusVsX != null && unit1IsGround) {
            unit2FinalDmg += unit2GBonusVsX;
            unit2ShieldAttack += unit2GBonusVsX;
        }

        //All the air attribute bonuses
        if (unit2Attributes.contains("B") && unit1AirBonusVsB != null && !unit2IsGround) {
            unit1FinalDmg += unit1AirBonusVsB;
            unit1ShieldAttack += unit1AirBonusVsB;
        }
        if (unit2Attributes.contains("L") && unit1AirBonusVsL != null && !unit2IsGround) {
            unit1FinalDmg += unit1AirBonusVsL;
            unit1ShieldAttack += unit1AirBonusVsL;
        }
        if (unit2Attributes.contains("A") && unit1AirBonusVsA != null && !unit2IsGround) {
            unit1FinalDmg += unit1AirBonusVsA;
            unit1ShieldAttack += unit1AirBonusVsA;
        }
        if (unit2Attributes.contains("M") && unit1AirBonusVsM != null && !unit2IsGround) {
            unit1FinalDmg += unit1AirBonusVsM;
            unit1ShieldAttack += unit1AirBonusVsM;
        }
        if (unit2Attributes.contains("P") && unit1AirBonusVsP != null && !unit2IsGround) {
            unit1FinalDmg += unit1AirBonusVsP;
            unit1ShieldAttack += unit1AirBonusVsP;
        }
        if (unit2Attributes.contains("S") && unit1AirBonusVsS != null && !unit2IsGround) {
            unit1FinalDmg += unit1AirBonusVsS;
            unit1ShieldAttack += unit1AirBonusVsS;
        }
        if (unit2Attributes.contains("X") && unit1AirBonusVsX != null && !unit2IsGround) {
            unit1FinalDmg += unit1AirBonusVsX;
            unit1ShieldAttack += unit1AirBonusVsX;
        }

        //Unit 2
        if (unit1Attributes.contains("B") && unit2AirBonusVsB != null && !unit1IsGround) {
            unit2FinalDmg += unit2AirBonusVsB;
            unit2ShieldAttack += unit2AirBonusVsB;

        }
        if (unit1Attributes.contains("L") && unit2AirBonusVsL != null && !unit1IsGround) {
            unit2FinalDmg += unit2AirBonusVsL;
            unit2ShieldAttack += unit2AirBonusVsL;
        }
        if (unit1Attributes.contains("A") && unit2AirBonusVsA != null && !unit1IsGround) {
            unit2FinalDmg += unit2AirBonusVsA;
            unit2ShieldAttack += unit2AirBonusVsA;
        }
        if (unit1Attributes.contains("M") && unit2AirBonusVsM != null && !unit1IsGround) {
            unit2FinalDmg += unit2AirBonusVsM;
            unit2ShieldAttack += unit2AirBonusVsM;
        }
        if (unit1Attributes.contains("P") && unit2AirBonusVsP != null && !unit1IsGround) {
            unit2FinalDmg += unit2AirBonusVsP;
            unit2ShieldAttack += unit2AirBonusVsP;
        }
        if (unit1Attributes.contains("S") && unit2AirBonusVsS != null && !unit1IsGround) {
            unit2FinalDmg += unit2AirBonusVsS;
            unit2ShieldAttack += unit2AirBonusVsS;
        }
        if (unit1Attributes.contains("X") && unit2AirBonusVsX != null && !unit1IsGround) {
            unit2FinalDmg += unit2AirBonusVsX;
            unit2ShieldAttack += unit2AirBonusVsX;
        }

        //  If the units cannot target the other unit, they are "peaceful"
        if (((unit2IsGround && !unit2.equals("Colossus")) && (unit1AttVsGround <= 0 || unit1AttVsGround == null)) || (!unit2IsGround && (unit1AttVsAir <= 0 || unit1AttVsAir == null))) {
            unit1Peaceful = true;
        }
        if (((unit1IsGround && !unit1.equals("Colossus")) && (unit2AttVsGround <= 0 || unit2AttVsGround == null)) || (!unit1IsGround && (unit2AttVsAir <= 0 || unit1AttVsAir == null))) {
            unit2Peaceful = true;
        }

        //Attack Speed.  Exceptions made for some units and unit interactions here.

        unit1FinalAttackSpeed = unit1AttSpeed;
        if ((!unit2IsGround || unit2.equals("Colossus")) && (unit1AttSpeedVsAir != null && unit1AttSpeedVsAir != 0)) {
            unit1FinalAttackSpeed = unit1AttSpeedVsAir;
        }
        unit2FinalAttackSpeed = unit2AttSpeed;
        if ((!unit1IsGround || unit1.equals("Colossus")) && (unit2AttSpeedVsAir != null && unit2AttSpeedVsAir != 0)) {
            unit2FinalAttackSpeed = unit2AttSpeedVsAir;
        }

        if (unit1.equals("Cyclone") && unit2.equals("Colossus")) {
            unit1FinalAttackSpeed = unit1AttSpeed;
            unit1FinalDmg = unit1AttVsGround - unit2Arm * unit1AttackCount + unit1GBonusVsA;
            unit1ShieldAttack = unit1AttVsGround + unit1GBonusVsA;
        }
        if (unit2.equals("Cyclone") && unit1.equals("Colossus")) {
            unit2FinalAttackSpeed = unit2AttSpeed;
            unit2FinalDmg = unit2AttVsGround - unit1Arm * unit2AttackCount + unit2GBonusVsA;
            unit2ShieldAttack = unit2AttVsGround + unit2GBonusVsA;
        }
        if (unit1.equals("Widow Mine")) {
            unit1ShieldAttack += 35;
        }
        if (unit2.equals("Widow Mine")) {
            unit2ShieldAttack += 35;
        }

        //  If unit 2 has a final attack more than 0, calculate how many attacks to kill unit 1 (hits till dead)
        //  If unit 2 has a final attack that = 0 or less, it's peaceful, and it's attack is 0

        //Calculate hits till shields are gone before hits till dead
        if (!unit2Peaceful) {
            unit1HitsTillShields = unit1Shields / unit2ShieldAttack;
            if (unit1HitsTillShields != null & unit1HitsTillShields != 0 && (unit1HitsTillShields * unit2ShieldAttack < unit1Shields)) {
                unit1HitsTillShields += 1;
            }
            if (unit1Shields < unit2ShieldAttack && unit1Shields != null && unit1Shields != 0) {
                unit1HitsTillShields = 1;
            }
        }
        if (!unit1Peaceful) {
            unit2HitsTillShields = unit2Shields / unit1ShieldAttack;
            if (unit2HitsTillShields != null & unit2HitsTillShields != 0 && (unit2HitsTillShields * unit1ShieldAttack < unit2Shields)) {
                unit2HitsTillShields += 1;
            }
            if (unit2Shields < unit1ShieldAttack && unit2Shields != null && unit2Shields != 0) {
                unit2HitsTillShields = 1;
            }
        }

        unit1TempHP = unit1TotalHP - (unit1HitsTillShields * unit2ShieldAttack);
        unit2TempHP = unit2TotalHP - (unit2HitsTillShields * unit1ShieldAttack);

        // Now calculate hits till dead
        if (unit2FinalDmg > 0) {
            unit1HitsTillDead = (unit1TempHP / unit2FinalDmg) + unit1HitsTillShields;
        } else if (unit2FinalDmg <= 0) {
            unit2Peaceful = true;
            unit2FinalDmg = 0;
        }

        //  If the unit has a finite amount of hits until death and the product of that number and unit 2 final attack is still less than the HP of the unit, add 1.
        //  It could be less, because of how hits till dead is calculated.

        if (unit1HitsTillDead != null && (((unit1HitsTillDead - unit1HitsTillShields) * unit2FinalDmg)) < unit1TempHP) {
            unit1HitsTillDead += 1;
        }
        if (unit1TempHP <= 0 && unit1HitsTillShields == 1) {
            unit1HitsTillDead = 1;
        }

        //  Same thing for unit 1, calculating unit 2 hits until it dies
        if (unit1FinalDmg > 0) {
            unit2HitsTillDead = (unit2TempHP / unit1FinalDmg) + unit2HitsTillShields;
        } else if (unit1FinalDmg <= 0) {
            unit1Peaceful = true;
            unit1FinalDmg = 0;
        }

        //  Same thing as we did for unit 1 hits until dead, we do now for unit 2 hits until dead
        if (unit2HitsTillDead != null && (((unit2HitsTillDead - unit2HitsTillShields) * unit1FinalDmg)) < unit2TempHP) {
            unit2HitsTillDead += 1;
        }
        if (unit2TempHP <= 0 && unit2HitsTillShields == 1) {
            unit2HitsTillDead = 1;
        }

        // Calculate the time it takes for the unit to die.  Whichever dies first is the loser, which means the *higher* time of death would be the winner.
        if (unit1HitsTillDead != null && unit2FinalAttackSpeed != 0 && unit2FinalAttackSpeed != null && !unit2.equals("Baneling")) {
            unit1TimeTillDead = (unit1HitsTillDead - 1) * unit2FinalAttackSpeed;
            if (unit1.equals("Baneling")) {
                unit1TimeTillDead = 0.0;
                // make more exact with shieldattack final dmg average??
                if ((unit2TotalHP) > unit1FinalDmg) {
                    unit2TimeTillDead = null;
                } else {
                    unit2TimeTillDead = 0.0;
                }
            }
        }
        if (unit2HitsTillDead != null && unit1FinalAttackSpeed != 0 && unit2FinalAttackSpeed != null && !unit1.equals("Baneling")) {
            unit2TimeTillDead = (unit2HitsTillDead - 1) * unit1FinalAttackSpeed;
            if (unit2.equals("Baneling")) {
                unit2TimeTillDead = 0.0;
                if ((unit2TotalHP) > unit2FinalDmg) {
                    unit1TimeTillDead = null;
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
                    winnerAttacksDealt = (int)(unit2LifeSpan / unit1FinalAttackSpeed);
                }
                loserAttacksDealt = (int) (unit2TimeTillDead / unit2FinalAttackSpeed) + 1;
                if (unit2LifeSpan != null && unit1TimeTillDead > unit2LifeSpan && unit2LifeSpan < unit2TimeTillDead) {
                    loserAttacksDealt = (int)(unit2LifeSpan / unit2FinalAttackSpeed);
                }
                if (loserAttacksDealt < unit1HitsTillShields) {
                    unit1HitsOnShields = loserAttacksDealt;
                    allOtherAttacks = 0;
                }
                if (loserAttacksDealt >= unit1HitsTillShields) {
                    unit1HitsOnShields = unit1HitsTillShields;
                    allOtherAttacks = loserAttacksDealt - unit1HitsTillShields;
                }
                hpRemaining = Integer.toString((unit1HP + unit1Shields) - (unit1HitsOnShields * unit2ShieldAttack) - (allOtherAttacks * unit2FinalDmg));
            }
            else if (unit2TimeTillDead > unit1TimeTillDead  || (unit1LifeSpan != null && unit2TimeTillDead > unit1LifeSpan)) {
                winner = unit2;
                loser = unit1;
                winnerUnit = "unit 2";
                loserUnit = "unit 1";
                time = unit1TimeTillDead;
                winnerAttacksDealt = unit1HitsTillDead;

                //  If unit 2's lifespan is less than the time it takes to kill either unit it's the limiting factor
                if (unit1LifeSpan != null && unit2TimeTillDead > unit1LifeSpan && unit1LifeSpan < unit1TimeTillDead) {
                    winnerAttacksDealt = (int)(unit1LifeSpan / unit2FinalAttackSpeed);
                }
                loserAttacksDealt = (int) (unit1TimeTillDead / unit1FinalAttackSpeed) + 1;
                if (unit1LifeSpan!= null && unit2TimeTillDead > unit1LifeSpan && unit1LifeSpan < unit1TimeTillDead) {
                    loserAttacksDealt = (int)(unit1LifeSpan / unit1FinalAttackSpeed);
                }
                if (loserAttacksDealt < unit2HitsTillShields) {
                    unit2HitsOnShields = loserAttacksDealt;
                    allOtherAttacks = 0;
                }
                if (loserAttacksDealt >= unit2HitsTillShields) {
                    unit2HitsOnShields = unit2HitsTillShields;
                    allOtherAttacks = loserAttacksDealt - unit2HitsTillShields;
                }
                hpRemaining = Integer.toString((unit2HP + unit2Shields) - (unit2HitsOnShields * unit1ShieldAttack) - (allOtherAttacks * unit1FinalDmg));
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
            if (unit2TimeTillDead == null) {
                result = "The Baneling blows up and the " + unit2 + " lives on forever!";
                time = 0.0;
                winner = unit2;
                loser = unit1;
                loserAttacksDealt = 1;
                winnerAttacksDealt = 1;
                hpRemaining = Integer.toString(unit2TotalHP - unit1FinalDmg);
                if (unit2Shields != null && unit2Shields != 0) {
                    hpRemaining = Integer.toString(unit2TotalHP - unit1ShieldAttack);
                }
            }
        }
        if (unit2.equals("Baneling") && !unit1.equals("Baneling")){
            if (unit1TimeTillDead == null) {
                result = "The Baneling blows up and the " + unit1 + " lives on forever!";
                time = 0.0;
                winner = unit1;
                loser = unit2;
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
            winnerAttacksDealt = 0;
            loserAttacksDealt = 0;
        }
        if (unit2Peaceful && !unit1Peaceful) {
            result = "The " + unit1 + " wins, as the " + unit2 + " can't deal damage!";
            hpRemaining = Integer.toString(unit1TotalHP);
            winnerAttacksDealt = unit2HitsTillDead;
            loserAttacksDealt = 0;
            winner = unit1;
            loser = unit2;
            if (unit2TotalHP <= unit1FinalDmg && unit1.equals("Baneling")) {
                result = "Both units blow up due to the Baneling explosion!";
                winner = unit1;
                loser = unit2;
                unit2TimeTillDead = 0.0;
                hpRemaining = Integer.toString(0);
                winnerAttacksDealt = 1;
                loserAttacksDealt = 0;
            }
            time = unit2TimeTillDead;
            if (unit2HitsTillDead == 1) {
                time = 0.0;
            }
        }
        if (unit1Peaceful && !unit2Peaceful) {
            result = "The " + unit2 + " wins, as the " + unit1 + " can't deal damage!";
            hpRemaining = Integer.toString(unit2TotalHP);
            winnerAttacksDealt = unit1HitsTillDead;
            loserAttacksDealt = 0;
            winner = unit2;
            loser = unit1;
            if (unit1TotalHP <= unit2FinalDmg && unit2.equals("Baneling")) {
                result = "Both units blow up due to the Baneling explosion!";
                winner = unit2;
                loser = unit1;
                unit1TimeTillDead = 0.0;
                hpRemaining = Integer.toString(0);
                winnerAttacksDealt = 1;
                loserAttacksDealt = 0;
            }
            time = unit1TimeTillDead;
            if (unit1HitsTillDead == 1) {
                time = 0.0;
            }
        }
        if (unit1LifeSpan != null && winner.equals(unit1)) {
            result += "  The " + winner + " eventually expires " + (unit1LifeSpan - time) + " seconds after the battle.";
        }
        if (unit2LifeSpan != null && winner.equals(unit2)) {
            result += "  The " + winner + " eventually expires " + (unit2LifeSpan - time) + " seconds after the battle.";
        }
        result += "\n" + "HP Remaining: " + hpRemaining;
        result += "\n" + "Attacks dealt by the " + winner + ": " + winnerAttacksDealt;
        result += "\n" + "Attacks dealt by the " + loser + ": " + loserAttacksDealt;
        if (time == 999999.7) {
            result += "\n" + "Time of battle: it continues infinitely";
        }
        else {
            result += "\n" + "Time of battle: " + df.format(time) + " seconds";
        }
        result += "\n" + "Unit 1 starting HP: " + unit1TotalHP + "   Unit 2 starting HP: " + unit2TotalHP;

        // Testing tags:   + " " + unit1FinalDmg + " " + unit2FinalDmg + " "+ unit1FinalAttackSpeed + " " + unit2FinalAttackSpeed + " " + unit1HitsTillDead+ " " + unit2HitsTillDead
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.unit_vs_units);

        clear = findViewById(R.id.clear);
        calculate = findViewById(R.id.calculate);
        results = findViewById(R.id.resultsView);
        instructions = findViewById(R.id.instructions);
        instructions2 = findViewById(R.id.instructions2);
        unitOne = findViewById(R.id.unit1Group);
        unitTwo = findViewById(R.id.unit2Group);

        unit1Zerg = findViewById(R.id.Zerg);
        unit1Protoss = findViewById(R.id.Protoss);
        unit1Terran = findViewById(R.id.Terran);

        unit2Zerg = findViewById(R.id.zerg);
        unit2Protoss = findViewById(R.id.protoss);
        unit2Terran = findViewById(R.id.terran);

        selectionError = 0;

        unit1Name = findViewById(R.id.unit1Name);
        unit1AttackUps = findViewById(R.id.unit1AttackUps);
        unit1ArmorUps = findViewById(R.id.unit1ArmorUps);

        unit2Name = findViewById(R.id.unit2Name);
        unit2AttackUps = findViewById(R.id.unit2AttackUps);
        unit2ArmorUps = findViewById(R.id.unit2ArmorUps);
        unit2Quantity = findViewById(R.id.unit2Quantity);

        unitNameArray = new String[]{"Unit Name","Adept","Archon","Auto-Turret","Baneling", "Banshee", "Battlecruiser","Brood Lord","Carrier","Changeling","Colossus","Corruptor", "Cyclone",
                "Dark Templar","Disruptor","Drone","Ghost", "Hellbat", "Hellion","High Templar","Hydralisk","Immortal","Infested Terran","Infestor","Interceptor","Larva", "Liberator (defender mode)",
                "Liberator (fighter mode)","Locust", "Lurker", "Marauder", "Marine", "Medivac", "Missile Turret","Mothership", "MULE","Mutalisk","Nydus Worm","Observer","Oracle","Overseer","Phoenix",
                "Photon Cannon","Planetary Fortress","Probe","Queen","Ravager", "Raven", "Reaper","Roach", "SCV","Sentry", "Siege Tank (sieged)", "Siege Tank (tank mode)","Spine Crawler","Stalker",
                "Swarm Host","Tempest","Thor (explosive)", "Thor (high impact)","Ultralisk", "Viking (fighter mode)", "Viking (assault mode)","Viper","Void Ray","Warp Prism", "Widow Mine","Zealot","Zergling"};

//        unit2NameArray = new String[]{"Unit 2 Name","Adept","Archon","Auto-Turret","Baneling", "Banshee", "Battlecruiser","Brood Lord","Carrier","Changeling","Colossus","Corruptor", "Cyclone",
//                "Dark Templar","Disruptor","Drone","Ghost", "Hellbat", "Hellion","High Templar","Hydralisk","Immortal","Infested Terran","Infestor","Interceptor","Larva", "Liberator (defender mode)",
//                "Liberator (fighter mode)","Locust", "Lurker", "Marauder", "Marine", "Medivac", "Missile Turret","Mothership", "MULE","Mutalisk","Nydus Worm","Observer","Oracle","Overseer","Phoenix",
//                "Photon Cannon","Planetary Fortress","Probe","Queen","Ravager", "Raven", "Reaper","Roach", "SCV","Sentry", "Siege Tank (sieged)", "Siege Tank (tank mode)","Spine Crawler","Stalker",
//                "Swarm Host","Tempest","Thor (explosive)", "Thor (high impact)","Ultralisk", "Viking (fighter mode)", "Viking (assault mode)","Viper","Void Ray","Warp Prism", "Widow Mine","Zealot","Zergling"};

        terranUnitArrray = new String[]{"Auto-Turret", "Banshee", "Battlecruiser", "Cyclone", "Ghost", "Hellbat", "Hellion", "Liberator (defender mode)", "Liberator (fighter mode)", "Marauder",
                "Marine", "Medivac", "Missile Turret", "MULE", "Planetary Fortress", "Raven", "Reaper", "SCV", "Siege Tank (sieged)", "Siege Tank (tank mode)", "Thor (explosive)", "Thor (high impact)",
                "Viking (fighter mode)", "Viking (assault mode)", "Widow Mine"};

        protossUnitArrray = new String[]{"Adept","Archon", "Carrier", "Colossus", "Dark Templar", "Disruptor", "High Templar", "Immortal", "Interceptor", "Mothership", "Observer",
                "Oracle", "Phoenix", "Photon Cannon", "Probe", "Sentry", "Stalker", "Tempest", "Void Ray", "Warp Prism", "Zealot"};

        zergUnitArrray = new String[]{"Baneling","Brood Lord", "Changeling", "Corruptor", "Drone", "Hydralisk", "Infested Terran", "Infestor", "Larva", "Locust", "Lurker",
                "Mutalisk", "Nydus Worm", "Overseer", "Queen", "Ravager", "Roach", "Spine Crawler", "Swarm Host", "Ultralisk", "Viper", "Zergling"};

        unitUpgrades = new String[]{"0", "1", "2", "3"};

        unitQuantity = new String[]{"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};

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

        final ArrayAdapter<String> adapterUnitName = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, unitNameArray);
        //final ArrayAdapter<String> adapterUnitName2 = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, unit2NameArray);

        final ArrayAdapter<String> adapterTerranUnit = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, terranUnitArrray);
        final ArrayAdapter<String> adapterProtossUnit = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, protossUnitArrray);
        final ArrayAdapter<String> adapterZergUnit = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, zergUnitArrray);

        ArrayAdapter<String> adapterUpgrades = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, unitUpgrades);
        ArrayAdapter<String> adapterQuantity = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, unitQuantity);

        unit1Name.setAdapter(adapterUnitName);
        unit1Name.setSelection(0);
        final View root = unit1Name.getRootView();

        unit2Name.setAdapter(adapterUnitName);
        unit2Name.setSelection(0);

        final GradientDrawable gd = new GradientDrawable();
        gd.setCornerRadius(8);
        gd.setStroke(2, Color.parseColor("#000000"));

        final GradientDrawable gd2 = new GradientDrawable();
        gd2.setCornerRadius(8);
        gd2.setStroke(2, Color.parseColor("#000000"));

        unitOne = findViewById(R.id.unit1Group);
        unitOne.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (unit1Terran.isChecked()) {
                    unit1Name.setAdapter(adapterTerranUnit);
                    gd.setColor(Color.parseColor("#fa8072"));
                    instructions.setBackground(gd);
                }
                if (unit1Zerg.isChecked()) {
                    unit1Name.setAdapter(adapterZergUnit);
                    gd.setColor(Color.parseColor("#90ee90"));
                    instructions.setBackground(gd);
                }
                if (unit1Protoss.isChecked()) {
                    unit1Name.setAdapter(adapterProtossUnit);
                    gd.setColor(Color.parseColor("#a9d6e5"));
                    instructions.setBackground(gd);
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
                }
                if (unit2Zerg.isChecked()) {
                    unit2Name.setAdapter(adapterZergUnit);
                    gd2.setColor(Color.parseColor("#90ee90"));
                    instructions2.setBackground(gd2);
                }
                if (unit2Protoss.isChecked()) {
                    unit2Name.setAdapter(adapterProtossUnit);
                    gd2.setColor(Color.parseColor("#a9d6e5"));
                    instructions2.setBackground(gd2);
                }
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
                unit2Quantity.setSelection(0);
                results.setText("");
                instructions.setBackgroundResource(R.drawable.text_view_corners);
                instructions2.setBackgroundResource(R.drawable.text_view_corners);
            }
        });

        unit1AttackUps.setAdapter(adapterUpgrades);
        unit1AttackUps.setSelection(0);

        unit1ArmorUps.setAdapter(adapterUpgrades);
        unit1ArmorUps.setSelection(0);

        unit2AttackUps.setAdapter(adapterUpgrades);
        unit2AttackUps.setSelection(0);

        unit2ArmorUps.setAdapter(adapterUpgrades);
        unit2ArmorUps.setSelection(0);

        unit2Quantity.setAdapter(adapterQuantity);
        unit2Quantity.setSelection(0);


        calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
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
                unit1TotalHP = 0;
                unit1LifeSpan = null;

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
                unit2TotalHP = 0;
                unit2LifeSpan = null;
                infoSetter();
                if (unit1Name.getSelectedItem().toString().equals("Unit Name") || unit1Name.getSelectedItem().toString().equals("") || unit2Name.getSelectedItem().toString().equals("Unit Name") || unit2Name.getSelectedItem().toString().equals("")) {
                    selectionError = 1;
                }
                else {
                    selectionError = 0;
                }
                if (selectionError == 0) {
                    resultMaker();
                    results.setText(result);
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
    }
}