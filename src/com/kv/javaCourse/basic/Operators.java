package com.kv.javaCourse.basic;

public class Operators {
    public static void main(String[] args) {

//        Assigning operator '='
        int i=0;

        //       First 'i' will be incremented and then println() will be executed
        System.out.println("increment i = "+ ++i);

        //       First println() will be executed and then 'i' will be incremented
        System.out.println("increment i = "+ i++);

        // i = i*2;
        i *= 2;
        System.out.println("i = "+ i);

        int j=5;

//        Equals operator '=='
        if(j==5 && j>=i || i<=j ) {
            System.out.println("print me");
        }

        boolean iamCar = false;

        String x = iamCar ? "true" : "false";
        System.out.println("iamCar = " + x);

    }
}


