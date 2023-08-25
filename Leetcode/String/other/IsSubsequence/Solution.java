// 392. Is Subsequence

public class Solution {
    public boolean isSubsequence(String s, String t) {
        char[] a = s.toCharArray();
        StringBuilder sb = new StringBuilder(t);
        StringBuilder temp = new StringBuilder();
        int index = 0;
        for (int i = 0; i < a.length; i++) {
            for (index = 0; index < sb.length(); index++) {
                System.out.println(a[i] + " " + sb.charAt(index));
                if (a[i] == sb.charAt(index)) {
                    temp.append(a[i]);
                    if (index == 0) {
                        sb.deleteCharAt(index);
                    } else {
                        sb.delete(0, index+1);
                    }
                    break;
                }
            }
        }
        if (temp.length() == a.length) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.isSubsequence("acb", "ahbgdc"));
    }
}
