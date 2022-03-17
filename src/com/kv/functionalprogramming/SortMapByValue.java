package com.kv.functionalprogramming;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class SortMapByValue {

    public static void main(String[] args) {
        Map<String, Integer> unordered = new HashMap<>();
        unordered.put("dog", 1);
        unordered.put("zebra", 10);
        unordered.put("cat", 98);
        unordered.put("ant", 12);
        unordered.put("bat", 50);
        unordered.put("elephant", 61);

        //LinkedHashMap to store sorted map
        unordered.entrySet().stream()
                .sorted(Map.Entry.comparingByValue())
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
                        (oldValue, newValue) -> oldValue, LinkedHashMap::new))
                .forEach((k, v) -> System.out.println( k + " " + v));

    }
}
