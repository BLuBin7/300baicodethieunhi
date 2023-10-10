import java.util.ArrayList;
import java.util.List;

public class Solution {
    ArrayList<Integer> list;
    public List<Integer> postorderTraversal(TreeNode root) {
        list = new ArrayList<>();
        postorder(root);
        return list;
    }
    public void postorder(TreeNode node){
        if(node == null) return;
        postorder(node.left);
        postorder(node.right);
        list.add(node.val);
    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);
        System.out.println(solution.postorderTraversal(root));
    }    
}
