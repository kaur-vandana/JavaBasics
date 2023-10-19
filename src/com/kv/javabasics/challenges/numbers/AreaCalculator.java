package com.kv.javabasics.challenges.numbers;

public class AreaCalculator {
    public static double area(double radius) {
        if(radius<0)
            return -1;
        return radius*radius*3.14159;
    }
    public static double area(double x, double y) {
        if(x<0 || y<0)
            return -1;
        return x*y;
    }

    public static void main(String[] args) {
        System.out.println("Area of circle = " + area(5));
        System.out.println("Area of rectangle = " + area(3,4));

    }

}
