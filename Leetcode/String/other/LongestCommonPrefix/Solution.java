// 14. Longest Common Prefix

import java.util.Arrays;

public class Solution {
    public String longestCommonPrefix(String[] strs) {
       int count = 0;
       Arrays.sort(strs);
       String start = strs[0];
       String end = strs[strs.length - 1];
       int i = 0;
       while (i < start.length() && i < end.length()) {
        System.out.println(start.charAt(i) + " " + end.charAt(i));
           if(start.charAt(i) == end.charAt(i)) {
               count++;
           } else {
               break;
           }
           i++;
       }
       return start.substring(0, count);
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.longestCommonPrefix(new String[] { "flower", "flow", "flight" }));
        System.out.println(solution.longestCommonPrefix(new String[] { "ab", "a" }));

    }
}
















