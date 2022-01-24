package com.kv.javaCourse.basic;

//name method name with different parameters
public class MethodOverloading {

    public static int newScore(String playerName, int score) {
        System.out.println(playerName + " scored " + score);
        return score*10;
    }

    //different number of parameters - works
    public static int newScore(int score) {
        System.out.println(score);
        return score*10;
    }

    //parameter with different data type - works
    public static int newScore(String score) {
        if(!score.isEmpty()) {
            System.out.println(score);
            return 10;
        }
        else
            return 0;
    }

    //different access modifier - works
    protected static int newScore() {
        System.out.println("0");
        return 0;
    }

//    overloading cannot be done by changing the return type
//    public static void newScore() {
//    }

    public static void main(String[] args) {
        int x = newScore("Vandana", 23);
        x = newScore(98);
        x = newScore();
        x = newScore("100");

    }
}
