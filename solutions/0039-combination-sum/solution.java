class Solution {
    List<List<Integer>>ans;
    List<Integer>inner= new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] arr, int target) {
     
        Arrays.sort(arr);
        ans= new ArrayList<>();
        A(0,0,arr,target);
        return ans;
    }
    
    public void A(int j,int sum,int arr[],int target)
    {
        for(int i=j;i<arr.length;i++)
        {
            sum=sum+arr[i];
           inner.add(arr[i]);   
        if(sum==target)
        {
            ans.add(new ArrayList<>(inner));
             inner.remove(inner.size()-1);
            break;
            
        }
        else if(sum<target)
        {
            A(i,sum,arr,target);
        }
        
            inner.remove(inner.size()-1);
            sum=sum-arr[i];   
        }
        
    }
}
