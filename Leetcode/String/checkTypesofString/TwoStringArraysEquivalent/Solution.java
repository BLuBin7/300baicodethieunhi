
public class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String temp1 = "", temp2 = "";
        for (int i = 0 ; i < word1.length-1;i++) {
            temp1 = word1[i].concat(word1[i+1]);
        }
        temp2 = word2[0].concat(word2[1]);
        for (int i = 0 ; i < word2.length-1;i++) {
            if(word2.length > 2 && i>1) {
                temp2 = temp2.concat(word2[i]);
                System.out.println(temp2);
            }
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
