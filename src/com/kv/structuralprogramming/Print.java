package com.kv.structuralprogramming;

import java.util.ArrayList;
import java.util.List;

public class Print {
    public static void main(String[] args) {
        List<String> countryNames = new ArrayList<>();
        countryNames.add("India");
        countryNames.add("England");
        countryNames.add("Australia");
        countryNames.add("Newzealand");
        countryNames.add("South");

        //advance for loop
        for(String x : countryNames) {
            System.out.println(x);
        }
    }
}
