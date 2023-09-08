package com.leetcode;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class DivideTests {
    @Test
    public void RunTests() {
        System.out.println("started: FindMedianSortedArrays");
        DivideSolution solution = new DivideSolution();
        // assertTrue(RunTest(solution, 10, 3, 3));
        // assertTrue(RunTest(solution, 7, -3, -2));
        // assertTrue(RunTest(solution, -9, -9, 1));
        // assertTrue(RunTest(solution, 9, 9, 1));
        // assertTrue(RunTest(solution, -9, 9, -1));
        // assertTrue(RunTest(solution, 9, -9, -1));
        // assertTrue(RunTest(solution, 3, 10, 0));
        assertTrue(RunTest(solution, -2147483648, -1, 2147483647));

        System.out.println("successfully finished: FindMedianSortedArrays");
    }

    private boolean RunTest(DivideSolution solution, int dividend, int divisor, int expected) {
        int response = solution.divide(dividend, divisor);
        String newLine = "\n";
        boolean success = response == expected;
        if (!success) {
            System.out.println("success: " + success
                    + newLine + "expected: " + expected
                    + newLine + "response: " + response
                    + newLine);
        }

        return success;
    }
}
