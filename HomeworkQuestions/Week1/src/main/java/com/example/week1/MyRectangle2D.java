package com.example.week1;

public class MyRectangle2D {
    // getters return void
    // setters return void, changes this.method

    // ++i , i will increase before executing stuff in the loop
    // i++, i will increase after executing stuff in the loop

    double x, y;
    double width, height;

    public MyRectangle2D() // constructor
    {
      this.x = 0;
      this.y = 0;
      this.width = 1;
      this.height = 1;
    }

    // specified x, y, height and width

    public MyRectangle2D(double inputx, double inputy, double inputWidth, double inputHeight) // constructor
    {
        this.x = inputx;
        this.y = inputy;
        this.width = inputWidth;
        this.height = inputHeight;
    }

    public double getX()
    {
        return this.x;
    }

    public double gety()
    {
        return this.y;
    }

    public void setX(double value)
    {
        this.x = value;
    }

    public void setY(double value)
    {
        this.y = value;
    }

    public double getArea()
    {
        return this.width * this.height;
    }

    public double getPerimeter()
    {
        return 2*(this.width + this.height);
    }



    public static void main(String[] args)
    {

    }

}
