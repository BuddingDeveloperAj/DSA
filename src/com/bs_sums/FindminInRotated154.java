package com.bs_sums;

public class FindminInRotated154 {
    public static void main(String[] args) {
        int nums[] = {1,1};
        int start = 0;
        int end = nums.length - 1;

        if (end < 1){
            System.out.println(nums[end]);
        }

        while (start <= end){
            int mid = start + (end - start)/2;

            if (mid > start && nums[mid] < nums[mid - 1]){
                System.out.println(nums[mid]);
            }

            if (nums[0] < nums[nums.length - 1]){
                System.out.println(nums[0]);
            }

            if (end > mid && nums[mid] > nums[mid + 1]){
                System.out.println(nums[mid + 1]);
            }

            if (nums[start] == nums[mid] && nums[mid] == nums[end]){
                if (nums[start] == nums[mid]){
                    if (start < mid && nums[start] > nums[start + 1]){
                        System.out.println(nums[start+1]);
                    }
                    else {
                        start++;
                    }
                }
                else if(nums[start] == nums[mid]){
                    if (end >= mid && nums[end] <= nums[end - 1]){
                        System.out.println(nums[end]);
                    }
                    else{
                        end--;
                    }
                }
            }
            else if(nums[0] < nums[mid] || nums[start] == nums[mid] && nums[mid] > nums[end]){
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        System.out.println(-1);
    }

}
