package com.kv.javaCourse.Challenges.numbers;

public class LargestPrime {
    public static int getLargestPrime(int n) {
        if (n <=0)
            return -1;
        int maxPrime = -1;

        // Print the number of 2s
        // that divide n
        while (n % 2 == 0) {
            maxPrime = 2;

            // equivalent to n /= 2
            n >>= 1;
        }
        // n must be odd at this point
        while (n % 3 == 0) {
            maxPrime = 3;
            n = n / 3;
        }

        // now we have to iterate only for integers
        // who does not have prime factor 2 and 3
        for (int i = 5; i <= Math.sqrt(n); i += 6) {
            while (n % i == 0) {
                maxPrime = i;
                n = n / i;
            }
            while (n % (i + 2) == 0) {
                maxPrime = i + 2;
                n = n / (i + 2);
            }
        }

        // This condition is to handle the case
        // when n is a prime number greater than 4
        if (n > 4)
            maxPrime = n;

        return maxPrime;
    }

    public static void main(String[] args) {
        System.out.println(getLargestPrime(21));
    }
}
