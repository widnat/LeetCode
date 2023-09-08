package com.leetcode;

public class SearchSolution {
    public int search(int[] nums, int target) {
        int output = -1;
        int leftIndex = 0;
        int rightIndex = nums.length - 1;
        while (leftIndex < rightIndex - 1) {
            int middleIndex = (rightIndex + leftIndex) / 2;
            if (nums[leftIndex] <= target && target <= nums[middleIndex]) {
                rightIndex = middleIndex;
            } else if (nums[middleIndex] <= target && target <= nums[rightIndex]) {
                leftIndex = middleIndex;
            } else if (nums[leftIndex] > nums[middleIndex]) {
                rightIndex = middleIndex;
            } else {
                leftIndex = middleIndex;
            }
        }

        for (int i = leftIndex; i <= rightIndex; ++i) {
            if (nums[i] == target) {
                output = i;
                break;
            }
        }

        return output;
    }
}
