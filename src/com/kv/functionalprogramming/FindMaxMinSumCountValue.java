package com.kv.functionalprogramming;

import java.util.Arrays;
import java.util.List;

public class FindMaxMinSumCountValue {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,7,3,9,10,5,3,6);
        Integer val= numbers.stream().max(Integer::compare).get();
        System.out.println("max = " + val);

//        Method References
//        Integer::compare
        System.out.println("min = " + numbers.stream().min(Integer::compare).get());

        System.out.println("sum = "+numbers.stream().reduce(0,(x,y)->x+y));

        System.out.println("count/ length of list= " + numbers.stream().count());
    }
}