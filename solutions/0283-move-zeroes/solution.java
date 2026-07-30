class Solution {
    public void moveZeroes(int[] nums) {
        
         
         for(int i=0;i<nums.length;i++)
         {
             if(nums[i]==0)
             {
                  swap(nums,i);
             }
         }
    }

    public void swap(int nums[],int index)
    {
         if(index==nums.length-1) return ;
         nums[index]= nums[index+1];
         nums[index+1]=0;
         while(index>0 && nums[index-1]==0)
         {
                   nums[index-1]=nums[index];
                   nums[index]=0;
                   index--;
         }
    }
}
