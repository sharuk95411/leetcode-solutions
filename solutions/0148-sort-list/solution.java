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
        
        if(head==null || head.next==null) return head;
        
        ListNode mid= mid(head);
        ListNode left= sortList(head);
        ListNode right= sortList(mid);
        return merge(left,right);
    }
    public ListNode mid (ListNode head)
    {
        ListNode slow=head,fast=slow.next,prev= slow;
        while(fast!=null && fast.next!=null)
        {
            slow= slow.next;
            fast= fast.next.next;
        }
        prev= slow.next;
        slow.next=null;
        return prev;
    }
    public ListNode merge (ListNode left,ListNode right)
    {
        ListNode dummy= new ListNode(0);
        ListNode current= dummy;
        while(left!=null && right!=null)
        {
            if(left.val<=right.val)
            {
                current.next= left;
                left= left.next;
                current= current.next;
            }
            else
            {
                current.next= right;
                right= right.next;
                current= current.next;
            }
        }
        while(left!=null)
        {
            current.next= left;
            current= current.next;
            left= left.next;
        }
        while(right!=null)
        {
            current.next= right;
            current= current.next;
            right= right.next;
        }
return dummy.next;
    }
}
