import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        boolean success = solution.isValid("()");
        System.out.println(success);
    }
    public boolean isValid(String s){
        Stack<Character> stack = new Stack<>();

        Map<Character, Character> mapping = new HashMap<>();
        mapping.put(')', '(');
        mapping.put('}', '{');
        mapping.put(']', '[');

        for (char c : s.toCharArray()) {
            if (mapping.containsKey(c)) {
                // Closing bracket encountered
                if (stack.isEmpty() || stack.peek() != mapping.get(c)) {
                    return false;
                }
                stack.pop();
            } else {
                // Opening bracket encountered
                stack.push(c);
            }
        }
        return stack.isEmpty();
    }
}



