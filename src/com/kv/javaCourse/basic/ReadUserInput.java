package com.kv.javaCourse.basic;

import java.util.Scanner;

public class ReadUserInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        String s1 = scanner.next();
        System.out.println("string = " + string +" "+ s1);

/*       //not possible
        int i = scanner.nextLine();
        int s = scanner.next();
        */

        int i = scanner.nextInt();
        System.out.println("int  = " + i);

        double d = scanner.nextDouble();
        System.out.println("double  = " + d);


        scanner.close();
    }
}
