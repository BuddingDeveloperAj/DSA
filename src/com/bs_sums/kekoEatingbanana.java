package com.bs_sums;

public class kekoEatingbanana {
    public static void main(String[] args) {
        int[] piles = {30,11,23,4,20};
        int h = 5;
        int start = 1;
        int end = 0;

        for (int n:piles){
            end = Math.max(end, n);
        }
        //System.out.println((float)3/4);

        while (start < end){
            int mid = start + (end - start)/2;
            float sum = 0;

            for (int n:piles){
                sum += (float)n/(float)mid;
                //System.out.println(sum);
            }

//            if (sum == h){
//                System.out.println(mid + "mid");
//            }

            if (sum > h){
                start = mid+1;
            }
            else{
                end = mid;
            }
        }
        System.out.println(start + " ans");
    }
}
