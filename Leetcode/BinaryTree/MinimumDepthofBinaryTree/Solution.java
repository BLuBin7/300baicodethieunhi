public class Solution {
    public int minDepth(TreeNode root) {
        if(root ==null){
            return 0;
        }
        int lc = minDepth(root.left);
        int rc = minDepth(root.right);
        if(lc==0 || rc == 0){
            return Math.max(lc,rc)+1;
        }
        return Math.min(rc,lc)+1;
    }
}
