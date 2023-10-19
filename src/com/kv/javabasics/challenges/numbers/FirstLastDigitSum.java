package com.kv.javabasics.challenges.numbers;

public class FirstLastDigitSum {
    public static int sumFirstAndLastDigit(int number) {
        if(number<0)
            return -1;
        int lastDigit = number%10;
        int firstDigit =0;

        while(number!=0) {
            firstDigit = number%10;
            number /= 10;
        }
        return lastDigit+firstDigit;
    }

    public static void main(String[] args) {
        System.out.println( sumFirstAndLastDigit(567821));
        System.out.println( sumFirstAndLastDigit(-5));
        System.out.println( sumFirstAndLastDigit(3));
        System.out.println( sumFirstAndLastDigit(11));
   }
}
