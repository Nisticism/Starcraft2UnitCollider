package com.Icantbelievedefaultisexample.nistic.starcraft2unitcollider;

import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.support.design.widget.BottomNavigationView;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.Spinner;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class TakeQuiz extends MainActivity {

    Button home;
    Button clear;
    Button begin;
    Spinner time;
    Spinner content;
    Spinner questions;
    CheckBox terranCheck;
    CheckBox zergCheck;
    CheckBox protossCheck;
    RadioButton allRaces;
    Quiz customQuiz;

    Cursor res;

    String[] timeValues;
    String[] contentValues;
    String[] questionCounts;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.take_quiz);

        home = findViewById(R.id.home);
        clear = findViewById(R.id.clear);
        begin = findViewById(R.id.begin);
        time = findViewById(R.id.timeLimit);
        content = findViewById(R.id.content);
        questions = findViewById(R.id.questionCount);
        terranCheck = findViewById(R.id.checkTerran);
        zergCheck = findViewById(R.id.checkZerg);
        protossCheck = findViewById(R.id.checkProtoss);
        allRaces = findViewById(R.id.radioAll);

        timeValues = new String[]{"None", "1 minute", "5 minutes", "10 minutes", "15 minutes", "20 minutes", "5 seconds per question", "10 seconds per question", "20 seconds per question", "30 seconds per question", "1 minute per question"};
        contentValues = new String[]{"Random", "Any Unit Statistics", "Unit HP, Attack, and Armor", "Unit Counters or Matchups", "Which Unit Wins?", "Unit Attributes", "Obscure Statistics", "Map Quiz", "Lore"};
        questionCounts = new String[]{"5", "10", "15", "20", "30", "50", "100"};

        final ArrayAdapter<String> timeAdapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item,timeValues);
        final ArrayAdapter<String> contentAdapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item,contentValues);
        final ArrayAdapter<String> questionAdapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item,questionCounts);

        time.setAdapter(timeAdapter);
        content.setAdapter(contentAdapter);
        questions.setAdapter(questionAdapter);

        questions.setSelection(3);

        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
                startActivity(new Intent(getBaseContext(), MainActivity.class));
                overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
            }
        });

        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                time.setSelection(0);
                content.setSelection(0);
                questions.setSelection(3);
                terranCheck.setChecked(false);
                zergCheck.setChecked(false);
                protossCheck.setChecked(false);
                allRaces.setChecked(false);
            }
        });

        allRaces.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (allRaces.isChecked()) {
                    terranCheck.setChecked(true);
                    zergCheck.setChecked(true);
                    protossCheck.setChecked(true);
                }
            }
        });

        terranCheck.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (!terranCheck.isChecked() && zergCheck.isChecked() && protossCheck.isChecked()) {
                    allRaces.setChecked(false);
                }
                else if (terranCheck.isChecked() && zergCheck.isChecked() && protossCheck.isChecked()) {
                    allRaces.setChecked(true);
                }
            }
        });

        zergCheck.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (terranCheck.isChecked() && !zergCheck.isChecked() && protossCheck.isChecked()) {
                    allRaces.setChecked(false);
                }
                else if (terranCheck.isChecked() && zergCheck.isChecked() && protossCheck.isChecked()) {
                    allRaces.setChecked(true);
                }
            }
        });

        protossCheck.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (terranCheck.isChecked() && zergCheck.isChecked() && !protossCheck.isChecked()) {
                    allRaces.setChecked(false);
                }
                else if (terranCheck.isChecked() && zergCheck.isChecked() && protossCheck.isChecked()) {
                    allRaces.setChecked(true);
                }
            }
        });

        begin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Intent intent = new Intent(TakeQuiz.this, QuizQuestionProfile.class);
//                intent.putExtra("quiz_question_answer", buildFirstQuestionAnswers());
//                intent.putExtra("current_question", 1);
//                intent.putExtra("timer", time.getSelectedItem().toString());
//                startActivity(intent);
            }
        });

        res = unitDB.getAllData();


        BottomNavigationView navigation = findViewById(R.id.navigation);

        if (sdkNum < 26) {
            home.setPadding(0,0,0,0);
            clear.setPadding(0,0,0,0);
            begin.setPadding(0,0,0,0);

            if (pixelDensity < 2.1) {
                allRaces.setTextSize(11);
                protossCheck.setTextSize(11);
                terranCheck.setTextSize(11);
                zergCheck.setTextSize(11);

                navigation.setItemTextAppearanceInactive(R.style.BottomNavigationViewLow);
                navigation.setItemTextAppearanceActive(R.style.BottomNavigationViewActiveLow);
            }
        }
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
        navigation.getMenu().getItem(2).setChecked(true);
    }

    public String getRace() {
        String race = "";
        if (allRaces.isChecked()) {
            race = "all";
        }
        else if (terranCheck.isChecked() && zergCheck.isChecked()) {
            race = "terranzerg";
        }
        else if (zergCheck.isChecked() && protossCheck.isChecked()) {
            race = "zergprotoss";
        }
        else if (protossCheck.isChecked() && terranCheck.isChecked()) {
            race = "protossterran";
        }
        else if (terranCheck.isChecked()) {
            race = "terran";
        }
        else if (zergCheck.isChecked()) {
            race = "zerg";
        }
        else if (protossCheck.isChecked()) {
            race = "protoss";
        }

        return race;
    }

//    contentValues = new String[]{"Random", "Any Unit Statistics", "Unit HP, Attack, and Armor", "Unit Counters or Matchups",
//            "Which Unit Wins?", "Unit Attributes", "Obscure Statistics", "Map Quiz", "Lore"};

    public QuestionAnswer nextQuestionAnswer(Integer questionNumber, String content, String race) {
        QuestionAnswer qa = new QuestionAnswer(null, null);

        //  Use of ArrayLists makes this much more flexible in case I add more columes to the database, or just change the function to use adding, if two fields are mutually exclusive,
        //  Such as "Lore" and "Which Unit Wins?".  Or if Blizzard adds more units to each race, I don't worry about array sizes/initializations.

        ArrayList<Integer> possibleUnitsByRace = new ArrayList<>();
        ArrayList<Integer> possibleDataPointsForAnswers = new ArrayList<>();
        ArrayList<Integer> anyUnitStats = new ArrayList<>(Arrays.asList(1, 2, 4));
        String answer = "";

        //  2 switch cases will determine the exact answer, first the race choices, then the data-points within those units.  In other words, first the row, then the column.

        switch (race) {
            case "all":
                for (int i = 1; i <= res.getCount(); i++) {
                    possibleUnitsByRace.add(i);
                }
            case "terranzerg":
                res.moveToFirst();
                for (int i = 0; i < res.getCount(); i++) {
                    if (res.getString(30).equals("Terran") || res.getString(30).equals("Zerg")) {
                        possibleUnitsByRace.add(res.getPosition() + 1);
                    }
                    res.moveToNext();
                }
            case "zergprotoss":
                res.moveToFirst();
                for (int i = 0; i < res.getCount(); i++) {
                    if (res.getString(30).equals("Zerg") || res.getString(30).equals("Protoss")) {
                        possibleUnitsByRace.add(res.getPosition() + 1);
                    }
                    res.moveToNext();
                }
            case "protossterran":
                res.moveToFirst();
                for (int i = 0; i < res.getCount(); i++) {
                    if (res.getString(30).equals("Protoss") || res.getString(30).equals("Terran")) {
                        possibleUnitsByRace.add(res.getPosition() + 1);
                    }
                    res.moveToNext();
                }
            case "terran":
                res.moveToFirst();
                for (int i = 0; i < res.getCount(); i++) {
                    if (res.getString(30).equals("Terran")) {
                        possibleUnitsByRace.add(res.getPosition() + 1);
                    }
                    res.moveToNext();
                }
            case "zerg":
                res.moveToFirst();
                for (int i = 0; i < res.getCount(); i++) {
                    if (res.getString(30).equals("Zerg")) {
                        possibleUnitsByRace.add(res.getPosition() + 1);
                    }
                    res.moveToNext();
                }
            case "protoss":
                res.moveToFirst();
                for (int i = 0; i < res.getCount(); i++) {
                    if (res.getString(30).equals("Protoss")) {
                        possibleUnitsByRace.add(res.getPosition() + 1);
                    }
                    res.moveToNext();
                }

        }

        switch (content) {
            case "Any Unit Statistics":
                possibleDataPointsForAnswers = anyUnitStats;
                qa.setAnswer("");

            case "Unit HP, Attack, and Armor":

        }

        //  The ideal is randomize the unit from possibles, and select only different units until you have to start using the same unit for more data.  Loop until complete.

        ArrayList<Integer> finalRaceOptions = new ArrayList<>();
        ArrayList<String> allAnswers = new ArrayList<>();
        Random rand = new Random();

        for (int i = 0; i < possibleUnitsByRace.size(); i++) {
            Integer raceRand = rand.nextInt(possibleUnitsByRace.size());
            Integer dataRand = rand.nextInt(possibleDataPointsForAnswers.size());

            //  Move the cursor to the right row
            res.moveToPosition(possibleUnitsByRace.get(raceRand - 1));

            //  Add the random column to the final answers ArrayList
            allAnswers.add(res.getString(dataRand - 1));

            //  Get rid of the value of the race from the previous array so that unit isn't chosen for the remainder of the loop.  If it's size is 1, set it to the new array.
            finalRaceOptions.add(possibleUnitsByRace.get(raceRand - 1));

            if (possibleUnitsByRace.size() > 1) {
                possibleUnitsByRace.remove(raceRand - 1);
            } else {
                possibleUnitsByRace = finalRaceOptions;
            }
        }

        qa.setAnswer(allAnswers.get(0));
        return qa;
    }

    public ArrayList<QuestionAnswer> buildFirstQuestionAnswers() {

        //  Create what you return
        ArrayList<QuestionAnswer> questionAnswers = new ArrayList<QuestionAnswer>(){};

        Integer questionCount = Integer.parseInt(questions.getSelectedItem().toString());
        for (int i = 1; i <= questionCount; i++) {

            //  Add to it
            questionAnswers.add(nextQuestionAnswer(i, content.toString(), getRace()));
        }

        //  Return the array to send off to the quiz profile activity
        return questionAnswers;
    }

    public Quiz buildQuiz(Integer questions, String timeLimit, ArrayList<QuestionAnswer> questionAnswerArrayList) {
        Quiz newQuiz;
        newQuiz = new Quiz(questions, questionAnswerArrayList, timeLimit);
        return newQuiz;
    }
}
