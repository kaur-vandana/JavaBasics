package com.kv.javaCourse.basic.inheritance;

public class Main {
    public static void main(String[] args) {
        //creates reference to object in memory
        Animal animal = new Animal("Animal", 1, 1, 5, 5);

        Dog dog = new Dog("Yorkie", 8, 20, 2, 4, 1, 20, "long silky");
        dog.eat();
        dog.walk();
        dog.run();
    }
}
