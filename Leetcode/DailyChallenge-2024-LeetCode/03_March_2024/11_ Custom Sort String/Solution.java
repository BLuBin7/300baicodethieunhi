class Solution {
    public String customSortString(String order, String s) {
        int[] bucket = new int[26];
        for(char c : s.toCharArray()) bucket[c-'a']++;
        
        StringBuilder sb = new StringBuilder();
        for(char c : order.toCharArray()) {
            while(bucket[c-'a'] > 0) {
                sb.append(c);
                bucket[c-'a']--;
            }
        }

        int i = 0;
        while(i < 26) {
            if(bucket[i] < 1) {
                i++;
                continue;
            }
            char c = (char) (i+'a');
            sb.append(c);
            bucket[i]--;
        }

        return sb.toString();
    }
}