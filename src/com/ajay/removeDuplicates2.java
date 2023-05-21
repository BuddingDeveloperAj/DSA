package com.ajay;

import java.util.Arrays;

public class removeDuplicates2 {
    public static void main(String[] args) {
        int[] nums = {1,1,1,2,2,3};
        int i = 0;
        for (int num : nums) {
            if (i < 2 || num > nums[i - 2]) {
                nums[i++] = num;
            }
        }
        System.out.println(Arrays.toString(Arrays.copyOfRange(nums, 0, i)));
    }
}
