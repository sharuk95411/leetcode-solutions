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
    // TC O(l1+l2) and SC is O(1)
    // logic- Pepcoding and its very easy logic 
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        
        
       if(l1==null) return l2;
        
        ListNode dummy= new ListNode();
        
        ListNode temp= dummy;
        ListNode a=l1, b=l2;
        while(a !=null && b!=null)
        {
            if(b.val>=a.val)
            {
                dummy.next=a;
                dummy= a;
                 a=a.next;
                
            }
            else 
            {
                dummy.next=b;
                dummy=b;
                b= b.next;
            }
        
        }
        
    if(a!=null) dummy.next=a;
    else dummy.next= b;
        
           
        return temp.next;
    }
}
