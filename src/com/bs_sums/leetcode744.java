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
        System.out.println("hello");
    }
}

//python solution for the same
//class Solution:
//        def nextGreatestLetter(self, letters: List[str], target: str) -> str:
//        start = 0
//        end = len(letters) - 1
//
//        while (start <= end):
//        mid = (start + (end - start)//2)
//        if (target < letters[mid]):
//        end = mid - 1
//        else:
//        start = mid + 1
//
//        return letters[start % len(letters)]


// javascirpt solution
//    /**
//     * @param {character[]} letters
//     * @param {character} target
//     * @return {character}
//     */
//    var nextGreatestLetter = function(letters, target) {
//        let start = 0
//        let end = letters.length - 1
//
//        while (start <= end){
//        let mid = start + Math.floor((end - start)/2)
//
//        if (target < letters[mid]) end = mid -1
//        else start = mid + 1
//        }
//        return letters[start % letters.length]
//        };