class Solution {
    public int countKDifference(int[] nums, int k) {
        int count=0;
        Arrays.sort(nums);
        
        for(int i=0;i<nums.length-1;i++)
        {
            int j=i+1;
            while(j<nums.length)
            {
                int diff= Math.abs(nums[j]-nums[i]);
                if(diff==k)
                {
                    count++;
                    j++;
                }
                else if(diff<k)
                {
                    j++;
                }
                else if(diff>k) break;

                    
            }
        }
        return count;
        
        
        
    }
}
