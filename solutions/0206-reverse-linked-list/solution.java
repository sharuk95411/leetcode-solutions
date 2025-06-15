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

ListNode ans=null;
    public ListNode reverseList(ListNode head) {
        
        if(head==null || head.next==null) return head;
        A(head,head.next);
        head.next=null;
        return ans;
    }
    public void A(ListNode a ,ListNode b)
    {
        if(b==null)
        {
            ans=a;
            return ;
        }
        A(a.next,b.next);
        b.next=a;
    }
}
