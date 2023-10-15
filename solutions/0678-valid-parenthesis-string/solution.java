class Solution {
    Boolean dp[][];
    public boolean checkValidString(String s) {
         dp=new Boolean[s.length()+1][s.length()+1];
        return A(0,0,0,s);
    }
    public boolean A(int open,int close,int i,String s)
        
    {
        if(open <0 || i>=s.length())
        {
            if(open!=0)return false;
            else return true;
        }
       
        boolean a,b,d;
        a=false;
        b=false;
        d=false;
        
        char c=s.charAt(i);
        if(dp[open][i]!=null)return dp[open][i];
        
        if(c=='(')
         a= A(open+1,close,i+1,s);
        
        else if(c==')')
        {
            if(open<=0) return false;
            b= A(open-1,close,i+1,s);
        }
        else
        {
            a=A(open+1,close,i+1,s);  // Traet as open bracket
            b= A(open-1,close,i+1,s); // Treat as close braket
            d=A(open,close,i+1,s);    // Treat as none
        }
        
        return dp[open][i] =(a|| (b||d)); 
    }
}
