package com.string;

public class NextGreaterElement3 {
    public static void main(String[] args) {
        int number = 12349;
        int result = nextGreaterElement(number);
        System.out.println("Result: " + result);
    }
    public static int nextGreaterElement(int n) {
        char[] digits = String.valueOf(n).toCharArray();

        // Find the first decreasing digit from the right
        int i = digits.length - 2;
        while (i >= 0 && digits[i] >= digits[i + 1]) {
            i--;
        }

        if (i < 0) {
            return -1; // No next greater permutation exists
        }

        // Find the smallest digit greater than the decreasing digit
        int j = digits.length - 1;
        while (digits[j] <= digits[i]) {
            j--;
        }

        // Swap the decreasing digit with the next greater digit
        swap(digits, i, j);

        // Reverse the digits after the swapping position
        reverse(digits, i + 1);

        // Convert the modified digits array back to integer
        long result = Long.parseLong(new String(digits));

        // Check if the result is within the valid range
        return (result > Integer.MAX_VALUE) ? -1 : (int) result;
    }

    private static void swap(char[] digits, int i, int j) {
        char temp = digits[i];
        digits[i] = digits[j];
        digits[j] = temp;
    }

    private static void reverse(char[] digits, int start) {
        int i = start;
        int j = digits.length - 1;
        while (i < j) {
            swap(digits, i, j);
            i++;
            j--;
        }
    }
}
