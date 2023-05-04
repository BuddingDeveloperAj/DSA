package com.bs_sums;

import java.util.Arrays;

public class sq_of_sorted_matrix {
    public static void main(String[] args) {
        int[] nums = {-4,-1,0,3,10};

        int len = nums.length;
        int start = 0;
        int[] res = new int[len];
        int end = len - 1;
        int i = len - 1;

        while (start <= end){
            if (nums[start] * nums[start] > nums[end] * nums[end]){
                res[i] = nums[start] * nums[start];
                start++;
            }
            else{
                res[i] = nums[end]*nums[end];
                end--;
            }
            i--;
        }
        System.out.println(Arrays.toString(res));
    }
}
