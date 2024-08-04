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
    public ListNode oddEvenList(ListNode head) {
        
              if(head==null || head.next==null) return head;

              ListNode a= head;
              ListNode b= head.next;
              ListNode second= head.next;

              while(b!=null && b.next!=null)
              {

                    a.next=b.next;
                    a=b.next;
                    b.next=a.next;
                    b= a.next;
              }
              a.next=second;
              return head;
    }
}
