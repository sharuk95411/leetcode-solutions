class Solution {
     Boolean t[][];
    public boolean isMatch(String s, String pattern) {
        
       t= new Boolean[s.length()+1][pattern.length()+1];
       return B(s,pattern,0,0);
    }
    public boolean B(String s,String pattern,int i,int j)
    {
        if(i!=s.length() && j==pattern.length()) return false; // i show string length and j shows pattern length.
        if(i==s.length()&& j== pattern.length()) return true;
        
        if(i==s.length()&& j!=pattern.length())
        {
           int  index=j;
            while(index<pattern.length())
            {
                if(pattern.charAt(index)!='*') return false;
                
            index++;
            }
            return true;
        }
        if(t[i][j]!=null) return t[i][j];
        boolean b=false;
        if(pattern.charAt(j)=='?')
        {
            if(B(s,pattern,i+1,j+1))
            {
                b=true;
            }
            
        }
       else if(pattern.charAt(j)=='*')
        {
            if(B(s,pattern,i,j+1))
            {
                b=true;
            }
            if(B(s,pattern,i+1,j+1))
            {
                b=true;
            }
            if(B(s,pattern,i+1,j))
            {
                b=true;
            }
        }
        else
        {
            if(s.charAt(i)==pattern.charAt(j) && B(s,pattern,i+1,j+1))
            {
                    b=true;
            }
        
        
        }
        t[i][j]=b;
        return b;
    }
}
