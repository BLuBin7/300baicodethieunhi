public class Solution {
    public int strStr(String haystack, String needle) {
        if(needle.equals(haystack)) return 0;
        for (int i = 0; i < haystack.length() ; i++) {
            if (i <= haystack.length() - needle.length()) {
                if (haystack.substring(i, i + needle.length()).equals(needle)) {
                    return i;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.strStr("abc", "c"));
    }
}
