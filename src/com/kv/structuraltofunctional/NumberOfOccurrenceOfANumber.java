package com.kv.structuraltofunctional;

import java.util.Arrays;
import java.util.List;

public class NumberOfOccurrenceOfANumber {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 3, 3, 3, 3, 3, 4, 5, 6, 7, 8, 3);
        // count the number of occurrence of a number
        int number = 3;

        int count = 0;
        for (Integer i : numbers) {
            if (i.equals(number)) {
                count++;
            }
        }
        System.out.println("NumberOfOccurrenceOfANumber of 3 = " + count);

        // ................................................................

        long occurrence = numbers.stream().filter(x-> number==x).count();

        System.out.println("NumberOfOccurrenceOfANumber of 3 = " + occurrence);

    }
}
