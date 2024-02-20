class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int sum = 0;
        while(n>0){
            sum +=n; 
            n--;
        }
        int arrSum = 0;
        for (int i = 0;i<nums.length;i++){
            arrSum +=nums[i];
        }
        return (sum-arrSum);
    }
}