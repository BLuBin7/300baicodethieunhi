class Solution {
    public boolean checkValidString(String s) {
        int extra = 0;
        int st = 0;
        Character open = '(';
        Character wildCard = '*';
        Stack<Character> stack = new Stack<>();
        char[] ar = s.toCharArray();
        for (char c : s.toCharArray()) {
        if (c == '(') {
            st++;
            stack.push(open);
        } else if (c == ')') {
            // Remove open
            if (st > 0) {
            st--;
            stack.remove(stack.lastIndexOf(open));
            continue;
            }
            // Use extra to convert
            if (extra > 0) {
            extra--;
            stack.remove(stack.lastIndexOf(wildCard));
            continue;
            }
            // lose
            return false;

        } else {
            // * wild card
            stack.push(wildCard);
            extra++;
        }
        }

        // end of string and we used all the open
        if (st == 0) return true;
        // Still have open ~> need extra
        // If extra = 0 or less than open can't solve ~> false
        if (extra == 0 || extra < st) return false;

        int counter = 0;
        while (!stack.isEmpty()) {
        if (stack.pop().equals(open)) counter--;
        else counter++;
        if (counter < 0) return false;
        }
        return true;
    }
}