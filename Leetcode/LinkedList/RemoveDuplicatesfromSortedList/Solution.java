public class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode current = head;
        while (current.next != null && current != null) {
            if (current.val == current.next.val) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }
        return head;
    }

    void display(ListNode listnode) {
        ListNode current = listnode;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        ListNode list1 = new ListNode(1);
        list1.next = new ListNode(3);
        list1.next.next = new ListNode(3);
        list1.next.next = new ListNode(4);
        solution.display(list1);
        solution.deleteDuplicates(list1);
        solution.display(list1);
    }
}
