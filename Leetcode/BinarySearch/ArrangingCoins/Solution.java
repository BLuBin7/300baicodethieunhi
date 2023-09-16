public class Solution {
    public int arrangeCoins(int n) {
        long i=0;
        for(i=1;i*(i+1)/2<=n;i++){
            System.out.println("i: "+i);
        }
        return (int)i-1;
    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.arrangeCoins(5));
    }
}
