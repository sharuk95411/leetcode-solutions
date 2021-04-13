/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {
         ListNode n= node;
        while(n.next.next!=null)
        {
            n.val= n.next.val;
            n=n.next;
            
        }
        n.val= n.next.val;
        n.next=null;
        
    }
}
