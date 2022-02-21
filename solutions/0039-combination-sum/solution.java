class Solution {
    
    List<Integer>inner= new ArrayList<>();
    List<List<Integer>>ans= new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] arr, int target) {
        
    
        A(arr,target,0,0);
        return ans;
    
    }
    
    private void A(int arr[],int target,int sum,int index)
    {
        if(sum==target)
        {
            System.out.println(inner);
            ans.add(new ArrayList<>(inner));
            return ;
        }
        
        for(int i=index;i<arr.length;i++)
        {
            sum=sum+arr[i];
            inner.add(arr[i]);
            if(sum<=target)
            A(arr,target,sum,i);
            
            inner.remove(inner.size()-1);
            sum=sum-arr[i];
        
        }
    }
    
}
