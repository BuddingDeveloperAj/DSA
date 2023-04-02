package com.bs_sums;

public class findFirst_Last {
    public static void main(String[] args) {
        int[] nums = {5,7,7,8,8,9};
        int target = 8;

        System.out.println(Search(nums, target, true));
        System.out.println(Search(nums, target, false));

    }

    public static int Search(int[] arr, int target, boolean ops){
        int ans = -1;
        int start = 0;
        int end = arr.length - 1;

        while (start <= end){
            int mid = start + (end - start)/2;

            if (target > arr[mid]){
                start = mid + 1;
            }
            else if (target < arr[mid]){
                end = mid - 1;
            }
            else{
                ans = mid;
                if (ops){
                    end = mid - 1;
                }
                else{
                    start = mid + 1;
                }
            }
        }
        return ans;
    };

//    public static int LBinarySearch(int[] arr, int target){
//        int start = 0;
//        int end = arr.length - 1;
//
//        while (start <= end){
//            int mid = start + (end - start)/2;
//
//            if (((start == mid) || (start < mid && arr[mid - 1] != target)) && arr[mid] == target){
//                return mid;
//            }
//
//            if (target > arr[mid]){
//                start = mid + 1;
//            }
//            else{
//                end = mid - 1;
//            }
//        }
//        return -1;
//    }
//
//    public static int RBinarySearch(int[] arr, int target){
//        int start = 0;
//        int end = arr.length - 1;
//
//        while (start <= end){
//            int mid = start + (end - start)/2;
//
//            if (((end == mid) || (mid < end && arr[mid + 1] != target)) && arr[mid] == target){
//                return mid;
//            }
//
//            if (target < arr[mid]){
//                end = mid - 1;
//            }
//            else{
//                start = mid + 1;
//            }
//        }
//        return -1;
//    }
}
