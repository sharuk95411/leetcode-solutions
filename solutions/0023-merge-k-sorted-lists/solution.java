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

class temp implements Comparator<ListNode>
{
    public int compare(ListNode n1,ListNode n2)
    {
        if(n1.val<n2.val) return -1;
        else if(n1.val>n2.val) return 1;
        else return 0;
    }
}
  PriorityQueue<ListNode>pq= new PriorityQueue<>(new temp());
    public ListNode mergeKLists(ListNode[] lists) {
      for(int i=0;i<lists.length;i++)
      {
          if(lists[i]!=null)
          pq.add(lists[i]);
      }
      ListNode l= new ListNode();
      ListNode ans=l;
      while(pq.size()>0)
      {
          ListNode n= pq.poll();
          ans.next=n;
          ans=n;
          if(n.next!=null)
          {
              pq.add(n.next);
          }
          
      }
      return l.next;

    }
}
