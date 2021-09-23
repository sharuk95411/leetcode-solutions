class Solution {
    public int scoreOfParentheses(String s) {
        int ans=0;
        if(s.length()==0) return ans;
        boolean flag=false;
        Stack<Character>stack= new Stack<>();
        for(int i=0;i<s.length();i++)
        {
            
            char c=s.charAt(i);
            if(c=='(') stack.push(c);
            
            else
            {
                
                while(stack.size()>0 && stack.peek()!='(')
                {
                  
                  ans= ans+stack.pop()-'0';
                    flag=true;
                }
                stack.pop();
                
                if(flag==true)
                {
                    ans=2*ans;
                    stack.push((char)(ans+'0'));
                    flag=false;
                    ans=0;
                }
                else
                {
                    stack.push('1');
                }
                

            }
        }
       // System.out.println(stack);
        while(stack.size()>0)
        {
                ans= ans+stack.pop()-'0';
        }
        
        return ans;
    }
}
