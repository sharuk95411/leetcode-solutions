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
    public ListNode deleteDuplicates(ListNode head) {
        
        if(head==null) return head;
        ListNode a= head;
        ListNode ans= head;
        head=head.next;

        while(head!=null)
        {
            if(a.val==head.val)
            {
                head= head.next;
            }
            else
            {
                a.next=head;
                a=head;
                head=head.next;
                System.out.println("Go in else");
            }
        }
        a.next=head;
        return ans;
        
    }
}
