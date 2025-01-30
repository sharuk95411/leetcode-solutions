class Solution {
    public int findPairs(int[] nums, int k) {
        HashMap<Integer,Integer>h= new HashMap<>();

        for(int i=0;i<nums.length;i++)
        {
            h.put(nums[i],i);
        }
    
        int ans=0;
        for(int i=0;i<nums.length;i++)
        {
            int check = nums[i]-k;
            if(h.containsKey(check)&&(i!=h.get(check)))
            {
                h.remove(check); // remove the key for avoid duplication 
                ans++;
            }
        }
        return ans;
    }
}
