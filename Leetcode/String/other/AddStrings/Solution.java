import java.math.BigInteger;

public class Solution {
    public String addStrings(String num1, String num2) {
        BigInteger num1New = new BigInteger(num1);
        BigInteger num2New = new BigInteger(num2);
        System.out.println("num1New: "+num1New);
        System.out.println("num2New: "+num2New);
        return num1New.add(num2New).toString();
    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        // System.out.println(solution.addStrings("123", "456"));
        System.out.println(solution.addStrings("6913259244", "71103343"));
    }    
}
