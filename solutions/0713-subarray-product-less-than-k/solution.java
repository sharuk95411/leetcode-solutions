class Solution {
    public int numSubarrayProductLessThanK(int[] arr, int k) {
        if(k<=1) return 0;
        int count =0;
       int i=0,j=0;
       int product=1;

       while(j<arr.length)
       {
        product=product*arr[j];

        while(product>=k)
        {
              product= product/arr[i];
              i++;
        }
         count+=j-i+1;
         j++;

       }
   
        return count;

    }
}
