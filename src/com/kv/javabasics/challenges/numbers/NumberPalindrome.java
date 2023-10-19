package com.kv.javabasics.challenges.numbers;

public class NumberPalindrome {
//    public static boolean isPalindrome(int num) {
//        int length = String.valueOf(num).length();
//
//        if(length% 2 != 0)
//            return false;
//
//        if(num %10 == num)
//            return true;
//        char[] ch = String.valueOf(num).toCharArray();
//
//        for(int i=0 ,j=length/2+1; i<=length/2 && j>=0; i++, j--) {
//            if(ch[i] != ch[j])
//                return false;
//        }
//        return true;
//    }

//    public static boolean isPalindrome(int number) {
//        StringBuffer reverse = new StringBuffer(number).reverse();
//
//        if(reverse.equals(""))
//            return false;
//        if(Integer.parseInt(reverse.toString()) == number)
//            return true;
//        else
//            return false;
//    }
public static boolean isPalindrome(int number) {
    if(number<0)
        number=number*(-1);

    int temp=number, sum=0, r;

    while(number>0){
        r=number%10;  //getting remainder
        sum=(sum*10)+r;
        number=number/10;
    }

    System.out.println(sum);
    if(temp==sum)
        return true;
    else
       return false;
}

    public static void main(String[] args) {
        System.out.println("is Palindrome = " +  isPalindrome(1221));
        System.out.println("is Palindrome = " +  isPalindrome(10));
    }
}
