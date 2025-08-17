class Solution {
    public int[] productExceptSelf(int[] arr) {
        
        int pre[]= new int[arr.length];
        int no =1;
        pre[0]=1;
        for(int i=1;i<arr.length;i++)
        {
            no = no*arr[i-1];
            pre[i]=no;
        }
         
         System.out.println("Pre "+Arrays.toString(pre));
        int post[]=new int[arr.length];

         no=1;
         post[arr.length-1]=1;
         for(int i=arr.length-2;i>=0;i--)
        {
        no=no*arr[i+1];
        post[i]=no;
        }
         System.out.println("Post "+Arrays.toString(post));
          
          int ans[]= new int[arr.length];
         
         for(int i=0;i<arr.length;i++)
         {
            ans[i]= pre[i]*post[i];
         }
         return ans;

        
    }
}
