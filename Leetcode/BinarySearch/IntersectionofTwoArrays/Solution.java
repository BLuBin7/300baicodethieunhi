import java.util.HashSet;
import java.util.Set;

public class Solution {
   public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        for(int i : nums1){
            set1.add(i);
        }
        for(int i : nums2){ 
            set2.add(i);
        }
        set1.retainAll(set2);
        return set1.stream().mapToInt(Integer::intValue).toArray();
    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.intersection(new int[]{1,2,2,1}, new int[]{2,2}));
    }
}
