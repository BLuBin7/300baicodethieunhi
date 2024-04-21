class Solution {
   public boolean validPath(int n, int[][] edges, int source, int destination) {
        Map<Integer, Queue<Integer>> ways = new HashMap<>();
        for(int[] edge : edges){
            Queue<Integer> way1 = ways.computeIfAbsent(edge[0], s -> new LinkedList<>());
            Queue<Integer> way2 = ways.computeIfAbsent(edge[1], s -> new LinkedList<>());
            way1.add(edge[1]);
            way2.add(edge[0]);
        }
        return dfs(ways, source, destination);
    }
    public boolean dfs(Map<Integer, Queue<Integer>> ways, int key, int destination){
        if(key == destination)
            return true;
        Queue<Integer> way = ways.get(key);
        while(!way.isEmpty()){
            int keyNext = way.poll();
            if(dfs(ways, keyNext, destination)){
                return true;
            }
        }
        return false;
    }
}