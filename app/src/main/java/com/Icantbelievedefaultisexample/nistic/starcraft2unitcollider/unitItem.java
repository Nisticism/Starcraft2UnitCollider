package com.Icantbelievedefaultisexample.nistic.starcraft2unitcollider;

//  The simple "Unit Item" class to make instances of what is held in the spinners and also the cards.  The description is the unit type.  No need for setters.

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
