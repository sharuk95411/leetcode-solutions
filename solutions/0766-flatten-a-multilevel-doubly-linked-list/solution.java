/*
// Definition for a Node.
class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;
};
*/

class Solution {
    public Node flatten(Node head) {
    
       Node cur = head;
        Node tail = head;
        Stack<Node>s= new Stack<>();
    
         while(cur != null) {
            if(cur.child != null) {
                Node child = cur.child;
                if(cur.next != null){ 
                    s.push(cur.next);
                    cur.next.prev = null; 
                }
                cur.next = child;
                child.prev = cur;
                cur.child = null;
            }
            tail = cur;
            cur = cur.next;
        }
        
        
    while(tail!=null)
    {
        if(tail.next==null &&!s.isEmpty())
        {
            cur=s.pop();
            tail.next=cur;
            cur.prev= tail;
        }
        tail=tail.next;
    }
        return head;
            
        }
        
    
}
