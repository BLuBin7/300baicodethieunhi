import java.util.HashMap;

public class Solution {
    public boolean buddyStrings(String s, String goal) {
        HashMap<Character, Character> map = initMap(s, goal);
      if (s.length() == goal.length()) {
           if(checkStringS(s, goal,map) == true && checkStringgoal(s, goal, map) == true) {
               return true;
           }
           else {
               return false;
           }
        }
        return false;
    }
    public boolean checkStringgoal(String s,String goal,HashMap<Character,Character> map) {
        for (int i = 0; i < goal.length(); i++) {
                // if (map.containsKey(goal.charAt(i)) && map.containsValue(map.get(goal.charAt(i)))) {
                //     System.out.println("" + map.get(goal.charAt(i)));
                // }
                if (goal.charAt(i) == map.get(goal.charAt(i))) {
                    System.out.println("" + map.get(goal.charAt(i)));
                }
                 else {
                    return false;
                }
            }
        return true;
    }
      
    public boolean checkStringS(String s,String goal,HashMap<Character,Character> map){
         for (int j = 0; j < s.length(); j++) {
            // System.out.println(s.charAt(j));
                if (s.charAt(j) == map.get(s.charAt(j))) {
                    System.out.println("" + map.get(s.charAt(j)));
                } else {
                    return false;
                }
            }
            return true;
    }

    public HashMap<Character,Character> initMap(String s, String goal){
           HashMap<Character, Character> map = new HashMap<>();
         for (int i = 0; i < s.length(); i++) {
                for (int j = 0; j < goal.length(); j++) {
                    if (i == j) {
                        map.put(s.charAt(i), goal.charAt(j));
                    }
                }
            }
            return map;
    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.buddyStrings("aaaaaaabc", "aaaaaaacb"));
        System.out.println(solution.buddyStrings("ab", "ab"));

        // HashMap<Character, Character> map = solution.initMap("ab","aa");
        // System.out.println(map);
        // System.out.println(solution.checkStringS("ab", "aa", map));
        // System.out.println(solution.checkStringgoal("ab", "aa", map));
    }
}
