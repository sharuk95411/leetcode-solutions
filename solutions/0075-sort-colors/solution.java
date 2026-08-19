class Solution {
    public void sortColors(int[] arr) {
        int i =0;
        int j= arr.length-1;
        int k=0;
        
        while(k<=j)
        {
            if(arr[k]==0)
            {
                if(k==i)
                {
                    i++;
                    k++;
                }
                else
                {
                    arr[k]=arr[i];
                    arr[i]=0;
                    i++;
                }
            }
            else if(arr[k]==1)
            {
                k++;
            }
            else
            {
                while(j>i && arr[j]==2)
                {
                    j--;
                }
                if(j==i || k>j) return;
                arr[k]=arr[j];
                arr[j]=2;
                j--;
            }
        }
    }
}
