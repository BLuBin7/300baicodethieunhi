class Solution {
    public long countSubarrays(int[] nums, int k) {
        int left = 0, right = 0, counter = 0, max = 0;
        long res = 0;
        // int max = Arrays.stream(nums).max().getAsInt();

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) max = nums[i];
        }

        while (right < nums.length) {
            if (nums[right] == max) counter++;
            while (counter >= k) {
                if (nums[left] == max) counter--;
                left++;
            }
            res += left;
            right++;
        }
        return res;
    }
}