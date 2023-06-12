package com.ajay;

public class jumpgame2 {
    public static void main(String[] args) {
        int[] nums = {2,1,3,3,2,0,1,4};
        int ans = jump(nums);
        System.out.println(ans);
    }

    public static int jump(int[] nums) {
        int currentPosition = 0;
        int currentJump = 0;
        int jumpCount = 0;

        for (int i = 0; i < nums.length - 1; i++) {
            currentJump = Math.max(currentJump, i + nums[i]);

            if (currentPosition == i) {
                currentPosition = currentJump;
                jumpCount++;
            }
        }

        return jumpCount;
    }
}
