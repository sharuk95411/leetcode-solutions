class Solution {
    int ans=0;
    public int uniquePaths(int m, int n) {
        
int dp[][]=new int [m+1][n+1];
 for (int[] row : dp)
{
  Arrays.fill(row, -1);
}
        return A(0,0,m,n,dp);
        
    }
    public int A(int i,int j,int row,int col,int dp[][])
    {
         if(i>=row || j>=col) return 0;
        if(i==row-1 && j==col-1)
        {
            
            return 1;
        }
        if(dp[i][j]!=-1)return dp[i][j];
        
       int way1=A(i,j+1,row,col,dp);
       int way2= A(i+1,j,row,col,dp);
        return dp[i][j]=way1+way2;
    }
}
