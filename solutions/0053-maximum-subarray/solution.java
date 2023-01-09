class Solution {

    int ans=Integer.MIN_VALUE;
    public int maxSubArray(int[] arr) {
        int sum=0;
        for(int i=0;i<arr.length;i++)
        {
            sum= sum+arr[i];
            if(sum>ans)
            {
                ans=sum;
            }
            if(arr[i]>sum)
            {
                ans= Math.max(arr[i],ans);
                sum= Math.max(sum,arr[i]);
            }
        }
        return ans;
    }
}
