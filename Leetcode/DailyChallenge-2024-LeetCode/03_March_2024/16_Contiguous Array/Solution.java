class Solution {
    public int findMaxLength(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int maxLength = 0;
        int count = 0;
        
        map.put(0, -1);
        
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == 0){
                count += -1;
            }else{
                count += 1;
            }
            
            if(map.containsKey(count)) {
                maxLength = Math.max(maxLength, i - map.get(count));
            }else{
                map.put(count, i);
            }
        }
        
        return maxLength;
    }
}