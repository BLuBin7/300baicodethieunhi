class Solution {
    // Monotonic stack
    public String removeLeadingZeros(StringBuilder num) {
        int i = 0;
        int len = num.length();
        while (i < len && num.charAt(i) == '0') {
            i++;
        }
        return i == len ? "0" : num.substring(i);
    }
    
    public String removeKdigits(String num, int k) {
        Stack<Character> stack = new Stack<>();
        for (char digit : num.toCharArray()) {
            while (k > 0 && !stack.isEmpty() && stack.peek() > digit) {
                stack.pop();
                k--;
            }
            stack.push(digit);
        }
        while (k > 0) {
            stack.pop();
            k--;
        }
        StringBuilder result = new StringBuilder();
        stack.forEach(result::append);
        return removeLeadingZeros(result);
    }
}   