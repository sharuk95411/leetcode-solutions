class Solution {
    List<List<Integer>>ans= new ArrayList<>();
    List<Integer>inner= new ArrayList<>();
    public List<List<Integer>> subsets(int[] nums) {
        
        A(nums,0);
        return ans;
    }

    public void A(int arr[],int index)
    {

        if(index>=arr.length)
        {
            ans.add(new ArrayList<>(inner));
            return ;
        }

        inner.add(arr[index]);
        A(arr,index+1);
        inner.remove(inner.size()-1);
        A(arr,index+1);
        // inner.remove(inner.size()-1);
    }
}
