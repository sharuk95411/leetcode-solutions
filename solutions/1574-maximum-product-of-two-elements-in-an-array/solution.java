class Solution {
    public int maxProduct(int[] arr) {
 if(arr.length==1)
        {
            return(arr[arr.length-1]);
        }
        int m=Integer.MIN_VALUE,n= Integer.MIN_VALUE;
        for(int i=0;i<arr.length-1;i++)
        {
            if(arr[i]>=m)
            {
                n=m;
                m=arr[i];
                
            }
            if(arr[i+1]>n)
            {
                n=arr[i+1];
            }
        }
        
        return(n-1)*(m-1);
    }
}
