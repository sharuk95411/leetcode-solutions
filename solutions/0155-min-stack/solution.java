// yha hum stack ko LinkList k throughh Implement kr rhe h 
class MinStack {

     LinkList head;
    class LinkList
    {
        int data;
         int min; 
        LinkList next;
    LinkList(int x,int min)
    {
        this.data=x;
        this.min=min;
        next=null;
    }
    }
    
    public MinStack() {
        
    }
    
    public void push(int val) {
       
        if(head==null)
        {
            LinkList n= new LinkList(val,val);
            head=n;
        
        }
        else
        {
            LinkList n = new LinkList(val, Math.min(head.min,val));
            n.next=head;
            head=n;
        
        }
        
    }
    
    public void pop() {
        LinkList temp=head;
        head=head.next;
        temp.next=null;
    }
    
    public int top() {
        return head.data;
        
    }
    
    public int getMin() {
        return head.min;
        
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
