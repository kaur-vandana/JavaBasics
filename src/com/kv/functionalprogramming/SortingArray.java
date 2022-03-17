package com.kv.functionalprogramming;

import java.util.Arrays;

public class SortingArray {
    public static void main(String[] args) {
        String [] array = { "blue", "green", "red", "blue", "green", "red", "blue", "green", "red"};

        Arrays.stream(array).sorted().forEach(System.out::println);

    }
}
