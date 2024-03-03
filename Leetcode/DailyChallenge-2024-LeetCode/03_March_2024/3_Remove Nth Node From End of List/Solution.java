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
    public static ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode fast = head;
        ListNode slow = head;
        int counter = 0;
        while (fast != null) {
            fast = fast.next;
            if (counter > n) {
                slow = slow.next;
            }
            counter++;
        }
        if (counter == n) {
            head = head.next;
            return head;
        }
        slow.next = slow.next.next;
        return head;
    }
}