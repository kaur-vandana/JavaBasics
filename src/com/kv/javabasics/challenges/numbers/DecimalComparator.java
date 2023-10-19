package com.kv.javabasics.challenges.numbers;

public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces(double one, double two) {
        one = one * 1000;
        two = two * 1000;

        if((int) one == (int) two)
            return true;

        return false;
    }
    public static void main(String[] args) {
       boolean x= areEqualByThreeDecimalPlaces(89.456777, 89456987);
        System.out.println("numbers are equal up to 3 decimal places (89.456777, 89456987) " + x );

       x = areEqualByThreeDecimalPlaces(-3.1756, -3.175);
       System.out.println("numbers are equal up to 3 decimal places (-3.1756, -3.175) " + x );

        x = areEqualByThreeDecimalPlaces(3.175, 3.176);
        System.out.println("numbers are equal up to 3 decimal places  (3.175, 3.176) " + x );

        x = areEqualByThreeDecimalPlaces(3.0, 3.0);
        System.out.println("numbers are equal up to 3 decimal places (3.0, 3.0) " + x );

        x = areEqualByThreeDecimalPlaces(-3.123, 3.123);
        System.out.println("numbers are equal up to 3 decimal places (-3.123, 3.123) " + x );

    }
}
