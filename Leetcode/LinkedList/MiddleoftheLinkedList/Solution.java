import java.util.Stack;

public class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode node = head;
        Stack<ListNode> stack = new Stack<>();
        while (node != null) {
            System.out.println(node.val);
            stack.push(node);
            node = node.next;
        }
        ListNode temp = head;
        int i = stack.size() / 2 + 1;
        int count = 0;
        while (head != null) {
            stack.pop();
            temp = head;
            head = head.next;
            count++;
            if (count == i) {
                System.out.println(temp.val);
                return temp;
            }
        }
        return temp;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        ListNode list1 = new ListNode(1);
        list1.next = new ListNode(2);
        list1.next.next = new ListNode(3);
        list1.next.next.next = new ListNode(4);
        list1.next.next.next.next = new ListNode(5);
        // list1.next.next.next.next.next = new ListNode(6);
        System.out.println(solution.middleNode(list1));
    }
}
