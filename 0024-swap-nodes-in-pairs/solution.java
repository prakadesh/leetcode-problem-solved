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
    public ListNode swapPairs(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        ListNode newhead = head.next;
        ListNode prev = null;
        while(head != null && head.next != null){
            ListNode curr = head;
            ListNode next = head.next;
            curr.next = next.next;
            if(prev != null){
                prev.next = next;
            }
            prev = curr;
            next.next = curr;
            head = curr.next;
        }
        return newhead;
    }
}
