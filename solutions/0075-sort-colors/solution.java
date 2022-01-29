class Solution {
    public void sortColors(int[] arr) {
     
        int low=0,mid=0,high=arr.length-1;
        while(mid<=high)
        {
            if(arr[mid]==0)
            {
                int temp= arr[low];
                arr[low]= 0;
                arr[mid]=temp;
                low++;
                mid++;
            }
            else if(arr[mid]==2)
            {
                int temp= arr[high];
                arr[high]=2;
                arr[mid]=temp;
                high--;
            }
            else
                mid++;
        }
        
        
    }
}
