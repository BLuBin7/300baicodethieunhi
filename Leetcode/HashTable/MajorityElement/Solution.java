import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int num : nums){
            System.out.println(map.getOrDefault(num, 0)+1);
            map.put(num, map.getOrDefault(num, 0) + 1);
            System.out.println(map);
        }
        for(int key : map.keySet()){
            if(map.get(key) > nums.length / 2){
                return key;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.majorityElement(new int[]{2,2,1,1,1,2,2}));
    }
}
