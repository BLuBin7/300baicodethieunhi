class Solution {
    public int openLock(String[] deadends, String target) {
        Queue<String> q = new LinkedList<>();
        Set<String> set = new HashSet<>();
        Set<String> visited = new HashSet<>();
        int layers = 0;

        for (String seq: deadends) {
            set.add(seq);
        }

        q.offer("0000");

        while (!q.isEmpty()) {
            int counter = q.size();
            layers++;
            while (counter > 0) {
                String cur = q.poll();
                counter--;

                if (cur.equals(target)) return layers - 1;
                if (set.contains(cur) || visited.contains(cur)) continue;

                for (String adj: getAdjacents(cur)) {
                    q.offer(adj);
                }
                visited.add(cur);
            }
        }

        return -1;
    }

    private List<String> getAdjacents(String s) {
        List<String> ans = new ArrayList<>();

        for (int i = 0; i < s.length(); i++) {
            char curChar = s.charAt(i);
            char adjChar1;
            char adjChar2;

            if (curChar == '9') {
                adjChar1 = '8';
                adjChar2 = '0';
            } else if (curChar == '0') {
                adjChar1 = '1';
                adjChar2 = '9';
            } else {
                adjChar1 = (char) (curChar + 1);
                adjChar2 = (char) (curChar - 1);
            }

            ans.add(s.substring(0, i) + adjChar1 + s.substring(i + 1));
            ans.add(s.substring(0, i) + adjChar2 + s.substring(i + 1));
        }

        return ans;
    }
}