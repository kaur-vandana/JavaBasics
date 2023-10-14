package com.kv.functional;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class SortMapByKey {
    public static void main(String[] args) {
        Map<String, Integer> unordered = new HashMap<>();
        unordered.put("dog", 1);
        unordered.put("zebra", 10);
        unordered.put("cat", 98);
        unordered.put("ant", 12);
        unordered.put("bat", 50);
        unordered.put("elephant", 61);

        Map result = unordered.entrySet().stream()
                .sorted(Map.Entry.comparingByKey())
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
                        (oldValue, newValue) -> oldValue, LinkedHashMap::new));

        result.entrySet().stream().forEach(System.out::println);


    }
}
