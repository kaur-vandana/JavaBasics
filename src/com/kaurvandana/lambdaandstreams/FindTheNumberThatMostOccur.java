package com.kaurvandana.lambdaandstreams;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.BinaryOperator;

public class FindTheNumberThatMostOccur {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,3,3,3,3,3,4,5,6,7,8,3,5,5,5,5,5,5,5,5,0,5,5,5);
        Integer maxoccur = numbers.stream()
                .reduce(
                        BinaryOperator.maxBy((x,y)->Collections.frequency(numbers,x) - Collections.frequency(numbers,y))
                ).orElse(null);
        System.out.println("max occur element = " + maxoccur);
    }

}
