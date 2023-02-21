package com.bs_sums;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class FairCandy_leet {
    public static void main (String... args) {
        int[] aliceSizes = {2};
        int aliceSum = Arrays.stream(aliceSizes).sum();
        int[] bobSizes = {2,3};
        int bobSum = Arrays.stream(bobSizes).sum();
        int diff = (bobSum - aliceSum) / 2;
        Set<Integer> bobSet = new HashSet<>();
        for (int b : bobSizes) {
            bobSet.add(b);
        }
        for (int a : aliceSizes) {
            if (bobSet.contains(a + diff)) {
                System.out.println(a + " " + (a + diff));
            }
        }
    }
}


