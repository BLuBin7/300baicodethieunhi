public class Solution{
    public int[] sortArrayByParity(int[] nums) {
        int i = 0, j = nums.length - 1;
        
        while (i < j) {
            while (i < j && nums[i] % 2 == 0)
                i++;
            while (i < j && nums[j] % 2 == 1)
                j--;
            
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            System.out.println(nums[i]);
        }
        
        return nums;
    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = { 3,1,2,4};
        System.out.println(solution.sortArrayByParity(nums));
    }
}