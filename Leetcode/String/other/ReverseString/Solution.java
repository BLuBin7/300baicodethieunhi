// 344. Reverse String
public class Solution {
    // public void reverseString(char[] s) {
    //     StringBuilder r = new StringBuilder();
    //     for(int i = 0 ; i<s.length;i++){
    //         r.append(s[i]);
    //     }
    //     s= r.reverse().toString().toCharArray();
    //     System.out.println(s);
    // }

    // Solution 2
    public void reverseString(char[] s) {
        int i = 0;
        int max = s.length-1;
        while(i<max){
            char temp = s[i];
            s[i] = s[max];
            s[max] = temp;
            i++;
            max--;
        }
        System.out.println(s);
    }
    public static void main(String[] args){
        Solution s = new Solution();
        s.reverseString(new char[]{'h','e','l','l','o'});
        
    }
}
