class Solution {
    public List<Integer> majorityElement(int[] nums) {
        
       // int count= nums.length/3 +1;
        List<Integer>l= new ArrayList<>();
        
        int count1=0;
        int count2=0;
        int no1= Integer.MAX_VALUE;
        int no2 = Integer.MAX_VALUE;
        
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==no1) count1++;
            
            else if(nums[i]==no2) count2++;
            
            else if(count1==0)
            {
                count1++;
                no1= nums[i];
            }
            else if (count2==0)
            {
                count2++;
                no2= nums[i];
            }
            else 
            {
                count1--;
                count2--;
            }
        }
        
        System.out.println(no1+" "+no2);
        count1=0;
        count2=0;
        
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==no1) count1++;
            else if(nums[i]==no2) count2++;
        }
        
        if(count1>nums.length/3) l.add(no1);
        if(count2>nums.length/3)l.add(no2);
        return l;
        
        
    }
}
