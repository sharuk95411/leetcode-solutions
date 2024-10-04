class Solution {
    public int maxScore(int[] arr, int k) {
        
        int n=arr.length;
        int sum= 0;
        int ans=0;
        for(int i=0;i<k;i++)
        {
            sum=sum+arr[i];
        }
        ans= sum;
         
        int j=k-1;
        for(int i=n-1;i>=n-k;i--)
        {
            sum=sum-arr[j]+arr[i];
            ans=Math.max(sum,ans);
            j--;
        }
        return ans;
    }
}
