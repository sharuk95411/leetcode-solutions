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
        
        if(head==null) return null;
        if(head.next==null) return head;
        ListNode dummy= new ListNode(0);
    
        ListNode temp= dummy;
        
        ListNode p1= head, p2= head.next;
    while(p2.next!=null)
    {
        temp.next= p2;
        temp=p2;
        p2= p2.next;
        temp.next=p1;
        p1.next=null;
        temp=temp.next;
        p1=p2;
        if(p2.next==null) break;
        else
        p2=p2.next;
        
        
    }
       temp.next= p2;
        temp.next.next=p1;
        p1.next=null;
        
        return dummy.next;
        
    }
}
