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
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    ListNode prev= null;
    public TreeNode sortedListToBST(ListNode head) {
        
        if(head==null) return null;
        ListNode mid = mid(head);
        TreeNode n = new TreeNode(mid.val);
        if(prev!=null) prev.next=null;
        if(prev!=null) // This is for last node 
        n.left= sortedListToBST(head);
        n.right=sortedListToBST(mid.next);
        return n;

        
    }
     public ListNode mid (ListNode head)
    {
        ListNode slow= head;
        ListNode fast= head;
        prev=null;
        while(fast!=null && fast.next!=null)
        {
            prev= slow;
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
}
