package com.bs_sums;

public class ReachANumber {
    public static void main(String[] args) {
        int target = 5;
        int sum = 0;
        int step = 0;

        while (sum < target){
            step++;
            sum += step;
        }

        while ((sum - target) % 2 != 0){
            step++;
            sum += step;
        }

        System.out.println(step);
    }
}
