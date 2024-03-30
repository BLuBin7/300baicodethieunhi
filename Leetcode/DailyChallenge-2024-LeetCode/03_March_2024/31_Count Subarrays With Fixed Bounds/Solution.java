class Solution {
    public long count(int[] nums, int minK, int maxK) {
       long res = 0;
       int s = 0;
       for (int i = 0; i < nums.length; i++) {
           if (nums[i] > maxK || nums[i] < minK) {
               s = i + 1;
               continue;
           }
           res += (i - s + 1);
       }
       return res;
   }
   public long countSubarrays(int[] nums, int minK, int maxK) {
       return count(nums, minK, maxK) - count(nums, minK + 1, maxK)
               - count(nums, minK, maxK - 1) + count(nums, minK + 1, maxK - 1);
   }
}