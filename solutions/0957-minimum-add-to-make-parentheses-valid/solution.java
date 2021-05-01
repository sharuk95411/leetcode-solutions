class Solution {
    public int minAddToMakeValid(String s) {
         Stack<Character>stack= new Stack<>();
        int index=0;
        for(index=0;index<s.length();index++)
        {
            char c= s.charAt(index);
            if(c=='(') stack.push(c);
            else
            {
                if(stack.size()>0 && stack.peek()=='(')
                {
                    stack.pop();
                }
                else
                {
                    stack.push(c);
                }
            }
        
        }
        return stack.size();
    }
}
