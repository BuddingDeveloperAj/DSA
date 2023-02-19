package com.bs_sums;

public class ArrangingCoins {
    public static void main(String[] args) {
        int n = 1804289383;
//        int count = 0;
//        int start = 0;
//
//        while (count <= n){
//            count+= start + 1;
//            start++;
//        }
//        System.out.println(start-1);
        long start = 1, end = n/2;
        while (start <= end){
            long stair = start + (end - start)/2;
            long consumed = (stair) * (stair+1)/2;

            if (consumed == n){
                System.out.println(stair);
                return;
            }

            if (consumed > n) {
                end = stair - 1;
            }
            else{
                start = stair + 1;
            }
        }
        System.out.println(start - 1);
    }
}
