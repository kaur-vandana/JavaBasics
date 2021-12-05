package com.kaurvandana.streams;

import java.util.Arrays;

public class SortArrayInAscendingOrder {
    public static void main(String[] args) {
        String [] array = { "blue", "green", "red", "blue", "green", "red", "blue", "green", "red"};

        Arrays.stream(array).sorted(String::compareTo).forEach(System.out::println);

    }
}
