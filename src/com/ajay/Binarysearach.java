package com.ajay;

public class Binarysearach {
    public static void main(String[] args) {
        int[] arr = {2,3,4,5,6,7,9,12,14,18,19,21,25,26,36,38,41,46,48,52,58,67};
        int target = 16;
        int res = BinarySearch(arr, target);
        System.out.println(res + " " + arr[res]);
    }

    static int BinarySearch(int[] arr, int target){
      int start = 0;
      int end = arr.length - 1;

      while (start <= end){
          int mid = start + (end - start)/2;
          int mid_ele = arr[mid];
          if (target < mid_ele){
              end = mid - 1;
          } else if (target > mid_ele) {
              start = mid + 1;
          }else{
              return mid;
          }
      }
      return -1;
    };
}
