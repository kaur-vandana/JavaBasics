package com.kv.functional;

import java.util.Arrays;
import java.util.List;

public class DistinctNumber {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,3,3,3,3,3,4,5,6,7,8,3);

        numbers.stream().distinct().forEach(System.out::println);
    }
}
