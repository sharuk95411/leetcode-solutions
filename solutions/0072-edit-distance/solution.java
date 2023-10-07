class Solution {
    public int minDistance(String s1, String s2) {
        
        int dp[][]=new int[s1.length()+1][s2.length()+1];
        for (int[] row : dp)
{
  Arrays.fill(row, -1);
}
        if(s1.length()==0)return s2.length();
        if(s2.length()==0)return s1.length();
        return A(s1,s2,0,0,dp);
    }
    public int A(String s1,String s2,int i,int j,int dp[][])
        
    {
        
        if(j==s2.length()) return s1.length()-i;
        if(i>=s1.length())return s2.length()-j;
        
        if(s1.charAt(i)==s2.charAt(j))
        {
          return dp[i][j] = A(s1,s2,i+1,j+1,dp);
        }
        if(dp[i][j]!=-1)return dp[i][j];
        int e= 1+A(s1,s2,i,j+1,dp);
        int d= 1+A(s1,s2,i+1,j,dp);
        int rep= 1+A(s1,s2,i+1,j+1,dp);
        
        return dp[i][j]= Math.min(e,Math.min(d,rep));
    }
}
