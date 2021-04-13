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
        
        int count=0;
        ListNode n= head;
        while(n!=null)
        {
            count++;
            n=n.next;
        }
     //   System.out.println(count);
        int r= count/2;
        ListNode m= head;
        int check=0;
        while(check<r)
        {
            m=m.next;
            check++;
        }
        return m;
        
    }
}
