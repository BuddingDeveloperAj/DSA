package com.pattern;

public class patterns {
    public static void main(String[] args) {
        pattern19(7);

    }
    static void pattern3(int n){
        for (int row = 1; row <= (2*n - 1); row++) {
            if (row <= n){
                for (int col = 1; col <= row; col++) {
                    System.out.print("* ");
                }
            }
            else {
                for (int col = n-1; col >= row-n; col--) {
                    System.out.print("* ");
                }
            }
            System.out.println("");
        }
    }

    static void pattern30(int n){
        for (int row = 1; row <= n; row++) {
            for (int space = 0; space < n-row; space++) {
                System.out.print("  ");
            }
            for (int col = row; col >= 1; col--) {
                System.out.print(col + " ");
            }
            for (int col = 2; col <= row; col++) {
                System.out.print(col + " ");
            }

            System.out.println();
        }
    }

    static void pattern6(int n){
        for (int row = 1; row <= n; row++) {
            for (int space = 1; space <= n-row; space++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= row; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern7(int n){
        for (int row = 1; row <= n; row++) {
            for (int space = 1; space < row; space++) {
                System.out.print(" ");
            }
            for (int col = 0; col <= n-row; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern8(int n){
        for (int row = 1; row <= n; row++) {
            for (int space = 1; space <= n - row; space++) {
                System.out.print(" ");
            }
            for (int col = 0; col < row; col++) {
                System.out.print("*");
            }

            for (int col = 1; col < row; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern10(int n){
        for (int row = 1; row <= n; row++) {
            for (int space = 1; space <= n-row; space++) {
                System.out.print(" ");
            }
            for (int col = 0; col < row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern11(int n){
        for (int row = 1; row <= n; row++) {
            for (int space = 1; space < row; space++) {
                System.out.print(" ");
            }
            for (int col = 0; col <= n-row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern12(int n){
        for (int row = 0; row < 2*n; row++) {
            int tol_col = row < n ? n-row : row - n + 1;
            int tot_space = row < n ? row : 2*n - row - 1;

            for (int space = 1; space <= tot_space; space++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= tol_col; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern15(int n){
        for (int row = 1; row <= 2*n - 1; row++) {
            int lspace = row <= n ? n-row : row - n;
            for (int space = 1; space <= lspace; space++) {
                System.out.print(" ");
            }
            System.out.print("*");
            int rspace = row <= n ? n-row+1 : row+1;
            int rlt = row <= n ? n : 2*n;
            for (int space = rspace; space < rlt; space++) {
                System.out.print(" ");
            }

            int aspace = row <= n ? row - 1 : 2*n-row-1;
            for (int i = 2; i <= aspace ; i++) {
                System.out.print(" ");
            }

            if (row>1 && row<2*n-1){
                System.out.print("*");
            }

            System.out.println();
        }
    }

    static void pattern18(int n){
        for (int row = 1; row <= 2*n; row++) {
            int lspace = row <= n ? n-row : row - n;
            for (int space = 1; space <= lspace; space++) {
                System.out.print("*");
            }
            int rspace = row <= n ? n-row + 1 : row;
            int rlt = row <= n ? n : 2*n;
            for (int space = rspace; space <= rlt; space++) {
                System.out.print(" ");
            }

            int aspace = row <= n ? row - 1 : 2*n-row-1;
            for (int i = 2; i <= aspace ; i++) {
                System.out.print(" ");
            }

            int rfill = row <= n ? n-row : row - n + 1;
            for (int col = 1; col <= rfill; col++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }

    static void pattern19(int n){
        for (int row = 1; row <= 2*n-1; row++) {

            int tot_lcol = row <= n ? row : 2*n - row;
            for (int lcol = 1; lcol <= tot_lcol; lcol++) {
                System.out.print("*");
            }

            int tot_space = row <= n ? 2*n-row*2 : 2*row-2*n;
            for (int space = 1; space <= tot_space; space++) {
                System.out.print(" ");
            }

            int tot_rcol = row <= n ? row : 2*n-row;
            for (int rcol = 1; rcol <= tot_rcol ; rcol++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
