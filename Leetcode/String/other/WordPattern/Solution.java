// 290. Word Pattern

import java.util.Map;
import java.util.HashMap;

public class Solution {
    public boolean wordPattern(String pattern, String s) {
        // 1 key co cac value khong duoc trung nhau
        // onetoone

        Map<Character, String> charToWordMap = new HashMap<Character, String>();
        Map<String, Character>  wordToCharMap = new HashMap<String, Character>();


        char[] chars = pattern.toCharArray();

        String[] a = s.split(" ");
        if (a.length != chars.length) {
            return false;
        }
        for (int i = 0; i < chars.length; i++) {
            if (charToWordMap.containsKey(chars[i])) {
                // sai, do chuoi nen so sanh = equals(do co the du dau " ")
                // if(map.get(chars[i])!=a[i]){}
                if (!charToWordMap.get(chars[i]).equals(a[i])) {
                    return false;
                }
            } else {
                charToWordMap.put(chars[i], a[i]);
                if (charToWordMap.containsValue(a[i])) {
                   
                }
            }

            if (wordToCharMap.containsKey(a[i])) {
                if (!wordToCharMap.get(a[i]).equals(chars[i])) {
                    return false;
                }
            } else {
                wordToCharMap.put(a[i], chars[i]);
            }
        }
        System.out.println(charToWordMap);
        System.out.println(wordToCharMap);
        return true;
    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        String pattern = "abba";
        String s = "dog cat cat dog";
        System.out.println(solution.wordPattern(pattern, s));
    }
}
