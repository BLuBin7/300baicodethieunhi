class Solution {

    int[] parent;
    int[] count;

    int max;
    public boolean canTraverseAllPairs(int[] nums) {
        for (int x : nums)
            max = Math.max(max, x);

        int n = nums.length;
        parent = new int[max +1];
        count = new int[max+1];

        if(n == 1) return true;

        for(int i = 0; i < n; i++)
            if(nums[i]==1) return false;
        
        for(int i = 1; i <= max; i++)
            parent[i] = i;
        
        for(int x:nums)
            count[x]++;
        

        boolean[] visited = new boolean[max+1];

        for(int i = 2; i* 2 <= max; i++){
            if(visited[i]) continue;
            for(int j = i+i; j <= max; j+=i){
                visited[j] = true;
                if(count[j]!=0){
                    union(i, j);
                }
            }
        }

        int p = find(nums[0]);
        for(int i = 1; i < n; i++)
            if(find(nums[i]) != p) return false;
        
        return true;
    }

    private int find(int x) {
        return parent[x] == x ? x : (parent[x] = find(parent[x]));
    }
    
    private void union(int x, int y) {
        
        x = find(x);
        y = find(y);
        if (x == y)
            return;

        parent[y] = x;
    }
}