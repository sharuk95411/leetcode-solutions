class Solution {
    public int search(int[] nums, int target) {
        
        
        return A(nums,target,0,nums.length-1);
        
    }
    private int A(int nums[],int target,int l,int r)
    {
        
         int mid= l+(r-l)/2;
        
        while(l<=r)
        {
            if(nums[mid]==target)
            return mid;
            else if(nums[mid]>target) return A(nums,target,l,mid-1);
            else  return A(nums,target,mid+1,r);
                
            
        }
        return -1;
    
    }
}
