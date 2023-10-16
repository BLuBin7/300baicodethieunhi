// 767. Reorganize String

import java.util.HashMap;
import java.util.Map;

public class Solution {
    String reorganizeString(String s) {
        Map<Character, Integer> map = new HashMap<>();
        StringBuilder sb = new StringBuilder();
        char first = s.charAt(0);
        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))) {
                if (map.get(s.charAt(i)) >= 1) {
                    map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
                }
            } else {
                map.put(s.charAt(i), 1);
            }
        }
        int max = map.get(first);
        System.out.println(max);
        for (char c : map.keySet()) {
            sb.append(c);
            if (map.get(c) > max) {
                max = map.get(c);
            }
        }
        // cac ki tu khac nhau
        System.out.println(sb);

        for (int i = 0; i <= max+2; i++) {
            sb.append(sb.charAt(i));
        }

        char[] a = sb.toString().toCharArray();
        System.out.println(sb);
        // new String de luu gia tri
        StringBuilder sbNew = new StringBuilder();
        for (int i = 0; i < a.length; i++) {
            if (map.get(a[i]) > 0) {
                sbNew.append(a[i]);
                map.put(a[i], map.get(a[i]) - 1);
            }
        }
        System.out.println("sbNew: " + sbNew);
        // kiem tra coi co 2 gtri gan giong nhau khong
        // tach thanh cac char
        char[] check = sbNew.toString().toCharArray();
        for (int i = 0; i < sbNew.length(); i++) {
            if (i == sbNew.length() - 1) {
                break;
            } else if (i != 0) {
                if (sbNew.charAt(i) == sbNew.charAt(i + 1)) {
                    char temp = check[i];
                    check[i] = check[i - 1];
                    check[i - 1] = temp;
                }
                if (sbNew.charAt(i) == sbNew.charAt(i - 1)){
                    char temp = check[i];
                    check[i] = check[i + 1];
                    check[i + 1] = temp;
                }
            }
        }
        System.out.println("sau khi swap:");
        String result = new String(check);
        // kiem tra lan cuoi
        for(int i = 0;i<result.length();i++){
            if(i==result.length()-1){
                break;
            }
            else if(result.charAt(i)==result.charAt(i+1)){
                return "";
            }
        }
        return result;
    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.reorganizeString("aababc"));
    }
}
