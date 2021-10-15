class Solution {
    public boolean containsDuplicate(int[] nums) {
        
    HashMap<Integer,Integer>h= new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            h.put(nums[i],h.getOrDefault(nums[i],0)+1);
        }
        System.out.println(h.get(3));
          for (Map.Entry obj : h.entrySet()) 
          {
               int value= (int)obj.getValue();
              if(value>1) return true;
          }
        return false;
    }
}
