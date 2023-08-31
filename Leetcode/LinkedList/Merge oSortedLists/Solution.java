public class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 != null && list2 != null) {
            System.out.println("list1: "+list1.val+" list2: "+list2.val);
            if (list1.val < list2.val) {
                // list2 = list1.next; 2 4 6 
                list1.next = mergeTwoLists(list1.next, list2);
                return list1;
                // 5
            } else {
                list2.next = mergeTwoLists(list1, list2.next);
                return list2;
                // 4
            }
        }
        if (list1 == null)
            return list2;
        return list1;
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
        Solution solution = new Solution();
        ListNode list1 = new ListNode(1);
        list1.next = new ListNode(3);
        list1.next.next = new ListNode(5);
        solution.display(list1);
        
        ListNode list2 = new ListNode(2);
        list2.next = new ListNode(4);
        list2.next.next = new ListNode(6);
        solution.display(list2);

        // Merge the two lists
        ListNode merged = solution.mergeTwoLists(list1, list2);

        // Print the merged list
        System.out.print("Merged List: ");
        while (merged != null) {
            System.out.print(merged.val + " ");
            merged = merged.next;
        }
    }
}
