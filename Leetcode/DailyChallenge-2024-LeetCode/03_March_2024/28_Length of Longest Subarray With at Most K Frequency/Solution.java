class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        Map<Integer,Integer> fequency = new HashMap<>();
        int right = 0, left = 0, ans = 0, n = nums.length;
        while(right < n){
            fequency.put(nums[right],fequency.getOrDefault(nums[right], 0)+1);
            while(fequency.get((nums[right])) > k){
                fequency.put(nums[left],fequency.get(nums[left])-1);
                left++;
            }
            ans = Math.max(ans,1 + right - left);
            right++;
        }
        
        return ans;
    }
}