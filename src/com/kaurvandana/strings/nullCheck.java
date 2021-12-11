package com.kaurvandana.strings;

public class nullCheck {
    public static void main(String[] args) {
        String str = null;

        //null check comes first
        if (str != null && str.equals("Hello")) {
            System.out.println("print something");
        }

        str = "Hello";
        if (str.equals("Hello") && str != null) {
            System.out.println("String = " + str);
        }

        /*
        if(str == null) {
            throw new RuntimeException("str is null");
        }
        */
    }
}
