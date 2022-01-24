package com.kv.javaCourse.Challenges.numbers;

public class EvenDigitSum {
    public static int getEvenDigitSum(int number) {
        if(number<0)
            return -1;
        int r=0, sum=0;
        while(number>0) {
            r= number%10;
            if(r%2 ==0) {
                sum = sum+ r;
            }
            number=number/10;
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println(getEvenDigitSum(12128888));
    }
}
