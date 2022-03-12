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
        
        if(head==null) return null;
        
        HashMap<Node,Node>hash= new HashMap<>();
        Node h= new  Node(head.val);
        Node ans= h;
        hash.put(head,h);
        
        Node temp= head.next;
        while(temp!=null)
        {
            Node copy= new Node(temp.val);
            hash.put(temp,copy);
            h.next=copy;
            h=copy;
            temp=temp.next;
        }
  
      Node m= head;
        Node n= ans;
        while(m!=null)
        {
            
            if(m.random==null)
            {
                n.random=null;
                m=m.next;
                n=n.next;
            }
            else
            {
            n.random=hash.get(m.random);
                m=m.next;
                n=n.next;
            }
        }
        
        
        return ans;
    }
}
