package com.kv.javaCourse.dataStructures.arrays;

import java.util.Scanner;

public class SortedIntArrayInDescendingOrder {
    private static Scanner scanner;

    public static void main(String[] args) {
        int[] integers = getIntegers(5);
        integers = sortIntegers(integers);
        printArray(integers);
    }

    public static int[] getIntegers(int input) {
        scanner = new Scanner(System.in);
        int[] enteredNumbers = new int[input];
        System.out.println("Enter " + enteredNumbers.length + " numbers:\r");

        for (int i = 0; i < enteredNumbers.length; i++) {
            enteredNumbers[i] = scanner.nextInt();
        }
        return enteredNumbers;
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public static int[] sortIntegers(int[] array) {
        int temp;
        boolean flag =true;

     while(flag) {
         flag = false;
         for(int i=0 ; i<array.length-1; i++) {
             temp = array[i];
             if(array[i+1] > array[i]) {
                 array[i] = array[i + 1];
                 array[i+1] = temp;
                 flag = true;
             }
         }
     }
     return array;
    }

}
