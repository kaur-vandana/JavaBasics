package com.kv.javabasics.basic.encapsulation.withEncapsulation;

public class Person {
    public String name;

    //if we change the variable name here, it does not affect other classes
    // public int age;
    public int personAge;

    public Person(String name, int age) {
        this.name = name;
        if(age>0 && age<100) {
            this.personAge = age;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return personAge;
    }

    public void setAge(int age) {
        this.personAge = age;
    }

    public void loseAge(int age) {
        this.personAge = this.personAge -age;
        if(this.personAge <=0)
            System.out.println("age can not be 0 or negative");
    }

    public int remainingAge() {
        return this.personAge;
    }
}
