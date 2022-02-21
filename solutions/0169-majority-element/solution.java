class Solution {
    public int majorityElement(int[] nums) {
        
        int no= nums[0];
        int count=1;
        
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i]==no) count++;
            else
            {
                count--;
                if(count==0) 
                {
                    count++;
                    no=nums[i];
                }
            }
        }
        return no;
    }
}
