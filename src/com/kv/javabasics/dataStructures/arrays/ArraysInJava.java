package com.kv.javabasics.dataStructures.arrays;

import java.util.Arrays;

public class ArraysInJava {
    public static void main(String[] args) {
        //      Arrays
        int[] intArrays = new int[]{1, 2, 3, 4, 5}; //--- declaration and initialization
        System.out.println(Arrays.toString(intArrays));


        int[] int_Arrays; //-- declaration
        int_Arrays = new int[5]; //  memory allocation
        int_Arrays = new int[]{17, 32, 73, 34, 95}; // initialization
        System.out.println(Arrays.toString(int_Arrays));

//       here, int_Arrays points to the address pointing to the array in memory.
//       so it holds the address or reference rather than the data itself

        int [] array1 = new int[5];
        int[] array2 = array1;

//        both array1 and array2 points to same address in memory where array is created



    }
}
