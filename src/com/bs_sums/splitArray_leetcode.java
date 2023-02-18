package com.bs_sums;

public class splitArray_leetcode {
    public static void main(String[] args) {
        int[] arr= {7,2,5,10,8};
        int k = 3;
        System.out.println(splitArray(arr, k));
    }

    public static int splitArray(int[] nums, int k) {
      int start = 0;
      int end = 0;

      for (int num : nums){
          start = Math.max(start, num);
          end += num;
      }

      while (start < end){
          int mid = start + (end - start)/2;

          int sum = 0;
          int pieces = 1;

          for (int num:nums){
              if (num + sum > mid){
                  sum = num;
                  pieces++;
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
      return start;

    }
}
