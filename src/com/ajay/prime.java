package com.ajay;

public class prime {
    public static void main(String[] args) {
        Prime(8);
    }

    static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        int c = 2;
        while (c* c <= n) {
            if (n % c == 0) {
                return false;
            }
            c++;
        }
        return true;
    }

    static void Prime(int n){
        if (n <= 1){
            System.out.println("No prime");
        }


    }
}
