package com.ajay;

public class JumpgameVII {
    public static void main(String[] args) {
        System.out.println(check());
    }

    public static boolean check(){
        String s = "0000000000";
        int minJump = 2;
        int maxJump = 5;
        int i = 1;
        int startZero = 0;
        boolean zeroFound = false;

        while (i < s.length()){
            if (s.charAt(i) == '0'){
                while (i<=s.length()-3 &&  s.charAt(i+1) == '0'){
                    if (startZero + minJump <= i && i <= Math.min(startZero + maxJump, s.length() - 1)) {
                        startZero = i;
                        zeroFound = true;
                        i++;
                    }
                    else if (i<=s.length()-3 && s.charAt(i) == '0' && s.charAt(i+1) == '0') i++;
                    else return false;
                }
            }
            else i++;
        }
        return zeroFound;
    }
}
