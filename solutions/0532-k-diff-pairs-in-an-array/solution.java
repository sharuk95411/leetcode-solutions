class Solution {
    public int findPairs(int[] nums, int k) {
     
        HashMap<Integer,Integer>h= new HashMap<>();
        
        for(int i=0;i<nums.length;i++)
        {
            h.put(nums[i],i);
        }
        
        List<Integer>list= new ArrayList<>();
        
        int ans=0;
        
        for(int i=0;i<nums.length;i++)
        {
            int diff= k+nums[i];
            
           if(h.containsKey(diff)==true && h.get(diff)!=i)
            {
                ans++;
                h.remove(diff);
            }
        }
        return ans;
    }
}
