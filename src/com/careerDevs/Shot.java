package com.careerDevs;

public class Shot {
    String flavorName;
    double currentAmt;
    double amtPerDispense;
    double volume;

    public Shot(String flavorName, double currentAmt, double amtPerDispense, double volume) {
        this.flavorName = flavorName;
        this.currentAmt = currentAmt;
        this.amtPerDispense = amtPerDispense;
        this.volume = volume;
    }

    public static String dispense(String flavor) {

        return "";
    }
}
