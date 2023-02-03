package com.bs_sums;

public class leetcode744 {
    public static void main(String[] args) {
        char[] letters = {'c', 'f', 'j'};
        char target = 'c';
        int start = 0;
        int end = letters.length - 1;

        while (start <= end){
            int mid = start + (end - start)/2;

            if (target < letters[mid]){
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
        }
        System.out.println(letters[start % letters.length]);
    }
}


