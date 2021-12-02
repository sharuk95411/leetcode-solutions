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
    
        if(head==null) return null;
        ListNode h1= head;
        ListNode temp= head.next;
        ListNode h2= head.next;
        while(h2!=null)
        {
            h1.next= h2.next;
            if(h1.next==null) break;
            h2.next= h1.next.next;
            h1=h1.next;
            h2= h2.next;
        }
        h1.next=temp;
        return head;
    }
}
