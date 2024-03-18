class Solution {
    public int findMinArrowShots(int[][] points) {
         Arrays.sort(points, Comparator.comparing(a -> a[0]));
        int ans = 0;
        int[] curJoin = points[0];

        for (int i = 1; i < points.length; i++) {
            if (points[i][0] <= curJoin[1]) {
                curJoin[0] = points[i][0];
                curJoin[1] = Math.min(points[i][1], curJoin[1]);
                continue;
            } else {
                curJoin = points[i];
                ans++;
            }
        }

        return ans + 1;
    }
}