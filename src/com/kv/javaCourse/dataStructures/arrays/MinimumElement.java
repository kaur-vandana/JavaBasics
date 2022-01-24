package com.kv.javaCourse.dataStructures.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MinimumElement {

    private static Scanner scanner;

    private static int readInteger() {
        scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    private static int[] readElements(int size) {
        scanner = new Scanner(System.in);
        int [] array = new int[size];
        for(int i=0;i<size;i++) {
            array[i] = scanner.nextInt();
        }
        return array;
    }

    private static int findMin(int [] array) {
        int temp=0;

        boolean flag = true;

        while(flag) {
            flag = false;
            for(int i=0;i<array.length-1;i++) {
                if(array[i]>array[i+1]) {
                    temp = array[i];
                    array[i]=array[i+1];
                    array[i+1] = temp;
                    flag = true;
                }
            }

        }
        return array[0];
    }

    public static void main(String[] args) {

        int size = readInteger();
        System.out.println("size of array = "+ size);

        int [] array = readElements(size);
        System.out.println("Array is = "+ Arrays.toString(array));

        int min = findMin(array);
        System.out.println("min ele of array = "+ min);

    }
}
