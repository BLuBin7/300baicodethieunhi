public class Solution {
    // public ListNode removeElements(ListNode head, int val) {
    //     ListNode newNode = head;
    //     while (newNode != null && newNode.next != null) {
    //         if (newNode.next.val == val) {
    //             newNode.next = newNode.next.next;
    //         } else {
    //             newNode = newNode.next;
    //         }
    //     }
    //     if (newNode.val == val && newNode.next == null) {
    //         newNode = null;
    //     }
    //     return newNode;
    // }
    
    public ListNode removeElements(ListNode head, int val) {
        ListNode previous = new ListNode(0);
        previous.next = head;
        ListNode current = previous;
        
        while(current.next != null) {
            if(current.next.val == val) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }
        
        return previous.next;
    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        ListNode list1 = new ListNode(1);
        list1.next = new ListNode(1);
        list1.next.next = new ListNode(1);
        list1.next.next.next = new ListNode(1);
        int val = 1;
        solution.removeElements(list1, val);
    }
}
