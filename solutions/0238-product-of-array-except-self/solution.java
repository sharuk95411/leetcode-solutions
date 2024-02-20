class Solution {
    public int[] productExceptSelf(int[] arr) {
        
        int left[]= new int[arr.length];

         left[0]=1;
        int product=1;
        for(int i=1;i<arr.length;i++)
        {
         product= product*arr[i-1];
            left[i]= product;
        }

        int temp=1;
        for(int i=arr.length-2;i>=0;i--)
        {
            temp=temp*arr[i+1];
            left[i]= left[i]*temp;
        }
      
       return left;
        
    }
}
