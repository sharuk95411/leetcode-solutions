class Solution {
    // int ans;
    List<Integer>l= new ArrayList<>();
    public int combinationSum4(int[] arr, int target) {
        int dp[]=new int[target+1];
        Arrays.fill(dp,-1);
        Arrays.sort(arr);
        return A(0,target,arr,dp);
        
    }
    
    public int A(int sum,int target,int arr[],int dp[])
    {
         if(sum==target)
         {
            return 1;
         }
        if(sum>target) return 0;
        if(dp[sum]!=-1)return dp[sum];
        int ans=0;
        
        for(int i=0;i<arr.length;i++)
        {
            ans=ans+A(sum+arr[i],target,arr,dp);        
        }
        return dp[sum]=ans;
        
    }
}
