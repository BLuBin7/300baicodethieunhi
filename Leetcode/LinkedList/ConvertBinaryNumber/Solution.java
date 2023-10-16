public class Solution {
    public int getDecimalValue(ListNode head) {
        ListNode node = head;
        String result="";
        while (node != null) {
            result +=node.val;
            node = node.next;
        }
        // chuyen sang co so 2
        int x = Integer.parseInt(result, 2);
        return x;
    }


    public static void main(String[] args) {
        Solution solution = new Solution();
        ListNode list1 = new ListNode(1);
        list1.next = new ListNode(0);
        list1.next.next = new ListNode(1);
        System.out.println(solution.getDecimalValue(list1));
    }
}
