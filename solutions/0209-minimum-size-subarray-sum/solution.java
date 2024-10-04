class Solution {
    public int minSubArrayLen(int target, int[] arr) {
        
        int i =0,j=0,sum=0;
        int ans=arr.length+1;
        while(j<arr.length)
        {
            sum= sum+arr[j];
            while(sum>=target)
            {
                ans=Math.min(ans,j-i+1);
                sum=sum-arr[i];
                i++;
            }
            j++;
        }
        if(ans==arr.length+1)return 0;
        return ans;
    }
}
