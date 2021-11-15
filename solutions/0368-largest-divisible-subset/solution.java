class Solution {
    List<Integer>ans= new ArrayList<>();
    int dp[];
    public List<Integer> largestDivisibleSubset(int[] nums) {
    
        if(nums.length==0) return ans;
        if(nums.length==1) 
        {
            ans.add(nums[0]);
            return ans;
        }
        dp= new int[nums.length];
        Arrays.fill(dp,-1);
        Arrays.sort(nums);
        A(nums,0,new ArrayList<>(),1);
        return ans;
    }
    
    private void A(int arr[],int index,List<Integer>temp,int prev)
    {
        if(temp.size()>ans.size())
        {
            ans= new ArrayList<>(temp);
        
        }
        
    
    
        for(int i=index;i<arr.length;i++)
        {
            if(temp.size()>dp[i] && arr[i]%prev==0)
            {
                   dp[i]= temp.size();
                temp.add(arr[i]);
                A(arr,i+1,temp,arr[i]);
                temp.remove(temp.size()-1);
                
            }
          //  dp[i]= dp[i]-1;
            
        }
        
    }
}
