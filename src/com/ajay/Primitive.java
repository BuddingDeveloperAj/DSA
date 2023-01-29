package com.ajay;

import java.util.Scanner;

public class Primitive {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char a = input.next().charAt(0);
        byte b = (byte)(a);
        System.out.println(b);
    }
}
