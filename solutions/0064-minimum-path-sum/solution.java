class Solution {
    public int minPathSum(int[][] arr) {
        
        int dp[][]=new int [arr.length+1][arr[0].length+1];
         for (int[] row : dp)
        {
          Arrays.fill(row, -1);
        }
        return A(arr,0,0,dp);
    }
    
    public int A(int[][] grid,int i,int j,int dp[][])
    {
        //base case
        if(i>grid.length-1 || j>grid[0].length-1)
        {
           return 1011292;
        }
        if(i==grid.length-1 && j==grid[0].length-1)
        {
            return grid[i][j];
        }
        if(dp[i][j]!=-1)return dp[i][j];

        //main logic
        //row traverse
        int ans1=A(grid,i+1,j,dp);
        //colum travese
        int ans2=A(grid,i,j+1,dp);

        int min= Math.min(ans1,ans2)+grid[i][j];

        return dp[i][j]= min;
    }
}

   

