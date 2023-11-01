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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp;
        ListNode prev=null,curr=head,next;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        temp=head=prev;
        if(n==1){
            head=head.next;
        }
        else{
            prev=head;
            while(n>1){
                prev=temp;
                temp=temp.next;
                n--;
            }
            prev.next=temp.next;
        }
        

        prev=null;
        curr=head;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }

        return prev;

    }
}
