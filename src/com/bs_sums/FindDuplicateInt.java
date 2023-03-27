package com.bs_sums;

public class FindDuplicateInt {
    public static void main(String[] args) {
        int[] arr = {9,8,7,5,6,4,3,1,2,1};

        int start = 1;
        int end = arr.length - 1;

        while (start < end){
            int mid = start + (end - start)/2;
            int count = 0;

            for (int i: arr){
                if (i <= mid){
                    count ++;
                }
            }

            if (count <= mid){
                start = mid + 1;
            }
            else{
                end = mid;
            }
        }
        System.out.println(start);
    }
}
