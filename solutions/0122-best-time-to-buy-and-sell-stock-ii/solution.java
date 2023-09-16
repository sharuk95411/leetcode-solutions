class Solution {
    public int maxProfit(int[] arr) {
        
        int dp[][]=new int[arr.length+1][2];
         for (int[] row : dp)
            Arrays.fill(row, -1);
        return A(0,0,arr,dp);
    }
    
    public int A(int i,int check,int arr[],int dp[][])
    {
         if(i>=arr.length)return 0;
           if(dp[i][check]!=-1)return dp[i][check];
        
        int profit=0;
        if(check==0)
        {
            int buy= A(i+1,1,arr,dp)-arr[i];
            int nbuy= A(i+1,0,arr,dp);
            
            profit= Math.max(buy,nbuy);
            
        }
        else
        {
            int sell= arr[i]+A(i+1,0,arr,dp);
            int nsell= A(i+1,1,arr,dp);
            profit= Math.max(sell,nsell);
        }
        return dp[i][check]=profit;

}
}
