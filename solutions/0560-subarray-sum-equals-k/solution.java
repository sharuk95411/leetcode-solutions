class Solution {
    public int subarraySum(int[] nums, int k) {

        HashMap<Integer,Integer>h= new HashMap<>();
        
        h.put(0,1);
    int pSum=0;
        
    int count=0;
        
    for(int i=0;i<nums.length;i++)
    {
        pSum= pSum+nums[i];
        
        if(h.containsKey(pSum-k))
        {
            count= count+h.get(pSum-k);
            h.put(pSum,h.getOrDefault(pSum,0)+1);
        }
        else
            h.put(pSum,h.getOrDefault(pSum,0)+1);
        
    }
        return count;
        
    }
}
