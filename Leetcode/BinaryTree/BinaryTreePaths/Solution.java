import java.util.ArrayList;
import java.util.List;

public class Solution {
    ArrayList<String> list ;
    public List<String> binaryTreePaths(TreeNode root) {
        list = new ArrayList<>();
        recurse(root,"");
        return list;
    }
    public void recurse(TreeNode root,String path){
        if(root == null) return;
        if(root.left == null && root.right == null){
            list.add(path+root.val);
        }
        recurse(root.left,path+root.val+"->");
        recurse(root.right,path+root.val+"->");
    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        System.out.println(solution.binaryTreePaths(root));
    }
}
