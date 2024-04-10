class Solution {
    public int[] deckRevealedIncreasing(int[] deck) {
        int[] ans = new int[deck.length];
        Arrays.sort(deck);
        Queue<Integer> queue = new ArrayDeque<>();
        for (int i = deck.length - 1; i >= 0; i--) {
            if (queue.size() >= 2) {
                queue.offer(queue.poll());
            }
            queue.offer(deck[i]);
        }
        int index = deck.length - 1;
        while (!queue.isEmpty()) {
            ans[index] = queue.poll();
            index--;
        }
        return ans;
    }
}