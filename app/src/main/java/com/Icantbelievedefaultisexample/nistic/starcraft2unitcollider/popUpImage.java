package com.Icantbelievedefaultisexample.nistic.starcraft2unitcollider;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.ImageView;

public class popUpImage extends MainActivity {
    ImageView image;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.pop_up_image);

        image = findViewById(R.id.iconView);
        Bundle extras = getIntent().getExtras();
        int u = extras.getInt("picture");

        Resources res = getBaseContext().getResources();
        Bitmap bmp = BitmapFactory.decodeResource(res, u);
        image.setImageBitmap(bmp);

        DisplayMetrics dm = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dm);

        int width = dm.widthPixels;
        int height = dm.heightPixels;

        getWindow().setLayout((int)(width*0.7), (int)(height*0.4));
    }
}