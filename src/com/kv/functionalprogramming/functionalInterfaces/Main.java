package com.kv.functionalprogramming.functionalInterfaces;

public class Main implements Foo{

    // Default Method - Optional to Override
    @Override
    public String HelloWorld() {
        return "Hello Java 8";
    }

    @Override
    public void bar() {
        System.out.println("Hello World");
    }

    public static void main(String[] args) {
        int a = 5;

        // lambda expression to define the calculate method
        Square s = (int x) -> x * x;

        // parameter passed and return type must be same as defined in the prototype
        int ans = s.calculate(a);
        System.out.println(ans);
    }

}
