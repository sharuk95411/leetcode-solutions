class Solution {
    
    class Pair
    {
        char c;
        int position;
        
        Pair(char ch,int pos)
        {
            c=ch;
            position= pos;
        }
    }
    public String minRemoveToMakeValid(String s) {
     
        // When a String Unbalaned
        // No of opening and closing parenthesis has been different
        // No of opening and closing parenthesis same but position different
        
        Stack<Pair>stack= new Stack<>();
        StringBuilder str= new StringBuilder();
    
        
        for(int i=0;i<s.length();i++)
        {
            char c= s.charAt(i);
            if(c==')')
            {
                if(stack.isEmpty()) continue;
                else 
                {
                    stack.pop();
                    str.append(")");
                    
                }
            }
            else if(c=='(')
            {
             
                stack.push(new Pair('(',str.length()));
                str.append(c);
            
            }
            else 
            {
                str.append(c);
                
                
            }
        }
        
        
        
        // System.out.println(str.toString());
        // System.out.println(stack.size());
     
        
        while(!stack.isEmpty())
        {
            Pair p= stack.pop();
             str.setCharAt(p.position, '?');
        }
        
         s=str.toString();
        String s1=s.replace("?","");
        return s1;
        
        
        
        
    }
}
