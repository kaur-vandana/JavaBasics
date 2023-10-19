package com.kv.javabasics.basic;

public class PrimitiveTypes {
    public static void main(String[] args) {

        // int
        // making the value more readable
        int j = 1_132_132_165;

        byte byteMinValue = Byte.MIN_VALUE;
        byte byteMaxValue = Byte.MAX_VALUE;

        System.out.println("Byte Min Val = " + byteMinValue +
                "\n" + "Byte Max Val =" + byteMaxValue);

        System.out.println("Integer min Val = " + Integer.MIN_VALUE);
        System.out.println("Integer max Val = " + Integer.MAX_VALUE);

        short shortVal = 32767;
        System.out.println("Short min Val = " + Short.MIN_VALUE);
        System.out.println("Short max Val = " + Short.MAX_VALUE);

        long longVal = 10000L;
        long longVal2 = 10000;
        System.out.println("Long min Val = " + Long.MIN_VALUE);
        System.out.println("Long max Val = " + Long.MAX_VALUE);

        System.out.println("Float min Val = " + Float.MIN_VALUE);
        System.out.println("Float max Val = " + Float.MAX_VALUE);

        System.out.println("Double min Val = " + Double.MIN_VALUE);
        System.out.println("Double max Val = " + Double.MAX_VALUE);

        //Casting
        int i = j/2;

//        byteMinValue/2 return an int value
        byte b = (byte)(byteMinValue/2);

        short s = (short) (shortVal/2);

        float floatVal = (float) 797.23;
        float floatVal1 = 797.23f;
        floatVal1 = 797.23f / 784551.5468f;
        float floatVal2 = 9;
        floatVal2 = 9 / 4;

        double doubleVal = 745.85642;
        double doubleVal1 = 10;
        double doubleVal2 = 34567.9865465421d;

        char c = 'A';
        char a = '\u0041';
        System.out.println(a);

        boolean imTrue = true;
        boolean imFalse = false;

    }
}
