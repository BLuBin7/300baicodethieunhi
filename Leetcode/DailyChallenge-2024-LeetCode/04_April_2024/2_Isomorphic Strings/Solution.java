class Solution {
    public boolean isIsomorphic(String s, String t) {
        Map<Character,Character> mapS = new HashMap<>();
        Map<Character,Character> mapT = new HashMap<>();
        for(int i = 0; i < s.length(); i++){
            Character charS = s.charAt(i);
            Character charT = t.charAt(i);
            if(mapT.get(charT) == null){
                mapT.put(charT, charS);
            }
            if(mapS.get(charS) == null){
                mapS.put(charS, charT);
            }
            if(!(mapT.get(charT) == charS && mapS.get(charS) == charT)){
                return false;
            }
        }
        return true;
    }
}