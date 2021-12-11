package com.kaurvandana.strings;

import java.util.ArrayList;
import java.util.List;

public class ConvertStringToList {
    public static void main(String[] args) {
        String str = "Hello World";
        System.out.println("value of str = " + str);

        List<Character> charStr = new ArrayList<>();
        str.chars().forEach(y -> {
            if(y!= ' ') {
                charStr.add(Character.valueOf((char) y));
            }
        });

        System.out.println(charStr);
    }
}
