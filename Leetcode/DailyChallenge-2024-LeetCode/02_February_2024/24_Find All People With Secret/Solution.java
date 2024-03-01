class Solution {
    public List<Integer> findAllPeople(int n, int[][] meetings, int firstPerson) {
        List<Integer> ans = new ArrayList<>();
        Map<Integer, List<int[]>> map = new HashMap<>();
        for (int[] meeting : meetings) {
            map.computeIfAbsent(meeting[0], key -> new ArrayList<>()).add(new int[] {meeting[2], meeting[1]});
            map.computeIfAbsent(meeting[1], key -> new ArrayList<>()).add(new int[] {meeting[2], meeting[0]});
        }
        int[] people = new int[n];
        Arrays.fill(people, Integer.MAX_VALUE);
        people[0] = 0;
        people[firstPerson] = 0;
        Queue<int[]> queue = new ArrayDeque<>();
        queue.offer(new int[] {0, 0});
        queue.offer(new int[] {firstPerson, 0});
        while (!queue.isEmpty()) {
            int[] pairs = queue.poll();
            int second = pairs[0];
            int time = pairs[1];
            if (!map.containsKey(second)) continue;
            for (int[] nextPerson : map.get(second)) {
                int next = nextPerson[1];
                int t = nextPerson[0];
                if (t >= time && people[next] > t) {
                    people[next] = t;
                    queue.offer(new int[] {next, t});
                }
            }
        }
        for (int i = 0; i < people.length; i++) {
            if (people[i] != Integer.MAX_VALUE) {
                ans.add(i);
            }
        }
        return ans;
    }
}