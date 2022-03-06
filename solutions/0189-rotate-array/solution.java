class Solution {
    public void rotate(int[] nums, int k) {
        
    k= k%nums.length;
        
        // Rotate he whole Array
        
        rotate_whole(nums);
        rotate_left(nums,0,k-1);
        rotate_right(nums,k,nums.length-1);
        
    }
    private void rotate_whole(int arr[])
    {
        int i=0;
        int j= arr.length-1;
        while(i<j)
        {
            int temp =arr[i];
            arr[i]= arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
    }
    
    private void rotate_left(int arr[],int i,int j)
    {
        while(i<j)
        {
            int temp =arr[i];
            arr[i]= arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
    }
    private void rotate_right(int arr[],int i,int j)
    {
        while(i<j)
        {
            int temp =arr[i];
            arr[i]= arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
    }
}
