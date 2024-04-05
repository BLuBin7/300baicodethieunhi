class Solution {
    public String makeGood(String s) {
        StringBuilder ans = new StringBuilder();
        Stack<Character> stack1 = new Stack<>();
        Stack<Character> stack2 = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            if (!stack1.isEmpty() && Math.abs(s.charAt(i) - stack1.peek()) == 32) {
                stack1.pop();
            } else {
                stack1.push(s.charAt(i));
            }
        }

        while (!stack1.isEmpty()) {
            stack2.push(stack1.pop());
        }

        while (!stack2.isEmpty()) {
            ans.append(stack2.pop());
        }

        return ans.toString();
    }
}