class Solution {
    public int majorityElement(int[] nums) {
          int ans = nums[0];
        int times = 1;
        
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i]==ans)
                times++;
            else times--;
            if(times==-1)
            {
                times = 1;
                ans = nums[i];
            }
        }
        return ans;
        
    }
}
