package com.bs_sums;

public class Min_size_subarray_sum {
    public static void main(String[] args) {

        int[] nums = {2,3,1,1,4,3};
        int target = 7;

//        int n = nums.length;
//        int[] prefixSum = new int[n + 1];
//        for (int i = 1; i <= n; i++) {
//            prefixSum[i] = prefixSum[i - 1] + nums[i - 1];
//        }
//        int ans = Integer.MAX_VALUE;
//        int left = 1, right = n;
//        while (left <= right) {
//            int mid = (left + right) / 2;
//            boolean found = false;
//            for (int i = mid; i <= n; i++) {
//                if (prefixSum[i] - prefixSum[i - mid] >= target) {
//                    found = true;
//                    break;
//                }
//            }
//            if (found) {
//                ans = Math.min(ans, mid);
//                right = mid - 1;
//            } else {
//                left = mid + 1;
//            }
//        }
//        System.out.println(ans == Integer.MAX_VALUE ? 0 : ans);
//        int n = nums.length;
//        int left = 0;
//        int right = n;
//        int ans = n + 1;
//
//        while (left <= right) {
//            int mid = left + (right - left) / 2;
//
//            if (check(target, nums, mid)) {
//                ans = Math.min(ans, mid);
//                right = mid - 1;
//            } else {
//                left = mid + 1;
//            }
//        }
//
//        System.out.println(ans == n + 1 ? 0 : ans);
//    }
//
//    static boolean check(int target, int[] nums, int size) {
//        int sum = 0;
//        for (int i = 0; i < nums.length; i++) {
//            if (i >= size) {
//                sum -= nums[i - size];
//            }
//            sum += nums[i];
//            if (sum >= target) {
//                return true;
//            }
//        }
//        return false;
        if (nums == null || nums.length == 0)
            System.out.println(0);

        int start = 0,  end = 0,  sum = 0,  minLength = Integer.MAX_VALUE;

        while (end < nums.length) {
            sum += nums[end++];

            while (sum >= target) {
                minLength = Math.min(minLength, end - start);
                sum -= nums[start++];
            }
        }

        System.out.println(minLength == Integer.MAX_VALUE ? 0 : minLength);
    }
}
