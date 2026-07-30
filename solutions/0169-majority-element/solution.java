class Solution {
    public int majorityElement(int[] nums) {
        
        int freq=1;
        int ans=nums[0];

        for(int i=1;i<nums.length;i++)
        {
            if(nums[i]==ans)
            {
                   freq++;
            }
            else
            {
                 if(freq==0)
                 {
                     ans=nums[i];
                     freq=1;
                 }
                 else
                 {
                  freq--;
                 }
            }
        }
        return ans;
    }
}
