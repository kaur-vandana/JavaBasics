package com.kv.javabasics.challenges;

public class MinutesToYearsDaysCalculator {
    public static void printYearsAndDays(long minutes) {
        long years =0, days =0, hours=0;
        long i=minutes;
        if(minutes<0) {
            System.out.println("Invalid Value");
        } else {
            while (minutes>=60) {
                minutes-=60;
                hours++;
            }
            while (hours>=24) {
                hours-=24;
                days++;
            }
            while (days>=365) {
                days-=365;
                years++;
            }
            System.out.println(i + "min = " + years + "y and " + days + "d");
        }
    }
}