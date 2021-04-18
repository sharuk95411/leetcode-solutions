// logic self- Step 1- first find total no nodes.
// step2 now find m jo ki delete krne wle node ka no dega from start
// step3 -ab logic lga do node kis trh delete krna h jbki node no pta chl gya h start se 
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
        if(head==null) return head;
       int count=0;
       ListNode temp= head;
       while(temp!=null)
       {
           count++;
           temp=temp.next;
       }
       
int m= count-n+1;// yha node no pta chl gya h strt se ki kis no wle node ko delete krna h
       if(m==1)
       { 
          temp=head;
          head=head.next;
          temp.next=null;
          return head;
           
       }
      else
      { 
          count=2;
          ListNode slow=head;
          ListNode fast=head.next;
          
          while(count!=m)
          {
              
              slow=slow.next;
              fast= fast.next;
              count++;
          }
          slow.next= fast.next;
          return head;
          
      }
        
    }
}
