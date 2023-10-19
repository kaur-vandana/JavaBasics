package com.kv.javaCourse.basic.composition;

public class Lamp {
    private String style;
    private boolean battery;
    private int globRating;

    public void turnOn() {
        System.out.println("The lamp is being turned on");
    }

    public String getStyle() {
        return this.style;
    }

    public boolean isBattery() {
        return battery;
    }

    public int getGlobRating() {
        return globRating;
    }
}
