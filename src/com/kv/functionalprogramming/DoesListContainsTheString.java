package com.kv.functionalprogramming;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class DoesListContainsTheString {

    public static void main(String[] args) {
        List<String> words = Arrays.asList("Welcome", "to", "Baeldung");

        Predicate<String> string = obj -> obj.equals("Baeldung");

        /* anyMatch() method checks whether any Stream element matches
         * the specified predicate
         */
        boolean result = words.stream().anyMatch(string);

        System.out.println(result);
    }
}
