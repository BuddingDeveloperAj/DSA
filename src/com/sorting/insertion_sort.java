package com.sorting;

import java.util.Arrays;

public class insertion_sort {
    public static void main(String[] args) {
        int[] arr = {5,4,5,1,4,3,2,1};
        sort(arr);
        System.out.println(Arrays.toString(arr));;
    }

    public static void sort(int[] arr){
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i+1; j > 0; j--){
                if (arr[j-1] > arr[j]){
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
                else{
                    break;
                }
            }
        }
    }
}
