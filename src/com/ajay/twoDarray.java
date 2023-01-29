package com.ajay;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class twoDarray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        int[][] twoD = new int[3][3];
//
//        for (int row = 0; row < twoD.length; row++) {
//            for (int col = 0; col < twoD[row].length ; col++) {
//                twoD[row][col] = in.nextInt();
//            }
//        }

//        for (int row = 0; row < twoD.length; row++) {
//            for (int col = 0; col < twoD[row].length ; col++) {
//                System.out.print(Arrays.toString(twoD[row]) + " ");
//            }
//            System.out.println();
//        }

//        for (int[] element: twoD) {
//            System.out.println(Arrays.toString(element));
//        }

        ArrayList<Integer> list = new ArrayList<Integer>(10);

        for (int i = 0; i< 5; i++) {
            list.add(in.nextInt());
        }

        System.out.println(list);

        for (int i = 0; i< 2; i++) {
            list.set(i,in.nextInt());
        }

        System.out.println(list);


        //System.out.println(Arrays.toString(arr[1][0]));
    }
}
