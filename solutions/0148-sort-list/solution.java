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
        if(head==null || head.next==null)
       return head;
       ListNode mid= getmid(head);
       ListNode l1= sortList(head);
       ListNode l2= sortList(mid);
       return merge (l1,l2);
        
    }
    static ListNode getmid(ListNode head)
   {
       ListNode prev= null;
       ListNode slow= head;
        ListNode fast= head;
        while(fast!=null && fast.next!=null)
        {
            prev= slow;
            slow= slow.next;
            fast= fast.next.next;
        }
        prev.next=null;// yha listNode ko 2 parts me break kia gya h bcz slow mid node dega so mid wle se pehle
       // wla me null rkhna h jisse list 2 parts me devide ho jygi
        return(slow);
   }
   static ListNode merge(ListNode l1,ListNode l2)
   {
       if(l1==null)return l2;
       if(l2==null)return l1;
         ListNode head= l1;
        ListNode small= null;
        if(l1.val> l2.val) // yhe head ko km value wale node me rkhna h
        {
         small= l2;
            head= l2;
            l2= l2.next;
        }
        else
        {
         small =l1;
        l1=l1.next;
        }
       ListNode current= head;
        while(l1!=null&& l2!=null)
        {
            if(l2.val>l1.val)
            {
                current.next= l1;
                current= l1;
                l1= l1.next;
         }
            else
            {
                current.next= l2;
                current=l2;
                l2=l2.next;
            }
        }
        if(l1!=null)
        {
            current.next=l1;
        }
        else
        {
            current.next=l2;
        }
        return small;
   }
}
