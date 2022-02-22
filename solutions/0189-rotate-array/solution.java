class Solution {
    public void rotate(int[] arr, int s) {
        
        
        s= s%arr.length;
        if(s==0) return ;
        
        int i=0;
        int j= arr.length-1;
        
        while(i<j)
        {
            int temp= arr[i];
            arr[i]= arr[j];
            arr[j]= temp;
            i++;
            j--;
        }
        System.out.println(Arrays.toString(arr));
        i=0;
        j= s-1;
        while(i<j)
        {
            int temp= arr[i];
            arr[i]= arr[j];
            arr[j]= temp;
            i++;
            j--;
        }
        i= s;
        j= arr.length-1;
         while(i<j)
        {
            int temp= arr[i];
            arr[i]= arr[j];
            arr[j]= temp;
            i++;
            j--;
        }
      
    }
}
