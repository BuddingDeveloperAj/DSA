package com.bs_sums;

public class Guessthenumber_leet {
    public static void main(String[] args) {
        int n = 2;
        int start = 1;
        int end;
        end = n;

        while (start <= end){
            int mid = start + (end - start)/2;

            if (guess(mid) == 0) return;//mid
            else if(guess(mid) == -1) end = mid - 1;
            else start = mid + 1;
        }
        return ;//start
    }

    private static int guess(int mid) {
        return 0;
    }
}
