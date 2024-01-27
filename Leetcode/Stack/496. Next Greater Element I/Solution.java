import java.util.Stack;

class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n = nums2.length;
        int next[] = new int[n];
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<n;i++){
                while(!st.isEmpty() && nums2[st.peek()]<nums2[i]){
                    next[st.pop()]=nums2[i];
                }
                st.push(i);  
        }
        while(!st.isEmpty()){
            next[st.pop()]=-1;
        }
        int ans[] = new int[nums1.length];
        Map<Integer,Integer> hm = new HashMap<>();
        for(int i=0;i<n;i++){
            hm.put(nums2[i],next[i]);
        }
        for(int i=0;i<nums1.length;i++){
            ans[i] = hm.get(nums1[i]);
        }
        return ans;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums1 = {4,1,2};
        int[] nums2 = {1,3,4,2};
        System.out.println(solution.nextGreaterElement(nums1, nums2));
    }
}