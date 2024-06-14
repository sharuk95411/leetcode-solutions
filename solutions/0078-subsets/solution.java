class Solution {
     List<Integer>inner= new ArrayList<>();
    List<List<Integer>>ans= new ArrayList<>();
    public List<List<Integer>> subsets(int[] arr) {    
        A(0,arr);
        return ans;
    }
    
    private void A(int i,int arr[])
    {
        if(i==arr.length)
        {
            ans.add(new ArrayList<>(inner));
            return ;
        }
            inner.add(arr[i]);
            A(i+1,arr);
           inner.remove(inner.size()-1);
            A(i+1,arr);
                        
        }
}
