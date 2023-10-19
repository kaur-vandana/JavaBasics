package com.kv.javabasics.dataStructures.arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Notes {
    public static void main(String[] args) {
        String[] strArray = new String[10];
        int[] intArray = new int[10];

        ArrayList<String> stringArrayList = new ArrayList<>();
        stringArrayList.add("Vandana");

//        ArrayList<Class reference>
//        <Can not be a primitive type>

//        ArrayList<int> intArrayList = new ArrayList<int>();
//        intArrayList.add(1);

//        solution
//        we created a wrapper - IntClass ,
        ArrayList<IntClass> intArrayList = new ArrayList<IntClass>();
        intArrayList.add(new IntClass(54));
        intArrayList.add(new IntClass(90));

//       similar built-in wrapper is provided by the Java - example Integer
//        Integer is a class
        ArrayList<Integer> integersAutoboxing = new ArrayList<>();
//        Autoboxing : takes the int value (primitive type) and convert it to Integer class
        integersAutoboxing.add(90);
        integersAutoboxing.add(78);


        System.out.println(Integer.valueOf((int) 9.456567));


        Integer integerVal = 89; // Autoboxing
//        at compile time
//        i = Integer.valueOf(89);

        int intVal = integerVal; // Unboxing
//        at compile time
//        intVal =  integerVal.intValue();

        List<Integer> num = new ArrayList<>();
        num.add(89);
        num.add(35);
        num.add(32);

        Collections.sort(num);

        System.out.println(num);
    }
}
