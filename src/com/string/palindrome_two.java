package com.string;

public class palindrome_two {
    public static void main(String[] args) {
        String s = "eeccccbebaeeabebccceea";
        int start = 0;
        int end = s.length() - 1;
        boolean flag = true;

        while (start <= end){
            if (s.charAt(start) == s.charAt(end)){
                start++;
                end--;
                flag = true;
            }
            else if (flag && s.charAt(start) == s.charAt(end-1)) {
                end--;
                flag = false;
            }
            else if (flag && s.charAt(start+1) == s.charAt(end)) {
                start++;
                flag = false;
            }
            else{
                System.out.println(false);
            }
        }
        System.out.println(true);
    }
}
