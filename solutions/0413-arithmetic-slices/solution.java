class Solution {
    public int numberOfArithmeticSlices(int[] arr) {
        
        if(arr.length<3) return 0;
        
        int prev_diff= arr[1]-arr[0];
        int ans=0;
        int count=0;
        
        for(int i=1;i<arr.length-1;i++)
        {
            int diff= arr[i+1]-arr[i];
            if(diff==prev_diff)
            {
                count++;
            }
            else
            {
                prev_diff= diff;
                count=0;
            }
            ans= ans+count;
        }
        return ans;
    }
}
