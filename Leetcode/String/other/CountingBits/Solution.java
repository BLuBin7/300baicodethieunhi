public class Solution {
    public int[] countBits(int n) {
        int[] result = new int[n + 1];
        for (int i = 0; i < n; i++){
            result[i+1] = count(i+1);
        }
        return result;
    }
    public int count(int n){
        int du = 0;
        int sum = 0;
        while(n>0){ 
            du = n%2;
            sum = du + sum;
            n=n/2;
        }
        return sum;
    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        // System.out.println(solution.count(2));
        solution.countBits(2);
        System.out.println(solution.countBits(5));
    }
}
