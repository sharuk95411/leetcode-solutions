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
            int target= k+nums[i];
            
           if(h.containsKey(target)==true && h.get(target)!=i)
            {
                ans++;
                h.remove(target);  // its remove bcz we find the distinct pair
            }
        }
        return ans;




    }
}
