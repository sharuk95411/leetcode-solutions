class Solution {
    public void rotate(int[] arr, int k) {
        
        if(k== arr.length)return ;
        if(k>arr.length) k= k%arr.length;
        if(k==0) return;
        
      //  k= arr.length-k;
        System.out.println(k);
        Reverse(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
        Reverse(arr,0,k-1);
     //   System.out.println(Arrays.toString(arr));
        Reverse(arr,k,arr.length-1);
       // System.out.println(Arrays.toString(arr));
        
    }
    private void Reverse(int arr[],int left,int right)
    {
        while(left<right)
        {
            int temp= arr[left];
            arr[left]= arr[right];
            arr[right]= temp;
            left++;
            right--;
        }
    }
    
    
}
