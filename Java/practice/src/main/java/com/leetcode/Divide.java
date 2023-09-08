package com.leetcode;

class DivideSolution {
    public int divide(int dividend, int divisor) {
        long result = 0;
        boolean isPositive = ((long) dividend > 0 && (long) divisor > 0) || ((long) dividend < 0 && (long) divisor < 0);
        long top = (long) dividend < 0 ? (long) dividend * -1 : (long) dividend;
        long bottom = (long) divisor < 0 ? (long) divisor * -1 : (long) divisor;
        long sum = 0;
        if (bottom == 1) {
            result = top;
        } else {
            while (top >= sum + bottom) {
                ++result;
                sum += bottom;
            }
        }

        result = isPositive ? result : result * -1;
        if (result > Integer.MAX_VALUE) {
            result = Integer.MAX_VALUE;
        } else if (result < Integer.MIN_VALUE) {
            result = Integer.MAX_VALUE;
        }

        return (int) result;
    }
}
