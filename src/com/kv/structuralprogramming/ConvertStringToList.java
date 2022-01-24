package com.kv.structuralprogramming;

import java.util.ArrayList;
import java.util.List;

public class ConvertStringToList {
    public static void main(String[] args) {
        String string = "Hello World";
        List<Character> chars = new ArrayList<>();

        for (char ch: string.toCharArray()) {
            if(ch != ' ')
                chars.add(ch);
        }
        System.out.println(chars);

        char[] characters = string.toCharArray();
    }
}
