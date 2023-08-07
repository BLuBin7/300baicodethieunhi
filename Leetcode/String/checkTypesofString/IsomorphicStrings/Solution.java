import java.util.HashMap;

public class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            // Tra ve true neu map co key s.charAt(i)
            if (map.containsKey(s.charAt(i))) {
                // kiem tra key co khac value khong, neu khong thi tra ve null
                if (map.get(s.charAt(i)) != t.charAt(i)) {
                    return false;
                    // return map;
                }
            } 
            // check neu a = b va b = a
            else { 
                if (map.containsValue(t.charAt(i))) {
                    return false;
                    // return map;
                }
                map.put(s.charAt(i), t.charAt(i));
            }
        }
        return true;
        // return map;
    }

    
    public static void main(String[] args) {
        Solution solution = new Solution();
        // String s = new String("paper");
        // String t = new String("title");
        String s1 = new String("bbbaaaba");
        String s2 = new String("aaabbbba");
        // System.out.println(solution.isIsomorphic(s, t));
        System.out.println(solution.isIsomorphic(s1, s2));
    }
}
