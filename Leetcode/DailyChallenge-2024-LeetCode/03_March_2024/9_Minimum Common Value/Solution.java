class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        int left = 0, right = 0;
        int m = nums1.length, n = nums2.length;
        while(left < m && right < n) {
            int n1 = nums1[left], n2 = nums2[right];
            if(n1 == n2) return n1;
            if(n1 < n2) {
                left++;
                continue;
            }
            if(n1 > n2) {
                right++;
                continue;
            }
        }
        return -1;
    }
}