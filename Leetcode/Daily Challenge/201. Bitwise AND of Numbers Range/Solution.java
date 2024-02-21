class Solution {
    public int rangeBitwiseAnd(int left, int right) {
        int suffixLen = 0;
        
        while (left != right) {
            left >>= 1;
            right >>= 1;
            suffixLen++;
        }

        return left << suffixLen;
    }
}