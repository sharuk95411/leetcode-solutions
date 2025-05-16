class Solution {
    List<List<Integer>>ans= new ArrayList<>();
    
    public List<List<Integer>> combinationSum(int[] arr, int target) {
        List<Integer>inner= new ArrayList<>();
        Arrays.sort(arr);
        A(arr,0,0,inner,target);
        return ans;
    }

    public void A(int arr[],int sum,int index,List<Integer>inner,int target)
    {
        if(sum==target)
        {
             ans.add(new ArrayList<>(inner));
             return;
        }
        if(sum>target) return ;

        for(int i=index;i<arr.length;i++)
        {
            inner.add(arr[i]);
            A(arr,sum+arr[i],i,inner,target);
            inner.remove(inner.size()-1);
        }
    }
}
