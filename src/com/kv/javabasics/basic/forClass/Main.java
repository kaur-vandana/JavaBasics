package com.kv.javabasics.basic.forClass;

public class Main {
    public static void main(String[] args) {

        //Object - toyoto
        Car toyoto = new Car();
        toyoto.setModel("Carrera");
        System.out.println(toyoto.getModel());


        Boat boat = new Boat();
        boat.boatModel="i am boat model";
        System.out.println(boat.boatModel);
    }
}
