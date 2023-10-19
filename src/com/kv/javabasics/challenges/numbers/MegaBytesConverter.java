package com.kv.javabasics.challenges.numbers;

public class MegaBytesConverter {
    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        int megaCount =0;
        int i = kiloBytes;

        if(i< 0) {
            System.out.println("Invalid Value");
        } else {
            while(kiloBytes>=1024) {
                kiloBytes = kiloBytes-1024;
                megaCount++;
            }
            // 1MB = 1024KB
            System.out.println(i + " KB = " + megaCount + " MB and " + kiloBytes + " KB");
        }

    }

    public static void main(String[] args) {
        printMegaBytesAndKiloBytes(1024);
    }
}
