import java.util.ArrayList;
import java.util.List;

public class Solution {
     List<Integer> l=new ArrayList<>();
    public boolean findTarget(TreeNode root, int k) {
        return help(root,k);
    }
    public boolean help(TreeNode root,int k )
    {
        if(root==null)return false;
        if(l.contains(k-root.val))return true;
        l.add(root.val);
        return help(root.left,k)||help(root.right,k);
    }
}
