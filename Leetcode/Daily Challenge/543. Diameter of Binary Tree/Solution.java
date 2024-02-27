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
     public int diameterOfBinaryTree(TreeNode root) {
         DFS(root, 0);
         return max;
     }
 
     private int DFS(TreeNode node, int depth) {
         if(node == null) return 0;
         int leftDepth = DFS(node.left, depth+1);
         int rightDepth = DFS(node.right, depth+1);
         max = Math.max(max, leftDepth + rightDepth);
         return Math.max(leftDepth + 1, rightDepth + 1);
     }
 }