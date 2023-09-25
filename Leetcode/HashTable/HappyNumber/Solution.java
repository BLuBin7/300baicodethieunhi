public class Solution {
    // public boolean isHappy(int n) {
    //     int slow = n;
    //     int fast = n;
    //     // while loop is not used here because initially slow and
    //     // fast pointer will be equal only, so the loop won't run.
    //     do {
    //         // slow moving one step ahead and fast moving two steps ahead

    //         slow = square(slow);
    //         fast = square(square(fast));
    //     } while (slow != fast);

    //     // if a cycle exists, then the number is not a happy number
    //     // and slow will have a value other than 1

    //     return slow == 1;
    // }


    // public int square(int num) {

    //     int ans = 0;

    //     while (num > 0) {
    //         int remainder = num % 10;
    //         ans += remainder * remainder;
    //         num /= 10;
    //     }

    //     return ans;
    // }
    
    // Solution 2
    public boolean isHappy(int n) {
        int m = recurse(n);
        if(m == 1){
            return true;
        }
        else{
            return false;
        }
    }
    public int recurse(int nums){
        String s = String.valueOf(nums);
        int sum = 0;
        for(int i = 0 ; i<s.length();i++){
            // trả về kiểu số 
            sum += Math.pow(s.charAt(i)-'0',2);
            System.out.println(sum);
        }
        if(sum == 1){
            return 1;
        }
        else if(sum < 10){
            return -1;
        }
        else{
            return recurse(sum);
        }
    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.isHappy(19));
    }
}