package com.leetcode;

class MaxAreaSolution {
    public int maxArea(int[] height) {
        int maxAreaFound = 0;
        int leftIndex = 0;
        int rightIndex = height.length - 1;
        while (leftIndex < rightIndex) {
            int width = rightIndex - leftIndex;
            int maxHeight = height[leftIndex] < height[rightIndex] ? height[leftIndex] : height[rightIndex];
            int total = width * maxHeight;
            if (total > maxAreaFound) {
                maxAreaFound = total;
            }

            if (height[leftIndex] < height[rightIndex]) {
                ++leftIndex;
            } else {
                --rightIndex;
            }
        }

        return maxAreaFound;
    }
}
