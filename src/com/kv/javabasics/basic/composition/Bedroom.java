package com.kv.javabasics.basic.composition;

public class Bedroom {
    private String name;
    private Wall wall1;
    private Wall wall2;
    private Wall wall3;
    private Wall wall4;
    private Ceiling ceiling;
    private Bed bed;
    private Lamp lamp;

    public Lamp getLamp() {
        return lamp;
    }
    public void makeBed() {
        System.out.println("the bed is being made and also calls the make() method in the Bed class");
    }
}
