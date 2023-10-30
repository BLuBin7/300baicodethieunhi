public class Solution{
    static boolean helper(TreeNode root, int a){
        if(root==null) return true;
        if(root.val!=a) return false;
        else return helper(root.left,a) && helper(root.right,a);
    }
    
    public boolean isUnivalTree(TreeNode root) {
        if(root==null) return true;
        return helper(root,root.val);
    }
}