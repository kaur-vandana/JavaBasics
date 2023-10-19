package com.kv.javabasics.challenges;

public class DiagonalStar {
        // write your code here
        public static void printSquareStar(int n) {
            if(n<5)
                System.out.println("Invalid Value");

           else
            {
                // Loop denoting rows
                for (int i = 0; i < n; i++) {

                    // Loop denoting columns
                    for (int j = 0; j < n; j++) {

                        // Checking boundary conditions
                        // and main diagonal and
                        // secondary diagonal conditions
                        if (i == 0 || j == 0 || i == j
                                || i == n - 1 || j == n - 1
                                || i + j == n - 1)
                            System.out.print("*");
                        else
                            System.out.print(" ");
                    }
                    System.out.println();
                }
            }
    }

    public static void main(String[] args) {
        printSquareStar(6);
    }

}
