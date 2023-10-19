package com.kv.javabasics.challenges.numbers;

public class Point {

    private int x;
    private int y;

    public Point() {
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double distance() {
       return 0;
    }

    public double distance(Point A) {
        return 0;
    }

    public double distance(int x, int y) {
        return (double) x-y;
    }

    public double distance(Point A, Point B) {
       return (double) Math.sqrt((B.getX()-A.x)*(B.getX()-A.getX()) + (B.y-A.y)*(B.y-A.y));
    }
}
