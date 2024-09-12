


class MinStack {
 
 Stack<Integer>stack= new Stack<>();
int min= Integer.MAX_VALUE;
    public MinStack() {
        
    }
    
    public void push(int val) {
         if(min>=val)
         {
             stack.push(min);
             min= val;
         }
         stack.push(val);
    }
    
    public void pop() {
          if(!stack.isEmpty())
          {
              if(stack.peek()==min)
              {
                  stack.pop();
                  min= stack.peek();
              }
              stack.pop();
          }
    }
    
    public int top() {
        if(stack.isEmpty()) return -1;
        else return stack.peek();
    }
    
    public int getMin() {
        return min;
    }
}

