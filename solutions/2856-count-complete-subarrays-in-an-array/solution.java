class Solution {
    public int countCompleteSubarrays(int[] nums) {
        int ans=0;
        
        HashMap<Integer,Integer>h= new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            
            h.put(nums[i],0);
        }
        System.out.println("OR SIZE "+h.size());
        
        List<Integer>list= new ArrayList<>();
        HashMap<Integer,Integer>h1=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        
        {
              h1.put(nums[i],0);
            
            if(h1.size()==h.size()) ans++;
            h1.put(nums[i],0);
            {
                for(int j=i+1;j<nums.length;j++)
                {
                    // list.add(nums[j]);
                    h1.put(nums[j],0);
                    if(h1.size()==h.size()) ans++;
                    
                }
                h1.clear();
            }
}
        return ans;
            
            
    }
}
