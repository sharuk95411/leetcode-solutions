class StockSpanner {
 
 
class Node
{
    int val;
    int del;
    
    public Node(int val,int del)
    {
        this.val = val;
        this.del = del;
    }
        
}

Stack<Node>st= new Stack<>();

public StockSpanner() {

}

public int next(int price) {
    int count = 0;
    while(!st.isEmpty() && st.peek().val<=price)
    {
         count+=st.peek().del;
         st.pop();
    }
    count++;
    st.push(new Node(price,count));
    return count;
}

}
