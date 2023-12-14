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
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null || head.next==null){
            return head;
        }
        ListNode current = head;
        ListNode index = null;
        ListNode pre = new ListNode(0);
        ListNode ans = pre;
        while(current!=null){
            index = current.next;
            boolean ch = false;
            while(index!=null){
                if(current.val==index.val){
                    pre.next = index.next;
                    index = index.next;
                    ch = true;
                }
                else{
                    if(ch==false){
                        pre.next = current;
                        pre = pre.next;
                    }
                    break;
                }

            }
            current = index;

        }
        return ans.next;
    }
}
