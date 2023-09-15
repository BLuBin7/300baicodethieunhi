public class Solution {
    public boolean isPerfectSquare(int num) {
        int result = (int) Math.sqrt(num);
        return result*result == num;
    }
    public static void main(String[] args) {
        System.out.println(new Solution().isPerfectSquare(14));
    }        
}
