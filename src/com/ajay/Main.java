package com.ajay;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {5,4,3,8,9};
        change(arr);
        System.out.println(Arrays.toString(arr));

    }

    public static void change(int[] n){
        n[2] = 20;
    }

//    public static String change(String naam){
//        naam = "Ravi";
//        return naam;
//    }
//
//    public static int numchange(int n) {
//        n = 21;
//        return n;
//    }
}