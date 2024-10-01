class Solution {
    public int longestOnes(int[] arr, int k) {
        
        int i=0;
        int j=0;
        int ans=0;
        while(j<arr.length)
        {
            if(arr[j]==1) j++;
            else
            {
                if(k>0)
                {
                    k--;
                    j++;
                }
                else
                {
                    ans= Math.max(ans,j-i);
                    while(k<=0)
                    {
                        if(arr[i]==0)
                        {
                            k++;
                        }
                        i++;
                    }
                }
            }
        }
        ans= Math.max(ans,j-i);
        return ans;
    }
}
