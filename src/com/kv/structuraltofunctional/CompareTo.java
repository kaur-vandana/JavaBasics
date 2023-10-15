package com.kv.structuraltofunctional;

public class CompareTo {

    public static void main(String[] args) {

        if ("A".compareTo("A") == 0) {
            System.out.println("A=A - return 0");
        }

        if ("B".compareTo("C") < 0) {
            System.out.println("B<C - return a negative value");
        }

        if ("D".compareTo("C") > 0) {
            System.out.println("D>C - return a positive  value");
        }

    }
}
