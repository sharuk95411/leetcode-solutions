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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        int pos=1;
        ListNode dummy= new ListNode(0),prev=dummy,curr= head;
        while(pos!=left)
        {
            prev.next=curr;
            prev=curr;
            curr=curr.next;
            pos++;
        }
    
    ListNode a= curr;
        ListNode b=curr.next;
        while(pos<right)
        {
            ListNode c= b.next;
            b.next=a;
            a=b;
            b=c;
            pos++;
            
            
        }
        prev.next=a;
        curr.next=b;
         return dummy.next;
    }
   
}
