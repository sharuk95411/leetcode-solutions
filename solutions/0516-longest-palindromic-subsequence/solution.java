class Solution {
    public int longestPalindromeSubseq(String s) {
        
         int dp[][]=new int[s.length()+1][s.length()+1];
        
 for (int[] row : dp)
{
  Arrays.fill(row, -1);
}
        
    StringBuilder sb=new StringBuilder(s);  
    sb.reverse();  
    String s1= sb.toString();  
        return A(s,s1,0,0,dp);
    }
    public int A(String s1,String s2, int i,int j,int dp[][])
    {
        if(i>=s1.length() || j>=s2.length())return 0;
        
        if(dp[i][j]!=-1)return dp[i][j]; 
        int ans=0;
        if(s1.charAt(i)==s2.charAt(j))
        {
            ans=1+A(s1,s2,i+1,j+1,dp);
        }
         else
            ans=Math.max(A(s1,s2,i+1,j,dp),A(s1,s2,i,j+1,dp));
         
        return dp[i][j]=ans ;
        
    }
}
