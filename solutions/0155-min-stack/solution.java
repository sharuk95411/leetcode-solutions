
class MinStack {

    Stack<Integer>stack1;
     Stack<Integer>stack2;
    public MinStack() {
        stack1= new Stack<>();
        stack2= new Stack<>();
    }
    
    public void push(int val) {
        
        if(stack1.isEmpty())
        {
             stack2.push(val);
             stack1.push(val);
        }
        else
        {
            if(val<=stack2.peek())
            {
                stack2.push(val);
            }
            stack1.push(val);
        }
        // System.out.println("Stack2 peek "+stack2.peek());
    }
    
    public void pop() {
        
        if(stack1.peek()==getMin())
        {
            stack1.pop();
            stack2.pop();
            System.out.println("Go");
        }
        else stack1.pop();
    }
    
    public int top() {
        return stack1.peek();
    }
    
    public int getMin() {
        
        return stack2.peek();
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
