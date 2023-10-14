package com.kv.structuralprogramming;

import java.util.Arrays;
import java.util.List;

public class SumOfOddNumbers {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 3, 4, 6, 2, 7);

        int sum = 0;
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) % 2 != 0) {
                sum = sum + numbers.get(i);
            }
        }
        System.out.println("sum1 = " + sum);

        // ................................................................

        sum = 0;
        for (Integer x : numbers) {
            if (x % 2 != 0) {
                sum = sum + x;
            }
        }
        System.out.println("sum2 = " + sum);

        // ................................................................

        sum = numbers.stream()
                .filter(x -> x % 2 != 0)
                .reduce(0, (a, b) -> a + b);

        System.out.println("sum3 = " + sum);

        // ................................................................

    }
}
