public class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        int sI  = 0;
        int eI = nums.length -1;
        return construstBST(nums, sI, eI);

    }
    public TreeNode construstBST(int arr[], int sI, int eI){
        if(sI>eI){
            return null;
        }
        int mid = (sI+eI)/2;
        TreeNode root = new TreeNode(arr[mid]);
        root.left =  construstBST(arr, sI, mid -1);
        root.right = construstBST(arr, mid+1, eI);
        return root;
    }
}
