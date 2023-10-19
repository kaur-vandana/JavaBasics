package com.kv.javaCourse.basic;

public class MutableStringWithStringBuilder {
    public static void main(String[] args) {
        /*
        We can create a mutable string by use of the StringBuilder class.
        The StringBuilder class is placed in java.lang package.
        Serializable, Comparable, and CharSequence are three interfaces that are implemented by the StringBuilder class.
        */

        //StringBuilder(): It is used to declare an empty string builder. Its initial capacity is 16.
        StringBuilder name = new StringBuilder(); // creating a blank string
        System.out.println("Is name is blank = "+ (name.length() == 0));
        System.out.println("Display the capacity of name = " + name.capacity());

        // StringBuilder(String str): It is used to declare a string builder with some specified value.
        StringBuilder name2 = new StringBuilder ("Ravi");   // creating a StringBuilder with specified string
        System.out.println("Name of Student = "+ name2);
        System.out.println("Display the capacity of name = " + name2.capacity());

        // StringBuilder(int capacity): It is used to declare an empty string builder with a specified capacity.
        // creating a StringBuilderwith specified capacity
        StringBuilder name3 = new StringBuilder (10);
        name.append("Ravi"); // Appending string in string buffer
        System.out.println("Name Of Student = "+ name3);
        System.out.println("Display the capacity of name = " + name3.capacity()); //

        //append() method
        StringBuilder str1 = new StringBuilder("Learning");
        str1.append(" website");
        System.out.println("Value of str1 after change : " + str1);

        //insert() method
        name.insert(4, "kant");
        System.out.println("Name of Student = "+ name);

        //replace(startIndex, endIndex, string) method
        name.replace(5, 7, "OK");
        System.out.println("Name of Student = "+ name);

        // reverse the string
        StringBuilder reverseStr = name.reverse();
        System.out.println("Reverse String = " + reverseStr);

        // Append ','
        //(44) to the String
        name2.appendCodePoint(44);
        System.out.println("Modified StringBuilder = " + name2);

        // get capacity
        int capacity = name2.capacity();
        System.out.println("Capacity of StringBuilder = " + capacity);

    }
}
