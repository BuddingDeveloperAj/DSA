package com.bs_sums;

public class kekoEatingbanana {
    public static void main(String[] args) {
        int[] piles = {3,6,7,11};
        int h = 8;
        int start = 1;
        int end = 0;

        for (int n:piles){
            end = Math.max(end, n);
        }
        //System.out.println((float)3/4);

        while (start < end){
            int mid = start + (end - start)/2;
            int sum = 0;

            for (int n:piles){
                sum += (float)n/mid+1;
                System.out.println(sum);
            }
            System.out.println("over");

            if (sum == h){
                System.out.println(mid + "mid");
            }

            if (sum < h){
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        System.out.println(start);
    }
}
