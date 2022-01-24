package com.kv.javaCourse.Challenges.cylinder;

public class Cylinder extends Circle {
    private double height;

    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    public double getHeight() {
        if(height<0)
            return 0;
        else
            return height;
    }

    public double getVolume() {
        if(super.getArea()*height <0)
            return 0;
        else
            return super.getArea()*height;
    }
}
