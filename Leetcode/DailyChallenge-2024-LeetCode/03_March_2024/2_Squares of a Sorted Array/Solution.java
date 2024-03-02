class Solution {
    public int[] sortedSquares(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        int index = nums.length - 1;
        int[] ans = new int[nums.length];
        while (index >= 0) {
            int rightSquare = nums[right] * nums[right];
            int leftSquare = nums[left] * nums[left];
            if (rightSquare > leftSquare) {
                ans[index] = rightSquare;
                right--;
            } else {
                ans[index] = leftSquare;
                left++;
            }
            index--;
        }
        return ans;
    }
}