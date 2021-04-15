// logic TUF
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
    public boolean isPalindrome(ListNode head) {
        if(head==null || head.next==null)return true;
         ListNode front=null, a=null,m=null,n=null;
        ListNode low= head;
        ListNode high = head.next;
        while(high.next!=null &&high.next.next!=null)
        {
            low=low.next;
            high=high.next.next;
        }
        if(high.next==null)
        {
            front= low.next;
               a= low.next;
                m= low.next;
              n= low.next;
       }
       else
       {
           front= low.next.next;
           a=front;
           m=front;
           n=front;
       }
      
      ListNode current= low.next; // Reverse the LinkList
         ListNode prev= null;
         ListNode next= null;
        while(current!=null)
        {
            next= current.next;
            current.next=prev;
            prev= current;
            current= next;
        } 
        // prev is point the last node of LL after reversing the LL
     while(prev!=null)
     {
         if(prev.val!= head.val)
         {
             return false;
         }
         prev= prev.next;
         head= head.next;
     }
     return true;
       
        
        
    }
}
