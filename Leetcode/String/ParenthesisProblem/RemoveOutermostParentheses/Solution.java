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

    // Solution 2
    // boolean isValidParentheses(String string) {
    //     int balance = 0;
    //     for (char c : string.toCharArray()) {
    //         if (c == '(') {
    //             balance++;
    //         } else {
    //             balance--;
    //         }
    //         if (balance < 0) {
    //             return false;
    //         }
    //     }
    //     return balance == 0;
    // }

    // // Function to find the primitive decomposition of a given string
    // List<String> primitiveDecomposition(String string) {
    //     List<String> primitives = new ArrayList<>();
    //     StringBuilder currentPrimitive = new StringBuilder();
    //     int balance = 0;
    //     for (char c : string.toCharArray()) {
    //         currentPrimitive.append(c);
    //         if (c == '(') {
    //             balance++;
    //         } else {
    //             balance--;
    //         }
    //         if (balance == 0) {
    //             primitives.add(currentPrimitive.toString());
    //             currentPrimitive = new StringBuilder();
    //         }
    //     }
    //     return primitives;
    // }

    // // Remove the outermost parentheses from each primitive in the decomposition
    // public String removeOuterParentheses(String s) {
    //     List<String> primitiveDecomposition = primitiveDecomposition(s);
    //     StringBuilder result = new StringBuilder();
    //     for (String primitive : primitiveDecomposition) {
    //         if (isValidParentheses(primitive)) {
    //             result.append(primitive.substring(1, primitive.length() - 1));
    //         }
    //     }

    //     return result.toString();
    // }
       

    public static void main(String[] args) {
        Solution generator = new Solution();
        String result = generator.removeOuterParentheses("()");
        System.out.println(result);

    }
}
