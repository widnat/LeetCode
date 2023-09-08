package com.leetcode;

class MyAtoiSolution {
    public int myAtoi(String s) {
        int length = s.length();
        int i = 0;
        long result = 0;
        boolean isPositive = true;
        while (i < length) {
            char c = s.charAt(i);
            if (c == ' ') {
                ++i;
                continue;
            }

            if (c == '+' || c == '-' || (c >= '0' && c <= '9')) {
                if (c == '+' || c == '-') {
                    ++i;
                    if (c == '-') {
                        isPositive = false;
                    }
                }

                break;
            } else {
                return 0;
            }
        }

        while (i < length) {
            char c = s.charAt(i);
            if (c >= '0' && c <= '9') {
                result = (result * 10) + c - '0';
            } else {
                break;
            }

            if (result <= Integer.MIN_VALUE || result >= Integer.MAX_VALUE) {
                break;
            }

            ++i;
        }

        if (!isPositive) {
            result *= -1;
        }

        if (result <= Integer.MIN_VALUE) {
            result = Integer.MIN_VALUE;
        } else if (result >= Integer.MAX_VALUE) {
            result = Integer.MAX_VALUE;
        }

        return (int) result;
    }
}
