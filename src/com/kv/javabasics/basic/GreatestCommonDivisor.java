package com.kv.javaCourse.basic;

public class GreatestCommonDivisor {

    public static int getGreatestCommonDivisor(int first, int second) {
        if(first<10 || second<10)
            return -1;
        int small;
        if(first<second)
            small = first;
        else
            small = second;

        while(small>0) {
            if(first%small ==0 && second %small == 0)
                break;
            small--;
        }

        return small;
    }

    public static void main(String[] args) {
        System.out.println(getGreatestCommonDivisor(13,30));
        System.out.println(getGreatestCommonDivisor(15,30));
        System.out.println(getGreatestCommonDivisor(20,30));
    }
}
