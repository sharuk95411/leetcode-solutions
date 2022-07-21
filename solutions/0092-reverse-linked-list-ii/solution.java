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
    public ListNode reverseBetween(ListNode head, int left, int right) {
          int pos =1;
    ListNode fakeHead = new ListNode(0);
    ListNode cur = head;
    
    // Prev is the node immediately before the group.
    ListNode prev = fakeHead;
    while (pos != left) {
        prev.next = cur;
        prev=cur;
        cur = cur.next;
        pos++;
    }
    // The first in group will become last and needs its next updated.
    ListNode first = cur;
    ListNode t = cur.next;
    while (pos < right) {
        ListNode tmp = t.next;
        t.next = cur;
        pos++;
        cur = t;
        t = tmp;
    }
    first.next = t;
    prev.next = cur;
    return fakeHead.next;
    }
}
