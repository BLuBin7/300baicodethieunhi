// 383 Random Note
import java.util.HashMap;

public class Solution {
    boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character,Integer> map = new HashMap<>();
        for (int i = 0; i < magazine.length(); i++) {
            if (map.containsKey(magazine.charAt(i))) {
                map.put(magazine.charAt(i), map.get(magazine.charAt(i)) + 1);
            } else {
                map.put(magazine.charAt(i), 1);
            }
        }
        System.out.println("Map khi chua xet: "+map);
        for(int i = 0;i<ransomNote.length();i++) {
            if(map.containsKey(ransomNote.charAt(i))) {
                if(map.get(ransomNote.charAt(i)) == 0) {
                    return false;
                } else {
                    // tru phan tu da lay ra trong map
                    map.put(ransomNote.charAt(i), map.get(ransomNote.charAt(i)) - 1);
                }
            } else {
                return false;
            }
        }
        System.out.println("Map khi da xet: "+map);
        return true;
    }
    public static void main(String[] args){
        Solution solution = new Solution();
        System.out.println(solution.canConstruct("aa", "aab"));
    }
}
