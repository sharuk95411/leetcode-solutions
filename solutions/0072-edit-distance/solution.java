class Solution {
    public int minDistance(String s, String t) {
        int m= s.length();
        int n= t.length();
        int dp[][]= new int[m+1][n+1];
        for(int i=0;i<m+1;i++)
            for(int j=0;j<n+1;j++)
                dp[i][j]= -1;
          return A(s,t,dp,m,n);
    }
      public int A(String s, String t,int dp[][],int m,int n)
    {
          m= s.length();
          n= t.length();
        if(s.length()==0) return t.length();
        if(t.length()==0) return s.length();
          if(dp[m][n]!=-1) return dp[m][n];
          else
          {
        if(s.charAt(0)==t.charAt(0) ) 
        {  dp[m][n]= A(s.substring(1),t.substring(1),dp,m,n);
        }
        else 
        {
            int a= A(s,t.substring(1),dp,m,n ); // For insert
            int b= A(s.substring(1),t ,dp,m,n);// for dlete
            int c= A(s.substring(1),t.substring(1),dp,m,n);// for subtitute
            
             dp[m][n]=1+ Math.min(a ,Math.min(b,c));
        }
              return dp[m][n];
          }
    }
}
