// Logic Self
// step 1- find the postion of Nodes Left and right jha ki list reverse krni h
// step 2- Now is list ko revere kro and left se phle ek pointer rkh lo and right k bd ka taki list reverse hne k bad merge kr skte .
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
    public ListNode reverseBetween(ListNode head, int left, int right) {
    if(left==right) return head;
    int a=1;
     ListNode m=head, n=head;
     ListNode prev=head,current= head;
     ListNode temp= head;
     while(temp!=null)
     {
         if(a==left)
         {
             n=m;
             prev= temp;
         }
         else if(a==right)
         {
             current= temp;
             break;
         }
         a++;
         m=temp;
         temp=temp.next;
       
     }
     m= current.next;
     ListNode r= reverse(prev,current);
     n.next=r;
     prev.next=m;
     if(left==1)
     return r;
     else return head;
        
    }
    static ListNode reverse(ListNode l1,ListNode l2)
 {
    ListNode prev=null;
    ListNode curr=l1,next=l1.next;
    while(curr!=l2)
    {
         next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
            
    }
    curr.next=prev;
    return curr;
 }
}
