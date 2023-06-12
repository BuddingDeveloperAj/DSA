package com.ajay;

public class rotatestring {
    public static void main(String[] args) {
        String goal = "deabc";
        String s = "abcde";
        char[] charArray = s.toCharArray();
        int rotates = 0;
        while (rotates < s.length()-1 && !String.valueOf(charArray).equals(goal)){
            reverse(charArray, 0, s.length()-1);
            reverse(charArray, 1, s.length()-1);
            rotates++;
        };
        System.out.println(String.valueOf(charArray).equals(goal));
        System.out.println(rotateString(s, goal));


    }
    public static void reverse(char[] arr, int start,int end){
        while (start <= end) {
            char temp = arr[end];
            arr[end] = arr[start];
            arr[start] = temp;
            start++;
            end--;
        }
    }

    public static boolean rotateString(String s, String goal) {
        String s3=s+s;
        if(s.length()!=goal.length())
        {
            return false;
        }
        return s3.contains(goal);
    }
}
