package com.bs_sums;

public class leetcode34sol2 {
    public static void main(String[] args) {
        int[] nums = {1,2,5,7,7,7,7,8,8,9,10};
        int target = 7;

        int s = Search(nums, target, true);
        int e = Search(nums, target, false);

        int[] res = new int[] {s,e};
        System.out.println(res[0] + " " + res[1]);
    }

    public static int Search(int[] arr, int target, boolean ops){
        int ans = -1;
        int start = 0;
        int end = arr.length - 1;

        while (start <= end){
            int mid = start + (end - start)/2;

            if (target > arr[mid]){
                start = mid + 1;
            }
            else if (target < arr[mid]){
                end = mid - 1;
            }
            else{
                ans = mid;
                if (ops){
                    end = mid - 1;
                }
                else{
                    start = mid + 1;
                }
            }
        }
        return ans;
    };
}
