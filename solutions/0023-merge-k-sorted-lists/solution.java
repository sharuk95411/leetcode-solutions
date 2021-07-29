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
    
 PriorityQueue<ListNode> pq = new PriorityQueue<>((p1, p2) -> p1.val - p2.val);
    public ListNode mergeKLists(ListNode[] lists) {
         for(int i=0;i<lists.length;i++)
        {
            if(lists[i]!=null)
            pq.add(lists[i]);
        }
        ListNode head= new ListNode(-1);
        ListNode temp=head;
        while(pq.size()>0)
        {
            ListNode p= pq.poll();
            temp.next=p;
            temp=p;
            if(p.next!=null)
            {
            
                pq.add(p.next);
            }
            
        }
        return head.next;
    }
}
