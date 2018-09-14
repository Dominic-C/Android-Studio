package com.example.week1.MyRectangle2D;

public class Main {
    public static void main(String[] args)
    {
        MyRectangle2D rect = new MyRectangle2D();
        rect.setX(0);
        rect.setY(0);

        System.out.println("Does test rectangle contain the point (0.5, 0.5)?: " + rect.contains(0.5, 0.5));

        MyRectangle2D bigRect = new MyRectangle2D(-1, 2, 6, 4);
        MyRectangle2D smallRect = new MyRectangle2D(0.6, 2, 3, 2);

        boolean answer = bigRect.contains(smallRect);

        System.out.println("Does big rectangle contain small rectangle? " + answer);


        boolean answer2 = bigRect.overlaps(smallRect);
        System.out.println("Does big rectangle overlap small rectangle? " + answer2);

    }

}
