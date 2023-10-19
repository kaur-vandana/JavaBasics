package com.kv.javabasics.passByValue;

public class Demo1 {

    int parameter =100;

    void change(int a) {
        parameter = parameter+100;  //values will be changed locally
    }

    public static void main(String[] args) {

        Demo1 passByValue =new Demo1();  //Creating object

        System.out.println(" Value (before change)=" + passByValue.parameter);

        //Passing the parameters by values does not affect the original variable
        passByValue.change(500);  //Passing value
        System.out.println(" Value (after change)=" + passByValue.parameter);
    }
}

