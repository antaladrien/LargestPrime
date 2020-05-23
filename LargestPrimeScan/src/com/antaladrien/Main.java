package com.antaladrien;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter number: ");
        int num = myObj.nextInt();

        System.out.println("The largest prime factor of a given number: " + getLargestPrime(num));

    }

    public static int getLargestPrime(int number) {

        if (number <= 1) {
            System.out.println("The number is negative or does not have any prime numbers");
            return -1;
        }

        int prime = 0;
        for(int i = 2; i <= number; i++) {
            if(number % i == 0) {
                number /= i;
                prime = i;
                i--;
            }
        }
        return prime;
    }
}
