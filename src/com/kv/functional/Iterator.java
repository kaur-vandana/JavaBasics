package com.kv.functional;

import java.util.stream.Stream;

public class Iterator {
    public static void main(String[] args) {
        Stream.iterate(40, n -> n + 2).limit(20);
    }
}
