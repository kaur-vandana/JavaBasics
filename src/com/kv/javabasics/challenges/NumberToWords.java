package com.kv.javabasics.challenges;

public class NumberToWords {
    // write your code here
    public static void numberToWords(int number) {

        int r;
        if(number < 0)
            System.out.println("Invalid Value");

        int digits = getDigitCount(number);
        number = reverse(number);

        int count =0;
        for(int i=0 ; i< digits; i++) {
            while(number!=0) {
                r= number%10;
                count++;
                switch(r) {
                    case 0:
                        System.out.println("Zero");
                        break;
                    case 1:
                        System.out.println("One");
                        break;
                    case 2:
                        System.out.println("Two");
                        break;
                    case 3:
                        System.out.println("Three");
                        break;
                    case 4:
                        System.out.println("Four");
                        break;
                    case 5:
                        System.out.println("Five");
                        break;
                    case 6:
                        System.out.println("Six");
                        break;
                    case 7:
                        System.out.println("Seven");
                        break;
                    case 8:
                        System.out.println("Eight");
                        break;
                    case 9:
                        System.out.println("Nine");
                        break;
                }
                number = number/10;
            }
        }
        if(count!=digits) {
            int j = digits-count;
            while (j>0) {
                System.out.println("Zero");
                j--;
            }
        }

    }

    public static int getDigitCount(int number) {
        if(number<0)
            return -1;
        //return number of digits
        if(number==0)
            return 1;
        int sum=0;
        while(number!=0) {
            sum++;
            number = number / 10;
        }
        return sum;
    }

    public static int reverse(int number) {
        int sum=0, r;
        while(number!=0) {
            r = number % 10;
            sum = sum * 10 + r;
            number = number / 10;
        }
        return sum;
    }

    public static void main(String[] args) {
//       numberToWords(123);
        numberToWords(0);
        numberToWords(100);
    }

}


