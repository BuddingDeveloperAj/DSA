package com.bs_sums;

public class SerachInRotatedArray {
    public static void main(String[] args) {
        int[] arr = {3,5,1};
        int peak = PeakSearch(arr, 0, arr.length - 1);
        int target = 3;


        if (peak == -1){
            System.out.println(BinarySearch(arr, target, 0, arr.length - 1));
        }

        if (arr[peak] == target){
            System.out.println(peak);
        }

        if (arr[0] <= target){
            System.out.println(BinarySearch(arr, target, 0, peak - 1));
        }
        else{
            System.out.println(BinarySearch(arr, target, peak + 1, arr.length - 1));
        }
    }

    static int PeakSearch(int[] arr, int start, int end){
        while (start <= end){
            int mid = start + (end - start)/2;

            if (mid < end && arr[mid] > arr[mid + 1]){
                return mid;
            }
            if (mid > start && arr[mid - 1] > arr[mid]){
                return mid - 1;
            }
            if (arr[mid] < arr[start]){
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }
        return -1;
    }

    static int BinarySearch(int[] arr, int target, int start, int end){
        while (start <= end){
            int mid = start + (end - start)/2;

            if (arr[mid] == target){
                return mid;
            }
            if (arr[mid] > target){
                end = mid - 1;
            }
            else {
                start = mid + 1;
            }
        }
        return -1;
    }
}
