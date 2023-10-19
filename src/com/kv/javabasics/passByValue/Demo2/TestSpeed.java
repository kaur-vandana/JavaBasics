package com.kv.javabasics.passByValue.Demo2;

public class TestSpeed {
    public static void swap(Object o1, Object o2)// method for swapping variables
    {
        Object temp = o1;
        o1=o2;
        o2=temp;
    }

    public static void main(String[] args) {
        Bike apache = new Bike(180); //memory references
        Bike pulsar = new Bike(200);

        swap(apache, pulsar);
        System.out.println("Apache's Speed is ="+apache.getSpeed());
        System.out.println("Pulsar's Speed is ="+pulsar.getSpeed());

        /*From the above output, we can see that the swap method did not work.
                It did not work because Java is pass by value, and, here, we are passing the reference of the object.
                So it is clear that Java does not support pass by reference.*/
    }

}