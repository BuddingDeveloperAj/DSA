package com.bs_sums;

import org.w3c.dom.ls.LSOutput;

public class countNegativeInsortedMatrix_leet{
    public static void main(String[] args) {
        int[][] grid = {{5,1,0},{-1,-1,-2}};
        int count = 0;
        for (int[] mat:grid) {
            int start = 0;
            int end = mat.length - 1;

            while (start <= end) {
                int mid = start + (end - start) / 2;

                if (mat[mid] >= 0) {
                    start = mid + 1;
                } else end = mid - 1;
            }
            count += mat.length - start;
        }
        System.out.println(count);
    }
};
