package com.bs_sums;

import java.util.Arrays;

public class doubleofNexistinarr {
    public static void main(String[] args) {
        int[] arr = {-2,0,10,-19,4,6,-8};
        Arrays.sort(arr);

        for (int num:arr){
            int start = 0;
            int end = arr.length - 1;
            while (start <= end){
                int mid = start + (end - start)/2;

                if (arr[mid] == num*2) {
                    System.out.println("true");
                    return;
                }
                else if(arr[mid] > num*2) end = mid - 1;
                else start = mid + 1;
            }
        }
        System.out.println("false");
        return;
    }
}

