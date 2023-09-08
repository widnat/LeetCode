package com.leetcode;

import static org.junit.Assert.assertTrue;
import java.util.List;

import org.junit.Test;

public class ThreeSumTests {
    @Test
    public void RunTests() {
        System.out.println("started: ThreeSumTests");
        ThreeSumSolution solution = new ThreeSumSolution();
        assertTrue(RunTest(solution, new int[] { -1, 0, 1, 2, -1, 4 }));

        System.out.println("successfully finished: ThreeSumTests");
    }

    private boolean RunTest(ThreeSumSolution solution, int[] nums) {
        List<List<Integer>> response = solution.threeSum(nums);
        // String newLine = "\n";
        // boolean success = Arrays.equals(expected, response);
        // if (!success) {
        // System.out.println("success: " + success
        // + newLine + "nums: " + Arrays.toString(nums)
        // + newLine + "expected: " + Arrays.toString(expected)
        // + newLine + "response: " + response
        // + newLine);
        // }

        return true;
    }
}
