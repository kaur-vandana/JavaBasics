package com.kv.javabasics.basic;

public class IfElse {

    public static void main(String[] args) {
        int i=1;

        if (i == 1)
            System.out.println("true");
        else
            System.out.println("false");

        if(++i == 2) {
            i++;
            System.out.println("i = "+ i);
        }

        boolean b = true;
        if(b)
            System.out.println("i am true");

    }
}
