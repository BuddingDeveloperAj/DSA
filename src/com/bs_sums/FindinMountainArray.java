package com.bs_sums;

public class FindinMountainArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,3,1};
        int target = 2;

        int peak = PeakInMountain(arr, 0, arr.length - 1);
        int AscOrder = AgnosticSearch(arr, target, 0, peak);
        if (AscOrder != -1){
            System.out.println(AscOrder);
        }
        else{
            System.out.println(AgnosticSearch(arr, target, peak, arr.length - 1));
        }
    }
    public static int PeakInMountain(int[] arr, int start, int end){
        while (start != end){
            int mid = start + (end - start)/2;

            if (arr[mid] > arr[mid + 1]){
                end = mid;
            }
            else{
                start = mid + 1;
            }
        }
        return start;
    }

    public static int AgnosticSearch(int[] arr, int target, int start, int end){
        boolean isAsc = arr[start] < arr[end];

        while (start <= end){
            int mid = start + (end - start)/2;

            if (arr[mid] == target){
                return mid;
            }

            if (isAsc){
                if (arr[mid] > target){
                    end = mid - 1;
                }
                else {
                    start = mid + 1;
                }
            }
            else{
                if (arr[mid] > target){
                    start = mid + 1;
                }
                else {
                    end = mid - 1;
                }
            }
        }
        return -1;
    }
}
//this is leat code program