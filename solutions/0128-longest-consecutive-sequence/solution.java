class Solution {
    public int longestConsecutive(int[] nums) {
        
        int ans=0;

        HashMap<Integer,Boolean>h= new HashMap<>();
        for(int a:nums)
        {
            h.put(a,true);
        }

        for(int i=0;i<nums.length;i++)
        {
            int a = nums[i];
            if(h.containsKey(a-1))  // Thats mean isse small element present h to isko false kr do
            {
                h.put(a,false);
            }
        }
         
         for (int key : h.keySet()) {
            
            int count=0;
            if(h.get(key)==true)  // yhi smallest elements h series ke to yhi se start karna h 
            {
                while(h.containsKey(key))
                {
                    count++;
                    key++;
                }
            }
            ans=Math.max(ans,count);
        }

        return ans;
    }
}
