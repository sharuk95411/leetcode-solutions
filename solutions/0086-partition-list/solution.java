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
    public ListNode partition(ListNode head, int x) {
        if(head==null || head.next==null) return head;
      ListNode dummy1= new ListNode(-1);
      ListNode h1=dummy1;
      ListNode dummy2= new ListNode(-1);
      ListNode h2=dummy2;
      ListNode curr= head;
      while(curr!=null)
      {
          if(curr.val<x)
          {
             h1.next= curr;
             h1=h1.next;
              curr=curr.next;
          }
          else
          {
              h2.next=curr;
              h2=h2.next;
              curr=curr.next;
          }
          
      }
      h2.next=null;
      h1.next=dummy2.next;
    return dummy1.next;
        
    }
}
