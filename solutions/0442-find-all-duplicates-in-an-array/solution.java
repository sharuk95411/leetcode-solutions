class Solution {
    public List<Integer> findDuplicates(int[] nums) {
     
        List<Integer>l= new ArrayList<>();
        
        for(int i=0;i<nums.length;i++)
        {
            
            int value= Math.abs(nums[i]);
            if(nums[value-1]<0) l.add(value);
            else nums[value-1]= -nums[value-1];
        }
        return l;
        
        
    }
}
