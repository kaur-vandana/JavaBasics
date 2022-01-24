package com.kv.functionalprogramming;

import java.util.Arrays;
import java.util.List;

public class SumOfOddNumbers {
    public static void main(String[] args) {
        List<Integer> numbers =	Arrays.asList(1,3,4,6,2,7);

//        Optional<Integer> sum = numbers.stream()
//                .filter(x-> x%2!=0)
//                .reduce(Integer:: sum);

        int sum =	numbers.stream()
                .filter(SumOfOddNumbers::isOdd)
                .reduce(0, Integer::sum);

        System.out.println(sum);
    }
    static boolean isOdd(int number)	{
        return number%2	!= 0;
    }
}
