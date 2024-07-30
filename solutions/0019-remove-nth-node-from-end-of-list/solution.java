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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head==null || head.next==null) return null ;
ListNode a= new ListNode();
ListNode b= head;

int size =0;

while(b!=null)
{
   size++;
   b=b.next;
}

b=head;

int des= size-n;

if(des==0) return head.next;
while(des>0)
{
    a=b;
    b=b.next;
    des--;
}
a.next= b.next;
return head;
    }
}
