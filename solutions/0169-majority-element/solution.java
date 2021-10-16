class Solution {
    public int majorityElement(int[] nums) {
        
        int freq=1;
            int no=nums[0];
        
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==no) freq++;
            else
            {
                freq--;
                if(freq==0)
                {
                    no= nums[i];
                    freq++;
                }
            }
        }
        return no;
    }
}
