public class Solution {
    int min;
    long res = Long.MAX_VALUE;

    public void dfs(TreeNode root) {
        if (root != null) {
            if (min < root.val && root.val < res) {
                res = root.val;
            } else if (min == root.val){
                dfs(root.left);
                dfs(root.right);
            }
        }
    }

    public int findSecondMinimumValue(TreeNode root) {
        if (root == null) return -1;
        min = root.val;
        dfs(root);
        return res < Long.MAX_VALUE ? (int) res : -1;
    }
}
