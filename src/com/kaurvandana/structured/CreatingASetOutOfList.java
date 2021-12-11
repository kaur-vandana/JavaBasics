package com.kaurvandana.structured;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CreatingASetOutOfList {
    public static void main(String[] args) {
        List numbers = Arrays.asList(1,3,3,3,3,3,4,5,8);

        Set<Integer> hSet = new HashSet<>();
        for (Object x : numbers)
            hSet.add((Integer) x);

        hSet.stream().forEach(System.out::println);
    }
}
