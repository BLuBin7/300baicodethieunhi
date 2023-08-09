
public class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        for(String word : word1){
            for(int i = 0; i < word.length(); i++){
                word1.add(word[0]);
            }
        }
    }
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.arrayStringsAreEqual(new String[]{"ab", "c"}, new String[]{"a", "bc"}));
    }
}
