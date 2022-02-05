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
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<ListNode>pq= new PriorityQueue<>((p1,p2)->p1.val-p2.val);
        ListNode head=new ListNode(-1);
        ListNode temp= head;
        
        for(int i=0;i<lists.length;i++)
        {
            if(lists[i]!=null) pq.add(lists[i]);
        }
        
        while(pq.size()>0)
        {
            ListNode p=pq.poll();
        temp.next=p;
            temp=p;
            if(p.next!=null) pq.add(p.next);
        }
        return head.next;
    }
}
