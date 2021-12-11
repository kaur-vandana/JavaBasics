package com.kaurvandana.strings;

import java.util.Arrays;

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

        //to lowercase
        String s3 = s1.toLowerCase();
        System.out.println(s3);

        //to uppercase
        String s4 = s1.toUpperCase();
        System.out.println(s4);

        System.out.println("Printing the String Character Code Points  --> ");
        s1.chars().forEach(System.out::println);

        //character at particular index
        System.out.println("first char = " + s1.charAt(0));
        System.out.println("last char = " + s1.charAt(s1.length()-1));

        //The Java String class getChars() method copies the content of this string into a specified char array.
        //getChars(int srcBeginIndex, int srcEndIndex, char[] destination, int dstBeginIndex)
        char [] ch = new char[5];
        s1.getChars(0,5,ch,0);
        Arrays.asList(ch).stream().forEach(System.out::println);

        //get index of string
        String myStr = "Hello planet earth, you are a great planet.";
        System.out.println(myStr.lastIndexOf("planet"));
        System.out.println(myStr.lastIndexOf("lo"));
        System.out.println(myStr.lastIndexOf("Hello"));

        //contains method
        if (myStr.contains("planet")) {
            System.out.println("yes it contains");
        }
        if (!myStr.contains("zebra")) {
            System.out.println("No it does not contains zebra");
        }

        //compareTo
       if ( myStr.compareTo("Hello planet earth, you are a great planet.") ==0) {
           System.out.println("equal");
       }
       if ("A".compareTo("B")<0) {
           System.out.println("A<B");
       }
       if ("C".compareTo("B")>0) {
            System.out.println("C>B");
       }
    }
}
