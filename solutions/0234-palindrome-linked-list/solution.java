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

Boolean b= true;
ListNode temp=null;
    public boolean isPalindrome(ListNode head) {
        
        temp=head;
        A(head);
        return b;
    }
    public void A(ListNode head)
    {
         if(head==null) return ;

         A(head.next);
         if(head.val!=temp.val)
         {
            b=false;
            return ;
         }
         if(b)temp=temp.next;
    }
}
