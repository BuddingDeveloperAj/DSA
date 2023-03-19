package com.bs_sums;

public class FindminInRotated154 {
    public static void main(String[] args) int start = 0;
        int end = nums.length - 1;

        if (end < 1){
        return nums[end];
    }

        while (start <= end){
        int mid = start + (end - start)/2;

        if (mid > start && nums[mid] < nums[mid - 1]){
            return nums[mid];
        }

        if (nums[0] < nums[nums.length - 1]){
            return nums[0];
        }

        if (end > mid && nums[mid] > nums[mid + 1]){
            return nums[mid + 1];
        }

        if (nums[start] == nums[mid] || nums[mid] == nums[end]){
            if (start < mid && nums[start] > nums[start + 1]){
                return nums[start + 1];
            }
            start++;

            if (nums[end] < nums[end - 1]){
                return nums[end];
            }
            end--;
        }
        else if(nums[0] < nums[mid] || nums[start] == nums[mid] && nums[mid] > nums[end]){
            start = mid + 1;
        }
        else{
            end = mid - 1;
        }
    }
        return -1;
    }
}
