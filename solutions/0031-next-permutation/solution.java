class Solution {
    public void nextPermutation(int[] nums) {
        
        if(nums.length==0|| nums.length==1) return ;
        
        int i=nums.length-1;
        boolean check=true;
        while(i>0)
        {
            if(nums[i-1]<nums[i]) 
            {
                i=i-1;
                check=false;
                break;
            }
            i--;
    }
               System.out.println(i);
        if(check)
        {
           reverse(0,nums,nums.length-1);
            return ;
        }

        int j=nums.length-1;
         if(i>=0)
         {
             while(nums[i]>=nums[j])
             {
                  j--;
             }
             swap(i,j,nums);
           //  System.out.println(Arrays.toString(nums));
             reverse(i+1,nums,nums.length-1);
         }
       // System.out.println(nums[j]);    
        
}
    
    private void swap(int left,int right,int nums[])
    {
        int temp= nums[left];
        nums[left]= nums[right];
        nums[right]= temp;
    }
    private void reverse(int left,int nums[],int right)
    {
        while(left<right)
        {
            int temp=nums[left];
            nums[left]= nums[right];
            nums[right]= temp;
            left++;
            right--;
        }
    }
}
