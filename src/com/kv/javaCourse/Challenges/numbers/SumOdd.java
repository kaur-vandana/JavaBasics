package com.kv.javaCourse.Challenges.numbers;

public class SumOdd {
    public static boolean isOdd(int num) {
        if(num<0)
            return false;
        if(num%2 ==1)
            return true;
        else
            return false;
    }

    public static int sumOdd(int start, int end) {
        if(start<0 || end <0 || start>end)
            return -1;
        int sum =0;
        for(int i = start; i<=end ; i++) {
            if(isOdd(i))
                sum= sum+i;
        }
        return sum;
    }
}
