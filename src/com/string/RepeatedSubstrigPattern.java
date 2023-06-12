package com.string;

public class RepeatedSubstrigPattern {
    public static void main(String[] args) {
//        System.out.println("aaa");
        System.out.println(repeatedSubstringPattern("abcdeabcd"));
    }
    public static boolean repeatedSubstringPattern(String s) {
//        int n = s.length();
//
//        for (int i = n / 2; i >= 1; i--) {
//            if (n % i == 0) {
//                int repeat = n / i;
//                String substring = s.substring(0, i);
//                    StringBuilder sb = new StringBuilder();
//
//                for (int j = 0; j < repeat; j++) {
//                    sb.append(substring);
//                }
//
//                if (sb.toString().equals(s)) {
//                    return true;
//                }
//            }
//        }
//
//        return false;
        int n = s.length();

        for (int i = n / 2; i >= 1; i--) {

            if (n % i == 0 && s.charAt(i-1) == s.charAt(n-1)) {

                int m = n / i;
                String str = s.substring(0, i);
                if (str.repeat(m).equals(s)) return true;
            }
        }

        return false;
    }
}
