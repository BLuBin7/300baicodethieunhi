import java.util.Scanner;
import java.util.StringTokenizer;

public class Solution {
    public int countSegments(String s) {
        int count = 0;
        for(int i = 0;i<s.length();i++){
            if((i==0||s.charAt(i-1)==' ')&&s.charAt(i)!=' '){
                count++;
            }
        }
        Scanner sc = new Scanner(s);
        while(sc.hasNext()){
            String token = sc.next();
            System.out.println("token: "+token);
        }
        return count;
    }
    //Solution 2: use StringTokenizer
    // public int countSegments(String s) {
    //     StringTokenizer st = new StringTokenizer(s);
    //     int count = 0;
    //     // kiem tra con token ko, neu true thi tim tiep
    //     while(st.hasMoreTokens()){
    //         System.out.println("token: "+st.hasMoreTokens());
    //         count++;
    //         // Token tiep theo
    //         st.nextToken();
    //     }
    //     return count;
    // }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.countSegments("    foo    bar"));
        System.out.println(solution.countSegments("Hello, my name is John"));
    }
}
