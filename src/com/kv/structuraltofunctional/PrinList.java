package com.kv.structuraltofunctional;

import java.util.ArrayList;
import java.util.List;

public class PrinList {
    public static void main(String[] args) {
        List<String> countryNames = new ArrayList<>();
        countryNames.add("India");
        countryNames.add("England");
        countryNames.add("Australia");
        countryNames.add("Newzealand");
        countryNames.add("South");

        // advance for loop
        for (String x : countryNames) {
            System.out.print(x + " ");
        }

        // ................................................................
        System.out.println();

        // with lambda expression
        countryNames.stream().forEach(x -> System.out.print(x + " "));

        // ................................................................
        System.out.println();

        // with method reference
        countryNames.stream().forEach(System.out::println);

        // ................................................................

        countryNames.forEach(System.out::println);

        // ................................................................

    }
}
