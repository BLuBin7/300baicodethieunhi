class Solution {
    public int maxDepth(String s) {
        int max = 0, i = 0;
        Stack<Character> stack = new Stack();
        for (char c : s.toCharArray()) {
            if (c == '(') {
                stack.push(c);
                i++;
            }
            if (c == ')') {
                stack.pop();
                i--;
            }
            max = Math.max(max, i);
        }
        return max;
    }
}