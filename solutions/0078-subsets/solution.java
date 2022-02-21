class Solution {
    List<Integer>inner= new ArrayList<>();
    List<List<Integer>>ans= new ArrayList<>();
    public List<List<Integer>> subsets(int[] arr) {
     
        A(arr,0);
        return ans;
        
    }
    
    private void A(int arr[],int index)
    {
       

        ans.add(new ArrayList<>(inner));
        
        
        for(int i=index;i<arr.length;i++)
        {
            inner.add(arr[i]);
            A(arr,i+1);
            inner.remove(inner.size()-1);
        
        }
    }
}
