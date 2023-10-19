package com.kv.functional.functionalinterfaces;

public class Main implements Foo {

    // Default Method - Optional to Override
    @Override
    public String helloWorld() {
        return "Main Hello Java";
    }

    @Override
    public void bar() {
        System.out.println("Main Bar Hello World");
    }

    public static void main(String[] args) {
        int a = 5;

        // lambda expression to define the calculate method
        Square s = (int x) -> x * x;

        // parameter passed and return type must be same as defined in the prototype
        int ans = s.calculate(a);
        System.out.println(ans);

        Main main = new Main();
        main.bar();

    }

}
