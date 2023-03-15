package com.bs_sums;

import org.w3c.dom.ls.LSOutput;

public class SingleNoDuplicate {
    public static void main(String[] args) {
        System.out.println(findindex());
    }

    public static int findindex(){
        int[] nums = {1};
        int start = 0;
        int end = nums.length -1;
        while (start <= end){
            int mid = start + (end - start)/2;
            mid = mid + (mid%2);

            //if (mid % 2 == 0 && nums[mid]!=nums[mid+1]) return (nums[mid]);

            if (mid<end && nums[mid] == nums[mid+1]) start = mid+1;
            else if (start<mid && nums[mid] == nums[mid-1]) end = mid  - 1;
            else return nums[mid];

        }
        return -1;
    }
}
