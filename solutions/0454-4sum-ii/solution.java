class Solution {
    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
        
        // Arrays.sort(nums1);
        // Arrays.sort(nums2);
        // Arrays.sort(nums3);
        // Arrays.sort(nums4);
        
        int count=0;
        
        HashMap<Integer,Integer>h= new HashMap<>(); // sum and freq type ka lia h
        for(int i=0;i<nums1.length;i++)
        {
            for(int j=0;j<nums2.length;j++)
            {
                int sum= nums1[i]+nums2[j];
                h.put(sum,h.getOrDefault(sum,0)+1);
                
            }
        }
        
        for(int i=0;i<nums3.length;i++)
        {
            for(int j=0;j<nums4.length;j++)
            {
                int sum= nums3[i]+nums4[j];
                if(h.containsKey(-sum))
                {
                    count= count+h.get(-sum);
                }
            }
        }
        return count;
        
    }
}
