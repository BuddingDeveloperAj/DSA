package com.bs_sums;

import java.util.Arrays;

public class longestsubsequence {
    public static int lengthOfLIS(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        int n = nums.length;
        int[] dp = new int[n];
        Arrays.fill(dp, 1);

//        for (int i = 1; i < n; i++) {
//x            for (int j = 0; j < i; j++) {
//                if (nums[i] > nums[j]) {
//                    dp[i] = Math.max(dp[i], dp[j] + 1);
//                }
//            }
//        }

        int maxLen = 0;
        for (int len : dp) {
            maxLen = Math.max(maxLen, len);
        }

        return maxLen;
    }

    public static void main(String[] args) {
        int[] nums = {10, 9, 2, 5, 3, 7, 101, 18};
        int result = lengthOfLIS(nums);
        System.out.println(result);  // Output: 4
    }
}
