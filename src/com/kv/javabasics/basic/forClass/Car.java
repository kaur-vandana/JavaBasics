package com.kv.javabasics.basic.forClass;

//Class
public class Car {

    //instance variables
    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String colour;

    //if the instance variables are private , we need getter and setters to access them
    public void setModel(String model) {
        this.model=model;
    }
    public String getModel() {
        return this.model;
    }


}
