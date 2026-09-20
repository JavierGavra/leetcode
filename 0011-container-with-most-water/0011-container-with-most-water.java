class Solution {
    public int maxArea(int[] height) {
        int n = height.length;
        int l = 0;
        int r = n - 1;
        int max = 0;

        while (l < r) {
            int w = r - l;
            int h = Math.min(height[l], height[r]);
            max = Math.max(max, h * w);

            if (height[l] <= height[r]) {
                l++;
            } else if (height[l] > height[r]) {
                r--;
            }
        }

        return max;
    }
}