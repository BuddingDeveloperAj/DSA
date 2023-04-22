package com.bs_sums;

public class Kth_smallest_in_matrix {
    public static void main(String[] args) {

        int[][] matrix = {{1,5,12},{10,11,13},{12,13,15}};
        int k = 4;

        int n = matrix.length;
        int lo = matrix[0][0];
        int hi = matrix[n-1][n-1];

        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            int count = 0;
            int j = n - 1;
            for (int i = 0; i < n; i++) {
                while (j >= 0 && matrix[i][j] > mid) {
                    j--;
                }
                count += (j + 1);
            }
            if (count < k) {
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }
        }

        System.out.println(lo);


//        int rstart = 0;
//        int rend = matrix.length;
//
//        while (rstart <= rend){
//            int rmid = rstart + (rend - rstart)/2;
//
//            int count = 0;
//            int col = matrix.length-1;
//
//            for (int r = 0; r <= rmid; r++) {
//                while (col >= 0 && matrix[r][col] < rmid){
//                    col -= 1;
//                }
//                count += col + 1;
//            }
//
//            if (count < k){
//                rstart = rmid + 1;
//            }
//            else{
//                rend = rmid - 1 ;
//            }
//        }
//        System.out.println(matrix[rstart][rend]);

    }
}
