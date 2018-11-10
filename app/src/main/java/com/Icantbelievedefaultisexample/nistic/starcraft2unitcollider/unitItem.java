package com.Icantbelievedefaultisexample.nistic.starcraft2unitcollider;

import android.content.Context;

public class unitItem {
    private String aUnitName;
    private String aUnitDescrip;
    private int aUnitImage;

    public unitItem(String firstLine, String secondLine, int icon) {
        aUnitName = firstLine;
        aUnitDescrip = secondLine;
        aUnitImage = icon;
    }

    public String getUnitName() {
        return aUnitName;
    }

    public String getUnitDescrip() {
        return aUnitDescrip;
    }

    public int getUnitImage() {
        return aUnitImage;
    }
}
