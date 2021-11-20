class Solution {
    int ans=0;
    public int singleNonDuplicate(int[] nums) {
     
        if(nums.length==0) return 0;
        if(nums.length==1) return 1;
        
        int left=0;
        int right= nums.length-1;
        int mid= left+(right-left)/2; 
        check(nums,left,right);
        return ans;
        }
        
       private void check(int []nums,int left,int right)
        {
           while(left<right)
           {
           int mid=left+(right-left)/2;
           if(mid%2==1 && nums[mid-1]==nums[mid] || (mid%2==0 && nums[mid]==nums[mid+1]))
           {
                 left=mid+1;
           }
               else 
               {
                   right=mid;
               }  
               
           }
          ans= nums[left];
        }
    
}
