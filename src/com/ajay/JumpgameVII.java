package com.ajay;

public class JumpgameVII {
    public static void main(String[] args) {
        System.out.println(check());
    }

    public static boolean check(){
        String s = "011001110001000";
        int minJump = 3;
        int maxJump = 5;

        int n = s.length(), pre = 0;
        boolean[] dp = new boolean[n];
        dp[0] = true;
        for (int i = 1; i < n; ++i) {
            if (i >= minJump && dp[i - minJump])
                pre++;
            if (i > maxJump && dp[i - maxJump - 1])
                pre--;
            dp[i] = pre > 0 && s.charAt(i) == '0';
        }
        return dp[n - 1];
    }
}
