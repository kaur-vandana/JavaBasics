package com.kv.javabasics.basic;

import java.util.Arrays;

public class MutableStringWithStringBuffer {

    public static void main (String[] args)
    {
        /*
        Suppose if you want to work in a multithreading environment and the string should be thread-safe then you
        should use the StringBuffer class
        */
        StringBuffer str1 = new StringBuffer("JavaGoal");
        System.out.println("Value of str1 =" + str1);

        //append
        str1.append(".com");
        System.out.println("append --> " + str1);

        //replaces entire string
        str1.replace(0,str1.length(), "hello");
        System.out.println("replace --> " + str1);

        //length of string
        int length = str1.length();
        System.out.println("length of str1 --> " + length);

        //character at particular index
        char ch = str1.charAt(0);
        System.out.println("char at index 0  --> " + ch);

        /*
        Java String chars() method returns an IntStream. The stream contains the integer code point values of the
        characters in the string object. This method was added to the String class in Java 9 release.
        */
        System.out.println("Printing the String Character Code Points  --> ");
        str1.chars().forEach(System.out::println);

        /*
        If you have to process the string characters and you don’t mind unordered processing, you can create a parallel
        stream and process its characters.
        */
        System.out.println("Processing String Characters in Parallel  --> ");
        str1.chars().parallel().forEach(c -> System.out.println(Character.valueOf((char) c)));

       /*
       The trimToSize() method of StringBuffer/StringBuilder class is the inbuilt method used to trims the capacity used
       for the character sequence of StringBuffer/StringBuilder object. If the buffer used by StringBuffer/StringBuilder
       object is larger than necessary to hold its current sequence of characters, then this method is called to resize
       the StringBuffer/StringBuilder object for converting this object to more space-efficient.Calling this method may,
       but is not required to, affect the value returned by a subsequent call to the capacity() method.
        */

        // applying trimToSize() Method
        System.out.println("Capacity before " + "applying trimToSize() = " + str1.capacity());
        str1.trimToSize();
        System.out.println("String = " + str1);
        System.out.println("Capacity after" + " applying trimToSize() = " + str1.capacity());

        //sub sequence
        System.out.println("sub sequence = " +  str1.subSequence(0,2));

        //creating a character array out of string
        char[] charArray = new char[2];
        str1.getChars(0,2, charArray, 0);
        Arrays.asList(charArray).stream().forEach(System.out::println);

        /*The delete(int start, int end) method of StringBuilder class removes the characters starting from index start to
            index end-1 from String contained by StringBuilder.*/
        //deletes first character
        System.out.println("new string = " +  str1.delete(0,1));
        //deletes last character
        System.out.println("new string = " +  str1.delete(str1.length()-1,str1.length()));

    }
}
