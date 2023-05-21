package com.ajay;

import java.util.Arrays;

public class Move_zeroes_283 {
    public static void main(String[] args) {
        int[] nums = {45192,0,-659,-52359,-99225,-75991,0,-15155,27382,59818,0,-30645,-17025,81209,887,64648};
//        int end = nums.length - 1;
//        int i = 0;
//        while (i <= end){
//            if (nums[i] == 0){
//                int start = i;
//                while (start <= end-1){
//                    if (nums[start] != nums[start+1]){
//                        int temp = nums[start];
//                        nums[start] = nums[start+1];
//                        nums[start+1] = temp;
//                    }
//                    start++;
//                }
//                end--;
//            }
//            if (nums[i] != 0) i++;
//        }
//        int nonZeroIndex = 0;
//        for (int i = 0; i < nums.length; i++) {
//            if (nums[i] != 0) {
//                nums[nonZeroIndex++] = nums[i];
//            }
//        }
//        while (nonZeroIndex < nums.length) {
//            nums[nonZeroIndex++] = 0;
//        }
        int nonZeroIndex = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                int temp = nums[nonZeroIndex];
                nums[nonZeroIndex++] = nums[i];
                nums[i] = temp;
            }
        }
        System.out.println(Arrays.toString(nums));
    }
}
