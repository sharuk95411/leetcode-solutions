class Solution {
    public int longestOnes(int[] arr, int k) {
        
        int i=0;
        int j=0;
        int n= arr.length;
        int ans= Integer.MIN_VALUE;

        for(j=0;j<n;j++)
        {
             if(k>0 && arr[j]==0) k--;
            else if(k==0 && arr[j]==0)
             {
                 ans=Math.max(ans,j-i);
                 while(i<n && k==0)
                 {
                     if(arr[i]==0)
                     {
                         i++;
                         k++;
                     }
                     else i++;
                 }
                 j--;
             }
        }
        ans=Math.max(ans,j-i);
        return ans;
    }
}
