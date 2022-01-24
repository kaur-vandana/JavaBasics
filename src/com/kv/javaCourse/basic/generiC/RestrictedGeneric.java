package com.kv.javaCourse.basic.generiC;

import java.util.ArrayList;
import java.util.List;

public class RestrictedGeneric<T extends Number>{
    private List<T> values = new ArrayList<>();;

    void add(T value) {
        values.add(value);
    }

    public static void main(String[] args) {
//        Does not work
//        RestrictedGeneric<String> stringMyGenericList = new RestrictedGeneric<>();

        RestrictedGeneric<Integer> integerList = new RestrictedGeneric<>();
        integerList.add(98);
        integerList.add(23);
        integerList.add(67);
        System.out.println(integerList.values);
    }
}
