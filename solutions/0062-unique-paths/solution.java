class Solution {
    public int uniquePaths(int m, int n) {
        
        if(m==0&& n==0) return 0;
        int arr[][]= new int[m][n];
        Integer dp[][]= new Integer[m+1][n+1];
        
         int ans= A(arr,0,0,m,n,dp);
        return ans;
    }
    private int A(int arr[][],int i,int j,int m,int n,Integer dp[][])
    {
        if(j>=n || i>=m) return 0;
        if(i==m-1 && j==n-1) return 1;
        
        if(dp[i][j]!=null) return dp[i][j];
        int  way1=0;
        way1= A(arr,i,j+1,m,n,dp);
        dp[i][j]= way1;
        int way2=0;
        way2= A(arr,i+1,j,m,n,dp);
        dp[i][j]= way2;
        return dp[i][j]= way1+way2;
        
    }
}
