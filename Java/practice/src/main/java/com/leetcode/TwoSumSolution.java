package com.leetcode;

import java.util.HashMap;

public class TwoSumSolution {
    public int[] twoSum(int[] nums, int target) {
        try {
            HashMap<Long, Integer> numToIndex = new HashMap<Long, Integer>();
            for (int i = 0; i < nums.length; ++i) {
                Long value = (long) nums[i];
                long neededValue = target - value;
                if (numToIndex.containsKey(neededValue)) {
                    return new int[] { numToIndex.get(neededValue), i };
                } else {
                    numToIndex.put(value, i);
                }
            }

            return new int[] {};
        } catch (Exception ex) {
            System.out.println("Caught exception: " + ex.getMessage());
            return new int[] {};
        }
    }
}
