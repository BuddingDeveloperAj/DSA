package com.bs_sums;

public class FindKthP_integer_leet {
    public static void main(String[] args) {
        int[] arr = {2,3,4,7,11};
        int k = 5;
        int left = 0, right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] - mid - 1 < k) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        System.out.println(left+k);
    }
}
