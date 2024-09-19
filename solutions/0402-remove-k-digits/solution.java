class Solution {
    public String removeKdigits(String s, int k) {
        
        String ans="";
        if(k==s.length()) return "0";
        Stack<Character>stack= new Stack<>();
        stack.push(s.charAt(0));

        for(int i=1;i<s.length();i++)
        {
            char b= s.charAt(i);
            while(!stack.isEmpty() &&( k>0 &&stack.peek()>b ) )
            {
                k--;
                stack.pop();
            }
            stack.push(b);
        }
        
        while(k>0)
        {
            stack.pop();
            k--;
        }

        while(!stack.isEmpty())
        {
            ans= stack.pop()+ans;
        }
        while(ans.length()>0 && ans.charAt(0)=='0')
        {
            ans=ans.substring(1,ans.length());

        }
         if(ans.length()==0) return "0";
        return ans;




    }
}
