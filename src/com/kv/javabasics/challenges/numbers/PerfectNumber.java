package com.kv.javabasics.challenges.numbers;

public class PerfectNumber {
    public static boolean isPerfectNumber(int num) {
        int sum=0;
        if(num<1)
            return false;

        else {
            for(int i=1; i<num; i++) {
                if(num%i == 0)
                    sum = sum + i;
            }
        }
        if(sum == num)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        System.out.println(isPerfectNumber(6));
        System.out.println(isPerfectNumber(28));
        System.out.println(isPerfectNumber(5));
        System.out.println(isPerfectNumber(-1));
    }
}
