package com.leetcode;

import static org.junit.Assert.assertTrue;

import java.util.Arrays;

import org.junit.Test;

public class PlusOneTests {
    @Test
    public void RunTests() {
        System.out.println("started: PlusOneTests");
        PlusOneSolution solution = new PlusOneSolution();
        assertTrue(RunTest(solution, new int[] { 1, 2, 3 }, new int[] { 1, 2, 4 }));
        assertTrue(RunTest(solution, new int[] { 4, 3, 2, 1 }, new int[] { 4, 3, 2, 2 }));
        assertTrue(RunTest(solution, new int[] { 9 }, new int[] { 1, 0 }));

        System.out.println("successfully finished: PlusOneTests");
    }

    private boolean RunTest(PlusOneSolution solution, int[] digits, int[] expected) {
        int[] response = solution.plusOne(digits);
        String newLine = "\n";
        boolean success = Arrays.equals(expected, response);
        if (!success) {
            System.out.println("success: " + success
                    + newLine + "digits: " + Arrays.toString(digits)
                    + newLine + "expected: " + Arrays.toString(expected)
                    + newLine + "response: " + Arrays.toString(response)
                    + newLine);
        }

        return success;
    }

    private boolean ArraysAreEqual(int[] array1, int[] array2) {
        if (array1.length != array2.length) {
            return false;
        }

        for (int i = 0; i < array1.length; ++i) {
            if (array1[i] != array2[i]) {
                return false;
            }
        }

        return true;
    }
}
