package com.kv.javabasics.basic.encapsulation.withoutEncapsulation;

public class Main {

    public static void main(String[] args) {
        Person person = new Person();

//      we don't have Constructor, getters and setters here, as the instance variables are public
//      [its a bad way to initialize] , as we are not ensuring that we can access the Person class only when the data
//      passed is valid and we do that [by using constructors]
        person.name = "Salman";
        person.age = 50;
        System.out.println(person.name + " age is = " + person.remainingAge());

        int change =10;
        person.loseAge(change);
        System.out.println(person.name + " age is = " + person.remainingAge());

        change = 20;
        person.age = 100; // we are able to override the value , so we are taking the control from the Player class.
        // we by being to access these fields directly we are opening up our application to be accessed from outside
        person.loseAge(change);
        System.out.println(person.name + " age is = " + person.remainingAge());
    }
}
