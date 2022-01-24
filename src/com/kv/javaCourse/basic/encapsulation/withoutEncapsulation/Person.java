package com.kv.javaCourse.basic.encapsulation.withoutEncapsulation;

public class Person {

    public String name;

//    if we change the name of this variable , It will effect the Main class as well.
    public int age;

    public void loseAge(int age) {
        this.age = this.age-age;
        if(this.age<=0)
            System.out.println("age can not be 0 or negative");
    }

    public int remainingAge() {
        return this.age;
    }
}
