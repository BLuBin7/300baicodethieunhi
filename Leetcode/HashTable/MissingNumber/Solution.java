import java.util.ArrayList;
import java.util.Comparator;

public class Solution {
    public int missingNumber(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            list.add(nums[i]);
        }
        list.sort(Comparator.naturalOrder());
        for(int i = 0; i < list.size(); i++) {
            if(i!=list.size()-1 && list.get(i+1) - list.get(i) != 1){
                return list.get(i) + 1;
            }
            else if( i == list.size()-1 && list.size() > list.get(i)){
                return list.get(i) + 1;
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.missingNumber(new int[]{1,2,3,4,6}));    
    }
}
