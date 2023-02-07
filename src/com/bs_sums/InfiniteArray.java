package com.bs_sums;

public class InfiniteArray {
    //Find position of an element in a sorted array of infinite numbers
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,7,8,9,10,12,14,16,17,19,21,22,25,27,29,34,39,40};
        int target = 21;

        System.out.println(search(arr, target));
    }

    public static int search(int[] arr, int target) {
        int start = 0;
        int end = 1;

        while (target > arr[end]){
            int temp = end + 1;
            end = end + (end - start + 1) * 2;
            start = temp;
        }
        return BS(arr, target, start, end);
    }

    public static int BS(int[] arr, int target, int start, int end){
        while (start <= end){
            int mid = start + (end - start)/2;

            if (target < arr[mid]){
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
}
