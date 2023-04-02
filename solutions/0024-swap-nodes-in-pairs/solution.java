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
        if(head==null || head.next==null) return head;
        ListNode ans= head.next;

        ListNode prev=head, p1=prev, curr=prev.next, temp=curr;
        while(curr!=null && curr.next!=null)
        {
            temp= curr.next;
            curr.next=prev;
            prev=temp;
            curr=temp.next;
            if(curr==null) p1.next=prev;
            else p1.next= curr;
            p1=prev;
        }
        if(curr==null) prev.next= null;
        else 
        {
            curr.next=prev;
            prev.next=null;
        }
        return ans;
    }
}
