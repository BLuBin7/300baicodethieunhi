class Solution {
    public int longestIdealString(String s, int k) {
        int[] cnt = new int[26];
        int res = 0;
        for (int i = 0; i < s.length(); i++) {
            int minIndex = Math.max(0, s.charAt(i) - 'a' - k);
            int maxIndex = Math.min(25, s.charAt(i) - 'a' + k);
            int temp = 1;
            for (int index = minIndex; index <= maxIndex; index++) {
                temp = Math.max(cnt[index] + 1, temp);
            }
            cnt[s.charAt(i) - 'a'] = temp;
            res = Math.max(res, cnt[s.charAt(i) - 'a']);
        }
        return res;
    }
}