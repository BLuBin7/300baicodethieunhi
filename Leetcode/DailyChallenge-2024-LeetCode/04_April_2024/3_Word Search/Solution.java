class Solution {
    boolean ans = false;
    public boolean exist(char[][] board, String word) {
        int m = board.length;
        int n = board[0].length;
        boolean[][] visited = new boolean[m][n];
        char[] words = word.toCharArray();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                dfs(board, i,j,visited,words, 0);
            }
        }
        return ans;
    }
    public void dfs(char[][] board, int row, int col, boolean[][] visited, char[] word, int index) {
        if (row >= board.length || col >= board[0].length || row < 0 || col < 0 || index == word.length)
            return;
        if (visited[row][col])
            return;
        if (word[index] == board[row][col]) {
            if (index == word.length - 1) {
                ans=true;
            }
            visited[row][col] = true;
            dfs(board, row + 1, col, visited, word, index + 1);
            dfs(board, row , col+1, visited, word, index + 1);
            dfs(board, row-1, col, visited, word, index + 1);
            dfs(board, row,col-1, visited, word, index + 1);
            visited[row][col] = false;
        }
        return;
    }
}