class Solution {
    boolean dp[];
    
    public boolean canJump(int[] nums) {
     
        
        if(nums.length==0) return false;
        if(nums[0]==0 && nums.length==1) return true;
        dp=new boolean[nums.length];
        Arrays.fill(dp,true); 
        return A(nums,0);
        
    }
    
    private boolean A(int arr[],int index)
    {
        
        if(index==arr.length-1)
        {
            return true;
        }
        if(arr[index]==0)
        {
            dp[index]=false;
            return false;
        }   
        int previous= index;
        int end= arr[index];
        if(dp[index]!=true) return dp[index];
        for(int i=1;i<=end;i++)
        {
           if( A(arr,i+previous))
           {
               dp[i]=true;
               return true;
           }
        }
        
         dp[index]= false;
        return dp[index];
        
        
        
        
    }
}
