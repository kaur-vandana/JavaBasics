package com.kv.javabasics.challenges.numbers;

public class IsPrime {
    public static boolean isPrime(int n) {
        if(n==1)
            return false;
        for(int i=2; i<= n/2 ; i++) {
            if(n%i ==0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println("is 1 a prime " + isPrime(1));
        System.out.println("is 13 a prime " + isPrime(13));
    }
}
