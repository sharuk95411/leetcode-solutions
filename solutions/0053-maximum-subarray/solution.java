class Solution {
    public int maxSubArray(int[] arr) {
        
        int ans= arr[0];
        int sum= arr[0];

        for(int i=1;i<arr.length;i++)
        {
            sum= sum+arr[i];
            if(arr[i]>sum)
            {
                sum= arr[i];
            }
            ans= Math.max(sum,ans);
        }
        return ans;
    }
}
