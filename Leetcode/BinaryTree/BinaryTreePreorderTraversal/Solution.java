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

        list.add(root.val);
        preorder(root.left);
        preorder(root.right);
    }
    public static void main(String[] args) {
        
    }
}
