package com.sorting;

import java.util.ArrayList;
import java.util.Arrays;

public class Find_duplicate_number {
    public static void main(String[] args) {
        int[] nums = {1,3,2,2,4,5};
        ArrayList<Integer> res = all_dup(nums);
        System.out.println(Arrays.toString(new ArrayList[]{res}));
    }

    public static int sorting(int[] nums){
        int i = 0;
        while (i < nums.length) {
            if (nums[i] != i + 1) {
                int correct = nums[i] - 1;
                if (nums[i] != nums[correct]) {
                    int temp = nums[i];
                    nums[i] = nums[correct];
                    nums[correct] = temp;
                } else {
                    return nums[i];
                }
            }
            else {
                i++;
            }
        }
        return -1;
    }

    public static ArrayList<Integer> all_dup(int[] nums){
        int i = 0;
        ArrayList<Integer> list = new ArrayList<>();

        while (i < nums.length){
            if (nums[i] != i+1){
                int correct = nums[i] - 1;
                if (nums[i] != nums[correct]){
                    int temp = nums[i];
                    nums[i] = nums[correct];
                    nums[correct] = temp;
                }
                else{
                    list.add(i);
                    i++;
                }
            }
            else{
                i++;
            }
        }
        return list;
    }
}
