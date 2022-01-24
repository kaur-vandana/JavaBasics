package com.kv.javaCourse.Challenges.poolArea;

public class Cuboid extends Rectangle{
    private double height;

    public Cuboid(double width, double length, double height) {
        super(width, length);
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
