package com.kv.javabasics.dataStructures.arraylist.comparator;

public class Cricketer {
    int runs;
    String name;

    public Cricketer(String name, int runs) {
        this.runs = runs;
        this.name = name;
    }

    @Override
    public String toString() {
        return  name + " " + runs;
    }
}
