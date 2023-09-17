class Solution {
    
    public int rob(int[] nums) {
        int dp[]= new int[nums.length+1];
        Arrays.fill(dp,-1);
        int start_with_zero= A(0,nums,nums.length-1,dp);
        Arrays.fill(dp,-1);
        int start_with_one= A(1,nums,nums.length,dp);
        if(nums.length==1)return nums[0];
        return Math.max(start_with_zero,start_with_one);
    }
    
    public int A(int i,int arr[],int n,int dp[])
        
    {
        if(i>=n)return 0;
        if(dp[i]!=-1) return dp[i];
        
        int ans=0;
        
        int pick= arr[i]+A(i+2,arr,n,dp);
        int notpick= A(i+1,arr,n,dp);
        
        ans= Math.max(pick,notpick);
        return dp[i]=ans;
    }
}
