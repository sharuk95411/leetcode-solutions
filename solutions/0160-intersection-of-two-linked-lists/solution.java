/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode h1, ListNode h2) {

if(h1==null|| h2==null) return null;
ListNode a=h1;
ListNode b= h2;
      ListNode ans=null;
        while(h1!=null && h2!=null)
        {
                    if(h1.val<0)
                    {
                        ans=h1;
                        break;
                    }
                     
                    if(h2.val<0) 
                    {
                        ans=h2;
                        break;
                    }
                   if(h1==h2)
                   {
                    ans= h1;
                    break;
                   }
                    h1.val= -h1.val;
                    h2.val= -h2.val;
                    h1=h1.next;
                    h2=h2.next;
        }

        while(h1!=null)
        {
            if(h1.val<0)
            {
                ans=h1;
                break;
            }
            h1=h1.next;
        }
        while(h2!=null)
        {
            if(h2.val<0)
            {
                ans=h2;
                break;
            }
            h2=h2.next;
        }
        

       while(a!=null)
       {
        if(a.val<0) a.val= -a.val;
           a=a.next;
       }
        while(b!=null)
       {
        if(b.val<0) b.val= -b.val;
           b=b.next;
       }
        
        return ans;
    }
}
