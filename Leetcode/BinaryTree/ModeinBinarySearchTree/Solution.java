import java.util.HashMap;
import java.util.Map;

public class Solution{
     public int[] findMode(TreeNode root) {
        Map<Integer, Integer> map = new HashMap<>();
        int n = 0;
        int max = -1;
        helper(root, map);
        for(int p : map.values()){
            max = Math.max(max, p);
        }
        System.out.println(max);

        for(int p : map.keySet()){
            if(map.get(p) == max){
                n++;
            }
        }
        int[] res = new int[n];
        int ind = 0;
        System.out.println(map);
        for(int p : map.keySet()){
            if(map.get(p) == max){
                res[ind++] = p;
            }
        }
        return res;

    }
    public void helper(TreeNode root, Map<Integer, Integer> map){
        if(root == null){
            return;
        }
        map.put(root.val, map.getOrDefault(root.val, 0)+1);
       
        
        helper(root.right, map);
        helper(root.left, map);
    }
}