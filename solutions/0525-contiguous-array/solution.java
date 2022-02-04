class Solution {
    public int findMaxLength(int[] nums) {
     
        
        Map<Integer,Integer>map= new HashMap<>();
        map.put(0,-1); // ye tb k liye h jb hmri value 0 aa jye like 0,0,1,1 is case me iska use ayga you can check by dry run the program.
        
        int ans=0;
        int count =0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==0) count--;
            else count++;
            
            if(map.containsKey(count))
            {
                ans= Math.max(ans,i-map.get(count));
            }
            else
                map.put(count,i);
        }
        return ans;
        
        
    }
}
