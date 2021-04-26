// Logic Algorithm Made easy 
// easy logic hint-use dummy Node
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
        if(head==null || head.next==null)return head;
        ListNode dummy= new ListNode(-1);
    ListNode prev=dummy,current= head;
    while(current!=null)
    {
    if(current.next!=null && current.val==current.next.val)
    {
        while(current.next!=null &&current.val==current.next.val)
        {
            current=current.next;
        }
        prev.next=current.next;
        current=current.next;
    }
    else
    {
        prev.next=current;
        prev=current;
        current=current.next;
    }
    }
    return(dummy.next);
    }
}
