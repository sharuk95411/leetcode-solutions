class Solution {
    public int maxProduct(int[] arr) {
        
        int a=0;
        int index=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>a)
            {
                a=arr[i];
                index=i;
            }
        }

        int b=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>b && i!=index)
            {
                b=arr[i];
            }
        }
        return (a-1)*(b-1);

    }
}
