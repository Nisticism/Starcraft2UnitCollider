package com.Icantbelievedefaultisexample.nistic.starcraft2unitcollider;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.text.SpannableString;
import android.util.Log;

public class QuizQuestionProfile extends MainActivity {

    private static final String TAG = "Quiz Question Profile: ";

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.unit_profile);
        Log.d(TAG, "onCreate: started.");
    }

    private void getIncomingIntent() {
        Log.d(TAG, "Checking for incoming intents");
        if (getIntent().hasExtra("question_answer_array")) {
            Log.d(TAG, "Found extras");
            Bundle extras = getIntent().getExtras();
        }
    }
}
