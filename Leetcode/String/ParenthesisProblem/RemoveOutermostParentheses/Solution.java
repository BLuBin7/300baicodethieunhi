
public class Solution {
    public String removeOuterParentheses(String s) {
        int countopen = 0, countclose = 0;
        String snew = "";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                countopen++;
            }
            if (s.charAt(i) == ')') {
                countclose++;
            }
            if (countclose == countopen) {
                snew = s.substring(0, i) ;
                if (snew.length() < s.length()) {
                    return s = s.substring(1, i) + removeOuterParentheses(s.substring(i+1, s.length()));
                }
                else {
                    return s;
                }
            }
        }
        return s;
    }

    public static void main(String[] args) {
        Solution generator = new Solution();
        String result = generator.removeOuterParentheses("()()");
        System.out.println(result);

    }
}
