class Solution {
    List<List<Integer>>ans= new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<Integer>inner= new ArrayList<>();
           fun(0,0,candidates,target,inner);
           return ans;
    }

    public void fun(int i,int sum,int arr[],int target,List<Integer>inner)
    {
        if(sum==target)
        {
            ans.add(new ArrayList<>(inner));
            return ;
        }
         if(sum>target) return ;
             
             if(i<arr.length)
             {
                inner.add(arr[i]);
             fun(i,sum+arr[i],arr,target,inner);
             inner.remove(inner.size()-1);
             fun(i+1,sum,arr,target,inner);
             }
            
         }
}
