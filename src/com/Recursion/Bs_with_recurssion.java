package com.Recursion;

public class Bs_with_recurssion {
    public static void main(String[] args) {
        int target = 8;
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(search(arr, 0, arr.length-1, target));
    }

    public static int search(int[] arr, int start, int end, int target){
        if (start > end) return -1;
        int mid = start + (end - start)/2;

        if (arr[mid] == target) return mid;

        int ans = (target > arr[mid]) ? search(arr, mid+1, end, target) : search(arr, start, mid-1, target);
        return ans;
    }
}
