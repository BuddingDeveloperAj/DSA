package com.ajay;

public class ceiling_of_number {
     //find target number or smallest greater number
     public static void main(String[] args) {
         int[] arr = {2,6,8,9,10,12,14,16,17,19};
         int target = 15;
         int res = BS(arr, target);
         System.out.println(res + " " + arr[res]);
     }

     static int BS(int[] arr, int target){
         int start = 0;
         int end = arr.length - 1;

         while (start <= end){
             int mid = start + (end - start)/2;
             int mid_ele = arr[mid];
             if (mid_ele > target){
                 end = mid -1;
             }
             else if(mid_ele < target){
                 start = mid + 1;
             }
             else {
                 return mid;
             }
         }
         return start;
     }


}
