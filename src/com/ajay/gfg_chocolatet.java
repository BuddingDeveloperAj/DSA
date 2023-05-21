package com.ajay;

public class gfg_chocolatet {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7,8,9};
        int k = 6;
        int start = Integer.MAX_VALUE;
        int end = 0;

        for (int num : nums){
            start = Math.min(start, num);
            end += num;
        }

        while (start < end){
            int mid = start + (end - start)/2;

            int sum = 0;
            int pieces = 1;

            for (int num:nums){
                if (num + sum > mid){
                    pieces++;
                    sum = 0;
                }else {
                    sum += num;
                }
            }
            if (pieces > k){
                start = mid + 1;
            }else{
                end = mid;
            }
        }
        System.out.println(start);
    }
}
