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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode list2Tail = list2;
        ListNode list1Left = list1;
        ListNode list1Right = list1;
        ListNode pointer = list1;

        int idx = 0;

        while (list2Tail.next != null) {
            list2Tail = list2Tail.next;
        }

        while (pointer != null) {
            if (idx == a - 1) {
                list1Left = pointer;
            }

            if (idx == b + 1) {
                list1Right = pointer;
            }
            idx++;
            pointer = pointer.next;
        }

        list1Left.next = list2;
        list2Tail.next = list1Right;

        return list1;
    
    }
}