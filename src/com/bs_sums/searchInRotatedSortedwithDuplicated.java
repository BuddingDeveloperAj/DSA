package com.bs_sums;

public class searchInRotatedSortedwithDuplicated {
    public static void main(String[] args) {
        int target = 1;
        int[] nums = {3,5,1};
        int n = nums.length;
        int left = 0, right = n - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                System.out.println(true);
            }

            if (nums[left] == nums[mid] || nums[mid] == nums[right]){
                if (nums[left] == target) System.out.println(true);
                else left = left + 1;

                if (nums[right] == target) System.out.println(true);
                else right = right - 1;
            }

            if (nums[0] <= nums[mid] && target < nums[mid]){
                if (nums[mid] < target) left = mid + 1;
                else right = mid - 1;
            }
            else{
                if (nums[mid] < target && target <= nums[n-1]) left = mid + 1;
                else right = mid - 1;
            }

        }

        System.out.println(false);
    }
}
