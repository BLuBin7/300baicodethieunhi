class Solution {
    public int[][] findFarmland(int[][] land) {
        List<int[]> res = new ArrayList<>();
        for (int col = 0; col < land[0].length; ++col) {
            for (int row = 0; row < land.length; ++row) {
                if (land[row][col] == 1) {
                    res.add(new int[4]);
                    res.get(res.size() - 1)[0] = (row);
                    res.get(res.size() - 1)[1] = (col);
                    dfs(land, row, col, res, res.size() - 1);
                }
            }
        }

        return res.toArray(new int[0][]);
    }
    public void dfs(int[][] land, int row, int col, List<int[]> res, int currIndex) {
        if (row < 0 || col < 0 || row >= land.length || col >= land[0].length || land[row][col] == 0) return;

        land[row][col] = 0;

        if (res.get(currIndex)[2] <= row && res.get(currIndex)[3] <= col) {
            res.get(currIndex)[2] = row;
            res.get(currIndex)[3] = col;
        }

        dfs(land, row - 1, col, res, currIndex);
        dfs(land, row, col - 1, res, currIndex);

        dfs(land, row + 1, col, res, currIndex);
        dfs(land, row, col + 1, res, currIndex);
    }
}