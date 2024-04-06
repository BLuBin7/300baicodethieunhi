class Solution {
    public String minRemoveToMakeValid(String s) {
        StringBuilder ans = new StringBuilder();
        int stack = 0;

        for (int i = 0; i < s.length(); i++) {
            if (stack == 0 && s.charAt(i) == ')') {
                continue;
            } else {
                ans.append(s.charAt(i));
                if (s.charAt(i) == '(') {
                    stack++;
                } else if (s.charAt(i) == ')'){
                    stack--;
                }
            }
        }

        int idx = ans.length() - 1;

        while (stack > 0) {
            if (ans.charAt(idx) == '(') {
                ans.deleteCharAt(idx);
                stack--;
            }
            idx--;
        }

        return ans.toString();
    }
}