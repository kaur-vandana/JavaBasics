package com.kv.structuralprogramming;

import java.util.ArrayList;
import java.util.List;

public class OddNumber {
    public static void main(String[] args) {
        List<Integer> number = new ArrayList<>();
        number.add(1);
        number.add(3);
        number.add(100001);
        number.add(8);
        number.add(12);
        number.add(21);

        List<Integer> oddNumber = new ArrayList<>();
        for(Integer x : number) {
            if(x%2 !=0) {
                oddNumber.add(x);
            }
        }

        System.out.println(oddNumber);

    }
}
