package com.Recursion;

public class reverseString {
    public static void main(String[] args) {
        char[] s = {'H','a','n','n','a','h', 'P'};
        swap(s, 0, s.length-1);
    }

    public static void swap(char[] arr, int start, int end){
        char temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        start++;
        end--;

        if (start < end){
            swap(arr, start, end);
        }
    }
}
