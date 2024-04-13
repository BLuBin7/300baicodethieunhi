class Solution {
    int calculate(int[][] dp) {
        int res = 0;
        for (int j = 0; j < dp[0].length; j++) {
            Deque<int[]> deque = new ArrayDeque<>();
            int[] first = new int[2];
            int[] last = new int[]{-1, -1};
            for (int i = 0; i < dp.length; i++) {
                int id = i;
                while (deque.size() > 0 && last[0] > dp[i][j]) {
                    deque.pollLast();
                    res = Math.max(res, last[0] * (i - last[1]));
                    id = last[1];
                    last = deque.peekLast();
                }
                deque.addLast(new int[] {dp[i][j], id});
                last = deque.peekLast();
            }

            while (deque.size() > 0) {
                first = deque.pollFirst();
                res = Math.max(res, first[0] * (dp.length - first[1]));
            }
        }
        return res;
    }
    public int maximalRectangle(char[][] matrix) {
        int[][] dp = new int[matrix.length][matrix[0].length];
        int res = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                dp[i][j] = matrix[i][j] == '1' ? dp[i][Math.max(0, j - 1)] + 1 : 0;
            }
        }
        return calculate(dp);
    }
}