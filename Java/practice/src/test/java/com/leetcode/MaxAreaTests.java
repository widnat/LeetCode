package com.leetcode;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class MaxAreaTests {
    @Test
    public void RunTests() {
        System.out.println("started: MaxAreaTests");
        MaxAreaSolution solution = new MaxAreaSolution();
        assertTrue(RunTest(solution, new int[] {1,8,6,2,5,4,8,3,7}, 49));

        System.out.println("successfully finished: MaxAreaTests");
    }

    private boolean RunTest(MaxAreaSolution solution, int[] s, int expected) {
        int response = solution.maxArea(s);
        String newLine = "\n";
        boolean success = expected == response;
        if (!success) {
            System.out.println("success: " + success
                    + newLine + "s: " + s
                    + newLine + "expected: " + expected
                    + newLine + "response: " + response
                    + newLine);
        }

        return success;
    }
}
