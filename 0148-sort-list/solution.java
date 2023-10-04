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
    public ListNode sortList(ListNode head) {
        int count=0;
        ListNode temp=head;
        while(temp!=null)
        {
         count++;
         temp=temp.next;   
        }
        int size=count;
        int arr[]=new int[size];
        temp=head;
        count=0;
        while(temp!=null)
        {
            arr[count]= temp.val;
             count++;
            temp=temp.next;
           
        }
        Arrays.sort(arr);
        temp=head;
        count=0;
        while(temp!=null)
        {
            temp.val= arr[count];
            count++;
            temp=temp.next;
        }
        return head;
    }
}
