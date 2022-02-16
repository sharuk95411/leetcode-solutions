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
     
        if(head==null) return head;
        if(head.next==null) return head;
        ListNode dummy= head.next;
        
        ListNode a=head;
        ListNode b= head.next;
        
        while(b!=null)
        {
            ListNode temp= b.next;
            b.next=a;
            
            // if(b==null)
            // {
            //     a.next=temp;
            //     temp.next=null;
            //     return dummy;
            // }
             if(temp!=null)
            {
                b=temp.next;
                if(b==null)
                {
                     a.next=temp;
                 temp.next=null;
                 return dummy;
                }
                a.next=b;
                a=temp;
            }
            else
            {
                a.next=temp;
                break;
            }
            
            
        }
        return dummy;
        
    }
}
