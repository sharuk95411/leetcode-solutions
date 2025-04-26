class Solution {
    int ans=0;
    public int countSquares(int[][] arr) {
         
         int dp[][]=new int[arr.length][arr[0].length];

         for(int i=0;i<dp.length;i++)
         {
            for(int j=0;j<dp[0].length;j++)
            {
                dp[i][j]=-1;
            }
         }

          for(int i=0;i<arr.length;i++)
          {
            for(int j=0;j<arr[0].length;j++)
            {
                if(arr[i][j]==1)
                {
                  
                   ans=ans+ A(i,j,arr,dp);
                }
            }
          }
          return ans;
    }

    public int A(int i,int j,int arr[][],int dp[][])
    {
         
         if(i>=arr.length || j>=arr[0].length) return 0 ;
         if(dp[i][j]!=-1) return dp[i][j];

         int right=A(i,j+1,arr,dp);
         int dig = A(i+1,j+1,arr,dp);
         int down=A(i+1,j,arr,dp);

           if(arr[i][j]==1)
            return dp[i][j]= 1+Math.min(right,Math.min(dig,down));
         else return dp[i][j]= 0;

    }
}
