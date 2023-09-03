public class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode previous = null;
        ListNode current = head;
        while(current != null ){
            ListNode next = current.next;
            current.next = previous;
            // di chuyen con tro den vi tri current
            previous = current;
            // di chuyen current tiep theo
            current = next;
            System.out.println("node: "+ current.val);
        }      
        return previous;
    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        ListNode list1 = new ListNode(1);
        list1.next = new ListNode(2);
        list1.next.next = new ListNode(3);
        System.out.println(solution.reverseList(list1));
    }
}
