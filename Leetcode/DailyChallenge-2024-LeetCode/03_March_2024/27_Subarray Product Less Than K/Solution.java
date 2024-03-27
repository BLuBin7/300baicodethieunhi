class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int preProduct = 1, i = 0, j = 0, count = 0;
        while(i < nums.length){
            preProduct *= nums[i];
            while(preProduct >= k && j <= i){
                preProduct /= nums[j];
                j++;
            }
            if(preProduct < k){
                count += i - j + 1;
            }
            i++;
        }
        return count;
    }
}