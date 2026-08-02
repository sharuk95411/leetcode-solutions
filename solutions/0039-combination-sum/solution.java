class Solution {
    List<List<Integer>>ans= new ArrayList<>();
    List<Integer>inner = new ArrayList<>();

    public List<List<Integer>> combinationSum(int[] arr, int target) {
        
        A(arr,target,0);
        return ans;
    }

    public void A(int arr[],int target,int i)
    {
        if(target==0)
        {
            ans.add(new ArrayList<>(inner));
            return;
        }
        else if(target<0 || i==arr.length) return ;
        else
        {
            inner.add(arr[i]);
            A(arr,target-arr[i],i);
            inner.remove(inner.size()-1);
            A(arr,target,i+1);
        }

    }
}
