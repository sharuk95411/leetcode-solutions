class Solution { // Logic- TECH Dose (lcs+Some Logic)
    // Hint - after lcs 3 pointer use
    /*isme ye 3 casees na likhne se TC 45% increase ho ri h so coding me each case liko
       1- if(m==0)return s2; 
       2-if(n==0) return s1;
       3- if(s.length()==0) return s1+s2;
    
    */
    public String shortestCommonSupersequence(String s1, String s2) {
        
        
        int m= s1.length();
        int n= s2.length();
        if(m==0)return s2; 
        if(n==0) return s1;
          int t[][]= new int[m+1][n+1];
        String s= A(s1,s2,m,n,t); // It is a lob=ngest common subsequence
        return s;
    
    }
    
  /*  if(s.length()==0) return s1+s2;
        
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
    */
    
    private String A(String s1,String s2,int m,int n,int t[][])
    {
      
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
    
      StringBuilder sb= new StringBuilder();
    int i=m,j=n;
    while(i>0 &&j>0)
    {
        if(s1.charAt(i-1)==s2.charAt(j-1))
        {
            sb.append(s1.charAt(i-1));
            i--;
            j--;
            
        }
     else if(t[i-1][j]>t[i][j-1])
         {
         sb.append(s1.charAt(i-1));
            i--;
         }
         else
         {
             sb.append(s2.charAt(j-1));
            j--;
         }
        
    }
         while(i>0)
    {
    sb.append(s1.charAt(i-1));
        i--;
    }
    while(j>0)
    {
        sb.append(s2.charAt(j-1));
        j--;
    }
        
    
        
        return (sb.reverse().toString());
    }
}
