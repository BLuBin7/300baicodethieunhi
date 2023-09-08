public class Solution {
    public int searchInsert(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                return i;
            }
            else if ((target > nums[nums.length - 1] && i == nums.length - 1)
                    || (target > nums[i] && target < nums[i + 1] && i != nums.length - 1)) {
                return i + 1;
            }
            else if ( target < nums[0]){
                return 0;
            }
        }
        return 1;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = { 1, 3, 5, 6 };
        System.out.println(solution.searchInsert(nums, 0));
    }
}
