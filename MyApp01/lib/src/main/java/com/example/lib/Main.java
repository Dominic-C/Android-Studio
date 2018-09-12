package com.example.lib;

import java.awt.Color;

public class Main {
    public static void main(String[] args)
    {
        // new is the keyword used to instantiate an object, it assigns memory to the object
        Car myCar = new Car(45.5, "1BC321", Color.BLUE, true);
        Car sallyCar = new Car (44.3, "Bfghiew", Color.PINK, true   );

        System.out.println("My Car's license Plate: "+ myCar.licensePlate);
        System.out.println("Sally's car license Plate: "+ sallyCar.licensePlate);

        System.out.println("My Car's color: "+ myCar.paintColor); // colors are written as RGB
        myCar.changePaintColor(Color.RED); // "this" evaluates to myCar instance
        System.out.println("My Car's color: "+ myCar.paintColor);

    }
}
