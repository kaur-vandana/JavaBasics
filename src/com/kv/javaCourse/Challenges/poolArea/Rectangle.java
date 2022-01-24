package com.kv.javaCourse.Challenges.poolArea;

public class Rectangle {
    private double width;
    private double length;

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        if(width<0)
        return 0;
        else
        return width;
    }

    public double getLength() {
        if(length<0)
            return 0;
        else
            return length;
    }

    public double getArea() {
        if(this.width <=0 || this.length <=0)
            return 0;
        else
            return width*length;
    }
}
