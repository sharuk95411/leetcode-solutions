class Solution {
    public void sortColors(int[] arr) {

        int i =0;
        int j= arr.length-1;
        int k=0;
        while(k<=j)
        {
            int a = arr[k];
            if(a==0)
            {
               if(i==k) 
               {
                i++;
                k++;
               }
               else
               {
                int temp= arr[i];
                arr[i]=0;
                arr[k]=temp;
                if(arr[k]==1)
                {
                      k++;
                }
                 i++;
               }
            }
            else if(a==2)
            {
                int temp= arr[j];
                arr[j]=2;
                arr[k]=temp;
                if(arr[k]==1)
                {
                      k++;
                }
                j--;
                
                
            }
            else k++;
        }
        
    }
}
