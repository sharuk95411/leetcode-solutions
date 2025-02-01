/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        if(head==null ||head.next==null)return null;
        ListNode slow=head,fast=head;
        slow=slow.next;
        fast=fast.next.next;
        boolean b=false;
        while(fast!=null && fast.next!=null)
        {
            if(slow==fast)
            {
                b=true;
                slow=head;
                break;
            }
            slow=slow.next;
            fast=fast.next.next;
        }
        if(b)
        {
            while(slow!=fast)
            {
                slow=slow.next;
                fast=fast.next;
            }
            return slow;
        }
        return null;
    }
}
