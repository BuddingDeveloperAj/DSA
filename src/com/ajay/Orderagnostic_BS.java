package com.ajay;

public class Orderagnostic_BS {
    public static void main(String[] args) {
        int[] arr = {74,71,68,61,50,49,45,40,39,33,28,20,10};
        int s = 0;
        int e = arr.length - 1;
        int target = 28;
        if (ass_or_des(arr)){
            while (s <= e){
                int mid = s + (e-s)/2;
                int mid_ele = arr[mid];

                if (target > mid_ele){
                    e = mid - 1;
                }
                else if (target < mid_ele){
                    s = mid + 1;
                }
                else{
                    System.out.println(mid);
                    break;
                }
            }
        }
        else {
            while (s <= e){
                int mid = s + (e-s)/2;
                int mid_ele = arr[mid];

                if (target < mid_ele){
                    s = mid + 1;
                }
                else if (target > mid_ele){
                    e = mid - 1;
                }
                else{
                    System.out.println(mid);
                    break;
                }
            }
        }
    }

    static boolean ass_or_des(int[] arr){
        int start = arr[0];
        int end = arr[arr.length - 1];

        if (end - start > 0){
            return true;
        }
        else {
            return false;
        }
    }
}
