class Solution {


    public int minCostClimbingStairs(int[] arr) {

         int dp[]=new int[arr.length+1];
         Arrays.fill(dp,-1);
        int a= A(arr,0,dp);
        Arrays.fill(dp,-1);
        int b= A(arr,1,dp);
        return Math.min(a,b);
    }

    public int A (int arr[],int i,int dp[])
    {
        if(i>=arr.length) return 0;
        if(dp[i]!=-1) return dp[i];
        int a,b;
        a= arr[i]+A(arr,i+1,dp);
        b= arr[i]+A(arr,i+2,dp);

        return dp[i]= Math.min(a,b);
    }
}
