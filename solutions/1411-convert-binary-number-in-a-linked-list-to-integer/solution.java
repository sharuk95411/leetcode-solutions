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
    public int getDecimalValue(ListNode head) {
        Stack<Integer>stack= new Stack<>();
        ListNode n= head;
        while(n!=null)
        {
            stack.push(n.val);
            n= n.next;
        }
        int count=1;
        int ans=0;
        while(!stack.isEmpty())
        {
            int no= stack.pop()*count;
            ans= ans+no;
            count=count*2;
        }
        return ans;
    }
}
