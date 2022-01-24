package com.kv.structuralprogramming;

import java.util.Arrays;
import java.util.List;

public class SumOfOddNumbers {
    public static void main(String[] args) {
        List<Integer> numbers =	Arrays.asList(1,3,4,6,2,7);

       int sum =0;

       for(int i=0; i<numbers.size(); i++) {
           if(numbers.get(i)%2 !=0 ) {
               sum = sum + numbers.get(i);
           }
       }

        System.out.println("sum = " + sum);
    }
}
