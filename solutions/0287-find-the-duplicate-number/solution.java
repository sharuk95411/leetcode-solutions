class Solution {
    public int findDuplicate(int[] nums) {
             int index=0;

             for(int i=0;i<nums.length;i++)
             {
                 index= Math.abs(nums[i]);
                 {
                     if(nums[index]<0) return index;
                     else
                     {
                         nums[index]= -nums[index];
                     }
                 }
             }
             return index;
    }
}
