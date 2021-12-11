package com.kaurvandana.strings;

public class MutableStringWithStringBuffer {

    public static void main (String[] args)
    {
        /*
        Suppose if you want to work in a multithreading environment and the string should be thread-safe then you
        should use the StringBuffer class
        */

        StringBuffer str1 = new StringBuffer("JavaGoal");

        System.out.println("Value of str1 =" + str1);

        str1.append(".com");
        System.out.println("append --> " + str1);

        //replaces entire string
        str1.replace(0,str1.length(), "hello");
        System.out.println("replace --> " + str1);

        int length = str1.length();
        System.out.println("length of str1 --> " + length);

        char ch = str1.charAt(0);
        System.out.println("char at index 0  --> " + ch);

        /*Java String chars() method returns an IntStream. The stream contains the integer code point values of the
        characters in the string object. This method was added to the String class in Java 9 release.*/
        System.out.println("Printing the String Character Code Points  --> ");
        str1.chars().forEach(System.out::println);

        /*If you have to process the string characters and you don’t mind unordered processing, you can create a parallel
        stream and process its characters.*/
        System.out.println("Processing String Characters in Parallel  --> ");
        str1.chars().parallel().forEach(c -> System.out.println(Character.valueOf((char) c)));


    }
}
