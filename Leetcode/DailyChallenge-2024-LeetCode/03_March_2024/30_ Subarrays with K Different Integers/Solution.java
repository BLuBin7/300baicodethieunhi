class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {
        return subArraysWithAMostKDistinct(nums, k) - subArraysWithAMostKDistinct(nums, k - 1);
    }

    public int subArraysWithAMostKDistinct(int[] nums, int k) {
        int left = 0, right = 0, max = 0;
        HashMap<Integer, Integer> map = new HashMap<>();

        while (right < nums.length) {
            map.put(nums[right], map.getOrDefault(nums[right], 0) + 1);

            while(map.size() > k) {
                if (1 == map.get(nums[left])) map.remove(nums[left]);
                else map.put(nums[left], map.get(nums[left]) - 1);
                left++;
            }
            max += right - left + 1;
            right++;
        }
        return max;
    }
}