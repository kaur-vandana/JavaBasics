package com.kaurvandana.structured;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindTheNumberThatMostOccur {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,3,3,3,3,3,4,5,6,7,8,3);

        Set<Integer> hSet = new HashSet<>();
        for (Object x : numbers)
            hSet.add((Integer) x);

        int count=0;
        int iAmTheAnswer=0;

        for(Integer num : hSet) {
            for(int j=0;j<numbers.size();j++) {
                if(num.equals(numbers.get(j))) {
                    count++;
                }
            }
            if(count>iAmTheAnswer) {
                iAmTheAnswer=count;
                count=0;
            } else {
                count=0;
            }
        }
        System.out.println(iAmTheAnswer);
    }
}
