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
        if(head==null)return null;
        
        Node temp= head, a=head;
        
        while(temp!=null)
        {
            Node n= new Node(temp.val);
            a= temp.next;
            n.next=a;
            temp.next= n;
            temp=a;
        }
        
         a=head;
       
        Node b= head.next;
        while(a!=null)
        {
            if(a.random==null)
            {
                  b.random=null;
                a=b.next;
                if(a==null) break;
                b=a.next;
              
            }
            else
            {
            b.random= a.random.next;
            a=b.next;
        if(a==null) break;
            b=a.next;
            }
        }
         a=head;
        b=head.next;
        temp=b;
        
        while(a!=null)
        {
            a.next=b.next;
            a= a.next;
            if(a==null) break;
            b.next= a.next;
                b=b.next;
        
        }
     return temp;
    }
}
