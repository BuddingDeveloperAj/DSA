package com.bs_sums;

public class twosum_leet_167 {
    public static void main(String[] args) {
            int[] numbers = {5,25,75};
            int target = 100;            int end = FindTarget(numbers, target, 0, numbers.length - 1);
            int start = 0;
            int[] ans = new int[2];

            while (start < end){
                int sum = numbers[start];

                for (int p = start + 1; p <= end; p++){
                    if (sum + numbers[p] == target){
                        ans[0] = start + 1;
                        ans[1] = p + 1;
                        return;
                    }
                }
                start++;
            }
        System.out.println(ans);
        }

        public static int FindTarget(int[] numbers, int target, int start, int end){
            while (start <= end){
                int mid = start + (end - start)/2;

                if (numbers[mid] > target) end = mid - 1;
                else start = start + 1;
            }
            return end;
        }
}
