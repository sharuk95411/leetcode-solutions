class Solution {
    
    public void nextPermutation(int[] arr) {
         int a=0,b=0, index=0, s1=0, s2=0;
        int n= arr.length;
        if(n==1 || n==0) return ;
        for(int i=n-1;i>0;i--)
        {
             index= i-1;
            if(arr[i]>arr[index])
            {
                index= i;
                s1=index-1;
                a= arr[index-1];
                 b=arr[index];
                break;
            }
            }
      if(index !=0)
      {
        for(int j=index;j<n;j++)
        {
            if(arr[j]>a && arr[j]<=b )
            {
                b=arr[j];
                 s2= j;
            }
        }
        int temp=a;
        arr[s1]= b;
        arr[s2]= temp;
      }
        for(int i=arr.length-1; i>index; i--)
        {
            int swap= arr[index];
            arr[index]= arr[i];
            arr[i]= swap;
            index++;
        }
        System.out.println("just next Permutation is ");
        //  System.out.println(Arrays.toString(arr));
       
        
    }
}
