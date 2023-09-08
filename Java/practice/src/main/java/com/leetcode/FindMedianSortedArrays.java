package com.leetcode;

class FindMedianSortedArraysSolution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int nums1Index = 0;
        int nums2Index = 0;
        int index = 0;
        double previous = 0;
        double current = 0;
        int totalLength = nums1.length + nums2.length;
        boolean isEven = totalLength % 2 == 0;
        int medianIndex = totalLength / 2;
        while (index <= medianIndex) {
            previous = current;
            boolean canUseNum1 = nums1Index < nums1.length;
            boolean canUseNum2 = nums2Index < nums2.length;
            if (canUseNum1 && canUseNum2) {
                double num1 = nums1[nums1Index];
                double num2 = nums2[nums2Index];
                if (num1 < num2) {
                    current = num1;
                    nums1Index++;
                } else {
                    current = num2;
                    nums2Index++;
                }
            } else if (canUseNum1) {
                current = nums1[nums1Index];
                nums1Index++;
            } else if (canUseNum2) {
                current = nums2[nums2Index];
                nums2Index++;
            }

            index++;
        }

        return isEven ? (current + previous) / 2.0 : current;
    }
}
