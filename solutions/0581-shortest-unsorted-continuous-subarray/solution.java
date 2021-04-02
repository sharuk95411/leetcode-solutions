class Solution {
    public int findUnsortedSubarray(int[] nums) {
         
          // base cases
        
        int n = nums.length;
        
        if(n<=1)
        return 0;
        
        //iterate from beginning of array
        //find the last element which is smaller than the last seen max from 
        //its left side and mark it as end
        
        int end = -2;
        
        int mx  = Integer.MIN_VALUE;
        
        for(int i=0;i<n;i++)
        {
            mx = Math.max(mx,nums[i]);
            
            if(nums[i]<mx)
                end = i;
        }
        
        //iterate from end of array
        //find the last element which is bigger than the last seen min from 
        //its right side and mark it as begin
        
        int begin = -1;
        
        int mn  = Integer.MAX_VALUE;
        
        for(int i=n-1;i>=0;i--)
        {
            mn = Math.min(mn,nums[i]);
            
            if(nums[i]>mn)
                begin = i;
        }
        
        return end - begin + 1;
        
    }
}
