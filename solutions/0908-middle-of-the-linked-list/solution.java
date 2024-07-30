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
    public ListNode middleNode(ListNode head) {
        ListNode a= head;
        int size=0;
        while(a!=null)
        {
            size++;
            a=a.next;
        }
        int mid =size/2;
        int start=0;
 
        while(start!=mid)
        {
            head=head.next;
             start++;
        }
        return head;
    }
}
