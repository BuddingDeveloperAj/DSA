package com.bs_sums;

import java.sql.SQLOutput;

public class search2Darray {
    public static void main(String[] args) {

        int[][] matrix = {{1,3},{4,5}};
        System.out.println(matrix[1][0]);
        int target = 3;
        int start = 0;
        int r = 0;
        int c = matrix.length - 1;
        while (r < matrix[start].length && c >= 0) {
            if (matrix[c][r] == target) {
                System.out.println("true");
                return;
            }
            if (matrix[c][r] < target) {
                r++;
            } else {
                c--;
            }
        }
        System.out.println("false");
    }

}
