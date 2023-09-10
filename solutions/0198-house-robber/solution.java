class Solution {
    public int rob(int []arr) {
    
         int dp[]= new int[arr.length+1];
         Arrays.fill(dp,-1);
         return A(0,arr,dp);
    }

    public int A(int index, int arr[],int dp[])
    {
        if(index>=arr.length)return 0;
        if(dp[index]!=-1)return dp[index];
        int sum1= 0;
        sum1= arr[index]+A(index+2,arr,dp);
        int sum2=A(index+1,arr,dp);
        dp[index] =Math.max(sum1,sum2);
        return dp[index];

    }
}
