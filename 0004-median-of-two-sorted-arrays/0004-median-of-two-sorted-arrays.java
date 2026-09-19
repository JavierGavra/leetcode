class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] merged = new int[nums1.length + nums2.length];

        int i = 0;
        int j = 0;

        for (int k = 0; k < merged.length; k++) {
            if (i == nums1.length) {
                merged[k] = nums2[j];
                j++;
                continue;
            } else if (j == nums2.length) {
                merged[k] = nums1[i];
                i++;
                continue;
            }

            if (nums1[i] <= nums2[j]) {
                merged[k] = nums1[i];
                i++;
            } else if (nums1[i] >= nums2[j]) {
                merged[k] = nums2[j];
                j++;
            }
        }

        boolean isOdd = (merged.length % 2 == 1);
        int medianIndex = merged.length / 2;

        if (isOdd) {
            return merged[medianIndex];
        } else {
            return (merged[medianIndex] + merged[medianIndex - 1]) / 2.0;
        }
    }
}