package com.leetcode;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class ReverseTests {
    @Test
    public void RunTests() {
        System.out.println("started: ReverseTests");
        ReverseSolution solution = new ReverseSolution();
        assertTrue(RunTest(solution, 123, 321));
        assertTrue(RunTest(solution, -123, -321));
        assertTrue(RunTest(solution, 120, 21));

        System.out.println("successfully finished: ReverseTests");
    }

    private boolean RunTest(ReverseSolution solution, int x, int expected) {
        int response = solution.reverse(x);
        String newLine = "\n";
        boolean success = expected == response;
        if (!success) {
            System.out.println("success: " + success
                    + newLine + "x: " + x
                    + newLine + "expected: " + expected
                    + newLine + "response: " + response
                    + newLine);
        }

        return success;
    }
}
