package com.sorting;

import java.util.Arrays;

public class cyclic_sort {
    public static void main(String[] args) {
        int[] arr = {3,2,2};
        int i = 0;
        while (i < arr.length){
            int correct = arr[i] - 1;

            if (arr[correct] != arr[i]){
                int temp = arr[correct];
                arr[correct] = arr[i];
                arr[i] = temp;
            }
            else{
                i++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }


}
