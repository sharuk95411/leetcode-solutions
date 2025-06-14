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
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        
        ListNode dummy=new ListNode();
        ListNode temp=dummy;

        while(l1!=null && l2!=null)
        {
            if(l2.val>l1.val) // move l1
            {
            dummy.next= l1;
                dummy=l1;
                l1=l1.next;
            }
            else  // move l2
            {
                dummy.next= l2;
                dummy=l2;
                l2=l2.next;
                
            }
        }
        if(l1!=null) dummy.next=l1;
        if(l2!=null) dummy.next=l2;

        return temp.next;
    }
}
