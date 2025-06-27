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
    public ListNode sortList(ListNode head) {

        if(head==null ||head.next==null) return head;
        ListNode mid = A(head);
        ListNode left= sortList(head);
        ListNode right= sortList(mid);
         return merge (left,right);
    }

    public ListNode A(ListNode head)
    {
        ListNode slow= head;
        ListNode fast= head;
        ListNode temp=slow;
        while(fast!=null && fast.next!=null)
        {
            temp=slow;
            slow=slow.next;
            fast= fast.next.next;
        }
        temp.next=null;
        return slow;

    }
    public ListNode merge(ListNode l1,ListNode l2)
    {
              ListNode dummy= new ListNode();
              ListNode head=dummy;

              while(l1!=null && l2!=null)
              {
                if(l1.val>l2.val)
                {
                    head.next=l2;
                    head=l2;
                    l2=l2.next;
                }
                else
                {
                    head.next=l1;
                    head=l1;
                    l1=l1.next;
                }
              }
              if(l1!=null) head.next=l1;
              if(l2!=null) head.next=l2;

              return dummy.next;
    }
}
