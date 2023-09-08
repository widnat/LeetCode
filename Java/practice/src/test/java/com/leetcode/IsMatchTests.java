package com.leetcode;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class IsMatchTests {
    @Test
    public void RunTests() {
        System.out.println("started: IsMatchTests");
        IsMatchSolution solution = new IsMatchSolution();
        // assertTrue(RunTest(solution, "aa", "a", false));
        assertTrue(RunTest(solution, "aa", "a*", true));
        assertTrue(RunTest(solution, "ab", ".*", true));
        assertTrue(RunTest(solution, "aab", "c*a*b", true));
        assertTrue(RunTest(solution, "aabcbcbcaccbcaabc", ".*a*aa*.*b*.c*.*a*", true));

        System.out.println("successfully finished: IsMatchTests");
    }

    private boolean RunTest(IsMatchSolution solution, String s, String p, boolean expected) {
        boolean response = solution.isMatch(s, p);
        String newLine = "\n";
        boolean success = expected == response;
        if (!success) {
            System.out.println("success: " + success
                    + newLine + "s: " + s
                    + newLine + "p: " + p
                    + newLine + "expected: " + expected
                    + newLine + "response: " + response
                    + newLine);
        }

        return success;
    }
}
