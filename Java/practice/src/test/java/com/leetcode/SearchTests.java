package com.leetcode;

import static org.junit.Assert.assertTrue;

import java.util.Arrays;

import org.junit.Test;

public class SearchTests {
    @Test
    public void RunTests() {
        System.out.println("started: SearchTests");
        SearchSolution solution = new SearchSolution();
        assertTrue(RunTest(solution, new int[] { 4, 5, 6, 7, 0, 1, 2 }, 0, 4));
        assertTrue(RunTest(solution, new int[] { 4, 5, 6, 7, 0, 1, 2 }, 3, -1));
        assertTrue(RunTest(solution, new int[] { 1 }, 0, -1));

        System.out.println("successfully finished: SearchTests");
    }

    private boolean RunTest(SearchSolution solution, int[] nums, int target, int expected) {
        int response = solution.search(nums, target);
        String newLine = "\n";
        boolean success = expected == response;
        if (!success) {
            System.out.println("success: " + success
                    + newLine + "nums: " + Arrays.toString(nums)
                    + newLine + "target: " + target
                    + newLine + "expected: " + expected
                    + newLine + "response: " + response
                    + newLine);
        }

        return success;
    }
}
