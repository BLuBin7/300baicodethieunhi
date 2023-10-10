import java.util.ArrayList;
import java.util.List;

public class Solution {
    // Solution 1
    ArrayList<Integer> list;

    public List<Integer> inorderTraversal(TreeNode root) {
        list = new ArrayList<>();
        inorder(root);
        return list;
    }
    public void inorder(TreeNode root){
        if(root==null) return;
        inorder(root.left);
        list.add(root.val);
        inorder(root.right);
    }
    // Solution 2
    // public List<Integer> inorderTraversal(TreeNode root) {
    //     List<Integer> list = new ArrayList<>();
    //     TreeNode node = new TreeNode();
    //     node = root;
    //     while (node != null) {
    //         if (node.left == null) {
    //             list.add(node.val);
    //             node = node.right;
    //         } else {
    //             TreeNode temp = node.left;
    //             while (temp.right != null && temp.right != node) {
    //                 temp = temp.right;
    //             }
    //             if (temp.right == null) {
    //                 temp.right = node;
    //                 node = node.left;
    //             } else {
    //                 temp.right = null;
    //                 list.add(node.val);
    //                 node = node.right;
    //             }
    //         }
    //     }  
    //     return list;
    // }
    public static void main(String[] args) {
        Solution solution = new Solution();
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);
        System.out.println(solution.inorderTraversal(root));
    }
}
