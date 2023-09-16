class Solution {
    public int maxProfit(int[] arr) {
        
        int[][][] dp = new int[arr.length+1][3][3];
          for (int[][] row : dp) {
            for (int[] rowColumn : row) {
                Arrays.fill(rowColumn, -1);
            }
        }
       return A(0,0,arr,2,dp);
        
    }
      public int A(int i,int check,int arr[],int count,int[][][] dp)
    {
         if(i>=arr.length||count==0)return 0;
          if(dp[i][check][count]!=-1)return dp[i][check][count];
        
        int profit=0;
        if(check==0 && count>0)
        {
            int buy= A(i+1,1,arr,count,dp)-arr[i];
            int nbuy= A(i+1,0,arr,count,dp);
            
            profit= Math.max(buy,nbuy);
            
        }
        else if(check==1)
        {
            int sell= arr[i]+A(i+1,0,arr,count-1,dp);
            int nsell= A(i+1,1,arr,count,dp);
            profit= Math.max(sell,nsell);
        }
        return dp[i][check][count]= profit;

}
}
