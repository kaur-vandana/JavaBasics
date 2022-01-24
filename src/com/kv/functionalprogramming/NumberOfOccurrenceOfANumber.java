package com.kv.functionalprogramming;

import java.util.Arrays;
import java.util.List;

public class NumberOfOccurrenceOfANumber {
    public static void main(String[] args) {
        List numbers = Arrays.asList(1,3,3,3,3,3,4,5,6,7,8,3);

        int num = (int) numbers.stream().filter(x -> x.equals(3)).count();
        System.out.println(num);
    }
}
