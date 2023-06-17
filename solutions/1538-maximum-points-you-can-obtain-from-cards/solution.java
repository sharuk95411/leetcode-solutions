class Solution {
    public int maxScore(int[] arr, int k) {
        int ans=0;
        int sum=0;
        int left=k-1;
        int right= arr.length-1;
        for(int i=0;i<k;i++)
        {
            sum=sum+arr[i];
        }
        if(k==arr.length) return sum;
        ans=sum;
        while(left>=0)
        {
            sum=sum-arr[left]+arr[right];
            ans= Math.max(sum,ans);
            left--;
            right--;
        }
        return ans;
    }
}
