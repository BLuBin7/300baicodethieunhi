public class Solution {
    static int sum(TreeNode root){
        if(root==null) return 0;
        else return root.val + sum(root.left)+sum(root.right);
    }

    static int helper(TreeNode root){
        if(root==null) return 0;

        int a = sum(root.left);
        int b = sum(root.right);

        int x = Math.abs(a-b);
        return x + helper(root.left)+helper(root.right);
    }
    public int findTilt(TreeNode root) {
        return helper(root);
    }
}
