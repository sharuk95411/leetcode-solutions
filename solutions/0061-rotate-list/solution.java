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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null) return null;
        int length=1;
        ListNode a=head;
        while(a.next!=null)
        {
            a=a.next;
            length++;
        }
        k= k%length;
        if(k==0) return head;
        
        int travel= length-k; // 3;
        ListNode b= head;
        while(travel>1)
        {
            b= b.next;
            travel--;
        }
        ListNode temp=b.next;
        b.next=null;
        a.next=head;
        return temp;
        
        
        
    
    }
}
