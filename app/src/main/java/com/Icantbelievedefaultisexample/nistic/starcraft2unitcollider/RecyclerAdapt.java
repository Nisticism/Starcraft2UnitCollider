package com.Icantbelievedefaultisexample.nistic.starcraft2unitcollider;

//  This class handles landscape orientation for the Unit Database class, using the portrait version of unit_information_database.xml
//  If only I could get the orientation in the adapter itself, I could combine the two classes (RecyclerAdapt and RecyclerAdapt2)

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class RecyclerAdapt extends RecyclerView.Adapter<RecyclerAdapt.MyViewHolder> {
    private unitItem[] unitArray;
    private Context mContext;

    public static class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView unitTitle;
        public ImageView unitIcon;
        public CardView card;
        public MyViewHolder(View v) {
            super(v);
            unitTitle = v.findViewById(R.id.unitName);
            unitIcon = v.findViewById(R.id.unitImage);
            card = v.findViewById(R.id.card);
            int screenHeight = getHeight();
            int screenWidth = getWidth();
            card.getLayoutParams().height = (int)(.22 * screenHeight);
            card.getLayoutParams().width = (int)(.31 * screenWidth);
            //unitTitle.getLayoutParams().height = (int) (0.03 *screenHeight);
            unitIcon.getLayoutParams().height = (int) (0.17 * screenHeight);
        }
    }

    public RecyclerAdapt(unitItem[] uArray, Context context) {
        unitArray = uArray;
        mContext = context;
    }

    @Override
    public RecyclerAdapt.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.horizontal_unit_profile, parent, false);
        MyViewHolder vh = new MyViewHolder(v);
        return vh;
    }

    // Replace the contents all the new Views (horizontal_unit_profile.xml) made by MyViewHolder (invoked by the layout manager), set each card to be able to be clicked on.
    // It even passes the type, which isn't visible on the card itself.  The type could also be retrieved by the Database, which the rest of the profile maker uses.
    @Override
    public void onBindViewHolder(MyViewHolder holder, final int position) {
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