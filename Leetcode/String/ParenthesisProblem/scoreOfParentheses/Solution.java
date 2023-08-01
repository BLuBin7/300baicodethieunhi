public class Solution {
    public int scoreOfParentheses(String s) {
        return score(s, 0, s.length() - 1);
    }

    private int score(String s, int left, int right) {
        if (right - left == 1) {
            // A pair of adjacent parentheses "()"
            return 1;
        }

        int balance = 0;
        for (int i = left; i < right; i++) {
            if (s.charAt(i) == '(') {
                balance++;
            } else {
                balance--;
            }

            if (balance == 0) {
                // Found a balanced parentheses pair (A + B)
                return score(s, left, i) + score(s, i + 1, right);
            }
        }

        // If the code reaches here, it means the parentheses are in the form (A)
        // where A is a balanced parentheses string.
        return 2 * score(s, left + 1, right - 1);
    }

    public static void main(String[] args) {
        Solution generator = new Solution();
        int re = generator.scoreOfParentheses("(()())");
        System.out.println(re); 
    }
}
