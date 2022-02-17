class Solution {
    
    List<Integer>list= new ArrayList<>();
    List<List<Integer>>ans= new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] arr, int target) {
     
        
        A(arr,target,0);
        return ans;
        
            }
    
    private void A(int arr[],int target,int index)
    {
        if(target==0)
        {
            ans.add(new ArrayList<>(list));
              return ;
        }
        
        for(int i=index;i<arr.length;i++)
        {
            if(target-arr[i]>=0)
            {
                target= target-arr[i];
                list.add(arr[i]);
                A(arr,target,i);
                target= target+arr[i];
                list.remove(list.size()-1);
            }
        }
      
    }
        


}
        
