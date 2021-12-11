package com.kaurvandana.strings;

public class ImmutableString {
    public static void main(String[] args) {
        String s1 = "Hello"; // strings are stored in Heap memory
        System.out.println(s1);

        //Once String object is created its data or state can't be changed
        //but a new String object is created in the string Constant pool.
        s1 = "Sachin";
        System.out.println(s1);

        //String objects are immutable
        s1.concat(" Tendulkar");//concat() method appends the string at the end
        System.out.println(s1);//will print Sachin because strings are immutable objects

        String s2 = s1.concat(" Tendulkar");
        System.out.println(s2);

        String s3 = s1.toLowerCase();
        System.out.println(s3);

        String s4 = s1.toUpperCase();
        System.out.println(s4);

        System.out.println("Printing the String Character Code Points  --> ");
        s1.chars().forEach(System.out::println);

        System.out.println("first char = " + s1.charAt(0));

        System.out.println("last char = " + s1.charAt(s1.length()-1));

        if(s1.compareTo("Sachin") == 0) {
            System.out.println("Sachin == equal");
        }

        if(s1.compareTo("Rose") > 0) {
            System.out.println("Sachin > Rose");
        }

        if(s1.compareTo("zebra") < 0) {
            System.out.println("Sachin < zebra");
        }

        if("zebra".compareTo(s1) > 0) {
            System.out.println("zebra > Sachin");
        }

    }
}
