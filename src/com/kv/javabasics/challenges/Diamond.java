package com.kv.javabasics.challenges;

public class Diamond {
    public static void main(String[] args) {
        for(int i =0 ; i<10 ; i++) {
            for(int j=0 ; j<=i ; j++) {
                if(i+j<10)
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
