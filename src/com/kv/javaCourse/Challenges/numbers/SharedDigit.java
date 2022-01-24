package com.kv.javaCourse.Challenges.numbers;

//Both integer have at least one same digit
public class SharedDigit {

    public static void main(String[] args) {
        //false
        System.out.println(hasSharedDigit(9,71));
        System.out.println(hasSharedDigit(94245,5));

        //true
        System.out.println(hasSharedDigit(17,71));
        System.out.println(hasSharedDigit(19,99));
        System.out.println(hasSharedDigit(19,13));

    }
    public static boolean hasSharedDigit(int x, int y) {
        if(x<10 || x>99)
            return false;

        if(y<10 || y>99)
            return false;

        int r1, r2;
        int num2=y;

        while(x!=0) {
            r1 = x%10;
            y=num2;
            while(y!=0) {
                r2 = y%10;
                if(r1 == r2)
                    return true;
                y /= 10;
            }
            x /= 10;
        }
        return false;
    }



/*
* int a,b;
        if(x>=10 || x<=99 || y>=10 || y<=99)
            return false;
        if(x==y)
            return true;

        while(x>0) {
            a=x%10;
            x=x/10;

            while(y>0) {
                b=y%10;
                if(a==b) {
                    return true;
                }
                y=y/10;
            }
        }
        return false;
    }
*
* */


}
