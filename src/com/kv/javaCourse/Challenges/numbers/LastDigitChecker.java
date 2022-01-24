package com.kv.javaCourse.Challenges.numbers;

public class LastDigitChecker {
    public static boolean hasSameLastDigit(int num1, int num2, int num3) {

       if( !isValid( num1) || !isValid( num2) || !isValid( num3) )
           return false;

        int last1 =0,last2 =0, last3=0;

        //fetch the first digit of the number
        last1= num1%10;
        last2= num2%10;
        last3= num3%10;

        if(last1 == last2 || last1 == last3 || last2 == last3)
            return true;
        else
            return false;
    }

    public static boolean isValid(int num) {
        if(num <10 || num> 1000)
            return false;
        return true;
    }

    public static void main(String[] args) {
//        //false
//        System.out.println(hasSameLastDigit(1, 15,67));
//        System.out.println(hasSameLastDigit(123, 1,89));
//        System.out.println(hasSameLastDigit(123, 178,7));
//
//        //true
//        System.out.println(hasSameLastDigit(123, 183,98));
//        System.out.println(hasSameLastDigit(123, 98,98));
        System.out.println(hasSameLastDigit(11, 22,31));
    }
}
