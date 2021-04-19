// Logic self
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
    public ListNode oddEvenList(ListNode head) {
        if(head==null || head.next==null) return head;
        
         ListNode slow= head, fast= head.next, a= head.next;
        
        while(slow.next!=null && fast.next!=null)
        {
            slow.next= fast.next;
            slow= slow.next;
            fast.next= slow.next;
            fast= fast.next;
        }
        // ab list two parts me break ho gi h after while loop 
slow.next=a; // yha odd list me even list ko add krr rhe h bcz odd pehe aygi
        return head;
    }
}
