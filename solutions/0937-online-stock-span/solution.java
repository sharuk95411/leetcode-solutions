// probelm is easy based on Monotonic Decreasing Stack
// Isme Stack node type me use kia gya h ye intresting h ek hi stack me km ho gya.
// Logic- codeBix
class StockSpanner {

    Stack<Node>s= new Stack<>();
     class Node
    {
        int span;
        int price;
        public Node(int span,int price)
        {
            this.span=span;
            this.price= price;
        }
    }
    public StockSpanner() {
        s= new Stack<>();
    }
    
    public int next(int price) {
        int count=0;
        while(s.size()>0 && price>=s.peek().price)
        {
            count= count+s.peek().span;
            s.pop();
        }
    count++;
        s.push(new Node(count,price));
        return count;
    }
    
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */
