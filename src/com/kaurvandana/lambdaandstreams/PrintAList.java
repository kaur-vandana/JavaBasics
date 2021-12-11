package com.kaurvandana.lambdaandstreams;

import java.util.ArrayList;
import java.util.List;

public class PrintAList {
    public static void main(String[] args) {
        List<String> countryNames = new ArrayList<>();
        countryNames.add("India");
        countryNames.add("England");
        countryNames.add("Australia");
        countryNames.add("Newzealand");
        countryNames.add("South");

        //with lambda expression
        countryNames.stream().forEach(x-> System.out.println(x));

        //with method reference
        countryNames.stream().forEach(System.out::println);

        countryNames.forEach(System.out::println);
    }
}
