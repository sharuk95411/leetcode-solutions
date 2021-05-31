class Solution {
    public String shortestCommonSupersequence(String s1, String s2) {
        
        
        int m= s1.length();
        int n= s2.length();
        if(m==0)return s2;
        if(n==0) return s1;
          int t[][]= new int[m+1][n+1];
        String s= A(s1,s2,m,n,t);
    if(s.length()==0) return s1+s2;
        
        StringBuilder ans= new StringBuilder();
  
        
        int i=0,j=0,k=0;
    
    while(i<s.length() || j<s.length() || k<s.length())
    {
        if(s1.charAt(i)!=s.charAt(k))
        {
            ans.append(s1.charAt(i));
            i++;
            
        }
        else if(s1.charAt(i)==s.charAt(k))
        {
             if(s2.charAt(j)!=s.charAt(k))
             {
                 ans.append(s2.charAt(j));
                 j++;
             }
             else
             {
                 ans.append(s.charAt(k));
                 i++;
                 j++;
                 k++;
             }
        }
    }
    while(i<s1.length())
    {
        ans.append(s1.charAt(i));
        i++;
    }
    while(j<s2.length())
    {
        ans.append(s2.charAt(j));
        j++;
    }
        
        return(ans.toString());
        
    }
    
    static String A(String s1,String s2,int m,int n,int t[][])
    {
           StringBuilder sb= new StringBuilder();
      
        for(int i=1;i<m+1;i++)
        {
            for(int j=1;j<n+1;j++)
        {
            if(s1.charAt(i-1)==s2.charAt(j-1))
            {
            
                t[i][j]= 1+t[i-1][j-1];
            }
            else
            {
                t[i][j]= Math.max(t[i-1][j],t[i][j-1]);
            }
        }
      
             
        }
    
    int a=m,b=n;
    while(a>0 &&b>0)
    {
        if(s1.charAt(a-1)==s2.charAt(b-1))
        {
            sb.append(s1.charAt(a-1));
            a--;
            b--;
            
        }
     else if(t[a-1][b]>t[a][b-1])
         {
            a--;
         }
         else
            b--;
        
    }
        return (sb.reverse().toString());
    }
}
