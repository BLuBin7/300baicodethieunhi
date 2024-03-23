/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public void reorderList(ListNode head) {
        if (head == null || head.next == null) return;

        ListNode fast = head;
        ListNode slow = head;

        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode newHead = null;
        ListNode rightHead = slow.next;
        slow.next = null;

        while (rightHead != null) {
            ListNode next = rightHead.next;
            rightHead.next = newHead;
            newHead = rightHead;
            rightHead = next;
        }

        ListNode leftHead = head;
        rightHead = newHead;
        ListNode dump = null;

        while (rightHead != null) {
            dump = leftHead.next;
            leftHead.next = rightHead;
            leftHead = dump;

            dump = rightHead.next;
            rightHead.next = leftHead;
            rightHead = dump;
        }
    }
}