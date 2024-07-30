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
        ListNode dummy= new ListNode(0);
        ListNode ans= dummy;
        int carry=0;
        int sum=0;

        while(l1!=null || l2!=null)
        {
            // res=(num1>num2) ? (num1+num2):(num1-num2)
            int a= l1==null ? 0:l1.val;
            int b= l2==null ? 0:l2.val;
            sum=a+b+carry;
            carry= sum/10;
            ListNode a1= new ListNode(sum%10);
            dummy.next=a1;
            dummy=a1;
            if(l1!=null) l1=l1.next;
            if(l2!=null) l2=l2.next;

        }
        if(carry>0)
        {
            System.out.println("working");
            ListNode b1= new ListNode(carry);
            dummy.next=b1;

        }
        return ans.next;
    }
}
