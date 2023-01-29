package com.ajay;

import java.util.Arrays;


public class Reverse {
    public static void main(String[] args) {
        int[] arr = {1,2,5,52,87,58,51,2,46,9};
        System.out.println(Arrays.toString(arr));
        reverse(arr);

        System.out.println(Arrays.toString(arr));

    }

    public static void reverse(int[] a) {
        for (int i = 0; i < a.length/2; i++) {
            int end = a.length - 1;
            swap(a, i, end - i);
        }
    }

    private static int[] swap(int[] a, int i, int i1) {
        int temp = a[i1];
        a[i1] = a[i];
        a[i] = temp;
        return a;
    }

}
