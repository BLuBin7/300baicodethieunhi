public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int lenA = getListLength(headA);
        int lenB = getListLength(headB);
        ListNode a = headA;
        ListNode b = headB;
        while(lenA > lenB){
            lenA--;
            a = a.next;
        }
        while(lenB > lenA){
            lenB--;
            b = b.next;
        }
        while(a != b){
            a = a.next;
            b = b.next;
        }
        return a;
    }
    public int getListLength(ListNode head){
        int len = 0;
        while(head!=null){
            len++;
            head = head.next;
        }
        return len;
    }
    void display(ListNode head){
        ListNode temp = head;
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Solution s = new Solution();
        ListNode list1 = new ListNode(1);
        list1.next = new ListNode(3);
        list1.next.next = new ListNode(5);
        s.display(list1);
        
        ListNode list2 = new ListNode(2);
        list2.next = new ListNode(3);
        list2.next.next = new ListNode(5);
        s.display(list2);

        // Merge the two lists
        ListNode merged = s.getIntersectionNode(list1, list2);
        System.out.println("Merged List: " );
        s.display(merged);

    }
}