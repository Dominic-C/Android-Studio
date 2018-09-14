package com.example.week1.MyRectangle2D;


public class MyRectangle2D {
    // getters return void
    // setters return void, changes this.method

    // ++i , i will increase before executing stuff in the loop
    // i++, i will increase after executing stuff in the loop

    private double x, y;
    private double width, height;

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

    public boolean contains(double x, double y)
    {
        // check if rectangle contains this point
        if(Math.abs(x - this.x) <= this.width/2 && Math.abs(y - this.y) <= this.height/2)
        {
            return true;
        }
        return false;
    }

    public boolean contains(MyRectangle2D r)
    {
        double x1, x2, x3, x4;
        double y1, y2, y3, y4;

        x1 = r.x + (r.width)/2;
        y1 = r.y + (r.height)/2;

        x2 = r.x + (r.width)/2;
        y2 = r.y - (r.height)/2;

        x3 = r.x - (r.width)/2;
        y3 = r.y + (r.height)/2;

        x4 = r.x - (r.width)/2;
        y4 = r.y - (r.height)/2;

        // Use the contains method for all 4 points of the smaller rectangle
        if(this.contains(x1, y1) && this.contains(x2, y2) && this.contains(x3, y3) && this.contains(x4, y4))
        {
            return true;
        }
        return false;
    }

    public boolean overlaps(MyRectangle2D r)
    {
        double x1, x2, x3, x4;
        double y1, y2, y3, y4;

        x1 = r.x + (r.width)/2;
        y1 = r.y + (r.height)/2;

        x2 = r.x + (r.width)/2;
        y2 = r.y - (r.height)/2;

        x3 = r.x - (r.width)/2;
        y3 = r.y + (r.height)/2;

        x4 = r.x - (r.width)/2;
        y4 = r.y - (r.height)/2;

        // Use the contains method for all 4 points of the smaller rectangle
        if(this.contains(x1, y1) || this.contains(x2, y2) || this.contains(x3, y3) || this.contains(x4, y4))
        {
            return true;
        }
        return false;
    }


}
