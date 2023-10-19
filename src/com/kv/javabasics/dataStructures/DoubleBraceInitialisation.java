package com.kv.javabasics.dataStructures;

import java.util.HashSet;
import java.util.Set;

public class DoubleBraceInitialisation {
    public static void main(String[] args) {
        Set<String> stringSets = new HashSet<String>()
        {
            {
                add("set1");
                add("set2");
                add("set3");
            }
        };

        System.out.println(stringSets);
    }
}
