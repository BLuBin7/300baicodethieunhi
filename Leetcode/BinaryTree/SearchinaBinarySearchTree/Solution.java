public class Solution{
    public TreeNode searchBST(TreeNode root, int val) {
        if(root == null){
            return null;
        }
        else if(root.val == val){
            TreeNode ans = root;
            return ans;
        }
        else if(root.val > val){
           return searchBST(root.left, val);
        }
        
            
        return searchBST(root.right,val);
    }
}