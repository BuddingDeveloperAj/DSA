package com.string;

public class Repeatedstring {
    public static void main(String[] args) {
        System.out.println(check("aaaaaaaaaaaaaaaaaaaaaab", "ba"));
    }
    public static int check(String A, String B){
        int count = 0;
        StringBuilder sb = new StringBuilder();
        while (sb.length() < B.length()) {
            sb.append(A);
            count++;
        }
        if(sb.toString().contains(B)) return count;
        if(sb.append(A).toString().contains(B)) return ++count;
        return -1;
    }
}
