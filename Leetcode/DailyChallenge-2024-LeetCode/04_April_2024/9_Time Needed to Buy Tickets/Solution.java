class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
         int res = k + 1;
        for (int i = 0; i < tickets.length; i++) {
            res += i <= k ? Math.min(tickets[i], tickets[k]) - 1 : Math.min(tickets[i], tickets[k] - 1);
        }
        return res;
    }
}