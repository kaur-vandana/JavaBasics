package com.kv.javabasics.dataStructures.arrays;

import java.util.Arrays;

public class ReverseArray {

    private static void reverse(int [] array) {

        int temp;
        for(int i=0,j=array.length-1 ;i<array.length/2  ;i++, j--) {
            temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
        System.out.println("Array = " + Arrays.toString(array));
    }

    public static void main(String[] args) {

        reverse(new int[] {1, 65,23,42, 9});
    }
}
