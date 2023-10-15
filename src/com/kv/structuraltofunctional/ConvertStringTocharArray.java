package com.kv.structuraltofunctional;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConvertStringTocharArray {
    public static void main(String[] args) {
        String str = "Hello World";
        System.out.println("value of str = " + str);

        // way 1
        List<Character> charStr = new ArrayList<>();
        str.chars().forEach(y -> {
            if (y != ' ') {
                charStr.add((char) y);
            }
        });
        System.out.println(charStr);

        // ...................................................................................................

        // way 2
        str = str.replace(" ", "");
        System.out.println(Arrays.toString(str.toCharArray()));

        // ...................................................................................................


        
    }
}
