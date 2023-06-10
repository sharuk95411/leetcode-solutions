class StockSpanner {

class Node 
{
    int value,count;
    Node(int a,int b)
    {
        value=a;
        count=b;
    }
}
Stack<Node>stack= new Stack<>();
    public StockSpanner() {
       
    }
    
    public int next(int price) {
        
        int ans=1;
         while(stack.size()>0 && price>=stack.peek().value)
         {
             ans=ans+stack.peek().count;
             stack.pop();
         }
          stack.push(new Node(price,ans));
          return ans;

    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */
