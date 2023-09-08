package com.leetcode;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class FindMedianSortedArraysTests {

    @Test
    public void RunTests() {
        System.out.println("started: FindMedianSortedArrays");
        FindMedianSortedArraysSolution solution = new FindMedianSortedArraysSolution();
        assertTrue(RunTest(solution, new int[] { 1,3 }, new int[] { 2 }, 2));
        assertTrue(RunTest(solution, new int[] { 1,2 }, new int[] { 3,4 }, 2.5));

        System.out.println("successfully finished: FindMedianSortedArrays");
    }

    private boolean RunTest(FindMedianSortedArraysSolution solution, int[] nums1, int[] nums2, double output) {
        double response = solution.findMedianSortedArrays(nums1, nums2);
        String newLine = "\n";
        boolean success = response == output;
        if (!success) {
            System.out.println("success: " + success
                    + newLine + "expected: " + output
                    + newLine + "response: " + response
                    + newLine);
        }

        return success;
    }
}
