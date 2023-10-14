package com.kv.structuraltofunctional;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Sorting {
    public static void main(String[] args) {
        String[] array = { "blue", "green", "red", "blue", "green", "red", "blue", "green", "red" };

        int length = array.length - 1;

        int i = 0;
        while (i < length) {
            for (int j = i + 1; j < length; j++) {
                if (array[i].compareTo(array[j]) > 0) {
                    String temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
            i++;
        }

        System.out.println("sorted list1 = " + Arrays.toString(array));

        // ................................................................

        String[] array1 = { "blue", "green", "red", "blue", "green", "red", "blue", "green", "red" };
        Arrays.sort(array1);
        System.out.println("sorted list1 = " + Arrays.toString(array1));

        // ................................................................

        String[] array2 = { "blue", "green", "red", "blue", "green", "red", "blue", "green", "red" };
        List<String> list = Arrays.stream(array2).sorted().collect(Collectors.toList());
        System.out.println("sorted list1 = " + list);

        // ................................................................

    }
}
