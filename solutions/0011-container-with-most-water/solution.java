class Solution {
    public int maxArea(int[] arr) {
             int result=0;
        int low= 0;
        int high= arr.length-1;
        while(low<high)
        {
            int min= Math.min(arr[low],arr[high]);
            int diff= high-low;
            result= Math.max(result,diff*min);
           
            if(arr[low]<arr[high] )
            {
                low++;
            }
            else
            {
                high--;
            }
        }
        return(result);
        
    }
}
