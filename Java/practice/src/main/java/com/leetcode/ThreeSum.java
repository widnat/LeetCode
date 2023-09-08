package com.leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

class ThreeSumSolution {
    public List<List<Integer>> threeSum(int[] nums) {
        // not done yet, hard to test
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> numList = new ArrayList<>();
        HashSet<Integer> numSet = new HashSet<>();
        for (int num : nums) {
            if (!numSet.contains(num)) {
                numSet.add((Integer) num);
                numList.add((Integer) num);
            }
        }

        for (int i = 0; i < numList.size() - 2; ++i) {
            for (int j = i + 1; j < numList.size() - 1; ++j) {
                int neededNum = (nums[i] + nums[j]) * -1;
                if (numSet.contains(neededNum)) {
                    ArrayList<Integer> newList = new ArrayList<>();
                    newList.add(nums[i]);
                    newList.add(nums[j]);
                    newList.add(neededNum);
                    result.add(newList);
                }
            }
        }

        return result;
    }
}
