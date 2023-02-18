package com.bs_sums;

public class FindBadVersion_leet {
    public int firstBadVersion(int n) {
        int start = 1;
        int end = n;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (isBadVersion(mid)) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return start;
    }

    private boolean isBadVersion(int mid) {
        return true;
    }
}
