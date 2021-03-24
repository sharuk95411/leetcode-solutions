// Kadan's Algo
class Solution {
    public int maxSubArray(int[] arr) {
         int  max_current= arr[0];
      int max_global= arr[0];
        for(int i=1;i<arr.length;i++)
        {
            max_current= Math.max(arr[i], arr[i]+max_current);
            if(max_current>max_global)
            {
                
                max_global= max_current;
                
                
            }
        }
        return max_global;
    }
}
