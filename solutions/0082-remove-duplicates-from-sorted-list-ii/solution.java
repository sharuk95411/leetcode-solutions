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
    public ListNode deleteDuplicates(ListNode head) {
        
    // isme sbase phle two scenarios h
    // 1- ye adjacent node same h 
    // 2- ya adjacent node diffrent h 
    // baki ka km bad me hga phle ye chz hgi phr aur chze iske andr hgi
     
    // 1 
    // 1-1 
    // 1-1-2   
    // 1-1-2-2  
    // 1-2-3-3-4-4-5   
    // 1-2-2-3
   
        
        if(head==null) return null;
        if(head.next==null) return head;
        ListNode d= new ListNode();
        ListNode a= head;
        ListNode b= head.next;
        ListNode ans= d;

        while(b!=null)
        {
            if(a.val==b.val)
            {
                 while(b!=null && a.val==b.val) b= b.next;
                if(b==null) 
                {
                    d.next=null;
                    return ans.next;
                }
                else if(b.next==null)
                {
                    d.next=b;
                    return ans.next;
                }
                
                else 
                {
                    a=b;
                    b=b.next;
                }
                
            }
            else
            {
                 d.next=a;
                d=a;
                a=a.next;
                b=b.next;
            }
        }
        return ans.next;
        
        
        
    }
}
