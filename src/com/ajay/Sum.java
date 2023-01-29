package com.ajay;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        //System.out.println(sum());
        int name = 5;
        name =changename(name);
        System.out.println(name);
    }

    static int sum() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter two numbers");
        int n1 = in.nextInt();
        int n2 = in.nextInt();
        //System.out.println("Sum is = "+(n1+n2));
        return (n1+n2);
    }

    static void sum1(int a, int b){
        System.out.println(a+b);
    }

    static int changename(int naam){
        naam = 15;
        return naam;
    }
}
