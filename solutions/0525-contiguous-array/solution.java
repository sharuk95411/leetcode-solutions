class Solution {
    public int findMaxLength(int[] nums) {
     
      if(nums.length==1) return 0;
        HashMap<Integer,Integer>h= new HashMap<>();
        h.put(0,-1);
        
        int value=0;
        int ans=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==0)
            {
                value--;
                if(h.get(value)!=null)
                {
                    int temp= h.get(value);
                    ans= Math.max(ans,i-temp);
                }
                else
                {
                    h.put(value,i);
                }
            }
            else
            {
                value++;
                if(h.get(value)!=null)
                {
                    int temp= h.get(value);
                    ans= Math.max(ans,i-temp);
                }
                else
                {
                    h.put(value,i);
                }
                
            }
        }
        
        return ans;
        
    }
}
