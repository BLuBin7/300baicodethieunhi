class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        Stack<Integer> stack = new Stack<>();
        Queue<Integer> queue = new ArrayDeque<>();
        for (int i = sandwiches.length - 1; i >= 0; i--) {
            stack.push(sandwiches[i]);
        }
        for (int student : students) {
            queue.offer(student);
        }
        while (!stack.isEmpty() && queue.contains(stack.peek())) {
            if (stack.peek() == queue.peek()) {
                stack.pop();
                queue.poll();
            } else {
                queue.offer(queue.poll());
            }
        }
        return queue.size();
    }
}