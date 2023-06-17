package com.bitwise;

public class operators {
    public static void main(String[] args) {
        int a = 45;
        int[] nums = {1,3,4};
        System.out.println(findsingleElement(nums));
    }

    public static int findsingleElement(int[] arr){
        int ans = 0;
        for (int num:arr){
            ans ^= num;
        }
        return ans;
    }
}
