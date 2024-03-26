class Solution {
    public int firstMissingPositive(int[] nums) {
        Set<Integer> visited = new HashSet<>();
        Queue<Integer> queue = new PriorityQueue<>();
        for (int num : nums) {
            if (num > 0 && !visited.contains(num)) {
                queue.add(num);
                visited.add(num);
            }
        }
        int current = 0;
        while (!queue.isEmpty()) {
            if (current + 1 != queue.peek()) {
                return current + 1;
            }
            current = queue.poll();
        }
        return current + 1;
    }
}