class Solution {
     int i=0;
    public int scoreOfParentheses(String S) {
        
          int count=0;
    while(i<S.length())
    {
        
        char c= S.charAt(i); 
        i++;
        if(c=='(')
        {
            
            if(S.charAt(i)==')')
            {
                count=count+1;
                i++;
                
            }
            else
            {
                count= count +2*scoreOfParentheses(S);
            }
             }
        else
        {
            return count;
        }
        
    }
    return count;
        
    }
}
