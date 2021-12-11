package com.kaurvandana.interviewQuestions;

public class ImmutableStringDemo {
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

    }
}
