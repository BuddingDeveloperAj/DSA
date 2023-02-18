package com.bs_sums;

public class FindNoOfRotations {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        System.out.println(PeakIndex(arr) + 1);
    }

    public static int PeakIndex(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end){
            int mid = start + (end - start) / 2;

            if (mid > start && arr[mid] > arr[mid + 1]){
                return mid;
            }
            if (end > mid && arr[mid] < arr[mid - 1]){
                return mid - 1;
            }
            if (arr[start] > arr[mid]){
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }
        return -1;
    }
}
