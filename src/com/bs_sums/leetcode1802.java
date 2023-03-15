package com.bs_sums;

public class leetcode1802 {
    public static void main(String[] args) {
        long n = 6;
        long index = 1;
        long maxSum = 10;

        long r = n-index-1;
        long l = index;
        long hi = maxSum;
        long lo = 1;
        long res = 0;

        while (lo<=hi){
            long mid = lo + (hi - lo)/2;

            long sum = mid;
            long rs = 0;
            long ls = 0;
            long m = (mid - 1);

            if (r <= m){
                rs += m*(m+1)/2L - (m-r)*(m-r+1)/2;
            }
            else{
                rs += m*(m+1)/2 + (r-m)*1;
            }

            if (l <= m){
                ls += m*(m+1)/2 - (m-l)*(m-l+1)/2;
            }
            else{
                ls += m*(m+1)/2 + (l-m)*1;
            }

            sum += ls+rs;

            if (sum <= maxSum){
                res = mid;
                lo = mid + 1;
            }
            else{
                hi=mid-1;
            }

        }
        System.out.println(res);
    }
}
