package com.bs_sums;

public class Perfect_sq_leet {
    public static void main(String[] args) {
        int num = 5;
        int start = 1;
        int end = num;

        while (start <= end){
            int mid = start + (end - start)/2;

            if (mid*mid == num){
                System.out.println("true");
                return;
            }
            else if(num/mid < mid) end = mid - 1;
            else start = mid + 1;
        }
        System.out.println("false");
    }
}
