public class Solution {
    int count = 0;
    public int countNodes(TreeNode root) {
            if(root != null){
                countNodes(root.left);
                count++;
                countNodes(root.right);
            }
        return count;
    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        System.out.println(solution.countNodes(root));
    }
}
