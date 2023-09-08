package com.leetcode;

import static org.junit.Assert.assertTrue;

import java.util.Arrays;

import org.junit.Test;

public class TwoSumTests {
    @Test
    public void RunTests() {
        System.out.println("started: RunTwoSumTests");
        TwoSumSolution easySolutions = new TwoSumSolution();
        assertTrue(RunTest(easySolutions, new int[] { 2, 7, 11, 15 }, new int[] { 0, 1 }, 9));
        assertTrue(RunTest(easySolutions, new int[] { 3, 2, 4 }, new int[] { 1, 2 }, 6));
        assertTrue(RunTest(easySolutions, new int[] { 3, 3 }, new int[] { 0, 1 }, 6));
        assertTrue(RunTest(easySolutions, new int[] { 1, 2, 3, 2, 4, 4, -20, 7, -100, -32, 34, 21, 84 },
                new int[] { 6, 8 },
                -120));
        assertTrue(RunTest(easySolutions, new int[] { 1, 2, 3, 2, 4, 4, -20, 7, -100, -32, 34, 21, 84 },
                new int[] { 8, 10 },
                -66));
        assertTrue(RunTest(easySolutions, new int[] { 500000000, 84838322, 32933585 }, new int[] { 0, 2 },
                532933585));

        System.out.println("successfully finished: RunTwoSumTests");
    }

    private boolean RunTest(TwoSumSolution easySolutions, int[] nums, int[] expected, int target) {
        int[] response = easySolutions.twoSum(nums, target);
        String newLine = "\n";
        boolean success = Arrays.equals(expected, response);
        if (!success) {
            System.out.println("success: " + success
                    + newLine + "nums: " + Arrays.toString(nums)
                    + newLine + "target: " + target
                    + newLine + "expected: " + Arrays.toString(expected)
                    + newLine + "response: " + Arrays.toString(response)
                    + newLine);
        }

        return success;
    }

}
