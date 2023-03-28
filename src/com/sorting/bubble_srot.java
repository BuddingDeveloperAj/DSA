package com.bubble_sort;

import java.util.Arrays;

public class bubble_srot {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        int N = arr.length;

        int i = 0;

        while (i < N){
            int j = 1;
            boolean is_swapped = false;
            while (j < N-i) {
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    is_swapped = true;
                }
                j++;
            }
            if (!is_swapped) break;
            i++;
        }
        System.out.println(Arrays.toString(arr));
    }
}
