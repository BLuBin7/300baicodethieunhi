public class Solution {
    public static int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
        Map<Integer, List<int[]>> map = new HashMap<>();
        for (int[] flight : flights) {
            map.computeIfAbsent(flight[0], key -> new ArrayList<>()).add(new int[] {flight[1], flight[2]});
        }
        int[] distance = new int[n];
        Arrays.fill(distance, Integer.MAX_VALUE);
        distance[src] = 0;
        Queue<int[]> queue = new ArrayDeque<>();
        queue.offer(new int[] {src, 0});
        int stop = 0;
        while (!queue.isEmpty() && stop <= k) {
            int size = queue.size();
            while (size-- > 0) {
                int[] pair = queue.poll();
                int des = pair[0];
                int dist = pair[1];
                if (!map.containsKey(des)) continue;
                for (int[] ints : map.get(des)) {
                    int neighbor = ints[0];
                    int price = ints[1];
                    if (price + dist >= distance[neighbor]) continue;
                    distance[neighbor] = price + dist;
                    queue.offer(new int[] {neighbor, distance[neighbor]});
                }
            }
            stop++;
        }
        return distance[dst] == Integer.MAX_VALUE ? -1 : distance[dst];
    }
}
