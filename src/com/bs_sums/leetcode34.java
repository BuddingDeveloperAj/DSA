package com.bs_sums;

public class leetcode34 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,7,7,7,7,8,8,9,10};
        int target = 9;
        
        First(arr, target);
        Last(arr, target);
    }

    static void First(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;

        while (start <= end){
            int mid = start + (end - start)/2;

            if (target > arr[mid]){
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        System.out.println(arr[start]);
        System.out.println(start);
    };

    static void Last(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;

        while (start <= end){
            int mid = start + (end - start)/2;

            if (target >= arr[mid]){
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        System.out.println(arr[end]);
        System.out.println(end);
    };
}
