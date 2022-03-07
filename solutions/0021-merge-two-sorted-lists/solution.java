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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
     
        ListNode dummy= new ListNode();
        ListNode a=list1,b=list2;
        ListNode temp= dummy;
        
        while(a!=null  && b!=null)
        {
            if(a.val>=b.val)
            {
                dummy.next=b;
                dummy=b;
                b=b.next;
            }
            else
            {
                dummy.next=a;
                dummy=a;
                a=a.next;
            }
        }
        if(a!=null) dummy.next=a;
        else dummy.next=b;
        return temp.next;
    }
}
