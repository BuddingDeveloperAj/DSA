package com.Recursion;

public class Numbers {
    public static void main(String[] args) {
        print(1);
    }
    static void print(int n){
        if (n==6) return;
        System.out.println(n);
        print(n+1);
    }

}
