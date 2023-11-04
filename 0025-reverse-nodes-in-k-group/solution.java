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
    public int len( ListNode head){
        int size=0;
        while(head!=null){
            head=head.next;
            size++;
        }
        return size;
    }
    public ListNode reverseKGroup(ListNode head, int k) {
        int n=len(head);
        int group=n/k;


         ListNode prevhead=null;
          ListNode currhead=head;
           ListNode ansnode=null;

           for(int i=0;i<group;i++){
                ListNode prev=null;
                 ListNode curr=currhead;
                  ListNode nextnode=null;
                //   reverse k group


              for(int j=0;j<k;j++){
                  nextnode=curr.next;
                curr.next=prev;
                prev=curr;
                curr=nextnode;
              }
              if(prevhead==null){
               ansnode=prev;
           }
           else{
               prevhead.next=prev;
           }
           prevhead=currhead;
           currhead=curr;
           prevhead.next=currhead;
          
           }
           
         return ansnode;
    }
}
