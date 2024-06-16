class Solution {
    public int[] productExceptSelf(int[] arr) {
        
        int ans[]= new int[arr.length];
        int n= arr.length;
        
        int multiplyFromLeft[]= new int[n];
        int multiplyFromRight[]= new int[n];
        int prev=1;
        
        for(int i=1;i<n;i++)
        {
            multiplyFromLeft[i]= arr[i-1]*prev;
            prev= multiplyFromLeft[i];
        }
        prev=1;
         System.out.println(Arrays.toString(multiplyFromLeft));
        for(int i=n-2;i>=0;i--)
        {
            multiplyFromRight[i]= prev*arr[i+1];
            prev= multiplyFromRight[i];
        }
         System.out.println(Arrays.toString(multiplyFromRight));
        ans[0]= multiplyFromRight[0];
        ans[n-1]= multiplyFromLeft[n-1];
        for(int i=1;i<n-1;i++)
        {
            ans[i]= multiplyFromLeft[i]*multiplyFromRight[i];
        }
        
        return ans;
    }
}
