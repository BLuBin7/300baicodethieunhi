
public class Solution {
    public int maxDepth(String s) {
        int countopen = 0, max = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                countopen++;
                if (countopen > max) {
                    max = countopen;
                }
            } else if (s.charAt(i) == ')') {
                countopen--;
            }
        }
        return max;
    }
    // Solution 2
    // public int maxDepth(String s) {
    //     int count = 0, max = 0;

    //     for (char c : s.toCharArray()) {
    //         if (c == '(') {
    //             count++;
    //             if (count > max) {
    //                 max = count;
    //             }
    //         } else if (c == ')') {
    //             count--;
    //         }
    //     }

    //     return max;
    // }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int a = solution.maxDepth("()");
        System.out.println(a);
    }
}
