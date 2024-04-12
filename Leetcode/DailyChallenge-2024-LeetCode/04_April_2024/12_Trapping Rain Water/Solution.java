class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int[] left = new int[n];
        int[] right = new int[n];
        int trappedWater = 0;
        if (n == 0) return 0;
        left[0] = height[0];
        for (int l = 1; l < n; l++) {
            left[l] = Math.max(left[l - 1], height[l]);
        }
        right[n - 1] = height[n - 1];
        for (int r = n - 2; r >= 0; r--) {
            right[r] = Math.max(right[r + 1], height[r]);
        }
        for (int i = 0; i < n; i++) {
            int minH = Math.min(left[i], right[i]);
            trappedWater += minH - height[i];
        }
        return trappedWater;
    }
}