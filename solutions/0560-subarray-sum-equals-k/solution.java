class Solution {

    public int subarraySum(int[] nums, int k) {

        HashMap<Integer,Integer>h= new HashMap<>();
        h.put(0,1);
        int ans=0;
        int sum=0;

        for(int a:nums)
        {
            sum=sum+a;
            if(h.containsKey(sum-k))
            {
                ans= ans+h.get(sum-k);
            }
         h.put(sum,h.getOrDefault(sum,0)+1);
            
        }
        return ans;
        
    }
}
