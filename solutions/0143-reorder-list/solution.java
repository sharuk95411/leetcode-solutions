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

 
    public void reorderList(ListNode head) {
           HashMap<Integer,ListNode>h=new HashMap<>();
           int count=1;
           ListNode temp= head;
           while(temp!=null)
           {
                     h.put(count++,temp);
                     temp=temp.next;
           }

           count= count-1;

           int steps= count/2;

           while(steps>0)
           {
                temp= head.next;
                head.next= h.get(count--);
                if(head.next!=temp) 
                {
                    head.next.next=temp;           
                }
                head=temp;
                steps--;
           }
    
           head.next=null;
        
    }
}
