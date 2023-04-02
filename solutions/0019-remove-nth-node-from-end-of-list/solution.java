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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode curr= head;
        int count=0;
        while(curr!=null)
        {
            count++;
             curr= curr.next;
        }
        int remove=count-n;
        if(remove==0) return head.next;
        count=0;
        ListNode prev=head;
        curr= head.next;
        while(count<remove-1)
        {
            prev=curr;
            curr=curr.next;
            count++;
        }
        prev.next= curr.next;
        return head;

    }
}
