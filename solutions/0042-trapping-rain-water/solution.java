class Solution {
    public int trap(int[] arr) {
    
        int ans=0;
        for(int i=1;i<arr.length-1;i++)
        {
            int j=i-1;
            int l_max=arr[i];
            int r_max=arr[i];
            while(j>=0)
            {
                      l_max=Math.max(arr[j],l_max);
                j--;
            }
            int k=i+1;
            while(k<arr.length)
            {
                    r_max=Math.max(r_max,arr[k]);
                k++;
            }
            ans=ans+Math.min(l_max,r_max)-arr[i];
        }
        return ans;
    }
}
