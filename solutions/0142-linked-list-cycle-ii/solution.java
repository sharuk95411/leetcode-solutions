/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        
        // Edde Cases
         if(head==null) return null;
        System.out.println(head.next);
        
        if(head.next==null) {
          //  System.out.println("OK");
            return null;
        }
        
        // First detect The Cycle
        boolean isCycle= false;
        
        ListNode slow= head;
        ListNode fast= head.next;
        
        while(fast.next!=null && fast.next.next!=null)
        {
             if(slow==fast)
             {
                 isCycle= true;
                 break;
             }
            fast= fast.next.next;
            slow= slow.next;
        }
         if(isCycle==false) return null;
        
        slow= head;
        fast= head.next;
        List<ListNode>l= new ArrayList<>();
        
        l.add(head);
        while(l.contains(fast)==false)
        {
            l.add(fast);
            fast= fast.next;
        }
        
        return fast;
        
    }
}
