package com.Icantbelievedefaultisexample.nistic.starcraft2unitcollider;

import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.drawable.BitmapDrawable;
import android.media.Image;
import android.os.Build;
import android.os.Bundle;
import android.support.constraint.ConstraintLayout;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.content.res.AppCompatResources;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;

import java.text.DecimalFormat;

public class AllInteractions extends MainActivity {

    private static final String TAG = "Activity";
    private Float pixelDensity = 0.0f;
    Button home;
    Button scrollStart;
    Button scrollLeft;
    Button scrollRight;
    Button scrollEnd;
    Button scrollTop;
    Button scrollBot;
    Button highlight;
    Button highlightHoriz;
    Button clear;
    Button next;

    HorizontalScrollView horizScroll;
    ScrollView vertScroll;
    ImageView allInteractions;
    Integer currentX;
    Integer currentY;
    Integer x2;
    Integer y2;
    Bitmap bm;
    Paint p = new Paint();

    Integer imageCounter;

    //TextView tester;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.all_interactions);
        allInteractions = findViewById(R.id.allInteractionsImage);
        //allInteractions.scrollTo(1, 1);
        imageCounter = 1;
        pixelDensity = getResources().getDisplayMetrics().density;

        home = findViewById(R.id.home);
        if (pixelDensity < 2.1) {
            home.setTextSize(12);
        }
        scrollStart = findViewById(R.id.scrollStart);
        scrollLeft = findViewById(R.id.scrollLeft);
        scrollRight = findViewById(R.id.scrollRight);
        scrollEnd = findViewById(R.id.scrollEnd);
        scrollTop = findViewById(R.id.scrollTop);
        scrollBot = findViewById(R.id.scrollBot);
        highlight = findViewById(R.id.highlight);
        if (pixelDensity < 2.1) {
            highlight.setTextSize(8);
        }
        highlightHoriz = findViewById(R.id.highlightHoriz);
        if (pixelDensity < 2.1) {
            highlightHoriz.setTextSize(8);
        }
        clear = findViewById(R.id.clear);
        if (pixelDensity < 2.1) {
            clear.setTextSize(12);
        }
        next = findViewById(R.id.nextGraph);
        if (pixelDensity < 2.1) {
            next.setTextSize(12);
        }

        horizScroll = findViewById(R.id.horizScroll);
        vertScroll = findViewById(R.id.vertScroll);
        //tester = findViewById(R.id.tester);
        final DecimalFormat df = new DecimalFormat("#.###");

        //bm = ((BitmapDrawable)allInteractions.getDrawable()).getBitmap();
        //bm = ((BitmapDrawable) AppCompatResources.getDrawable(this, R.drawable.all_interactions)).getBitmap();

        Log.d(TAG, "drawXLine: " + getResources().getDisplayMetrics().density);

//        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
//            bm.setHeight(allInteractions.getHeight());
//        }
//        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
//            bm.setWidth(allInteractions.getWidth());
//        }
        //final Bitmap mutableBitmap = bm.copy(Bitmap.Config.ARGB_8888, true);

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
                clearCanvas();
            }
        });

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nextGraph();
            }
        });


        //  OnClickListeners for scrolling buttons:

        scrollStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Integer currentY = vertScroll.getScrollY();
                horizScroll.smoothScrollTo(0,currentY);

            }
        });

        scrollEnd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Integer currentY = vertScroll.getScrollY();
                int totalWidth = horizScroll.getChildAt(0).getWidth();
                horizScroll.smoothScrollTo(totalWidth,currentY);

            }
        });

        scrollLeft.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Integer currentY = vertScroll.getScrollY();
                Integer currentX = horizScroll.getScrollX();
                horizScroll.scrollTo((int)(currentX - 39.62 * pixelDensity),currentY);

            }
        });
        scrollRight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Integer currentY = vertScroll.getScrollY();
                Integer currentX = horizScroll.getScrollX();
                horizScroll.scrollTo((int)(currentX + 39.62 * pixelDensity),currentY);

            }
        });
        scrollTop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Integer currentX = horizScroll.getScrollX();
                vertScroll.smoothScrollTo(currentX,0);

            }
        });
        scrollBot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Integer currentX = horizScroll.getScrollX();
                int totalHeight = vertScroll.getChildAt(0).getHeight();
                vertScroll.smoothScrollTo(currentX,totalHeight);

            }
        });

        //  Vertical line across
        highlight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DisplayMetrics dm = new DisplayMetrics();
                getWindowManager().getDefaultDisplay().getMetrics(dm);
                Double x = 1.0 * dm.widthPixels * pixelDensity;
                Double totalWidth = 1.0 * horizScroll.getChildAt(0).getWidth() * pixelDensity - (0.93 * x);
                Double amountScrolled = 1.0 * horizScroll.getScrollX() * pixelDensity;
                Double percentScrolled = amountScrolled / totalWidth;
                //tester.setText(df.format(percentScrolled) + " " + totalWidth + " " + amountScrolled);
                currentX = (int)(76.95 * pixelDensity) + (int)Math.round(percentScrolled * 1289 * pixelDensity);
                int orientation = getResources().getConfiguration().orientation;
                if (orientation == Configuration.ORIENTATION_LANDSCAPE) {
                    currentX = (int)(125 * pixelDensity) + (int)Math.round(percentScrolled * 1202 * pixelDensity);
                }
                drawXLine();
            }
        });

        //  Horizontal line across
        highlightHoriz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DisplayMetrics dm = new DisplayMetrics();
                getWindowManager().getDefaultDisplay().getMetrics(dm);
                Double y = 1.0 * dm.heightPixels * pixelDensity;
                Double totalHeight = 1.0 * vertScroll.getChildAt(0).getHeight() * pixelDensity - (0.72 * y);
                Double amountScrolled = 1.0 * vertScroll.getScrollY() * pixelDensity;
                Double percentScrolled = amountScrolled / totalHeight;
                //tester.setText(df.format(percentScrolled) + " " + totalWidth + " " + amountScrolled);
                currentY = (int)(80.5 * pixelDensity) + (int)Math.round(percentScrolled * 572.95 * pixelDensity);
                int orientation = getResources().getConfiguration().orientation;
                if (orientation == Configuration.ORIENTATION_LANDSCAPE) {
                    currentY = (int)(44.5 * pixelDensity) + (int)Math.round(percentScrolled * 639.0 * pixelDensity);
                }
                drawYLine();
            }
        });

        if (sdkNum < 26) {
            home.setPadding(0,0,0,0);
            clear.setPadding(0,0,0,0);
            next.setPadding(0,0,0,0);
            highlightHoriz.setPadding(0,0,0,0);
            highlight.setPadding(0,0,0,0);

            scrollStart.setPadding(0,0,0,0);
            scrollTop.setPadding(0,0,0,0);
            scrollEnd.setPadding(0,0,0,0);
            scrollBot.setPadding(0,0,0,0);
            scrollLeft.setPadding(0,0,0,0);
            scrollRight.setPadding(0,0,0,0);
        }


        BottomNavigationView navigation = findViewById(R.id.navigation);
        if (pixelDensity < 2.1) {
            navigation.setItemTextAppearanceInactive(R.style.BottomNavigationViewLow);
            navigation.setItemTextAppearanceActive(R.style.BottomNavigationViewActiveLow);
        }
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
        navigation.getMenu().getItem(3).setChecked(true);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        switch (event.getAction()) {
            case MotionEvent.ACTION_DOWN: {
                currentX = (int) event.getRawX();
                currentY = (int) event.getRawY();
                break;
            }

            case MotionEvent.ACTION_MOVE: {
                x2 = (int) event.getRawX();
                y2 = (int) event.getRawY();
                allInteractions.scrollBy(currentX - x2 , currentY - y2);
                currentX = x2;
                currentY = y2;
                break;
            }
            case MotionEvent.ACTION_UP: {
                break;
            }
        }
        return true;
    }

    //  shorter, vertical, fatter
    public void drawXLine() {

        //  Fixes crash if getDrawable is null
        if (allInteractions.getDrawable() != null) {
            bm = ((BitmapDrawable) allInteractions.getDrawable()).getBitmap();
        }
        else {
            if (imageCounter == 1) {
                bm = BitmapFactory.decodeResource(this.getResources(),
                        R.drawable.sc2_graph1_60_75);
            }
            else if (imageCounter == 2) {
                bm = BitmapFactory.decodeResource(this.getResources(),
                        R.drawable.sc2_graph2_60_75_22);
            }
        }
        final Bitmap mutableBitmap = bm.copy(Bitmap.Config.ARGB_8888, true);
        final Canvas canvas = new Canvas(mutableBitmap);
        canvas.drawBitmap(mutableBitmap, 0, 0, null);
        p.setColor(Color.BLUE);
        p.setStyle(Paint.Style.STROKE);
        p.setStrokeWidth((int)12 * pixelDensity);
        p.setAlpha(45);
        //canvas.drawBitmapMesh(mutableBitmap, allInteractions.getWidth(), allInteractions.getHeight(), Colors2, 0, Colors , 0, p);
        canvas.drawLine(currentX, (int)(76.57 * pixelDensity), currentX, (int)675.05 * pixelDensity, p);

        // Attach the new canvas to the imageview
        allInteractions.setImageDrawable(new BitmapDrawable(getResources(), mutableBitmap));
        Log.d(TAG, "drawXLine: " + getResources().getDisplayMetrics().density);
    }

    //  longer, horizontal, skinnier
    public void drawYLine() {

        //  Fixes crash if getDrawable is null
        if (allInteractions.getDrawable() != null) {
            bm = ((BitmapDrawable) allInteractions.getDrawable()).getBitmap();
        }
        else {
            if (imageCounter == 1) {
                bm = BitmapFactory.decodeResource(this.getResources(),
                        R.drawable.sc2_graph1_60_75);
            }
            else if (imageCounter == 2) {
                bm = BitmapFactory.decodeResource(this.getResources(),
                        R.drawable.sc2_graph2_60_75_22);
            }
        }
        final Bitmap mutableBitmap = bm.copy(Bitmap.Config.ARGB_8888, true);
        final Canvas canvas = new Canvas(mutableBitmap);
        canvas.drawBitmap(mutableBitmap, 0, 0, null);
        p.setColor(Color.BLUE);
        p.setStyle(Paint.Style.STROKE);
        p.setStrokeWidth((int)7.7 * pixelDensity);
        p.setAlpha(45);
        //canvas.drawBitmapMesh(mutableBitmap, allInteractions.getWidth(), allInteractions.getHeight(), Colors2, 0, Colors , 0, p);
        canvas.drawLine((int)(70.1 * pixelDensity), currentY, (int)1010 * pixelDensity, currentY, p);

        // Attach the new canvas to the imageview
        allInteractions.setImageDrawable(new BitmapDrawable(getResources(), mutableBitmap));
    }

    public void clearCanvas() {
        if (imageCounter == 1) {
            allInteractions.setImageResource(R.drawable.sc2_graph1_60_75);
        }
        else if (imageCounter == 2) {
            allInteractions.setImageResource(R.drawable.sc2_graph2_60_75_22);
        }
    }

    private void nextGraph() {
        if (imageCounter == 1) {
            imageCounter += 1;
            allInteractions.setImageResource(R.drawable.sc2_graph2_60_75_22);
        }
        else if (imageCounter == 2) {
            imageCounter = 1;
            allInteractions.setImageResource(R.drawable.sc2_graph1_60_75);
        }
    }


}
