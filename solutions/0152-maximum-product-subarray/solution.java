class Solution {
    public int maxProduct(int[] arr) {
        
    int n= arr.length;
        if(n==0) return 0;
        if(n==1) return arr[0];
        
        int ans= arr[0];
        for(int i=1;i<n;i++)
        {
            ans= Math.max(ans,arr[i]);
        }
        
        for(int i=0;i<n-1;i++)
        {
            int product= arr[i];
            for(int j=i+1;j<n;j++)
            {
                product= product*arr[j];
                ans= Math.max(product,ans);
            }
        }
        
        return ans;
    
        
    }
}
