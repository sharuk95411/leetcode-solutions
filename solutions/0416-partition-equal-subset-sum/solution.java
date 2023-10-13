class Solution 
{
    public boolean canPartition(int[] arr) {
        
        int sum=0;
            for(int i=0;i<arr.length;i++)
        {
            sum= sum+arr[i];
        }
        if(sum%2!=0)return false;
        int dp[][]=new int[arr.length+1][sum/2+1];
             for (int[] row : dp)
            {
              Arrays.fill(row, -1);
            }
        if(A(arr,0,sum/2,dp)>0)return true;
        return false;
        
    }
    
    public int A(int arr[],int i, int sum,int dp[][])
    {
        if(i>=arr.length)return 0;
        
        if(sum==0)return 1;
        if(sum<0)return 0;
        if(dp[i][sum]!=-1)return dp[i][sum];
        dp[i][sum]= A(arr,i+1,sum-arr[i],dp)+A(arr,i+1,sum,dp);
        if(dp[i][sum]>0)return 1;
        return dp[i][sum];
    }
}
