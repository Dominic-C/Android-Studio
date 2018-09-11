package com.example.lib;

import java.awt.*;

public class Car {

    double averageMilesPerGallon;
    String licensePlate;
    Color paintColor;
    boolean areTailLightsWorking;

    // constructor
    public Car(double averageMPG, String LicenseP, Color paint, boolean Taillights)
    {
        // This is a reference variable that refers to the instance of the current object.
        this.averageMilesPerGallon = averageMPG;
        this.licensePlate = LicenseP;
        this.paintColor = paint ;
        this.areTailLightsWorking = Taillights;
    }
}
