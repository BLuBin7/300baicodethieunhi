import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList<>();
        backtrack(list, "", 0, 0, n);
        return list;
    }

    private void backtrack(List<String> list, String current, int open, int close, int max) {
        if (current.length() == max * 2) {
            list.add(current);
            return;
        }

        if (open < max) {
            backtrack(list, current + "(", open + 1, close, max);
        }
        if (close < open) {
            backtrack(list, current + ")", open, close + 1, max);
        }
    }

    public static void main(String[] args) {
        Solution generator = new Solution();
        List<String> result = generator.generateParenthesis(3);
        System.out.println(result);
    }
}
