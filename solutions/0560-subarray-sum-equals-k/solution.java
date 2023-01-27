class Solution {
    public int subarraySum(int[] arr, int k) {
        
        int ans=0;
        int l= arr.length;
        for(int i=0;i<l;i++)
        {
            int sum=0;
            for(int j=i;j<l;j++)
            {
                    sum= sum+arr[j];
                    if(sum==k) 
                    {
                        ans++;
                    }
                
            }
        }
        return ans;
    }
}
