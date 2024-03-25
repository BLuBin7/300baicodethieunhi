class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> list = new ArrayList<>();
        
        for (int i = 0; i < nums.length; i++){
            int index = Math.abs(nums[i]) - 1;
            int num = nums[index];
            
            if (num < 0) list.add(index + 1);
            nums[index] = -num;
        }
        return list;
    }
}