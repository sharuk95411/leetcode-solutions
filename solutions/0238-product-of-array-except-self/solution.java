class Solution {
    // logic self and prefer Notes if not able to solve
    public int[] productExceptSelf(int[] arr) {
     int n= arr.length;
        int product=1;
       int count =0;
       int index=-1;
       for(int i=0;i<n;i++)
       {
           if(arr[i]==0 &&count ==0 )
           {
               index=i;
               count ++;
               continue;
           }
           else if(arr[i]==0&& count>0)
           {
               product=0;
           }
           else
           {
               product=product*arr[i];
           }
       }
       if(product==0)
       {
           for(int i=0;i<n;i++)
           {
               arr[i]=0;
           }
       }
       else if(count==1)
       {
           for(int i=0;i<n;i++)
           {
               if(i==index) arr[i]=product;
               else
               arr[i]=0;
           }
       }
       else
       {
           for(int i=0;i<n;i++)
           {
               arr[i]= product/arr[i];
           }
       }
        return arr;
    }
}
