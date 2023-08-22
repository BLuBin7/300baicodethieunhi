public class Solution {
    public String convertToTitle(int columnNumber) {
        StringBuilder sb = new StringBuilder();
        while(columnNumber>0){
            columnNumber--;
            sb.append((char)('A'+columnNumber%26));
            System.out.println(sb.toString());
            columnNumber/=26;
        }
        return sb.reverse().toString();
    }
    public static void main(String[] args){
        Solution solution = new Solution();
        System.out.println(solution.convertToTitle(28));
    }
}
