package com.leetcode;

class PlusOneSolution {
    public int[] plusOne(int[] digits) {
        boolean carry = true;
        for (int i = digits.length - 1; i >= 0; --i) {
            if (carry) {
                carry = false;
                int sum = digits[i] + 1;
                if (sum == 10) {
                    carry = true;
                    digits[i] = 0;
                }
                else {
                    digits[i] = sum;
                }
            }
        }

        if (carry) {
            int[] newDigits = new int[digits.length + 1];
            newDigits[0] = 1;
            for (int i = 0; i < digits.length; ++i) {
                newDigits[i + 1] = digits[i];
            }

            digits = newDigits;
        }

        return digits;
    }
}
