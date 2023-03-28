package com.sorting;

import java.util.Arrays;

public class selection_sort {
    public static void main(String[] args) {
        int[] arr = {6,0,5,2,3,1};
        int N = arr.length;
        for (int i = 0; i <= N-1; i++) {
            int res = getMaxInt(arr, 0, N-1-i);
            swapNum(arr, N-1-i, res);
        }
        System.out.println(Arrays.toString(arr));
    }

    public static int getMaxInt(int[] arr, int start, int end){
        int res = start;
        for (int i = start; i <= end; i++) {
            if (arr[res] < arr[i]) res = i;
        }
        return res;
    }

    public static void swapNum(int[] arr, int target, int index){
        int temp = arr[index];
        arr[index] = arr[target];
        arr[target] = temp;
    }
}
