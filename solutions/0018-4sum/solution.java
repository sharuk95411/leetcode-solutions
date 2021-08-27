class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        Set<List<Integer>>list= new HashSet<>();
        if(nums.length<4)
            return new ArrayList<>(list);
        for(int i=0;i<nums.length-3;i++)
        {
            for(int j=i+1;j<nums.length-2;j++)
            {
                int k= j+1;
                int l= nums.length-1;
                while(k<l)
                {
                    int sum= nums[i]+nums[j]+nums[k]+nums[l];
                    if(sum==target) 
                    {list.add(Arrays.asList(nums[i],nums[j],nums[k],nums[l]));
                     k++;
                     l--;
                    }
                    else if(sum>target)l--;
                    else k++;
                }
            }
        }
        return new ArrayList<>(list);
        
    }
}
