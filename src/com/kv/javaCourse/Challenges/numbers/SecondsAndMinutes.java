package com.kv.javaCourse.Challenges.numbers;
//Method Overloading
public class SecondsAndMinutes {
    public static String getDurationString(int minutes, int seconds){
        int hour=0;
        if(minutes<0)
            return "Invalid value";

        if(seconds<0 && seconds>59)
            return "Invalid value";

        while (minutes>=60) {
            minutes-=60;
            hour++;
        }
        return hour+ "h " + minutes + "m "+ seconds + "s";
    }

    public static String getDurationString(int seconds) {
        int minutes =0;
        if(seconds<0)
            return "Invalid value";
        while(seconds>=60) {
            seconds-=60;
            minutes++;
        }

        return minutes + "m "+ seconds + "s";
    }

    public static void main(String[] args) {
        System.out.println(getDurationString(60,56));

        System.out.println(getDurationString(3600));
    }
}
