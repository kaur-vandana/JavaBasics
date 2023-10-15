package com.kv.structuraltofunctional;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public class DistinctNumber {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 3, 3, 3, 3, 3, 4, 5, 6, 7, 8, 3);

        HashSet<Integer> num = new HashSet<>();
        for (Integer x : numbers) {
            num.add(x);
        }

        System.out.println(num);

        // ................................................................

        List<Integer> distinctNumberList = numbers.stream().distinct().collect(Collectors.toList());

        System.out.println("distinct Number List " + distinctNumberList);
    }
}
