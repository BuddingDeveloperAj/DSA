package com.ajay;

public class subarray_Div_by_K_974 {
    public static void main(String[] args) {
        int[] A = {4,5,0,-2,-3,1};
        int K = 5;
        int[] map = new int[K];
        map[0] = 1;
        int count = 0, sum = 0;
        for(int a : A) {
            sum = (sum + a) % K;
            if(sum < 0) sum += K;  // Because -1 % 5 = -1, but we need the positive mod 4
            count += map[sum];
            map[sum]++;
        }
        System.out.println(count);
    }
}
