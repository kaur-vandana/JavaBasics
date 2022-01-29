package com.kv.structuralprogramming;

import java.util.ArrayList;
import java.util.List;

public class ConvertStringToList {
    public static void main(String[] args) {
        String str = "Hello World";
        System.out.println("value of str = " + str);

        //way 1
        List<Character> charStr = new ArrayList<>();
        str.chars().forEach(y -> {
            if(y!= ' ') {
                charStr.add((char) y);
            }
        });
        System.out.println(charStr);

        //way 2
        char[] chars = str.toCharArray();

    }
}
