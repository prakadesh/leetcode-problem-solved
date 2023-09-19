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
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode current = new ListNode();
        ListNode l3 = current;
        int i = 0;

        while (l1 != null || l2 != null || i != 0){



            int sum = i;
            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }
            if (l2 != null){
                sum += l2.val;
                l2 = l2.next;
            }
            i = sum/10;
            sum = sum % 10;

            l3.next = new ListNode(sum);
            l3=l3.next;
        }


        return current.next;
    }
}
