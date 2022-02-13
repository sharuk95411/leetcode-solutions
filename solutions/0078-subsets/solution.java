class Solution {
    List<List<Integer>>ans= new ArrayList<>();
    List<Integer>temp= new ArrayList<>();
    public List<List<Integer>> subsets(int[] nums) {
     
    A(nums,0);
        return ans;
    }
    private void A(int arr[],int index)
    {
        if(index==arr.length)
        {
            ans.add(new ArrayList<>(temp));
            return ;
        }
        
        temp.add(arr[index]);
        A(arr,index+1);
        temp.remove(temp.size()-1);
        A(arr,index+1);
    }
}
