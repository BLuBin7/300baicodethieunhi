import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        Map<Character, Character> map = new HashMap<>();
        Set<Character> value = new HashSet();
        int countkey = 0;
        for (int i = 0; i < s1.length(); i++) {
            // neu co key trung
            if (map.containsKey(s1.charAt(i))) {
                // neu key trung sau co gtri khac key trung truoc 
                // tao mot bien dem key, neu a=b va b=a thi dung
                if (map.get(s1.charAt(i)) != s2.charAt(i)) {
                    {
                        if(map.keySet().contains(s2.charAt(i)) == false){
                           return false;
                        }
                        countkey++;
                    }
                }
            } else {
                map.put(s1.charAt(i), s2.charAt(i));
                // System.out.println(map);
            }
        }
        
        int count = 0;


        
        
        System.out.println(map.keySet());
        for (Character key : map.keySet()) {
            // lay ra cac key duoi dang Set(ko dc trung cac key)
            // System.out.println(map.keySet());
            // System.out.println(map.get(key));
            // neu khac thi count++
            // gia tri != key
            if (map.get(key) != key ) {
                System.out.println(map.get(key));
                count++;
            }
            
        }
        if(s1.equals(s2)){
            return true;
        }
        return countkey % 2 == 0 &&countkey>0||count<=2&&count>0;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.areAlmostEqual(
                "siyolsdcjthwsiplccjbuceoxmpjgrauocx",
                "siyolsdcjthwsiplccpbuceoxmjjgrauocx"));
        System.out.println(solution.areAlmostEqual(
                "aa",
                "ab"));
        System.out.println(solution.areAlmostEqual(
        "bank3","kanb3"
        ));
    }
}
