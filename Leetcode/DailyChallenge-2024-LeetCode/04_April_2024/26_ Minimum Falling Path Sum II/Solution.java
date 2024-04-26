class Solution {
    public int minFallingPathSum(int[][] grid) {
        int N = grid.length;
        if(N == 1)
            return grid[0][0];
        for(int i=0; i<N-1; i++){
            int firstMin = grid[i][0], secondMin = Integer.MAX_VALUE, firstMinIndex = 0, secondMinIndex = 0;
            for(int j=1; j<N; j++){
                int num = grid[i][j];
                if(num < firstMin){
                    secondMin = firstMin;
                    firstMin = num;
                    firstMinIndex = j;
                }else if(num < secondMin){
                    secondMin = num;
                }
            }
            for(int k=0; k<N; k++){
                grid[i+1][k] += (k == firstMinIndex ? secondMin : firstMin);

            }
        }

        int min = Integer.MAX_VALUE;
        for(int i=0; i<N; i++)
            min = Math.min(min, grid[N-1][i]);
        return min;
    }
}