package com.bs_sums;

public class Freq_of_Most_Freq_element {
    public static void main(String[] args) {
        int[] nums = {9940,9995,9944,9937,9941,9952,9907,9952,9987,9964,9940,9914,9941,9933,9912,9934,9980,9907,9980,9944,9910,9997};
        int k = 7925;
        int start = nums[0];
        int end = 0;
        int max_freq = 0;

        for (int i:nums){
            end = Math.max(end,i);
            start = Math.min(start, i);
        }

        while (start <= end){
            int mid = start + (end - start)/2;
            int val_req = 0;
            int count = 0;

            for (int i:nums){
                int op = mid - i;
                if (op > -1){
                    val_req += op;
                    count++;
                }
            }

            if (val_req == k) {
                max_freq = count;
                System.out.println(max_freq);
            }

            if (val_req < k) {
                max_freq = count;
                start = mid+1;
            }
            else {
                end = mid - 1;
            }
        }
        System.out.println(max_freq);
    }
}
