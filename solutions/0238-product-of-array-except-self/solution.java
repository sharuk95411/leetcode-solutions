class Solution {
    public int[] productExceptSelf(int[] arr) {
        
        int n =arr.length;
        int ans[]=new int[n]; // this calculate the left prefix product
       
       ans[0]=1;

       for(int i=1;i<n;i++)
       {
          ans[i]= arr[i-1]*ans[i-1];
       }

        //Modify the current array and convert to right prefix product

        int temp = arr[n-1];
        arr[n-1]=1;

        for(int i=n-2;i>=0;i--)
        {
            int t2= arr[i];
            arr[i]= arr[i+1]*temp;
            temp= t2;
        }

        for(int i=0;i<n;i++)
        {
            ans[i]=ans[i]*arr[i];
        }
        return ans;
    }
}       
