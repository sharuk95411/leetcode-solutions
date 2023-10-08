class Solution {

    public int uniquePathsWithObstacles(int[][]arr) {
        
        int dp[][]=new int [arr.length+1][arr[0].length+1];
         for (int[] row : dp)
        {
          Arrays.fill(row, -1);
        }
        return A(0,0,arr,dp);
        
    }
    public int A(int i,int j,int arr[][],int dp[][])
    {
         if(i>=arr.length || j>=arr[0].length) return 0;
        if(arr[i][j]==1)return 0;
        if(dp[i][j]!=-1)return dp[i][j];
        if(i==arr.length-1 && j==arr[0].length-1)
        {
            
            return 1;
        }
        
        
       int way1=A(i,j+1,arr,dp);
       int way2= A(i+1,j,arr,dp);
        return dp[i][j]= way1+way2;
    }
}
