package CallByValueAndReference;
// argument - actual value passed into a function
// parameter - input variable in a method definition

// when we call a method, the parameter gets the value of the arguments passed to the method itself

// call by value - when a function receives a copy of each argument passed to it, rather than a reference of the object itself
// call by reference - when a function receives a reference to each argument

// Java uses call by value


import java.awt.Color;

public class Main{

    public static void main(String [] args)
    {
        Car myCar = new Car(45.5, "1BC321", Color.BLUE, true);
        Car sallyCar = new Car (44.3, "Bfghiew", Color.PINK, true   );

        System.out.println("My Car's license Plate: "+ myCar.licensePlate);
        System.out.println("Sally's car license Plate: "+ sallyCar.licensePlate);

        System.out.println("My Car's color: "+ myCar.paintColor); // colors are written as RGB
        myCar.changePaintColor(Color.RED); // "this" evaluates to myCar instance
        System.out.println("My Car's color: "+ myCar.paintColor);

        double carspeed = 50.0;
        carspeed = myCar.speedingUp(carspeed); // instead of passing by reference, we copy a value and replace the current speed with it
        System.out.println("carspeed: "+ carspeed);
    }
}