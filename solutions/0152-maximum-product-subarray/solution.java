class Solution {
    public int maxProduct(int[] arr) {
        if(arr.length==1) return arr[0];
        int ans=Integer.MIN_VALUE;
        int product=1;
        for(int i=0;i<arr.length;i++)
        {
           if(arr[i]==0)
           {
             ans= Math.max(ans,arr[i]);
             product=1;
           }
           else
           {
            product=product*arr[i];
            ans= Math.max(ans,product);
           }
        }
         product=1;
        for(int i=arr.length-1;i>=0;i--)
        {
           if(arr[i]==0)
           {
             ans= Math.max(ans,arr[i]);
             product=1;
           }
           else
           {
            product=product*arr[i];
            ans= Math.max(ans,product);
           }
        }
        return ans;

    }
}
