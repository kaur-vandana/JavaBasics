package com.kv.functionalprogramming;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class OddNumber {
    public static void main(String[] args) {

        List<Integer> number = new ArrayList<>();
        number.add(1);
        number.add(3);
        number.add(100001);
        number.add(8);
        number.add(12);
        number.add(21);

        List<Integer> oddNumbers =
                number.stream()
                .filter(x -> x%2 != 0)
                .collect(Collectors.toList());

        oddNumbers.forEach(System.out::println);
    }
}
