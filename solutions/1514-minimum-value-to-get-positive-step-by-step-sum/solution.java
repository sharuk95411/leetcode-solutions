class Solution {
    public int minStartValue(int[] nums) {
        
        if(nums.length==0) return 0;
        int ans=nums[0];
        int sum=nums[0];
        
        for(int i=1;i<nums.length;i++)
        {
             sum=nums[i]+sum;
            ans= Math.min(ans,sum);
            
            
        }
        return  ans<0 ? Math.abs(ans)+1: 1;
        
    }
}
