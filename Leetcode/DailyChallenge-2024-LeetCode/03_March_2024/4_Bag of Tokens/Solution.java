class Solution {
    public int bagOfTokensScore(int[] tokens, int power) {
        Arrays.sort(tokens);
        int left = 0, right = tokens.length-1;
        int score = 0;
        while(left <= right) {
            if(tokens[left] <= power) {
                score++;
                power -= tokens[left];
                left++;
                continue;
            }
            if(left < right && score > 0) {
                score--;
                power += tokens[right];
                right--;
                continue;
            }
            return score;
        }
        return score;
    }
}