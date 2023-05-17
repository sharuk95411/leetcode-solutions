class Solution {
    List<List<Integer>>outer= new ArrayList<>();
    List<Integer>inner= new ArrayList<>();
    public List<List<Integer>> subsets(int[] nums) {
        
        A(nums,0);
        return outer;
    }
    public void A(int arr[],int index)
    {
        if(index>=arr.length)
        {
            outer.add(new ArrayList<>(inner));
            return ;
        }
        inner.add(arr[index]);
        A(arr,index+1);
        inner.remove(inner.size()-1);
        A(arr,index+1);
    }
}
