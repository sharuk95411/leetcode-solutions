class Solution {
    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
        
        Map<Integer,Integer>map= new HashMap<>();
        
        for(int a :nums4)
        {
            for(int b : nums3)
            map.put(a+b,map.getOrDefault(a+b,0)+1);
        }
        
        int n= nums1.length;
        int count=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                    int sum= nums1[i]+nums2[j];
                    if(sum>0)
                    {
                        count= count+ map.getOrDefault(-sum,0);
                    }
                    else
                    {
                        count= count+map.getOrDefault(-sum,0);
                    }
                    
            }
        }
        return count;
    }
}
