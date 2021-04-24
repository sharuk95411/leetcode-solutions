// isme same value ko ni address ko btana h jha same address dono list me hga
//TC bht gndi ai h isko optimize krna h 
// logic TUF(Take U Forward)
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
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        List<ListNode>l= new ArrayList<>();
        ListNode a= headA;
        ListNode b= headB;
        while(a!=null)
        {
            l.add(a);
            a=a.next;
        }
        while(b!=null)
        {
            if(l.contains(b)==true)
            {
                return b;
            }
            b=b.next;
        }
        return null;
        
    }
}
