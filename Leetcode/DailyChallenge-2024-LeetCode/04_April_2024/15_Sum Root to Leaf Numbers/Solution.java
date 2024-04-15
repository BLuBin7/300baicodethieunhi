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
    public int sumNumbers(TreeNode root) {
        int sum = 0;
        List<String> list = new ArrayList<>();
        dfs(root, "" , list);
        for (String string : list) {
            sum += Integer.parseInt(string);
        }
        return sum;
    }
    
    private void dfs(TreeNode node, String s, List<String> list) {
        if (node == null) {
            return;
        }
        s += String.valueOf(node.val);
        if (node.left == null && node.right == null) {
            list.add(s);
            return;
        }
        dfs(node.left, s, list);
        dfs(node.right, s, list);
    }
}