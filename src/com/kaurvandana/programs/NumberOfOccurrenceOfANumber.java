package com.kaurvandana.programs;

import java.util.Arrays;
import java.util.List;

public class NumberOfOccurrenceOfANumber {
    public static void main(String[] args) {
        List numbers = Arrays.asList(1,3,3,3,3,3,4,5,6,7,8,3);
        //count the number of occurrence of a number
        int i=3, count=0;
        for(Object num:numbers) {
            if(num.equals(i)) {
                count++;
            }
        }
        System.out.println("count = " + count);
    }
}
