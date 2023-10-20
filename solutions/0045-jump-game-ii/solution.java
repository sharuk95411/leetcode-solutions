class Solution {
    int dp[];
    public int jump(int[] arr) {
        if(arr.length==1)return 0;
        
        dp=new int[arr.length+1];
        return A(0,arr);
    }
    
    public int A(int i ,int arr[])
    {
        if(i>=arr.length-1)return 0;
        if(arr[i]==0)return arr.length;
        if(dp[i]!=0)return dp[i];
        int ans=arr.length;        
        for(int j=1;j<=arr[i];j++)
        {
          int temp_ans= 1+A(i+j,arr);
          ans= Math.min(temp_ans,ans);
        }
        return dp[i]= ans;
    }
}
