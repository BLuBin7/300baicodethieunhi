public class Solution {
    // public boolean isSumEqual(String firstWord, String secondWord, String targetWord) {
    //     int ascii = 0;
    //     String temp1 = "";
    //     for(int i = 0; i < firstWord.length(); i++) {
    //         char temp = firstWord.charAt(i);
    //         ascii =  temp - 97;
    //         temp1 +=ascii;
    //     }
        
    //     int ascii2 = 0;
    //     String temp2 = "";
    //     for(int i = 0; i < secondWord.length(); i++) {
    //         char temp = secondWord.charAt(i);
    //         ascii2 =  temp - 97;
    //         temp2 += ascii2;
    //     }

    //     int ascii3 = 0;
    //     String temp3 = "";
    //     for(int i = 0; i < targetWord.length(); i++) {
    //         char temp = targetWord.charAt(i);
    //         ascii3 =  temp - 97;
    //         temp3 += ascii3;
    //     }
    //     int numbertarget = Integer.parseInt(temp3);
    //     int number = Integer.parseInt(temp1) + Integer.parseInt(temp2);
    //     if(number ==  numbertarget) {
    //         return true;
    //     }
    //     return false;
    // }

    // Solution 2
    public boolean isSumEqual(String firstWord, String secondWord, String targetWord) {
        int sum1=0,sum2=0,sum=0;
        for(int i=0;i<firstWord.length();i++){
            sum1=sum1*10+firstWord.charAt(i)-'a';
        }
        for(int i=0;i<secondWord.length();i++){
            sum2=sum2*10+secondWord.charAt(i)-'a';
        }
        for(int i=0;i<targetWord.length();i++){
            // tang len theo  hang chuc *10
            // den hang tram *10 cua hang chuc
            sum=sum*10+targetWord.charAt(i)-'a';
            System.out.println(sum);
        }
        return sum==sum1+sum2;
    }
    
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.isSumEqual("acb", "cba", "cdb"));
    }
}
