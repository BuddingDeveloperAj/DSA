package com.bs_sums;

public class Min_size_subarray_sum {
    public static void main(String[] args) {

        int[] nums = {2,3,1,1,4,2,1};
        int target = 7;

        int n = nums.length;
        int[] prefixSum = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            prefixSum[i] = prefixSum[i - 1] + nums[i - 1];
        }
        int ans = Integer.MAX_VALUE;
        int left = 1, right = n;
        while (left <= right) {
            int mid = (left + right) / 2;
            boolean found = false;
            for (int i = mid; i <= n; i++) {
                if (prefixSum[i] - prefixSum[i - mid] >= target) {
                    found = true;
                    break;
                }
            }
            if (found) {
                ans = Math.min(ans, mid);
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        System.out.println(ans == Integer.MAX_VALUE ? 0 : ans);
    }
}
