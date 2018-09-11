package com.example.lib;

import java.awt.Color;

public class Main {
    public static void main(String[] args)
    {
        Car myCar = new Car(45.5, "1BC321", Color.BLUE, true);
        Car sallyCar = new Car (44.3, "Bfghiew", Color.PINK, true   );

        System.out.println("My Car's license Plate: "+ myCar.licensePlate);
        System.out.println("Sally's car license Plate: "+ sallyCar.licensePlate);
    }
}
