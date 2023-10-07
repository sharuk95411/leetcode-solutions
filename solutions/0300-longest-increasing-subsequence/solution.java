class Solution {
    public int lengthOfLIS(int[] arr) {
        

int dp[][]=new int [arr.length+1][arr.length+1];
 for (int[] row : dp)
{
  Arrays.fill(row, -1);
}
         
        return A(arr,-1,0,dp);
    }
    public int A(int arr[],int prev,int i,int dp[][])
    {
        if(i>=arr.length)return 0;
        int take=0;
        
        if(dp[prev+1][i]!=-1)return dp[prev+1][i];
        if(prev==-1|| arr[i]>arr[prev])
         take= 1+A(arr,i,i+1,dp);
        
       int dont_take= A(arr,prev,i+1,dp);
        
        return dp[prev+1][i] = Math.max(take,dont_take);
    }
}
