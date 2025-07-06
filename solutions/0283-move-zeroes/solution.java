class Solution {
    public void moveZeroes(int[] arr) {
        
        int i =0;
        int j=0;
        while(j<arr.length)
        {
            if(arr[j]!=0)
            {
                if(arr[i]==0)
                {
                   arr[i]=arr[j];
                    arr[j]=0;
                }
                i++;
               
            }
            j++;
        }
    }
}
