public class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String temp1 = "";
        for (int i = temp1.length(); i < word1.length; i++) {
            temp1 += word1[i];
        }
        String temp2 = "";
        for (int i = temp2.length(); i < word2.length; i++) {
            temp2 += word2[i];
        }
        if(temp1.equals(temp2)){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.arrayStringsAreEqual(new String[]{"ab", "c","qw"}, new String[]{"a", "bc","qw"}));

    }   
}
