import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        TreeNode node = new TreeNode();
        List<Integer> list = new ArrayList<>();
        node = root;
        while (node != null) {
            if (node.left == null) {
                list.add(node.val);
                node = node.right;
            } else {
                TreeNode temp = node.left;
                while (temp.right != null && temp.right != node) {
                    temp = temp.right;
                }
                if (temp.right == null) {
                    temp.right = node;
                    node = node.left;
                } else {
                    temp.right = null;
                    list.add(node.val);
                    node = node.right;
                }
            }
        }  
        return list;
    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);
        System.out.println(solution.inorderTraversal(root));
    }
}
