package com.bs_sums;

public class TofindPivotinDuplicateArr {
    public static void main(String[] args) {
        int[] arr = {3,3,4,5,7,7,8,9,1,2,2,3,3};
        System.out.println(FindPivotwithDuplicates(arr, 0, arr.length - 1));
    }

    static int FindPivotwithDuplicates(int[] arr, int start, int end){
        while (start <= end){
            int mid = start + (end - start)/2;

            if (mid < end && arr[mid] > arr[mid + 1]){
                return mid;
            }
            if (mid > start && arr[mid - 1] > arr[mid]){
                return mid - 1;
            }

            //if elements at mid, start and end are equal then skip the duplicates
            if (arr[mid] == arr[start] && arr[mid] == arr[end]){
                //what if these start and end elements were pivots
                //check if start is pivot
                if (arr[start] > arr[start + 1]){
                    return start;
                }
                start++;

                if (arr[end] < arr[end - 1]){
                    return end - 1;
                }
                end--;
            }
            //left side is sorted, so pivot should be in right
            else if(arr[start] < arr[mid] || (arr[start] == arr[mid] && arr[mid] > arr[end])){
                start = mid + 1;
            }else{
                end = mid - 1;
            }
        }
        return -1;
    }
}
