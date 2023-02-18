package com.bs_sums;

public class sqrt_x_leet {
    public static void main(String[] args) {
        int x = 2147395599;
        if (x == 0) System.out.println(0);
        int start = 1, end = x, ans = 0;
        while (start <= end){
            int mid = start + (end - start)/2;
            if (x/mid == mid) System.out.println(mid);
            else if (x/mid < mid) end = mid - 1;
            else{
                start = mid + 1;
                ans = mid;
            }
        }
        System.out.println(ans);
    }
}
