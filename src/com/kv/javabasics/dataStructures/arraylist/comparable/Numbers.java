package com.kv.javaCourse.dataStructures.arraylist.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Numbers implements Comparable<Numbers>{
    int runs;

    public Numbers(int runs) {
        this.runs = runs;
    }

    @Override
    public String toString() {
        return runs + "";
    }

    @Override
    public int compareTo(Numbers num) {
        if(this.runs > num.runs)
            return 1;
        if(this.runs < num.runs)
            return -1;
        return 0;
    }

    public static void main(String[] args) {
        List<Numbers> num = new ArrayList<>();

        num.add(new Numbers(45));
        num.add(new Numbers(21));
        num.add(new Numbers(87));
        num.add(new Numbers(100));

        Collections.sort(num);
        System.out.println(num);
    }
}
