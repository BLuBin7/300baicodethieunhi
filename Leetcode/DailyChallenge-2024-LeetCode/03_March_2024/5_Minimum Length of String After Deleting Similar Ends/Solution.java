class Solution {
    public int minimumLength(String s) {
        int n = s.length();
        int left = 0, right = n-1;
        while(left < right && s.charAt(left) == s.charAt(right)) {
            int c = s.charAt(left);
            while(left + 1 < right && s.charAt(left+1) == c) left++;
            while(right - 1 > left && s.charAt(right-1) == c) right--;
            left++;
            right--;
        }
        return right-left+1;
    }   
}