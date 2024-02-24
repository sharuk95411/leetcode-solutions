class Solution {
    public int maxSubArray(int[] arr) {
        
        int max_sum=arr[0];
        int sum=arr[0];
        
        for(int i=1;i<arr.length;i++)
        {
            sum=sum+arr[i];
            max_sum=Math.max(max_sum,sum);
            
            if(arr[i]>max_sum)
            {
                max_sum=arr[i];
                sum=arr[i];
            }
            else if(sum<0)
                sum=0;
               
        }
        return max_sum;
    }
}
