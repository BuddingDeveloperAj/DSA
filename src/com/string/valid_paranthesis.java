package com.string;

public class valid_paranthesis {
    public static void main(String[] args) {
        String sequence = "abaabcabaab";
        String word = "ab";
        int count = 0;
        String pat = word;
        while (sequence.contains(pat)) {
            count++;
            pat += word;
        }
        System.out.println(count);
    }
}
