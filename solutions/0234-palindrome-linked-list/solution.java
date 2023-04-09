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
        ListNode slow= head, fast= head.next;
        while(fast!=null && fast.next!=null)   // FIND THE MIDDLE OF LL
        {
               slow= slow.next;
               fast= fast.next.next;
        }
         ListNode prev= null,current= slow,Next= slow.next;
        while(current.next!=null)  // REVERSE THE LL FROM END TO MIDDLE
        {
            current.next=prev;
            prev=current;
            current=Next;
            Next= Next.next;
        }
        current.next=prev;
       while(head!=null)   // NOW CHECK THE PALINDROME
      {
    if(head.val!=current.val) return false;
    else
    {
        head=head.next;
        current= current.next;
    }
    }
return true;


    }
}
