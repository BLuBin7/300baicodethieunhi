public class Solution {
    static int xH =-1;
    static int yH =-1;
    static TreeNode xP = null;
    static TreeNode yP = null;
    static boolean ans = false;
    public static int inorder(TreeNode root, int x, int y, int dep){
        if(root == null) return 0;
        dep++;
       
        if(root.val == x){
            xH = dep;
        }
        if(root.val == y){
            yH = dep;
        }
        if(root.left !=null){
            if(root.left.val == x){
                xP = root;
            }
            if(root.left.val == y){
                yP = root;
            }
        }
        if(root.right !=null){
            if(root.right.val == x){
                xP = root;
            }
            if(root.right.val == y){
                yP = root;
            }
        }

        if( xH == yH && xH != -1 && yP != xP){
            ans = true;
        }

        inorder(root.left, x, y, dep);
        
        inorder(root.right, x, y, dep);
        return dep;
    }
    public boolean isCousins(TreeNode root, int x, int y) {
        xH = -1;
        yH = -1;
        xP = null;
        yP = null;
        ans= false;

        inorder(root, x, y, 0);
        return ans;
    }
}
