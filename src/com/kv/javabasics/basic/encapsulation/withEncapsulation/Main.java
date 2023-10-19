package com.kv.javaCourse.basic.encapsulation.withEncapsulation;

public class Main {

    public static void main(String[] args) {
        //Initialization happens at the time of object creation itself.
        //we can access the Person class only when the data passed is valid
        Person person = new Person("Salman", 50);

        System.out.println(person.getName() + " age is = " + person.getAge());

        //there is no other way to reduce the age of the person other than calling loseAge()
        person.loseAge(20);
        System.out.println(person.getName() + " age is = " + person.getAge());
    }

    }
