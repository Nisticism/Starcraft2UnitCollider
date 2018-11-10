package com.Icantbelievedefaultisexample.nistic.starcraft2unitcollider;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.io.ByteArrayOutputStream;


public class RecyclerAdapt extends RecyclerView.Adapter<RecyclerAdapt.MyViewHolder> {
    private unitItem[] unitArray;
    private Context mContext;
    private final View.OnClickListener cardClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {

        }
    };

    public static class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView unitTitle;
        public ImageView unitIcon;
        public CardView card;
        public MyViewHolder(View v) {
            super(v);
            unitTitle = (TextView) v.findViewById(R.id.unitName);
            unitIcon = (ImageView) v.findViewById(R.id.unitImage);
            card = v.findViewById(R.id.card);
            int screenHeight = getHeight();
            int screenWidth = getWidth();
            card.getLayoutParams().height = (int)(.19 * screenHeight);
            card.getLayoutParams().width = (int)(.3 * screenWidth);
            unitTitle.getLayoutParams().height = (int) (0.03 *screenHeight);
            unitIcon.getLayoutParams().height = (int) (0.15 * screenHeight);
        }
    }

    public RecyclerAdapt(unitItem[] uArray, Context context) {
        unitArray = uArray;
        mContext = context;
    }

    @Override
    public RecyclerAdapt.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        // create a new view
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.horizontal_unit_profile, parent, false);
        v.setOnClickListener(cardClickListener);
        MyViewHolder vh = new MyViewHolder(v);
        return vh;
    }

    // Replace the contents of a view (invoked by the layout manager)
    @Override
    public void onBindViewHolder(MyViewHolder holder, final int position) {
        //Log.d(TAG, "onBindViewHolder: called");
        // - get element from your dataset at this position
        // - replace the contents of the view with that element
        holder.unitTitle.setText(unitArray[position].getUnitName());
        holder.unitIcon.setImageResource(unitArray[position].getUnitImage());
        holder.card.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(mContext, unitProfileMaker.class);
                intent.putExtra("image_value", unitArray[position].getUnitImage());
                intent.putExtra("name_value", unitArray[position].getUnitName());
                intent.putExtra("type_value", unitArray[position].getUnitDescrip());
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                mContext.startActivity(intent);
            }
        });
    }

    // Return the size of your dataset (invoked by the layout manager)
    @Override
    public int getItemCount() {
        return (unitArray.length);
    }

    public static Integer getHeight() {
        return Resources.getSystem().getDisplayMetrics().heightPixels;
    }
    public static Integer getWidth() {
        return Resources.getSystem().getDisplayMetrics().widthPixels;
    }

    public void setmContext(Context mContext) {
        this.mContext = mContext;
    }
}