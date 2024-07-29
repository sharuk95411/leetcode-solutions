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
        
        int size=0;
        ListNode temp=head;
        while(temp!=null)
        {
            size++;
            temp=temp.next;
        }
        System.out.println("S "+size);
        int ans=0;
        size=size-1;
        temp=head;
        while(temp!=null)
        {
             if(temp.val!=0)
             {
                   ans= (int)Math.pow(2, size)+ans;; 
             } 
             size--;
             temp=temp.next;
        }
        return ans;
    }
}
