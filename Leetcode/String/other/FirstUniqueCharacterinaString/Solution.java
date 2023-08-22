// 387. First Unique Character in a String

import java.util.HashMap;

public class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))) {
                //                  gia tri cua khoa(so lan trung)
                map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
            } else {
                // neu luc dau khong co gtri trung thi se cho = 1
                map.put(s.charAt(i), 1);
            }
        }
        System.out.println(map);
        for (int i = 0; i < s.length(); i++) {
            if (map.get(s.charAt(i)) == 1) {
                return i;
            }
        }
        return -1;
    }


    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.firstUniqChar("loveleetcode"));
    }
}
