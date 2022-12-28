class Solution {
    public int[] productExceptSelf(int[] arr) {
        
        int ans[]= new int[arr.length];
        for(int i=0;i<arr.length;i++)
        {
            ans[i]=1;
        }

        for(int i=1;i<arr.length;i++)
        {
            ans[i]= ans[i-1]*arr[i-1];
        }

        int temp=arr[arr.length-1];

        for(int i=arr.length-2;i>=0;i--)
        {
              ans[i]= ans[i]*temp;
              temp= temp*arr[i];
        }
              return ans;
    }
}
