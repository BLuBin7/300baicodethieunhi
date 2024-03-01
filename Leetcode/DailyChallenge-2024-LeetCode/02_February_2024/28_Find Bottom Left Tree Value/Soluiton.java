/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    int max = 0;
    int ans = 0;
    public int findBottomLeftValue(TreeNode root) {
        ans = root.val;
        dfs(root,0);
        return ans;
    }
    private void dfs(TreeNode root, int height){
        if(root == null) return;
        dfs(root.left, height + 1);
        if(max < height) {
            max = height;
            ans = root.val;
        }
        dfs(root.right,height+1);
    }
}