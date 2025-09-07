class Solution {
    public int maxProduct(int[] arr) {
        
        int ans=arr[0];
         int temp=1;

        for(int i=0;i<arr.length;i++)
        {
              
            if(arr[i]==0)
            {
                    ans= Math.max(0,ans);
                    temp=1;
            }
            else
            {
                    temp= temp*arr[i];
                ans= Math.max(ans,temp);
            }        
        }

        temp=1;
        for(int i=arr.length-1;i>=0;i--)
        { 
            
            if(arr[i]==0)
            {
                     ans= Math.max(0,ans);
                     temp=1;
            }
            else
            {
                    temp= temp*arr[i];
                ans= Math.max(ans,temp);
            }

        }

        return ans;
    }
}
