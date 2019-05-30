package com.Icantbelievedefaultisexample.nistic.unused_classes;

import android.content.Context;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.util.AttributeSet;
import android.util.Log;
import android.widget.ListPopupWindow;
import android.widget.Spinner;

//  This unused class works, but will crash on older devices despite the requires API tag.  In order to avoid this I would need to make two different types of spinners
//  and in different layouts to assign to the single element in the XML file, unless I was able to overlap them.  It's probably better to not use this class until I can make
//  it not crash with older devices.  Interestingly, Kitkat is version 4.4, but crashes were occurring up until 5.0.  Example of the crash cluster below:

//  Samsung Galaxy A3 (a3lte), Android 5.0
//  Report 1
//
//java.lang.NullPointerException:
//  at com.Icantbelievedefaultisexample.nistic.starcraft2unitcollider.VisibleScrollbarSpinner.performClick (VisibleScrollbarSpinner.java:24)
//  at android.view.View$PerformClick.run (View.java:20154)
//  at android.os.Handler.handleCallback (Handler.java:739)
//  at android.os.Handler.dispatchMessage (Handler.java:95)
//  at android.os.Looper.loop (Looper.java:135)
//  at android.app.ActivityThread.main (ActivityThread.java:5536)
//  at java.lang.reflect.Method.invoke (Native Method)
//  at java.lang.reflect.Method.invoke (Method.java:372)
//  at com.android.internal.os.ZygoteInit$MethodAndArgsCaller.run (ZygoteInit.java:1397)
//  at com.android.internal.os.ZygoteInit.main (ZygoteInit.java:1192)

import java.lang.reflect.Field;

public class VisibleScrollbarSpinner extends android.support.v7.widget.AppCompatSpinner {
    private static final String TAG = "Vis Scrollbar Spinner: ";
    @RequiresApi(api = Build.VERSION_CODES.KITKAT)
    @Override public boolean performClick() {
        final boolean superResult = super.performClick();

        try {
            final Field mPopupField = Spinner.class.getDeclaredField("mPopup");
            mPopupField.setAccessible(true);
            //noinspection ConstantConditions
            ((ListPopupWindow) mPopupField.get(this)).getListView().setScrollbarFadingEnabled(false);
            mPopupField.setAccessible(false);
        } catch (NoSuchFieldException | IllegalAccessException e) {
            Log.e(TAG, e.toString(), e);
        }

        return superResult;
    }

    public VisibleScrollbarSpinner(Context context) { super(context); }
    public VisibleScrollbarSpinner(Context context, int mode) { super(context, mode); }
    public VisibleScrollbarSpinner(Context context, AttributeSet attrs) { super(context, attrs); }
    public VisibleScrollbarSpinner(Context context, AttributeSet attrs, int defStyleAttr) { super(context, attrs, defStyleAttr); }
    public VisibleScrollbarSpinner(Context context, AttributeSet attrs, int defStyleAttr, int mode) { super(context, attrs, defStyleAttr, mode); }
}