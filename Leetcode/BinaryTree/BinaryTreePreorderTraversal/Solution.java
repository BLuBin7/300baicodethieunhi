import java.util.ArrayList;
import java.util.List;

public class Solution {
    ArrayList<Integer> list;
    public List<Integer> preorderTraversal(TreeNode root) {
        list = new ArrayList<>();
        preorder(root);
        return list;  
    }
    public void preorder(TreeNode root){
        if(root==null) return;
        System.out.println(root.val);
        list.add(root.val);
        preorder(root.left);
        preorder(root.right);
    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);
        root.right.left.left = new TreeNode(4);
        System.out.println(solution.preorderTraversal(root));
    }
}
