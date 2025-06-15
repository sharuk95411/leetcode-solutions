/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {

        Map<Node,Node>h= new HashMap<>();
        h.put(null,null);
        Node prev=null;
        Node temp=head;
        while(head!=null)
        {
            Node n= new Node(head.val);
            h.put(head,n);
            if(prev!=null) prev.next=n;
            head=head.next;
            prev=n;
        }
        head=temp;

        Node current= h.get(head);
        
        while(head!=null)
        {
             current.random= h.get(head.random);
             head=head.next;
             current=current.next;
        }
        return h.get(temp);
    }
}
