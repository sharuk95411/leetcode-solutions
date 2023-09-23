class Solution {
    
    public int minFallingPathSum(int[][] arr) {
        
        int n= arr.length;
        int ans= Integer.MAX_VALUE;
        Integer dp[][]=new Integer[n+1][n+1];
        for(int j=0;j<n;j++)
        {
          int sum= A(0,j,arr,n,dp);
            ans= Math.min(ans,sum);
        }
        return ans;
    }
    
    public int A(int row,int col,int arr[][],int n,Integer dp[][])  
    {
           if(row>=n)return 0;
        if(col<0 ||col>=n)return 1000000;
        if(dp[row][col]!=null)return dp[row][col];
        
        int a= arr[row][col]+A(row+1,col-1,arr,n,dp);
        int b = arr[row][col]+A(row+1,col,arr,n,dp);
        int c = arr[row][col]+A(row+1,col+1,arr,n,dp);
        
        int t= Math.min(a,b);
        return dp[row][col]= Math.min(t,c);
    }
}
