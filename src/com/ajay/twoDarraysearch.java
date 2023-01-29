package com.ajay;

import java.util.Arrays;

public class twoDarraysearch {
    public static void main(String[] args) {
      int[][] arr = new int[][]{
              {21,34},
              {1,24,65,87,2},
              {41,25,85,98,32}
      };
      int target = 97;
      int[] ans = search(arr, target);
        System.out.println(Arrays.toString(ans));
    }

    static int[] search(int[][] arr,int target){
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] == target){
                    return new int[]{row, col};
                }
            }
        }
        return new int[]{-1};
    };
}
