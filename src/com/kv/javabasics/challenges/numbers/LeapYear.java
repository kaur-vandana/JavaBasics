package com.kv.javabasics.challenges.numbers;

public class LeapYear {

    public static boolean isLeapYear(int year) {
        if(!(year>=1 && 9999>=year))
            return false;
        if((year%4==0 && year%100!=0) || year%400==0) {
            return true;
        }
        return false;
    }
    public static int getDaysInMonth(int month, int year) {
        if(!(year>=1 && 9999>=year))
            return -1;
       if(month<1 || month >12)
            return -1;
        else if(month == 2 && isLeapYear(year))
            return 29;
        else if(month == 2 && !isLeapYear(year))
            return 28;
        else if(month ==8 || month ==1 || month ==3 || month ==5 || month ==7 || month ==10 || month ==12)
            return 31;
        else return 30;
    }

    public static void main(String[] args) {
        boolean b = isLeapYear(100000);
        System.out.println(" is year 100000 a leap year = "+ b);

        b = isLeapYear(-1200);
        System.out.println(" is year -1200 a leap year = "+ b);

        b = isLeapYear(1924);
        System.out.println(" is year 1924 a leap year = "+ b);

        b = isLeapYear(1800);
        System.out.println(" is year 1800 a leap year = "+ b);
    }
}


