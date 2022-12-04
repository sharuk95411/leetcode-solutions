class Solution {
    public void moveZeroes(int[] arr) {
        
        int i=0;
        int k= arr.length-1;
        
    while(i<=k)
    {
        if(arr[i]==0)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[j]!=0)
                {
                    int temp= arr[i];
                    arr[i]= arr[j];
                    arr[j]= temp;
                    break;
                }
            }
        }
        i++;
    }
    }
}
