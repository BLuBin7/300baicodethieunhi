public class Solution {
    public boolean repeatedSubstringPattern(String s) {
        String doubled = s + s;
        System.out.println(doubled);
        String sub = doubled.substring(1, doubled.length() - 1);
        System.out.println(sub);
        return sub.contains(s);
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        // System.out.println(solution.repeatedSubstringPattern("abcabcabcabc"));
        // System.out.println(solution.repeatedSubstringPattern("abaababaab"));
        System.out.println(solution.repeatedSubstringPattern("abab"));
    }
}
