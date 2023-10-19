package com.kv.javaCourse.basic.generiC;

import java.util.ArrayList;
import java.util.List;

public class MyGenericList<T>{
    private List<T> values = new ArrayList<>();;

    void add(T value) {
        values.add(value);
    }

    void remove(T value) {
        values.remove(value);
    }
    T get(int index) {
        return values.get(index);
    }

    public static void main(String[] args) {
        MyGenericList<String> stringMyGenericList = new MyGenericList<>();
        stringMyGenericList.add("first");
        stringMyGenericList.add("second");
        System.out.println(stringMyGenericList.values);

        stringMyGenericList.remove("first");
        System.out.println(stringMyGenericList.values);

        MyGenericList<Integer> integerMyGenericList = new MyGenericList<>();
        integerMyGenericList.add(98);
        integerMyGenericList.add(23);
        integerMyGenericList.add(67);
        System.out.println(integerMyGenericList.values);
    }
}
