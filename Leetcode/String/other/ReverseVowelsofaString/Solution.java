// 345. Reverse Vowels of a String

public class Solution {
    String reverseVowels(String s) {
        char[] charArray = s.toCharArray();
        StringBuilder sb = new StringBuilder(charArray.length);
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] == 'a' || charArray[i] == 'e' || charArray[i] == 'i' || charArray[i] == 'o' || charArray[i] == 'u'
                || charArray[i] == 'A' || charArray[i] == 'E' || charArray[i] == 'I' || charArray[i] == 'O' || charArray[i] == 'U') {
               sb.append(charArray[i]);
            }
        }
        int count = 0;
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] == 'a' || charArray[i] == 'e' || charArray[i] == 'i' || charArray[i] == 'o' || charArray[i] == 'u'
                || charArray[i] == 'A' || charArray[i] == 'E' || charArray[i] == 'I' || charArray[i] == 'O' || charArray[i] == 'U') {
                charArray[i] = sb.charAt(sb.length()-count-1);
                count++;
            }
        }
        System.out.println(sb.toString());
        String str = new String(charArray);
        return str;
    }
    public static void main(String[] args){
        Solution s = new Solution();
        System.out.println(s.reverseVowels("leetcode"));
    //     System.out.println(s.reverseVowels("leotcede"));
    }
}
