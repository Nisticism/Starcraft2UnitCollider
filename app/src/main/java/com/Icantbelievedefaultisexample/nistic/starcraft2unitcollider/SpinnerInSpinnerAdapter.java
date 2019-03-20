package com.Icantbelievedefaultisexample.nistic.starcraft2unitcollider;

import android.app.ActivityManager;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

import static android.app.PendingIntent.getActivity;

public class SpinnerInSpinnerAdapter extends ArrayAdapter<Spinner> {

//    @NonNull
//    @Override
//    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
//        return initView(position, convertView, parent);
//    }
//
//    @Override
//    public View getDropDownView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
//        return initView(position, convertView, parent);
//    }

    public SpinnerInSpinnerAdapter(Context context, Spinner[] spinnerList) {
        super(context, 0, spinnerList);
    }

//    private View initView(int position, View convertView, ViewGroup parent) throws OutOfMemoryError {
//        try {
//            if (convertView == null) {
//                convertView = LayoutInflater.from(getContext()).inflate(
//                        R.layout.options_spinner, parent, false);
//            }
//
//            Spinner attackUps = convertView.findViewById(R.id.icon);
//            TextView unitName = convertView.findViewById(R.id.firstLine);
//            TextView unitDescrip = convertView.findViewById(R.id.secondLine);
//
//
//            if (currentItem != null) {
//                unitImage.setImageResource(currentItem.getUnitImage());
//                unitName.setText(currentItem.getUnitName());
//                unitDescrip.setText(currentItem.getUnitDescrip());
//            }
//            return convertView;
//        }
//        catch (OutOfMemoryError e) {
//            e.printStackTrace();
//            String toastMessage = "Not enough memory to load list";
//            Toast.makeText(getContext(), toastMessage, Toast.LENGTH_SHORT).show();
//        }
//        return convertView;
//    }
}
