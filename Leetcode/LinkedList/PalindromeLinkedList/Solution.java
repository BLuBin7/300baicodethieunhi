import java.util.Stack;

public class Solution {
    public boolean isPalindrome(ListNode head) {
        ListNode node = head;
        Stack<Integer> stack = new Stack<>();
        while (node != null) {
            stack.push(node.val);
            System.out.println(stack.push(node.val));
            node = node.next;
        }
        while (head != null) {
            System.out.println(stack.pop() + " " + head.val);
            if (stack.pop() != head.val) {
                return false;
            } 
            head = head.next;
        }
        return true;
    }
    // Solution 2

    public static void main(String[] args) {
        Solution solution = new Solution();
        ListNode list1 = new ListNode(1);
        list1.next = new ListNode(2);
        list1.next.next = new ListNode(2);
        list1.next.next.next = new ListNode(1);
        System.out.println(solution.isPalindrome(list1));
    }
}
