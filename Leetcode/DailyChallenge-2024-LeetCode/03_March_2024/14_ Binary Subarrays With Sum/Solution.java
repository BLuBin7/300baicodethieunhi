class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        return slidingwindow(nums, goal) - slidingwindow(nums, goal-1);
    }

    private int slidingwindow(int[] nums, int goal) {
        int n = nums.length;
        int left = 0, res = 0, sum = 0;
        for(int right = 0; right < n; right++) {
            sum += nums[right];
            while(left <= right && sum > goal) {
                sum -= nums[left++];
            }
            res += right-left+1;
        }
        return res;
    }
}