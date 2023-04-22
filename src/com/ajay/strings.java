package com.ajay;

import java.util.Arrays;

public class strings {
    public static void main(String[] args) {
        String sb = "";

        for (int i=0; i< 26; i++){
            sb =  sb + (char) ('a' + i);

        }

        System.out.println(Arrays.toString(sb.toCharArray()));
    }
}
