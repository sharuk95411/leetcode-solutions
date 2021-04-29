class Solution {
    public int evalRPN(String[] s1) {
     
              Stack<Integer>stack= new Stack<>();
        
    for(String s :s1)
      {
          if("+-/*".contains(s))
          {
                 char ch=s.charAt(0);
                 int v1= stack.pop();
                 int v2=stack.pop();
                 int ans= operation(v1,v2,ch);
                 stack.push(ans);
          }
          else
          {
              stack.push(Integer.parseInt(s));
          }
      } 
        return stack.peek();
    }
     static int operation(int v1,int v2,char ch)
    {
        if(ch=='+') return v1+v2;
        else if (ch=='-') return v2-v1;
        else if(ch=='/') 
        {
        return v2/v1;
        }
        else return v1*v2;
    }
}
