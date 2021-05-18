// BFA(Brute Force Approach) Using Recursion 
class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        
        int sum=0;
        for(int i=0 ;i<nums.length;i++)
        {
            sum=sum+nums[i];
        }
        if((sum+target)%2!=0)return 0;
        int n= nums.length;
        sum= (sum+target)/2;
        int t[][]= new int[n+1][sum+1];
        for(int i=0;i<n+1;i++)
        {
            for(int j=0;j<sum+1;j++)
            {
                if(i==0 && j==0) t[i][j]=1;
                if(i==0) t[i][j]= 0;
                if(j==0) t[i][j]= 1;
            }
        }
        for(int i=1;i<n+1;i++)
        {
            for(int j=0;j<sum+1;j++)
            {
                if(nums[i-1]<=j)
                {
                    t[i][j]= t[i-1][j-nums[i-1]] +t[i-1][j];
                }
                else
               t[i][j]= t[i-1][j];
            }
        }
        return t[n][sum];
    } 
}
