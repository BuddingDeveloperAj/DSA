package com.bs_sums;

public class peakIndex {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,8,12,11,10,9,6,2,1};

        int start = 0;
        int end = arr.length;

        while (start != end){
            int mid = start + (end - start)/2;

            if (arr[mid] > arr[mid + 1]){
                end = mid;
            }
            else if(arr[mid] < arr[mid + 1]){
                start = mid + 1;
            }
        }

        System.out.println(arr[start]);
    }
}
