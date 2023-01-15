class Solution {
    public void sortColors(int[] arr) {
        
        int zero_index=0;
        int two_index= arr.length-1;
        int i=0;
        while(i<=two_index)
        {
            if(arr[i]==0)
            {
                 int temp= arr[zero_index];
                 arr[zero_index]= 0;
                 arr[i]=temp;
                 zero_index++;
                 i++;
            }
               else if(arr[i]==2)
            {
                         int temp= arr[two_index];
                         arr[two_index]= arr[i];
                         arr[i]=temp;
                         two_index--;
            }
            else
            {
                i++;
            }
        }
    }
}
