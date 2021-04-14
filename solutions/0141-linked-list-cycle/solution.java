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
    public boolean hasCycle(ListNode head) {
        
        if (head == null ) {
            return false;
        }

        ListNode slow = head;
        ListNode fast = head.next;
    while (slow != fast) // agr cycle bnegi to wo kbhi na kbhi ek dsre k equal zrur hge ye wo cond h
        {
            if (fast ==null || fast.next==null) //yha fast ka case null kb hga wo h ek br even no of nodes rkh lo without cycle and ek br odd so ye condition smjh aa jygi 
            {
                return false;
            }
            slow = slow.next;
            fast = fast.next.next;
        }
        return true;

        
    }
}
