class Solution {
    public int findDuplicate(int[] nums) {
        int n = nums.length;
        boolean[] set = new boolean[n+1];
        for(int i=0;i<n;i++) {
            if(set[nums[i]]) return nums[i];
            set[nums[i]] = true;
        }
        return -1;
    }
}