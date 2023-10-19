public class Solution {
    int HeightLeft = 0;
    int HeightRight = 0;
    int answer = 0;
    public int dfs(TreeNode root) {
        if(root == null){
            return -1;
        }
        if(root.left == null && root.right == null){
            return 0;
        }
        HeightLeft = dfs(root.left);
        HeightRight = dfs(root.right);
        answer = Math.max(answer, HeightLeft + HeightRight + 2);

        return Math.max(HeightLeft, HeightRight) + 1;
    }

    public int diameterOfBinaryTree(TreeNode root) {
        dfs(root);
        return answer;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
    }
    
}
