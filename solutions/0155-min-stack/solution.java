class Node
{
    int val;
    Node next;
    Node(int val)
    {
        this.val=val;
    }
}

class MinStack {

Node dummy= new Node(0);

  PriorityQueue<Integer>pq;
  
    public MinStack() {
        pq= new PriorityQueue<>();
    }
    
    public void push(int val) {
          
          Node n= new Node(val);
          if(pq.isEmpty())
          {
          dummy.next= n;
          }
          else
          {
                n.next= dummy.next;
                dummy.next=n;
          }
           pq.add(val);
       
    }
    
    public void pop() {

        int val= dummy.next.val;
        Node n= dummy.next;
        dummy.next= n.next;
        n.next=null;
        pq.remove(val);
    }
    
    public int top() {
        
        return dummy.next.val;
    }
    
    public int getMin() {
    
       return pq.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
