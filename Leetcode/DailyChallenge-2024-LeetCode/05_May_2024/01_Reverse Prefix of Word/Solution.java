class Solution {
    public String reversePrefix(String word, char ch) {
        int index = word.indexOf(ch);
        if (index != -1) {
            char[] chars = word.toCharArray();
            int l = 0, r = index;
            while (l <= r) {
                char t = chars[l];
                chars[l] = chars[r];
                chars[r] = t;
                l++;
                r--;
            }
            return new String(chars);
        }
        return word;
    }
}