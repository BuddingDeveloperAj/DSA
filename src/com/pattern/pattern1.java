package com.pattern;

public class pattern1 {
    public static void main(String[] args) {
        int n = 5;
        for (int row=0; row<=n; row++){
            for (int col=n; col>row; col--){
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}
