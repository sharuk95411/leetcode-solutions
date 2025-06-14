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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        if(l1==null) return l2;
        else if (l2==null) return l1;
        int sum=0;
        int carry=0;
        ListNode head=l1;
        ListNode ans=l1;

        while(l1!=null && l2!=null)
        {
            sum= l1.val+l2.val+carry;
              carry= sum/10;
              sum= sum%10;
            l1.val=sum;
            head= l1;
            l1=l1.next;
            l2=l2.next;
          

        }
        while(l1!=null)
        {
            sum=l1.val+carry;
            carry=sum/10;
            sum=sum%10;
            l1.val=sum;
            head=l1;
            l1=l1.next;
        }
        head.next=l2;
         while(l2!=null)
        {
            sum=l2.val+carry;
            carry=sum/10;
            sum=sum%10;
            l2.val=sum;
            head=l2;
            l2=l2.next;
        }
          if(carry!=0) head.next= new ListNode(carry);
          return ans;
    }
}
