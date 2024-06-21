class Solution {
    public int maxSubArray(int[] arr) {
        
        int n= arr.length;
        int maxSum= Integer.MIN_VALUE;
        int currSum=0;
        for(int i=0;i<n;i++)
        {    
                currSum=currSum+arr[i];
                maxSum=Math.max(currSum,maxSum);
           if(arr[i]>currSum)
            {
                maxSum=Math.max(arr[i],maxSum);
                currSum=arr[i];
            }
            
        }
        return maxSum;
    }
}
