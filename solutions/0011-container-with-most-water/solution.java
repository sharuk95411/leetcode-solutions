class Solution {
    public int maxArea(int[] arr) {
        
        int ans=Integer.MIN_VALUE;

        int left=0;
        int right= arr.length-1;

        while(left<right)
        {
            int water= Math.min(arr[left],arr[right])*(right-left);
            ans= Math.max(ans,water);
            if(arr[left]>arr[right])
            {
                right--;
            }
            else
            left++;
        }
        return ans;
    }
}
