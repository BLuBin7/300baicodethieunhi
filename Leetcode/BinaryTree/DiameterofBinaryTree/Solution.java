public class Solution {
    int HighLeft = 0;
    int HighRight = 0;
    int answer = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        if(root == null){
            return -1;
        }
        else if(root.left == null&& root.right == null){
            return 0;
        }
        HighLeft = diameterOfBinaryTree(root.left);
        HighRight = diameterOfBinaryTree(root.right);
        answer = Math.max(answer, HighLeft + HighRight + 2);

        return Math.max(HighLeft, HighRight) + 1;
    }
    public static void main(String[] args) {
        
    }
}
