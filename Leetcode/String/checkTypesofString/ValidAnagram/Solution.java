import java.util.stream.Collectors;

public class Solution {
    // boolean isAnagram(String s, String t) {
    //     Map<Character, Integer> map = new HashMap<>();
    //     Map<Character, Integer> map2 = new HashMap<>();
    //     if (s.length() != t.length()) {
    //         return false;
    //     }
    //     for (char c : s.toCharArray()) {
    //         map.put(c, map.getOrDefault(c, 0) + 1);
    //         System.out.println(map);
    //     }
    //     for (char c : t.toCharArray()) {
    //         map2.put(c, map2.getOrDefault(c, 0) + 1);
    //         System.out.println(map2);
    //     }
    //     return map.equals(map2);
    // }
    
    // class Solution {
    //     public boolean isAnagram(String s, String t) {
    //         if (s.length() != t.length()) {
    //             return false;
    //         }
            
    //         int[] freq = new int[26];
    //         for (int i = 0; i < s.length(); i++) {
    //             freq[s.charAt(i) - 'a']++;
    //             freq[t.charAt(i) - 'a']--;
    //         }
            
    //         for (int i = 0; i < freq.length; i++) {
    //             if (freq[i] != 0) {
    //                 return false;
    //             }
    //         }
            
    //         return true;
    //     }
    // }
    
    // Solution 2
    public boolean isAnagram(String s, String t) {
        return getSortedString(s).equals(getSortedString(t));
    }

    private String getSortedString(String s) {
        return s.chars().mapToObj(c -> (char)c).sorted().map(String::valueOf).collect(Collectors.joining());
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String s = new String("aacc");
        String t = new String("ccac");
        System.out.println(solution.isAnagram(s, t));
    }
}