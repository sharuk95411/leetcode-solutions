class Solution {
    public String removeKdigits(String s, int k) {
        
        if(s.length()==k) return "0";
        Stack<Character>stack= new Stack<>();
        
        stack.push(s.charAt(0));
        for(int i=1;i<s.length();i++)
        {
                while(stack.size()>0 &&(k>0 && stack.peek()>s.charAt(i)))
                {
                  //  System.out.println("OK");
                    stack.pop();
                    k--;
                }
            stack.push(s.charAt(i));
        }
        
        while(k>0)
        {
            stack.pop();
            k--;
        }
        String ans="";
        while(stack.size()>0)
        {
            ans=stack.pop()+ans;
        }
        // Removing leading zeros 
        while(ans.length()>0 &&ans.charAt(0)=='0')
        {
            ans=ans.substring(1);
        }
        if(ans.length()==0) return "0";
    
        return ans;
    }
    
}
