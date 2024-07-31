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
    public ListNode swapPairs(ListNode head) {
        if(head==null || head.next==null) return head;
        ListNode a= head;
        ListNode b= head.next;
        ListNode ans= b;
        while(b!=null && b.next!=null)
        {
            // max = (n1 > n2) ? n1 : n2;
            ListNode temp= b.next;
            b.next=a;
            a.next= temp.next==null ? temp :temp.next;
            a=temp;
            b=temp.next;
        } 
        if(b!=null) 
        {
            b.next=a;
            a.next=null
;        }
         return ans;    


    }
}
